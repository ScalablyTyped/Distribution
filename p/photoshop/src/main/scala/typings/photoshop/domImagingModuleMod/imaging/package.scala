package typings.photoshop.domImagingModuleMod.imaging

import typings.photoshop.domImagingModuleMod.imaging.^
import typings.photoshop.photoshopStrings.imageSlashuncompressed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createImageDataFromBuffer(arrayBuffer: js.typedarray.Float32Array, options: CreateImageDataFromBufferOptions): js.Promise[PhotoshopImageData] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageDataFromBuffer")(arrayBuffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PhotoshopImageData]]
inline def createImageDataFromBuffer(arrayBuffer: js.typedarray.Uint16Array, options: CreateImageDataFromBufferOptions): js.Promise[PhotoshopImageData] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageDataFromBuffer")(arrayBuffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PhotoshopImageData]]
/**
  * This API allows JavaScript to create arbitrary image data from a memory buffer.
  *
  * ```javascript
  * const imageData = await imaging.createImageDataFromBuffer(arrayBuffer, options);
  * ```
  *
  * The number of elements in imageData must be equal to: `width * height * components`.
  *
  * Example:
  * ```javascript
  * const width = 30;
  * const height = 40;
  * const components = 4;  // RGBA
  * const componentCount = width * height;
  * const dataSize = componentCount * components;
  * const arrayBuffer = new Uint8Array(dataSize);
  *
  * // Add some (chunky) data to the buffer
  * for (let i = 0 ; i < componentCount; i += components) {
  *     arrayBuffer[index]   = 255;      // red
  *     arrayBuffer[index+1] = 0;        // green
  *     arrayBuffer[index+2] = 0;        // blue
  *     arrayBuffer[index+3] = 127;      // alpha
  * }
  *
  * const options = {
  * width: width,
  * height: height,
  * components: components,
  * colorProfile: "sRGB IEC61966-2.1",
  * colorSpace: "RGB"
  * };
  * const imageData = await imaging.createImageDataFromBuffer(arrayBuffer, options)
  * ```
  *
  * Image data that is used for layer masks or document selections uses a single grayscale component.
  * When creating such data, use `components: 1`, `colorSpace: "Grayscale"`
  * and `colorProfile: "Gray Gamma 2.2"` as shown in the following example:
  *
  * ```javascript
  * const width = 30;
  * const height = 40;
  * const componentCount = width * height;
  * const arrayBuffer = new Uint8Array(componentCount);
  *
  * for (let i = 0 ; i < componentCount; ++i) {
  * arrayBuffer[i] = 127; // all set to the median value
  * }
  *
  * const options = {
  * width: width,
  * height: height,
  * components: 1,  // masks are grayscale
  * chunky: false,
  * colorProfile: "Gray Gamma 2.2",
  * colorSpace: "Grayscale"
  * };
  * const maskData = await imaging.createImageDataFromBuffer(arrayBuffer, options)
  * ```
  *
  * @minVersion 24.4
  * @async
  */
inline def createImageDataFromBuffer(arrayBuffer: js.typedarray.Uint8Array, options: CreateImageDataFromBufferOptions): js.Promise[PhotoshopImageData] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageDataFromBuffer")(arrayBuffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PhotoshopImageData]]

/**
  * This API is exposed to allow image data to be used with UXP image elements. With the current version of UXP
  * you must use jpeg/base64 encoding when assigning to an image element.
  *
  * ```javascript
  * const dataImage = await imaging.encodeImageData(options);
  * ```
  *
  * Example:
  * ```javascript
  * const imageElement = document.createElement('img');
  *
  * const jpegData = await imaging.encodeImageData({"imageData": imgObj.imageData, "base64": true});
  *
  * const dataUrl = "data:image/jpeg;base64," + jpegData;
  * imageElement.src = dataUrl;
  * document.body.appendChild(imageElement);
  * ```
  *
  * @minVersion 24.4
  * @async
  */
