package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriveExportOptions extends StObject {
  
  /** To include access level information for users with [indirect access](https://support.google.com/vault/answer/6099459#metadata) to files, set to **true**. */
  var includeAccessInfo: js.UndefOr[Boolean] = js.undefined
}
object DriveExportOptions {
  
  inline def apply(): DriveExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveExportOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DriveExportOptions] (val x: Self) extends AnyVal {
    
    inline def setIncludeAccessInfo(value: Boolean): Self = StObject.set(x, "includeAccessInfo", value.asInstanceOf[js.Any])
    
    inline def setIncludeAccessInfoUndefined: Self = StObject.set(x, "includeAccessInfo", js.undefined)
  }
}
