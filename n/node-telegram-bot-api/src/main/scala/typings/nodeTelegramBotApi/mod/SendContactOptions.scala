package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendContactOptions
  extends StObject
     with SendBasicOptions {
  
  var last_name: js.UndefOr[String] = js.undefined
  
  var vcard: js.UndefOr[String] = js.undefined
}
object SendContactOptions {
  
  @scala.inline
  def apply(): SendContactOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendContactOptions]
  }
  
  @scala.inline
  implicit class SendContactOptionsMutableBuilder[Self <: SendContactOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    
    @scala.inline
    def setVcard(value: String): Self = StObject.set(x, "vcard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVcardUndefined: Self = StObject.set(x, "vcard", js.undefined)
  }
}
