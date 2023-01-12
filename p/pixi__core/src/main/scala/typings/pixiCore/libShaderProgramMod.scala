package typings.pixiCore

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.pixiCore.anon.BufferMode
import typings.pixiCore.libShaderGlprogramMod.GLProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShaderProgramMod {
  
  @JSImport("@pixi/core/lib/shader/Program", "Program")
  @js.native
  /**
    * @param vertexSrc - The source of the vertex shader.
    * @param fragmentSrc - The source of the fragment shader.
    * @param name - Name for shader
    * @param extra - Extra data for shader
    */
  open class Program () extends StObject {
    def this(vertexSrc: String) = this()
    def this(vertexSrc: String, fragmentSrc: String) = this()
    def this(vertexSrc: Unit, fragmentSrc: String) = this()
    def this(vertexSrc: String, fragmentSrc: String, name: String) = this()
    def this(vertexSrc: String, fragmentSrc: Unit, name: String) = this()
    def this(vertexSrc: Unit, fragmentSrc: String, name: String) = this()
    def this(vertexSrc: Unit, fragmentSrc: Unit, name: String) = this()
    def this(vertexSrc: String, fragmentSrc: String, name: String, extra: IProgramExtraData) = this()
    def this(vertexSrc: String, fragmentSrc: String, name: Unit, extra: IProgramExtraData) = this()
    def this(vertexSrc: String, fragmentSrc: Unit, name: String, extra: IProgramExtraData) = this()
    def this(vertexSrc: String, fragmentSrc: Unit, name: Unit, extra: IProgramExtraData) = this()
    def this(vertexSrc: Unit, fragmentSrc: String, name: String, extra: IProgramExtraData) = this()
    def this(vertexSrc: Unit, fragmentSrc: String, name: Unit, extra: IProgramExtraData) = this()
    def this(vertexSrc: Unit, fragmentSrc: Unit, name: String, extra: IProgramExtraData) = this()
    def this(vertexSrc: Unit, fragmentSrc: Unit, name: Unit, extra: IProgramExtraData) = this()
    
    /** Assigned when a program is first bound to the shader system. */
    var attributeData: StringDictionary[IAttributeData] = js.native
    
    var extra: IProgramExtraData = js.native
    
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
    
    @JSImport("@pixi/core/lib/shader/Program", "Program")
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
  
  trait IAttributeData extends StObject {
    
    var location: Double
    
    var name: String
    
    var size: Double
    
    var `type`: String
  }
  object IAttributeData {
    
    inline def apply(location: Double, name: String, size: Double, `type`: String): IAttributeData = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAttributeData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAttributeData] (val x: Self) extends AnyVal {
      
      inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IProgramExtraData extends StObject {
    
    var transformFeedbackVaryings: js.UndefOr[BufferMode] = js.undefined
  }
  object IProgramExtraData {
    
    inline def apply(): IProgramExtraData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProgramExtraData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IProgramExtraData] (val x: Self) extends AnyVal {
      
      inline def setTransformFeedbackVaryings(value: BufferMode): Self = StObject.set(x, "transformFeedbackVaryings", value.asInstanceOf[js.Any])
      
      inline def setTransformFeedbackVaryingsUndefined: Self = StObject.set(x, "transformFeedbackVaryings", js.undefined)
    }
  }
  
  trait IUniformData extends StObject {
    
    var index: Double
    
    var isArray: Boolean
    
    var name: String
    
    var size: Double
    
    var `type`: String
    
    var value: Any
  }
  object IUniformData {
    
    inline def apply(index: Double, isArray: Boolean, name: String, size: Double, `type`: String, value: Any): IUniformData = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUniformData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IUniformData] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIsArray(value: Boolean): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
