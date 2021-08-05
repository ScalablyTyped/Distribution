package typings.msRestAzure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractiveLoginOptions
  extends StObject
     with DeviceTokenCredentialsOptions {
  
  /**
    * The language code specifying how the message should be localized to. Default value 'en-us'.
    */
  var language: js.UndefOr[String] = js.undefined
}
object InteractiveLoginOptions {
  
  inline def apply(): InteractiveLoginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractiveLoginOptions]
  }
  
  extension [Self <: InteractiveLoginOptions](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
  }
}
