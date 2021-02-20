package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailOptions extends StObject {
  
  /** Set to true to exclude drafts. */
  var excludeDrafts: js.UndefOr[Boolean] = js.native
}
object MailOptions {
  
  @scala.inline
  def apply(): MailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailOptions]
  }
  
  @scala.inline
  implicit class MailOptionsMutableBuilder[Self <: MailOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludeDrafts(value: Boolean): Self = StObject.set(x, "excludeDrafts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeDraftsUndefined: Self = StObject.set(x, "excludeDrafts", js.undefined)
  }
}
