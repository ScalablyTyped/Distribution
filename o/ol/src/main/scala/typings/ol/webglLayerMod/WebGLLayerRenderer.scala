package typings.ol.webglLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLLayerRenderer[LayerType /* <: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default] */]
  extends typings.ol.rendererLayerMod.default[typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]] {
  
  /**
    * Will return the last shader compilation errors. If no error happened, will return null;
    */
  def getShaderCompileErrors(): String | Null = js.native
  
  var helper: typings.ol.helperMod.default = js.native
}
