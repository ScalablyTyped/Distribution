package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailoverContext extends StObject {
  
  /** This is always *sql#failoverContext*. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The current settings version of this instance. Request will be rejected if this version doesn't match the current settings version. */
  var settingsVersion: js.UndefOr[String] = js.undefined
}
object FailoverContext {
  
  inline def apply(): FailoverContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailoverContext]
  }
  
  extension [Self <: FailoverContext](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSettingsVersion(value: String): Self = StObject.set(x, "settingsVersion", value.asInstanceOf[js.Any])
    
    inline def setSettingsVersionUndefined: Self = StObject.set(x, "settingsVersion", js.undefined)
  }
}
