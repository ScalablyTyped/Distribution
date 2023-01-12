package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SafeHtmlProto extends StObject {
  
  /**
    * IMPORTANT: Never set or read this field, even from tests, it is private. See documentation at the top of .proto file for programming language packages with which to create or read
    * this message.
    */
  var privateDoNotAccessOrElseSafeHtmlWrappedValue: js.UndefOr[String] = js.undefined
}
object SafeHtmlProto {
  
  inline def apply(): SafeHtmlProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeHtmlProto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SafeHtmlProto] (val x: Self) extends AnyVal {
    
    inline def setPrivateDoNotAccessOrElseSafeHtmlWrappedValue(value: String): Self = StObject.set(x, "privateDoNotAccessOrElseSafeHtmlWrappedValue", value.asInstanceOf[js.Any])
    
    inline def setPrivateDoNotAccessOrElseSafeHtmlWrappedValueUndefined: Self = StObject.set(x, "privateDoNotAccessOrElseSafeHtmlWrappedValue", js.undefined)
  }
}
