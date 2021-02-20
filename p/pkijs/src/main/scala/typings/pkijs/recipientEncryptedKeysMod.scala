package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recipientEncryptedKeysMod {
  
  @JSImport("pkijs/src/RecipientEncryptedKeys", JSImport.Default)
  @js.native
  class default () extends RecipientEncryptedKeys {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/RecipientEncryptedKeys", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/RecipientEncryptedKeys", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/RecipientEncryptedKeys", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/RecipientEncryptedKeys", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait RecipientEncryptedKeys extends StObject {
    
    var encryptedKeys: js.Array[typings.pkijs.recipientEncryptedKeyMod.default] = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object RecipientEncryptedKeys {
    
    @scala.inline
    def apply(
      encryptedKeys: js.Array[typings.pkijs.recipientEncryptedKeyMod.default],
      fromSchema: js.Any => Unit,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): RecipientEncryptedKeys = {
      val __obj = js.Dynamic.literal(encryptedKeys = encryptedKeys.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[RecipientEncryptedKeys]
    }
    
    @scala.inline
    implicit class RecipientEncryptedKeysMutableBuilder[Self <: RecipientEncryptedKeys] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryptedKeys(value: js.Array[typings.pkijs.recipientEncryptedKeyMod.default]): Self = StObject.set(x, "encryptedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptedKeysVarargs(value: typings.pkijs.recipientEncryptedKeyMod.default*): Self = StObject.set(x, "encryptedKeys", js.Array(value :_*))
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
