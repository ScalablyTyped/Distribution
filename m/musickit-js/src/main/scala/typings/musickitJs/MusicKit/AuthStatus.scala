package typings.musickitJs.MusicKit

import typings.musickitJs.musickitJsInts.`0`
import typings.musickitJs.musickitJsInts.`1`
import typings.musickitJs.musickitJsInts.`2`
import typings.musickitJs.musickitJsInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthStatus extends StObject {
  
  var AUTHORIZED: `3`
  
  var DENIED: `1`
  
  var NOT_DETERMINED: `0`
  
  var RESTRICTED: `2`
}
object AuthStatus {
  
  inline def apply(): AuthStatus = {
    val __obj = js.Dynamic.literal(AUTHORIZED = 3, DENIED = 1, NOT_DETERMINED = 0, RESTRICTED = 2)
    __obj.asInstanceOf[AuthStatus]
  }
  
  extension [Self <: AuthStatus](x: Self) {
    
    inline def setAUTHORIZED(value: `3`): Self = StObject.set(x, "AUTHORIZED", value.asInstanceOf[js.Any])
    
    inline def setDENIED(value: `1`): Self = StObject.set(x, "DENIED", value.asInstanceOf[js.Any])
    
    inline def setNOT_DETERMINED(value: `0`): Self = StObject.set(x, "NOT_DETERMINED", value.asInstanceOf[js.Any])
    
    inline def setRESTRICTED(value: `2`): Self = StObject.set(x, "RESTRICTED", value.asInstanceOf[js.Any])
  }
}
