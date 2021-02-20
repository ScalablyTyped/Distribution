package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbes2paramsMod {
  
  @JSImport("pkijs/src/PBES2Params", JSImport.Default)
  @js.native
  class default () extends PBES2Params {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/PBES2Params", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/PBES2Params", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/PBES2Params", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait PBES2Params extends StObject {
    
    var encryptionScheme: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var keyDerivationFunc: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object PBES2Params {
    
    @scala.inline
    def apply(
      encryptionScheme: typings.pkijs.algorithmIdentifierMod.default,
      fromSchema: js.Any => Unit,
      keyDerivationFunc: typings.pkijs.algorithmIdentifierMod.default,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): PBES2Params = {
      val __obj = js.Dynamic.literal(encryptionScheme = encryptionScheme.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), keyDerivationFunc = keyDerivationFunc.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[PBES2Params]
    }
    
    @scala.inline
    implicit class PBES2ParamsMutableBuilder[Self <: PBES2Params] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryptionScheme(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "encryptionScheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeyDerivationFunc(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "keyDerivationFunc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
