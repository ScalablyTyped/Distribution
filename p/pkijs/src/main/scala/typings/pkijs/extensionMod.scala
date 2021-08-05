package typings.pkijs

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extensionMod {
  
  @JSImport("pkijs/src/Extension", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Extension {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    var critical: Boolean = js.native
    
    /* CompleteClass */
    var extnID: String = js.native
    
    /* CompleteClass */
    var extnValue: OctetString = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/Extension", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    inline def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait Extension extends StObject {
    
    var critical: Boolean
    
    var extnID: String
    
    var extnValue: OctetString
    
    def fromSchema(schema: js.Any): Unit
    
    var parsedValue: js.UndefOr[js.Any] = js.undefined
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object Extension {
    
    inline def apply(
      critical: Boolean,
      extnID: String,
      extnValue: OctetString,
      fromSchema: js.Any => Unit,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): Extension = {
      val __obj = js.Dynamic.literal(critical = critical.asInstanceOf[js.Any], extnID = extnID.asInstanceOf[js.Any], extnValue = extnValue.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[Extension]
    }
    
    extension [Self <: Extension](x: Self) {
      
      inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
      
      inline def setExtnID(value: String): Self = StObject.set(x, "extnID", value.asInstanceOf[js.Any])
      
      inline def setExtnValue(value: OctetString): Self = StObject.set(x, "extnValue", value.asInstanceOf[js.Any])
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setParsedValue(value: js.Any): Self = StObject.set(x, "parsedValue", value.asInstanceOf[js.Any])
      
      inline def setParsedValueUndefined: Self = StObject.set(x, "parsedValue", js.undefined)
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
