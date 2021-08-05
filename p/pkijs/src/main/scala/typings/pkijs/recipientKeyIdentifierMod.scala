package typings.pkijs

import typings.asn1js.mod.GeneralizedTime
import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recipientKeyIdentifierMod {
  
  @JSImport("pkijs/src/RecipientKeyIdentifier", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with RecipientKeyIdentifier {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var subjectKeyIdentifier: OctetString = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/RecipientKeyIdentifier", JSImport.Default)
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
  
  trait RecipientKeyIdentifier extends StObject {
    
    var date: js.UndefOr[GeneralizedTime] = js.undefined
    
    def fromSchema(schema: js.Any): Unit
    
    var other: js.UndefOr[typings.pkijs.otherKeyAttributeMod.default] = js.undefined
    
    var subjectKeyIdentifier: OctetString
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object RecipientKeyIdentifier {
    
    inline def apply(
      fromSchema: js.Any => Unit,
      subjectKeyIdentifier: OctetString,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): RecipientKeyIdentifier = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), subjectKeyIdentifier = subjectKeyIdentifier.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[RecipientKeyIdentifier]
    }
    
    extension [Self <: RecipientKeyIdentifier](x: Self) {
      
      inline def setDate(value: GeneralizedTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setOther(value: typings.pkijs.otherKeyAttributeMod.default): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      inline def setSubjectKeyIdentifier(value: OctetString): Self = StObject.set(x, "subjectKeyIdentifier", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
