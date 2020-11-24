package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper that generates batching multi-texture shader. Use it with your new BatchRenderer
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait BatchShaderGenerator extends js.Object {
  
  /**
    * Reference to the fragement shader template. Must contain "%count%" and "%forloop%".
    *
    * @member {string} PIXI.BatchShaderGenerator#fragTemplate
    */
  var fragTemplate: String = js.native
  
  /**
    * Reference to the vertex shader source.
    *
    * @member {string} PIXI.BatchShaderGenerator#vertexSrc
    */
  var vertexSrc: String = js.native
}
object BatchShaderGenerator {
  
  @scala.inline
  def apply(fragTemplate: String, vertexSrc: String): BatchShaderGenerator = {
    val __obj = js.Dynamic.literal(fragTemplate = fragTemplate.asInstanceOf[js.Any], vertexSrc = vertexSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchShaderGenerator]
  }
  
  @scala.inline
  implicit class BatchShaderGeneratorOps[Self <: BatchShaderGenerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFragTemplate(value: String): Self = this.set("fragTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexSrc(value: String): Self = this.set("vertexSrc", value.asInstanceOf[js.Any])
  }
}
