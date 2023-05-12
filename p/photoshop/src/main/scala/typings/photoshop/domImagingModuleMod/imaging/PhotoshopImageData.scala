package typings.photoshop.domImagingModuleMod.imaging

import typings.photoshop.photoshopInts.`16`
import typings.photoshop.photoshopInts.`32`
import typings.photoshop.photoshopInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Image data is represented by a PhotoshopImageData instance.
  * @returnobject
  * @targetfolder objects/returnobjects
  */
trait PhotoshopImageData extends StObject {
  
  /**
    * True if the image data internally is using the chunky format.
    */
  var chunky: Boolean
  
  /**
    * The color profile for the image data. For example, `"sRGB IEC61966-2.1"`. If the color profile is empty,
    * then the profile of a target document will be used.
    */
  var colorProfile: String
  
  /**
    * The color space (or mode) for the image data.
    */
  var colorSpace: ColorSpace
  
  /**
    * Number of bits per component. This can be 8, 16, or 32.
    */
  var componentSize: `8` | `16` | `32`
  
  /**
    * Number of components per pixel. This is 3 for RGB, 4 for RGBA and so forth.
    */
  var components: Double
  
  /**
    * Calling this synchronous method will release the contained image data. Doing so will reduce memory
    * usage faster then waiting for the JavaScript garbage collector to run.
    *
    * ```javascript
    * pixelData.dispose();
    * ```
    */
  def dispose(): js.Promise[Unit]
  
  /**
    * Return pixel information from an `PhotoshopImageData` instance as a typed array.
    * The return type depends on the `componentSize` of the image.
    *
    * | Component Size | Return type |
    * | -------------- | ----------- |
    * | 8              | Uint8Array  |
    * | 16             | Uint16Array |
    * | 32             | Float32Array  |
    *
    * Example:
    * ```javascript
    * const pixelData = await imageObj.imageData.getData()
    * ```
    * @param options
    */
  def getData(options: GetDataOptions): js.Promise[
    js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Float32Array
  ]
  
  /**
    * True if the image data includes an alpha channel.
    */
  var hasAlpha: Boolean
  
  /**
    * The height of the image data in pixels.
    */
  var height: Double
  
  /**
    * Memory layout (order) of components in a pixel.
    */
  var pixelFormat: PixelFormat
  
  /**
    * Type of contained data. At the moment only "image/uncompressed" is supported.
    */
  var `type`: Type
  
  /**
    * The width of the image data in pixels.
    */
  var width: Double
}
object PhotoshopImageData {
  
  inline def apply(
    chunky: Boolean,
    colorProfile: String,
    colorSpace: ColorSpace,
    componentSize: `8` | `16` | `32`,
    components: Double,
    dispose: () => js.Promise[Unit],
    getData: GetDataOptions => js.Promise[
      js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Float32Array
    ],
    hasAlpha: Boolean,
    height: Double,
    pixelFormat: PixelFormat,
    `type`: Type,
    width: Double
  ): PhotoshopImageData = {
    val __obj = js.Dynamic.literal(chunky = chunky.asInstanceOf[js.Any], colorProfile = colorProfile.asInstanceOf[js.Any], colorSpace = colorSpace.asInstanceOf[js.Any], componentSize = componentSize.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), getData = js.Any.fromFunction1(getData), hasAlpha = hasAlpha.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], pixelFormat = pixelFormat.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoshopImageData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhotoshopImageData] (val x: Self) extends AnyVal {
    
    inline def setChunky(value: Boolean): Self = StObject.set(x, "chunky", value.asInstanceOf[js.Any])
    
    inline def setColorProfile(value: String): Self = StObject.set(x, "colorProfile", value.asInstanceOf[js.Any])
    
    inline def setColorSpace(value: ColorSpace): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setComponentSize(value: `8` | `16` | `32`): Self = StObject.set(x, "componentSize", value.asInstanceOf[js.Any])
    
    inline def setComponents(value: Double): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setDispose(value: () => js.Promise[Unit]): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setGetData(
      value: GetDataOptions => js.Promise[
          js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Float32Array
        ]
    ): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
    
    inline def setHasAlpha(value: Boolean): Self = StObject.set(x, "hasAlpha", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setPixelFormat(value: PixelFormat): Self = StObject.set(x, "pixelFormat", value.asInstanceOf[js.Any])
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
