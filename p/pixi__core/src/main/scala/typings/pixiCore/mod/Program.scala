package typings.pixiCore.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "Program")
@js.native
/**
  * @param vertexSrc - The source of the vertex shader.
  * @param fragmentSrc - The source of the fragment shader.
  * @param name - Name for shader
  */
open class Program () extends StObject {
  def this(vertexSrc: String) = this()
  def this(vertexSrc: String, fragmentSrc: String) = this()
  def this(vertexSrc: Unit, fragmentSrc: String) = this()
  def this(vertexSrc: String, fragmentSrc: String, name: String) = this()
  def this(vertexSrc: String, fragmentSrc: Unit, name: String) = this()
  def this(vertexSrc: Unit, fragmentSrc: String, name: String) = this()
  def this(vertexSrc: Unit, fragmentSrc: Unit, name: String) = this()
  
  /** Assigned when a program is first bound to the shader system. */
  var attributeData: StringDictionary[IAttributeData] = js.native
  
  /** Source code for the fragment shader. */
  var fragmentSrc: String = js.native
  
  var glPrograms: NumberDictionary[GLProgram] = js.native
  
  var id: Double = js.native
  
  var nameCache: Any = js.native
  
  var syncUniforms: Any = js.native
  
  /** Assigned when a program is first bound to the shader system. */
  var uniformData: StringDictionary[IUniformData] = js.native
  
  /** Source code for the vertex shader. */
  var vertexSrc: String = js.native
}
/* static members */
object Program {
  
  @JSImport("@pixi/core", "Program")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A short hand function to create a program based of a vertex and fragment shader.
    *
    * This method will also check to see if there is a cached program.
    * @param vertexSrc - The source of the vertex shader.
    * @param fragmentSrc - The source of the fragment shader.
    * @param name - Name for shader
    * @returns A shiny new PixiJS shader program!
    */
  inline def from(): Program = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[Program]
  inline def from(vertexSrc: String): Program = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any]).asInstanceOf[Program]
  inline def from(vertexSrc: String, fragmentSrc: String): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any])).asInstanceOf[Program]
  inline def from(vertexSrc: String, fragmentSrc: String, name: String): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Program]
  inline def from(vertexSrc: String, fragmentSrc: Unit, name: String): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Program]
  inline def from(vertexSrc: Unit, fragmentSrc: String): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any])).asInstanceOf[Program]
  inline def from(vertexSrc: Unit, fragmentSrc: String, name: String): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Program]
  inline def from(vertexSrc: Unit, fragmentSrc: Unit, name: String): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Program]
}
