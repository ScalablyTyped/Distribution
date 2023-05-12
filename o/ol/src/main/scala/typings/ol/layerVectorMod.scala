package typings.ol

import typings.ol.layerBaseVectorMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerVectorMod {
  
  /**
    * @classdesc
    * Vector data is rendered client-side, as vectors. This layer type provides most accurate rendering
    * even during animations. Points and labels stay upright on rotated views. For very large
    * amounts of vector data, performance may suffer during pan and zoom animations. In this case,
    * try {@link module:ol/layer/VectorImage~VectorImageLayer}.
    *
    * Note that any property set in the options is set as a {@link module:ol/Object~BaseObject}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @template {import("../source/Vector.js").default} VectorSourceType
    * @extends {BaseVectorLayer<VectorSourceType, CanvasVectorLayerRenderer>}
    * @api
    */
  @JSImport("ol/layer/Vector", JSImport.Default)
  @js.native
  /**
    * @param {import("./BaseVector.js").Options<VectorSourceType>} [options] Options.
    */
  open class default[VectorSourceType /* <: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] */] ()
    extends typings.ol.layerBaseVectorMod.default[VectorSourceType, typings.ol.rendererCanvasVectorLayerMod.default] {
    def this(options: Options[VectorSourceType]) = this()
  }
  
  /**
    * @classdesc
    * Vector data is rendered client-side, as vectors. This layer type provides most accurate rendering
    * even during animations. Points and labels stay upright on rotated views. For very large
    * amounts of vector data, performance may suffer during pan and zoom animations. In this case,
    * try {@link module:ol/layer/VectorImage~VectorImageLayer}.
    *
    * Note that any property set in the options is set as a {@link module:ol/Object~BaseObject}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @template {import("../source/Vector.js").default} VectorSourceType
    * @extends {BaseVectorLayer<VectorSourceType, CanvasVectorLayerRenderer>}
    * @api
    */
  type VectorLayer[VectorSourceType /* <: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] */] = typings.ol.layerBaseVectorMod.default[VectorSourceType, typings.ol.rendererCanvasVectorLayerMod.default]
}
