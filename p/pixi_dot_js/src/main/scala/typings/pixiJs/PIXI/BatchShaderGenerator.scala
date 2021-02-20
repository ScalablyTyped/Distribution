package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
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
trait BatchShaderGenerator extends StObject {
  
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
  implicit class BatchShaderGeneratorMutableBuilder[Self <: BatchShaderGenerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFragTemplate(value: String): Self = StObject.set(x, "fragTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexSrc(value: String): Self = StObject.set(x, "vertexSrc", value.asInstanceOf[js.Any])
  }
}
