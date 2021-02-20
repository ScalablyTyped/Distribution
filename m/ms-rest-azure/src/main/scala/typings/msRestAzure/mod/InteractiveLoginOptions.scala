package typings.msRestAzure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InteractiveLoginOptions extends DeviceTokenCredentialsOptions {
  
  /**
    * The language code specifying how the message should be localized to. Default value 'en-us'.
    */
  var language: js.UndefOr[String] = js.native
}
object InteractiveLoginOptions {
  
  @scala.inline
  def apply(): InteractiveLoginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractiveLoginOptions]
  }
  
  @scala.inline
  implicit class InteractiveLoginOptionsMutableBuilder[Self <: InteractiveLoginOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
  }
}
