package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enum extends StObject {
  
  /** Enum value definitions. */
  var enumvalue: js.UndefOr[js.Array[EnumValue]] = js.undefined
  
  /** Enum type name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Protocol buffer options. */
  var options: js.UndefOr[js.Array[Option]] = js.undefined
  
  /** The source context. */
  var sourceContext: js.UndefOr[SourceContext] = js.undefined
  
  /** The source syntax. */
  var syntax: js.UndefOr[String] = js.undefined
}
object Enum {
  
  @scala.inline
  def apply(): Enum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enum]
  }
  
  @scala.inline
  implicit class EnumMutableBuilder[Self <: Enum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumvalue(value: js.Array[EnumValue]): Self = StObject.set(x, "enumvalue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumvalueUndefined: Self = StObject.set(x, "enumvalue", js.undefined)
    
    @scala.inline
    def setEnumvalueVarargs(value: EnumValue*): Self = StObject.set(x, "enumvalue", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[Option]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setSourceContext(value: SourceContext): Self = StObject.set(x, "sourceContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceContextUndefined: Self = StObject.set(x, "sourceContext", js.undefined)
    
    @scala.inline
    def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
  }
}
