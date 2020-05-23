package typings.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper that generates batching multi-texture shader. Use it with your new BatchRenderer
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.BatchShaderGenerator")
@js.native
class BatchShaderGenerator protected ()
  extends typings.pixiJs.PIXI.BatchShaderGenerator {
  def this(vertexSrc: String, fragTemplate: String) = this()
  /**
    * Reference to the fragement shader template. Must contain "%count%" and "%forloop%".
    *
    * @member {string} PIXI.BatchShaderGenerator#fragTemplate
    */
  /* CompleteClass */
  override var fragTemplate: String = js.native
  /**
    * Reference to the vertex shader source.
    *
    * @member {string} PIXI.BatchShaderGenerator#vertexSrc
    */
  /* CompleteClass */
  override var vertexSrc: String = js.native
}

