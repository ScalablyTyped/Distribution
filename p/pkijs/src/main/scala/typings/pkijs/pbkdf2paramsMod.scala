package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbkdf2paramsMod {
  
  @JSImport("pkijs/src/PBKDF2Params", JSImport.Default)
  @js.native
  class default () extends PBKDF2Params {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/PBKDF2Params", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/PBKDF2Params", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/PBKDF2Params", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait PBKDF2Params extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var iterationCount: Double = js.native
    
    var keyLength: Double = js.native
    
    var prf: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    var salt: js.Any = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object PBKDF2Params {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class PBKDF2ParamsMutableBuilder[Self <: PBKDF2Params] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIterationCount(value: Double): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrf(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "prf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSalt(value: js.Any): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
