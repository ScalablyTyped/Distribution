package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RealmSelector extends StObject {
  
  /** List of realms to match. */
  var realms: js.UndefOr[js.Array[String]] = js.undefined
}
object RealmSelector {
  
  inline def apply(): RealmSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RealmSelector]
  }
  
  extension [Self <: RealmSelector](x: Self) {
    
    inline def setRealms(value: js.Array[String]): Self = StObject.set(x, "realms", value.asInstanceOf[js.Any])
    
    inline def setRealmsUndefined: Self = StObject.set(x, "realms", js.undefined)
    
    inline def setRealmsVarargs(value: String*): Self = StObject.set(x, "realms", js.Array(value :_*))
  }
}
