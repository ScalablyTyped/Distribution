package typings.ol

import typings.ol.layerBaseImageMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerImageMod {
  
  /**
    * @classdesc
    * Server-rendered images that are available for arbitrary extents and
    * resolutions.
    * Note that any property set in the options is set as a {@link module:ol/Object~BaseObject}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @template {import("../source/Image.js").default} ImageSourceType
    * @extends {BaseImageLayer<ImageSourceType, CanvasImageLayerRenderer>}
    * @api
    */
  @JSImport("ol/layer/Image", JSImport.Default)
  @js.native
  /**
    * @param {import("./BaseImage.js").Options<ImageSourceType>} [options] Layer options.
    */
  open class default[ImageSourceType /* <: typings.ol.styleImageMod.default */] () extends ImageLayer[ImageSourceType] {
    def this(options: Options[ImageSourceType]) = this()
  }
  
  /**
    * @classdesc
    * Server-rendered images that are available for arbitrary extents and
    * resolutions.
    * Note that any property set in the options is set as a {@link module:ol/Object~BaseObject}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @template {import("../source/Image.js").default} ImageSourceType
    * @extends {BaseImageLayer<ImageSourceType, CanvasImageLayerRenderer>}
    * @api
    */
  @js.native
  trait ImageLayer[ImageSourceType /* <: typings.ol.styleImageMod.default */]
    extends typings.ol.layerBaseImageMod.default[ImageSourceType, typings.ol.rendererCanvasImageLayerMod.default]
}
