package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyAgreeRecipientIdentifierMod {
  
  @JSImport("pkijs/src/KeyAgreeRecipientIdentifier", JSImport.Default)
  @js.native
  class default () extends KeyAgreeRecipientIdentifier {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/KeyAgreeRecipientIdentifier", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/KeyAgreeRecipientIdentifier", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/KeyAgreeRecipientIdentifier", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/KeyAgreeRecipientIdentifier", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait KeyAgreeRecipientIdentifier extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
    
    var value: js.Any = js.native
    
    var variant: Double = js.native
  }
  object KeyAgreeRecipientIdentifier {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      toJSON: () => js.Any,
      toSchema: () => js.Any,
      value: js.Any,
      variant: Double
    ): KeyAgreeRecipientIdentifier = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), value = value.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyAgreeRecipientIdentifier]
    }
    
    @scala.inline
    implicit class KeyAgreeRecipientIdentifierMutableBuilder[Self <: KeyAgreeRecipientIdentifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariant(value: Double): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    }
  }
}
