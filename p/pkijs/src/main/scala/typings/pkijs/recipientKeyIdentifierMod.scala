package typings.pkijs

import typings.asn1js.mod.GeneralizedTime
import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recipientKeyIdentifierMod {
  
  @JSImport("pkijs/src/RecipientKeyIdentifier", JSImport.Default)
  @js.native
  class default () extends RecipientKeyIdentifier {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/RecipientKeyIdentifier", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/RecipientKeyIdentifier", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/RecipientKeyIdentifier", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/RecipientKeyIdentifier", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait RecipientKeyIdentifier extends StObject {
    
    var date: js.UndefOr[GeneralizedTime] = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var other: js.UndefOr[typings.pkijs.otherKeyAttributeMod.default] = js.native
    
    var subjectKeyIdentifier: OctetString = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object RecipientKeyIdentifier {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      subjectKeyIdentifier: OctetString,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): RecipientKeyIdentifier = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), subjectKeyIdentifier = subjectKeyIdentifier.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[RecipientKeyIdentifier]
    }
    
    @scala.inline
    implicit class RecipientKeyIdentifierMutableBuilder[Self <: RecipientKeyIdentifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: GeneralizedTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOther(value: typings.pkijs.otherKeyAttributeMod.default): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      @scala.inline
      def setSubjectKeyIdentifier(value: OctetString): Self = StObject.set(x, "subjectKeyIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
