package typings.pkijs

import typings.asn1js.mod.GeneralizedTime
import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kekidentifierMod {
  
  @JSImport("pkijs/src/KEKIdentifier", JSImport.Default)
  @js.native
  class default () extends KEKIdentifier {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/KEKIdentifier", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/KEKIdentifier", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/KEKIdentifier", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait KEKIdentifier extends StObject {
    
    var date: js.UndefOr[GeneralizedTime] = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var keyIdentifier: OctetString = js.native
    
    var other: js.UndefOr[typings.pkijs.otherKeyAttributeMod.default] = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object KEKIdentifier {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      keyIdentifier: OctetString,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): KEKIdentifier = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), keyIdentifier = keyIdentifier.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[KEKIdentifier]
    }
    
    @scala.inline
    implicit class KEKIdentifierMutableBuilder[Self <: KEKIdentifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: GeneralizedTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeyIdentifier(value: OctetString): Self = StObject.set(x, "keyIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOther(value: typings.pkijs.otherKeyAttributeMod.default): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
