package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailoverContext extends StObject {
  
  /** This is always *sql#failoverContext*. */
  var kind: js.UndefOr[String] = js.native
  
  /** The current settings version of this instance. Request will be rejected if this version doesn't match the current settings version. */
  var settingsVersion: js.UndefOr[String] = js.native
}
object FailoverContext {
  
  @scala.inline
  def apply(): FailoverContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailoverContext]
  }
  
  @scala.inline
  implicit class FailoverContextMutableBuilder[Self <: FailoverContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSettingsVersion(value: String): Self = StObject.set(x, "settingsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsVersionUndefined: Self = StObject.set(x, "settingsVersion", js.undefined)
  }
}
