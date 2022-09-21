package typings.pixiCore.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.pixiUtils.mod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "BatchShaderGenerator")
@js.native
open class BatchShaderGenerator protected () extends StObject {
  /**
    * @param vertexSrc - Vertex shader
    * @param fragTemplate - Fragment shader template
    */
  def this(vertexSrc: String, fragTemplate: String) = this()
  
  var defaultGroupCache: NumberDictionary[UniformGroup[Dict[Any]]] = js.native
  
  /** Reference to the fragment shader template. Must contain "%count%" and "%forloop%". */
  var fragTemplate: String = js.native
  
  def generateSampleSrc(maxTextures: Double): String = js.native
  
  def generateShader(maxTextures: Double): Shader = js.native
  
  var programCache: NumberDictionary[Program] = js.native
  
  /** Reference to the vertex shader source. */
  var vertexSrc: String = js.native
}
