package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbkdf2paramsMod {
  
  @JSImport("pkijs/src/PBKDF2Params", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with PBKDF2Params {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var iterationCount: Double = js.native
    
    /* CompleteClass */
    var keyLength: Double = js.native
    
    /* CompleteClass */
    var prf: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    /* CompleteClass */
    var salt: js.Any = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/PBKDF2Params", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    inline def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait PBKDF2Params extends StObject {
    
    def fromSchema(schema: js.Any): Unit
    
    var iterationCount: Double
    
    var keyLength: Double
    
    var prf: typings.pkijs.algorithmIdentifierMod.default
    
    var salt: js.Any
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object PBKDF2Params {
    
    inline def apply(
      fromSchema: js.Any => Unit,
      iterationCount: Double,
      keyLength: Double,
      prf: typings.pkijs.algorithmIdentifierMod.default,
      salt: js.Any,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): PBKDF2Params = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), iterationCount = iterationCount.asInstanceOf[js.Any], keyLength = keyLength.asInstanceOf[js.Any], prf = prf.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[PBKDF2Params]
    }
    
    extension [Self <: PBKDF2Params](x: Self) {
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setIterationCount(value: Double): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
      
      inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
      
      inline def setPrf(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "prf", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: js.Any): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