inline def encodeImageData(options: EncodeImageDataOptions): js.Promise[js.Array[Double] | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeImageData")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Double] | String]]

/**
  * This API allows JavaScript to retrieve the pixel data representing a layer's mask.
  * ```javascript
  * const imageObj = await imaging.getLayerMask(options);
  * ```
  *
  * Example - get the user mask for a layer
  * ```javascript
  * const imageObj = await imaging.getLayerMask({
  *     documentID: 123,
  *     layerID: 5,
  *     kind: "user"
  *     sourceBounds: { left: 0, top: 0, right: 300, bottom: 300 },
  *     targetSize: { height: 100 }
  * });
  * ```
  *
  * @minVersion 24.4
  * @async
  */
inline def getLayerMask(options: GetLayerMaskOptions): js.Promise[GetLayerMaskResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLayerMask")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetLayerMaskResult]]

/**
  * This API allows JavaScript to obtain pixel data from a Photoshop document.
  * You can request pixels from an individual layer, or from the full document composite.
  *
  * ```javascript
  * const imageObj = await imaging.getPixels(options);
  * ```
  *
  * Note: the `components` property of the image data depends on whether or not the pixel source
  * includes an alpha channel, e.g., 4 for RGBA.
  *
  * If the targetSize is smaller than the requested region, then the resulting image data will
  * be scaled down. When scaling, Photoshop may use a smaller (cached) version of the image canvas.
  * This is known as a pyramid level. The number of pyramid levels that are available in a document
  * is determined by the preference: *"Performance Cache Levels"*. Using a cache level may result in
  * dramatic performance improvements. The returned level indicates which level that was used.
  * Level 0 indicates the full resolution canvas. Level 1 indicates a cache that is half of the
  * size of the full resolution, and so forth. The returned `sourceBounds` are relative to the
  * bounds of the source cache level (not relative to the full resolution bounds).
  *
  * The valid bounds for the `sourceBounds` depend on the pixel source. The origin of the composite
  * image is `(0, 0)`,and the size is given by the properties `width` and `height` on the DOM object
  * for the source document. The origin of a pixel layer can be different from `(0, 0)`. You can get
  * the valid pixel bounds for a layer by calling `boundsNoEffects` on the DOM object corresponding
  * to the source layer.
  *
  *
  * Example - create a thumbnail of an region of the target document that is 100 pixels tall.
  * ```javascript
  * const thumbnail = await imaging.getPixels({
  *     sourceBounds: { left: 0, top: 0, right: 300, bottom: 300 },
  *     targetSize: { height: 100 }
  * });
  * ```
  *
  * @minVersion 24.4
  * @async
  */
inline def getPixels(options: GetPixelsOptions): js.Promise[GetPixelsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPixels")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetPixelsResult]]

/**
  * This API allows JavaScript to obtain a pixel representation of the active selection.
  * Think of it like entering [Quick Mask mode](https://helpx.adobe.com/photoshop/using/create-temporary-quick-mask.html).
  * ```javascript
  * const imageObj = await imaging.getSelection(options);
  * ```
  *
  * Example - get the document selection
  * ```javascript
  * const imageObj = await imaging.getSelection({
  *     documentID: 123,
  *     sourceBounds: { left: 0, top: 0, right: 300, bottom: 300 }
  * });
  * ```
  *
  * @minVersion 24.4
  * @async
  */
inline def getSelection(options: GetSelectionOptions): js.Promise[GetSelectionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelection")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSelectionResult]]

/**
  * This API allows JavaScript to edit the pixels of a layer's mask.  At this time, only pixel
  * masks are editable. In the UI, they are what is referred to as a "Layer Mask".
  *
  * ```javascript
  * await imaging.putLayerMask(options);
  * ```
  *
  * Example:
  * ```javascript
  * await imaging.putLayerMask({
  *     layerID: 123
  *     imageData: grayImageData
  * });
  * ```
  *
  * @minVersion 24.4
  * @async
  */
inline def putLayerMask(options: PutLayerMaskOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("putLayerMask")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

/**
  * This API allows JavaScript to change pixel data in a layer. You can replace all pixels
  * in a layer or a region of the layer.
  *
  * ```javascript
  * await imaging.putPixels(options);
  * ```
  *
  * @minVersion 24.4
  * @async
  */
inline def putPixels(options: PutPixelsOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("putPixels")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

/**
  * This API allows JavaScript to change the selection itself using a provided pixel data representation.
  * Think of it like exiting [Quick Mask mode](https://helpx.adobe.com/photoshop/using/create-temporary-quick-mask.html).
  *
  * ```javascript
  * await imaging.putSelection(options);
  * ```
  *
  * Example:
  * ```javascript
  * await imaging.putSelection({ imageData: grayImageData });
  * ```
  *
  * @minVersion 24.4
  * @async
  */
inline def putSelection(options: PutSelectionOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("putSelection")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

/**
  * @minVersion 24.4
  */
type Type = imageSlashuncompressed
