package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateServerCaContext extends StObject {
  
  /** This is always *sql#rotateServerCaContext*. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The fingerprint of the next version to be rotated to. If left unspecified, will be rotated to the most recently added server CA version. */
  var nextVersion: js.UndefOr[String] = js.undefined
}
object RotateServerCaContext {
  
  inline def apply(): RotateServerCaContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotateServerCaContext]
  }
  
  extension [Self <: RotateServerCaContext](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextVersion(value: String): Self = StObject.set(x, "nextVersion", value.asInstanceOf[js.Any])
    
    inline def setNextVersionUndefined: Self = StObject.set(x, "nextVersion", js.undefined)
  }
}
