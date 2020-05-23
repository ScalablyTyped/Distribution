package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper that generates batching multi-texture shader. Use it with your new BatchRenderer
  *
  * @class
  * @memberof PIXI
  */
trait BatchShaderGenerator extends js.Object {
  /**
    * Reference to the fragement shader template. Must contain "%count%" and "%forloop%".
    *
    * @member {string} PIXI.BatchShaderGenerator#fragTemplate
    */
  var fragTemplate: String
  /**
    * Reference to the vertex shader source.
    *
    * @member {string} PIXI.BatchShaderGenerator#vertexSrc
    */
  var vertexSrc: String
}

object BatchShaderGenerator {
  @scala.inline
  def apply(fragTemplate: String, vertexSrc: String): BatchShaderGenerator = {
    val __obj = js.Dynamic.literal(fragTemplate = fragTemplate.asInstanceOf[js.Any], vertexSrc = vertexSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchShaderGenerator]
  }
}

