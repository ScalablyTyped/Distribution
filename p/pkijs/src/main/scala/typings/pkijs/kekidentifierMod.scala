package typings.pkijs

import typings.asn1js.mod.GeneralizedTime
import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kekidentifierMod {
  
  @JSImport("pkijs/src/KEKIdentifier", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with KEKIdentifier {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var keyIdentifier: OctetString = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/KEKIdentifier", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait KEKIdentifier extends StObject {
    
    var date: js.UndefOr[GeneralizedTime] = js.undefined
    
    def fromSchema(schema: js.Any): Unit
    
    var keyIdentifier: OctetString
    
    var other: js.UndefOr[typings.pkijs.otherKeyAttributeMod.default] = js.undefined
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
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
