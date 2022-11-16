package typings.parcelTypes.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type JSONObject = {[key: string] : @parcel/types.@parcel/types.JSONValue}
}}}
to avoid circular code involving: 
- @parcel/types.@parcel/types.JSONObject
- @parcel/types.@parcel/types.JSONValue
- @parcel/types.@parcel/types.Meta
*/
trait JSONObject
  extends StObject
     with /* key */ StringDictionary[JSONValue]
object JSONObject {
  
  inline def apply(): JSONObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONObject]
  }
}
