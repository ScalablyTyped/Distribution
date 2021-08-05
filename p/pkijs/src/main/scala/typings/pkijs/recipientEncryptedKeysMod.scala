package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recipientEncryptedKeysMod {
  
  @JSImport("pkijs/src/RecipientEncryptedKeys", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with RecipientEncryptedKeys {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    var encryptedKeys: js.Array[typings.pkijs.recipientEncryptedKeyMod.default] = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/RecipientEncryptedKeys", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    inline def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    inline def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait RecipientEncryptedKeys extends StObject {
    
    var encryptedKeys: js.Array[typings.pkijs.recipientEncryptedKeyMod.default]
    
    def fromSchema(schema: js.Any): Unit
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object RecipientEncryptedKeys {
    
    inline def apply(
      encryptedKeys: js.Array[typings.pkijs.recipientEncryptedKeyMod.default],
      fromSchema: js.Any => Unit,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): RecipientEncryptedKeys = {
      val __obj = js.Dynamic.literal(encryptedKeys = encryptedKeys.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[RecipientEncryptedKeys]
    }
    
    extension [Self <: RecipientEncryptedKeys](x: Self) {
      
      inline def setEncryptedKeys(value: js.Array[typings.pkijs.recipientEncryptedKeyMod.default]): Self = StObject.set(x, "encryptedKeys", value.asInstanceOf[js.Any])
      
      inline def setEncryptedKeysVarargs(value: typings.pkijs.recipientEncryptedKeyMod.default*): Self = StObject.set(x, "encryptedKeys", js.Array(value :_*))
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
