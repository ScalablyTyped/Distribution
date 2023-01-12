package typings.maximMazurokGapiClientDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartPageToken extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "drive#startPageToken". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The starting page token for listing changes. */
  var startPageToken: js.UndefOr[String] = js.undefined
}
object StartPageToken {
  
  inline def apply(): StartPageToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPageToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartPageToken] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setStartPageToken(value: String): Self = StObject.set(x, "startPageToken", value.asInstanceOf[js.Any])
    
    inline def setStartPageTokenUndefined: Self = StObject.set(x, "startPageToken", js.undefined)
  }
}
