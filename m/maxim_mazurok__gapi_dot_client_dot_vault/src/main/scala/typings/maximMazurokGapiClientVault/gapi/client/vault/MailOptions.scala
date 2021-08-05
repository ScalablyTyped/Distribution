package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailOptions extends StObject {
  
  /** Set to true to exclude drafts. */
  var excludeDrafts: js.UndefOr[Boolean] = js.undefined
}
object MailOptions {
  
  inline def apply(): MailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailOptions]
  }
  
  extension [Self <: MailOptions](x: Self) {
    
    inline def setExcludeDrafts(value: Boolean): Self = StObject.set(x, "excludeDrafts", value.asInstanceOf[js.Any])
    
    inline def setExcludeDraftsUndefined: Self = StObject.set(x, "excludeDrafts", js.undefined)
  }
}
