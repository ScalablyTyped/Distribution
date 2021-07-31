package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper that generates batching multi-texture shader. Use it with your new BatchRenderer
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "BatchShaderGenerator")
@js.native
class BatchShaderGenerator protected ()
  extends StObject
     with typings.pixiJs.PIXI.BatchShaderGenerator {
  def this(vertexSrc: String, fragTemplate: String) = this()
  
  /**
    * Reference to the fragement shader template. Must contain "%count%" and "%forloop%".
    *
    * @member {string} PIXI.BatchShaderGenerator#fragTemplate
    */
  /* CompleteClass */
  var fragTemplate: String = js.native
  
  /**
    * Reference to the vertex shader source.
    *
    * @member {string} PIXI.BatchShaderGenerator#vertexSrc
    */
  /* CompleteClass */
  var vertexSrc: String = js.native
}
