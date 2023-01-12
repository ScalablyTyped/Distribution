package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightIdentity extends StObject {
  
  // The email address of the user who shared the item.
  var address: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name of the user who shared the item.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The id of the user who shared the item.
  var id: js.UndefOr[NullableOption[String]] = js.undefined
}
object InsightIdentity {
  
  inline def apply(): InsightIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightIdentity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsightIdentity] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: NullableOption[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
