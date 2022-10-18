package typings.photoshop

import typings.photoshop.anon.Interpolation
import typings.photoshop.domCollectionsLayersMod.Layers
import typings.photoshop.domConstantsMod.AnchorPosition
import typings.photoshop.domConstantsMod.BlendMode
import typings.photoshop.domConstantsMod.ElementPlacement
import typings.photoshop.domConstantsMod.LayerKind
import typings.photoshop.domConstantsMod.RasterizeType
import typings.photoshop.domDocumentMod.Document
import typings.photoshop.domObjectsBoundsMod.Bounds
import typings.photoshop.photoshopStrings.both
import typings.photoshop.photoshopStrings.horizontal
import typings.photoshop.photoshopStrings.vertical
import typings.photoshop.utilUnitMod.AngleValue
import typings.photoshop.utilUnitMod.PercentValue
import typings.photoshop.utilUnitMod.PixelValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domLayerMod {
  
  @JSImport("photoshop/dom/Layer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("photoshop/dom/Layer", "Layer")
  @js.native
  open class Layer protected () extends StObject {
    /**
      * @ignore
      */
    def this(id: Double, docId: Double) = this()
    
    /**
      * @ignore
      * We use ID to reference the layer's document internally
      */
    val _docId: Double = js.native
    
    /**
      * @ignore
      * We use ID to reference layers internally
      */
    /* private */ val _id: Any = js.native
    
    /**
      * When set to true, prevents edits to pixels and properties of this layer
      */
    def allLocked: Boolean = js.native
    def allLocked_=(locking: Boolean): Unit = js.native
    
    /**
      * The blend mode of the layer
      */
    def blendMode: BlendMode = js.native
    /**
      * Set the blend mode of the layer
      */
    def blendMode_=(blendMode: BlendMode): Unit = js.native
    
    /**
      * Bounds of the layer, including the effects
      */
    def bounds: Bounds = js.native
    
    /**
      * Bounds of the layer excluding effects
      */
    def boundsNoEffects: Bounds = js.native
    
    /**
      * Moves the layer to a position above the topmost layer or group.
      */
    def bringToFront(): Unit = js.native
    
    /**
      * Clears the layer and does not copy to the clipboard.
      * If no selection is found then select all the pixels and then cut.
      *
      * @async
      */
    def clear(): js.Promise[Unit] = js.native
    
    /**
      * Copies the layer to the clipboard. When the optional argument is set to true, a
      * merged copy is performed (that is, all visible layers are copied to the clipboard).
      * ```javascript
      * await layer.copy(true)
      * await layer.copy()
      * ```
      * @async
      */
    def copy(): js.Promise[Unit] = js.native
    def copy(merge: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Cuts the layer to the clipboard. If no selection is found then select all the pixels and then cut.
      *
      * @async
      */
    def cut(): js.Promise[Unit] = js.native
    
    /**
      * Deletes this layer from the document.
      * ```javascript
      * const layers = document.layers
      * layers && layers[0] && layers[0].delete()
      * ```
      * @returns number of layer elements deleted
      */
    def delete(): Unit = js.native
    
    /**
      * The document this layer is in
      */
    def document: Document = js.native
    
    /**
      * Duplicates the layer, creating a copy above it in layer stack,
      * and returns the newly created layer.
      * ```javascript
      * // duplicate a layer
      * const copyLayer = await layer.duplicate()
      *
      * // extract to a new document
      * const exportDoc = psApp.documents[1]
      * const exportedLayer = await layer.duplicate(exportDoc)
      * ```
      * @param targetDocument if specified, duplicate to a different document target.
      *
      * @async
      */
    def duplicate(): js.Promise[Layer | Null] = js.native
    def duplicate(relativeObject: Unit, insertionLocation: Unit, name: String): js.Promise[Layer | Null] = js.native
    def duplicate(relativeObject: Unit, insertionLocation: ElementPlacement): js.Promise[Layer | Null] = js.native
    def duplicate(relativeObject: Unit, insertionLocation: ElementPlacement, name: String): js.Promise[Layer | Null] = js.native
    def duplicate(relativeObject: Document): js.Promise[Layer | Null] = js.native
    def duplicate(relativeObject: Document, insertionLocation: Unit, name: String): js.Promise[Layer | Null] = js.native
    def duplicate(relativeObject: Document, insertionLocation: ElementPlacement): js.Promise[Layer | Null] = js.native
    def duplicate(relativeObject: Document, insertionLocation: ElementPlacement, name: String): js.Promise[Layer | Null] = js.native
    def duplicate(relativeObject: Layer): js.Promise[Layer | Null] = js.native
    def duplicate(relativeObject: Layer, insertionLocation: Unit, name: String): js.Promise[Layer | Null] = js.native
    def duplicate(relativeObject: Layer, insertionLocation: ElementPlacement): js.Promise[Layer | Null] = js.native
    def duplicate(relativeObject: Layer, insertionLocation: ElementPlacement, name: String): js.Promise[Layer | Null] = js.native
    
    /**
      * The fill opacity of the layer, in percentage.
      */
    def fillOpacity: Double = js.native
    /**
      * Set the fill opacity setting of the layer.
      */
    def fillOpacity_=(opacity: Double): Unit = js.native
    
    /**
      * The density of the filter mask, in percentage.
      */
    def filterMaskDensity: Double = js.native
    /**
      * Set the density of the filter mask.
      */
    def filterMaskDensity_=(density: Double): Unit = js.native
    
    /**
      * The feather of the filter mask between 0.0 and 1000.0.
      */
    def filterMaskFeather: Double = js.native
    /**
      * Set the feather of the filter mask.
      */
    def filterMaskFeather_=(feather: Double): Unit = js.native
    
    /**
      * Flips the layer on one or both axis.
      *
      * ```javascript
      * // flip horizontally
      * await layer.flip.horizontal()
      * ```
      * @param axis Which axis (or both) to flip the layer on.
      *             - "horizontal": flip layer on horizontal axis
      *             - "vertical": flip layer on vertical axis
      *             - "both": flip layer on both axes
      * @async
      */
    def flip(axis: horizontal | vertical | both): js.Promise[Unit] = js.native
    
    /**
      * ID of the layer, can be used for making batchPlay calls
      */
    def id: Double = js.native
    
    def isBackgroundLayer: Boolean = js.native
    
    /**
      * Is the mask used as a clipping mask.
      */
    def isClippingMask: Boolean = js.native
    /**
      * Set the mask to be used as a clipping mask.
      */
    def isClippingMask_=(clipped: Boolean): Unit = js.native
    
    /**
      * Kind of the layer
      */
    def kind: LayerKind = js.native
    
    /**
      * The density of the layer mask, in percentage.
      */
    def layerMaskDensity: Double = js.native
    /**
      * Set the density of the layer mask.
      */
    def layerMaskDensity_=(density: Double): Unit = js.native
    
    /**
      * The feather of the layer mask between 0.0 and 1000.0.
      */
    def layerMaskFeather: Double = js.native
    /**
      * Set the feather of the layer mask.
      */
    def layerMaskFeather_=(feather: Double): Unit = js.native
    
    /**
      * The layers of this group layer
      * ```javascript
      * group.layers.forEach((layer) => {
      *   ...
      * })
      * ```
      */
    def layers: Layers | Null = js.native
    
    /**
      * Creates a link between this layer and the target layer if not already linked,
      * and returns a list of layers linked to this layer.
      * ```javascript
      * // link two layers together
      * const linkedLayers = strokes.link(fillLayer)
      * linkedLayers.forEach((layer) => console.log(layer.name))
      * > "strokes"
      * > "fillLayer"
      * ```
      */
    def link(targetLayer: Layer): js.Array[Layer] = js.native
    
    /**
      * Layers linked to this layer. See [[Layer.link]]
      */
    def linkedLayers: Layers = js.native
    
    /**
      * True if any property of this layer is locked
      */
    def locked: Boolean = js.native
    
    /**
      * Merges layers. This operates on the currently selected layers. If multiple
      * layers are selected, they will be merged together. If one layer is selected,
      * it is merged down with the layer beneath. In this case, the layer below must
      * be a pixel layer. The merged layer will now be the active layer.
      *
      * @async
      */
    def merge(): js.Promise[Layer] = js.native
    
    /**
      * Moves the layer relative to the layer specified in parameters.
      * "placeAfter" places the layer below relativeObject.
      * "placeBefore" places the layer above relativeObject.
      * "placeInside" places the layer inside relativeObject if relativeObject is a group layer.
      * `ElementPlacement.PLACEINSIDE` is only valid when `relativeObject.kind === LayerKind.group`
      */
    def move(relativeObject: Layer, insertLocation: ElementPlacement): Unit = js.native
    
    /**
      * Name of the layer
      */
    def name: String = js.native
    /**
      * @ignore
      * Set the name of the layer
      */
    def name_=(name: String): Unit = js.native
    
    /**
      * The master opacity of the layer, in percentage.
      */
    def opacity: Double = js.native
    /**
      * Set the opacity setting of the layer
      */
    def opacity_=(opacity: Double): Unit = js.native
    
    /**
      * The group layer this layer is in,
      * null if the layer is a top layer in the document
      */
    def parent: Layer | Null = js.native
    
    /**
      * When set to true, prevents the pixels of this layer from being edited
      */
    def pixelsLocked: Boolean = js.native
    def pixelsLocked_=(locking: Boolean): Unit = js.native
    
    /**
      * When set to true, prevents the layer from being moved
      */
    def positionLocked: Boolean = js.native
    def positionLocked_=(locking: Boolean): Unit = js.native
    
    /**
      * Converts the targeted contents in the layer into a flat, raster image.
      *
      * @async
      */
    def rasterize(target: RasterizeType): js.Promise[Unit] = js.native
    
    /**
      * Rotates the layer.
      * ```javascript
      * // rotate 90 deg counter clockwise
      * await layer.rotate(-90)
      *
      * // rotate 90 deg clockwise relative to top left corner
      * let anchorPos = require('photoshop').constants.AnchorPosition
      * await layer.rotate(90, anchorPos.TOPLEFT)
      * ```
      * @param angle Angle to rotate the layer by in degrees
      * @param anchor Anchor position to rotate around
      * @param options.interpolation Interpolation method to use when resampling the image
      *
      * @async
      */
    def rotate(angle: Double): js.Promise[Unit] = js.native
    def rotate(angle: Double, anchor: Unit, options: Interpolation): js.Promise[Unit] = js.native
    def rotate(angle: Double, anchor: AnchorPosition): js.Promise[Unit] = js.native
    def rotate(angle: Double, anchor: AnchorPosition, options: Interpolation): js.Promise[Unit] = js.native
    def rotate(angle: AngleValue): js.Promise[Unit] = js.native
    def rotate(angle: AngleValue, anchor: Unit, options: Interpolation): js.Promise[Unit] = js.native
    def rotate(angle: AngleValue, anchor: AnchorPosition): js.Promise[Unit] = js.native
    def rotate(angle: AngleValue, anchor: AnchorPosition, options: Interpolation): js.Promise[Unit] = js.native
    
    /**
      * Scales the layer.
      * Renamed from `resize` in ExtendScript.
      * ```javascript
      * await layer.scale(80, 80)
      *
      * // Scale the layer to be a quarter of the size relative to bottom left corner
      * let anchorPos = require('photoshop').constants.AnchorPosition
      * await layer.scale(50, 50, anchorPos.BOTTOMLEFT)
      * ```
      * @param width Numeric percentage to scale layer horizontally
      * @param height Numeric percentage to scale layer vertically
      * @param anchor Anchor position to rotate around
      * @param options.interpolation Interpolation method to use when resampling the image
      *
      * @async
      */
    def scale(width: Double, height: Double): js.Promise[Unit] = js.native
    def scale(width: Double, height: Double, anchor: Unit, options: Interpolation): js.Promise[Unit] = js.native
    def scale(width: Double, height: Double, anchor: AnchorPosition): js.Promise[Unit] = js.native
    def scale(width: Double, height: Double, anchor: AnchorPosition, options: Interpolation): js.Promise[Unit] = js.native
    def scale(width: Double, height: PercentValue): js.Promise[Unit] = js.native
    def scale(width: Double, height: PercentValue, anchor: Unit, options: Interpolation): js.Promise[Unit] = js.native
    def scale(width: Double, height: PercentValue, anchor: AnchorPosition): js.Promise[Unit] = js.native
    def scale(width: Double, height: PercentValue, anchor: AnchorPosition, options: Interpolation): js.Promise[Unit] = js.native
    def scale(width: PercentValue, height: Double): js.Promise[Unit] = js.native
    def scale(width: PercentValue, height: Double, anchor: Unit, options: Interpolation): js.Promise[Unit] = js.native
    def scale(width: PercentValue, height: Double, anchor: AnchorPosition): js.Promise[Unit] = js.native
    def scale(width: PercentValue, height: Double, anchor: AnchorPosition, options: Interpolation): js.Promise[Unit] = js.native
    def scale(width: PercentValue, height: PercentValue): js.Promise[Unit] = js.native
    def scale(width: PercentValue, height: PercentValue, anchor: Unit, options: Interpolation): js.Promise[Unit] = js.native
    def scale(width: PercentValue, height: PercentValue, anchor: AnchorPosition): js.Promise[Unit] = js.native
    def scale(width: PercentValue, height: PercentValue, anchor: AnchorPosition, options: Interpolation): js.Promise[Unit] = js.native
    
    /**
      * @ignore
      * The selection status of the layer
      */
    def selected: Boolean = js.native
    def selected_=(select: Boolean): Unit = js.native
    
    /**
      * Moves the layer to the bottom. If the bottom layer is the
      * background, it will move the layer to the position above the background.
      * If it is in a group, it will move to the bottom of the group.
      */
    def sendToBack(): Unit = js.native
    
    /**
      * @ignore
      */
    /* private */ var setLocking: Any = js.native
    
    /**
      * Applies a skew to the layer.
      * ```javascript
      * // parellelogram shape
      * await layer.skew(-15, 0)
      * ```
      * @param angleH Horizontal angle to skew by
      * @param angleV Vertical angle to skew by
      * @param option.interpolation Interpolation method to use when resampling the image
      *
      * @async
      */
    def skew(angleH: Double, angleV: Double): js.Promise[Unit] = js.native
    def skew(angleH: Double, angleV: Double, options: Interpolation): js.Promise[Unit] = js.native
    def skew(angleH: Double, angleV: AngleValue): js.Promise[Unit] = js.native
    def skew(angleH: Double, angleV: AngleValue, options: Interpolation): js.Promise[Unit] = js.native
    def skew(angleH: AngleValue, angleV: Double): js.Promise[Unit] = js.native
    def skew(angleH: AngleValue, angleV: Double, options: Interpolation): js.Promise[Unit] = js.native
    def skew(angleH: AngleValue, angleV: AngleValue): js.Promise[Unit] = js.native
    def skew(angleH: AngleValue, angleV: AngleValue, options: Interpolation): js.Promise[Unit] = js.native
    
    /**
      * Moves the layer (translation).
      * ```javascript
      * // Translate the layer to the left by 200px
      * await layer.translate(-200, 0)
      *
      * // move the layer one height down
      * let xOffsetPct = {_unit: "percentUnit", _value: 0};
      * let yOffsetPct = {_unit: "percentUnit", _value: 100};
      * await layer.translate(xOffsetPct, yOffsetPct);
      * ```
      * @param horizontal Numeric value to offset layer by in pixels or percent
      * @param vertical Numeric value to offset layer by in pixels or percent
      *
      * @async
      */
    def translate(horizontal: Double, vertical: Double): js.Promise[Unit] = js.native
    def translate(horizontal: Double, vertical: PercentValue): js.Promise[Unit] = js.native
    def translate(horizontal: Double, vertical: PixelValue): js.Promise[Unit] = js.native
    def translate(horizontal: PercentValue, vertical: Double): js.Promise[Unit] = js.native
    def translate(horizontal: PercentValue, vertical: PercentValue): js.Promise[Unit] = js.native
    def translate(horizontal: PercentValue, vertical: PixelValue): js.Promise[Unit] = js.native
    def translate(horizontal: PixelValue, vertical: Double): js.Promise[Unit] = js.native
    def translate(horizontal: PixelValue, vertical: PercentValue): js.Promise[Unit] = js.native
    def translate(horizontal: PixelValue, vertical: PixelValue): js.Promise[Unit] = js.native
    
    /**
      * When set to true, prevents the transparent pixels from being edited
      */
    def transparentPixelsLocked: Boolean = js.native
    def transparentPixelsLocked_=(locking: Boolean): Unit = js.native
    
    /**
      * The class name of the referenced Layer object
      */
    def typename: String = js.native
    
    /**
      * Unlinks the layer from any existing links.
      * ```javascript
      * // detach layer from any existing links
      * await layer.unlink()
      * ```
      * @async
      */
    def unlink(): js.Promise[Unit] = js.native
    
    /**
      * The density of the vector mask, in percentage.
      */
    def vectorMaskDensity: Double = js.native
    /**
      * Set the density of the vector mask.
      */
    def vectorMaskDensity_=(density: Double): Unit = js.native
    
    /**
      * The feather of the vector mask between 0.0 and 1000.0
      */
    def vectorMaskFeather: Double = js.native
    /**
      * Set the feather of the vector mask.
      */
    def vectorMaskFeather_=(feather: Double): Unit = js.native
    
    /**
      * True when the layer is visible.
      */
    def visible: Boolean = js.native
    def visible_=(visible: Boolean): Unit = js.native
  }
  
  inline def PSLayer(id: Double, docId: Double): Layer = (^.asInstanceOf[js.Dynamic].applyDynamic("PSLayer")(id.asInstanceOf[js.Any], docId.asInstanceOf[js.Any])).asInstanceOf[Layer]
  inline def PSLayer(id: Double, docId: Double, layerKind: Double): Layer = (^.asInstanceOf[js.Dynamic].applyDynamic("PSLayer")(id.asInstanceOf[js.Any], docId.asInstanceOf[js.Any], layerKind.asInstanceOf[js.Any])).asInstanceOf[Layer]
  
  @js.native
  sealed trait PSLayerKind extends StObject
  @JSImport("photoshop/dom/Layer", "PSLayerKind")
  @js.native
  object PSLayerKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PSLayerKind & Double] = js.native
    
    @js.native
    sealed trait adjustment
      extends StObject
         with PSLayerKind
    /* 2 */ val adjustment: typings.photoshop.domLayerMod.PSLayerKind.adjustment & Double = js.native
    
    @js.native
    sealed trait any
      extends StObject
         with PSLayerKind
    /* 0 */ val any: typings.photoshop.domLayerMod.PSLayerKind.any & Double = js.native
    
    @js.native
    sealed trait background
      extends StObject
         with PSLayerKind
    /* 12 */ val background: typings.photoshop.domLayerMod.PSLayerKind.background & Double = js.native
    
    @js.native
    sealed trait gradient
      extends StObject
         with PSLayerKind
    /* 9 */ val gradient: typings.photoshop.domLayerMod.PSLayerKind.gradient & Double = js.native
    
    @js.native
    sealed trait group
      extends StObject
         with PSLayerKind
    /* 7 */ val group: typings.photoshop.domLayerMod.PSLayerKind.group & Double = js.native
    
    @js.native
    sealed trait groupEnd
      extends StObject
         with PSLayerKind
    /* 13 */ val groupEnd: typings.photoshop.domLayerMod.PSLayerKind.groupEnd & Double = js.native
    
    @js.native
    sealed trait pattern
      extends StObject
         with PSLayerKind
    /* 10 */ val pattern: typings.photoshop.domLayerMod.PSLayerKind.pattern & Double = js.native
    
    @js.native
    sealed trait pixel
      extends StObject
         with PSLayerKind
    /* 1 */ val pixel: typings.photoshop.domLayerMod.PSLayerKind.pixel & Double = js.native
    
    @js.native
    sealed trait smartObject
      extends StObject
         with PSLayerKind
    /* 5 */ val smartObject: typings.photoshop.domLayerMod.PSLayerKind.smartObject & Double = js.native
    
    @js.native
    sealed trait solidColor
      extends StObject
         with PSLayerKind
    /* 11 */ val solidColor: typings.photoshop.domLayerMod.PSLayerKind.solidColor & Double = js.native
    
    @js.native
    sealed trait text
      extends StObject
         with PSLayerKind
    /* 3 */ val text: typings.photoshop.domLayerMod.PSLayerKind.text & Double = js.native
    
    @js.native
    sealed trait threeD
      extends StObject
         with PSLayerKind
    /* 8 */ val threeD: typings.photoshop.domLayerMod.PSLayerKind.threeD & Double = js.native
    
    @js.native
    sealed trait vector
      extends StObject
         with PSLayerKind
    /* 4 */ val vector: typings.photoshop.domLayerMod.PSLayerKind.vector & Double = js.native
    
    @js.native
    sealed trait video
      extends StObject
         with PSLayerKind
    /* 6 */ val video: typings.photoshop.domLayerMod.PSLayerKind.video & Double = js.native
  }
  
  inline def validateLayer(l: Layer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateLayer")(l.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
