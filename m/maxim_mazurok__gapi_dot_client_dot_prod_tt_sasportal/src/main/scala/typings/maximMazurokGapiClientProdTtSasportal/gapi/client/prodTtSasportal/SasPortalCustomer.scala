package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalCustomer extends StObject {
  
  /** Required. Name of the organization that the customer entity represents. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. Resource name of the customer. */
  var name: js.UndefOr[String] = js.undefined
  
  /** User IDs used by the devices belonging to this customer. */
  var sasUserIds: js.UndefOr[js.Array[String]] = js.undefined
}
object SasPortalCustomer {
  
  @scala.inline
  def apply(): SasPortalCustomer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalCustomer]
  }
  
  @scala.inline
  implicit class SasPortalCustomerMutableBuilder[Self <: SasPortalCustomer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSasUserIds(value: js.Array[String]): Self = StObject.set(x, "sasUserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSasUserIdsUndefined: Self = StObject.set(x, "sasUserIds", js.undefined)
    
    @scala.inline
    def setSasUserIdsVarargs(value: String*): Self = StObject.set(x, "sasUserIds", js.Array(value :_*))
  }
}
