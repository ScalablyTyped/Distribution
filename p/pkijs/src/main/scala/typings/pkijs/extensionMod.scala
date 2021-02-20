package typings.pkijs

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extensionMod {
  
  @JSImport("pkijs/src/Extension", JSImport.Default)
  @js.native
  class default () extends Extension {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/Extension", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/Extension", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/Extension", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait Extension extends StObject {
    
    var critical: Boolean = js.native
    
    var extnID: String = js.native
    
    var extnValue: OctetString = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var parsedValue: js.UndefOr[js.Any] = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object Extension {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ExtensionMutableBuilder[Self <: Extension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtnID(value: String): Self = StObject.set(x, "extnID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtnValue(value: OctetString): Self = StObject.set(x, "extnValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParsedValue(value: js.Any): Self = StObject.set(x, "parsedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsedValueUndefined: Self = StObject.set(x, "parsedValue", js.undefined)
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
