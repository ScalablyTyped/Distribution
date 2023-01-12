package typings.oidcProvider.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrantId
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var grantId: js.UndefOr[String] = js.undefined
}
object GrantId {
  
  inline def apply(): GrantId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GrantId] (val x: Self) extends AnyVal {
    
    inline def setGrantId(value: String): Self = StObject.set(x, "grantId", value.asInstanceOf[js.Any])
    
    inline def setGrantIdUndefined: Self = StObject.set(x, "grantId", js.undefined)
  }
}
