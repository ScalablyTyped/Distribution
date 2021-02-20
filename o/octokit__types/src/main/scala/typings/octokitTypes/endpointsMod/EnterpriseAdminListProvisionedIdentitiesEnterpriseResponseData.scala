package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Active
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminListProvisionedIdentitiesEnterpriseResponseData extends StObject {
  
  var Resources: js.Array[Active] = js.native
  
  var itemsPerPage: Double = js.native
  
  var schemas: js.Array[String] = js.native
  
  var startIndex: Double = js.native
  
  var totalResults: Double = js.native
}
object EnterpriseAdminListProvisionedIdentitiesEnterpriseResponseData {
  
  @scala.inline
  def apply(
    Resources: js.Array[Active],
    itemsPerPage: Double,
    schemas: js.Array[String],
    startIndex: Double,
    totalResults: Double
  ): EnterpriseAdminListProvisionedIdentitiesEnterpriseResponseData = {
    val __obj = js.Dynamic.literal(Resources = Resources.asInstanceOf[js.Any], itemsPerPage = itemsPerPage.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], totalResults = totalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminListProvisionedIdentitiesEnterpriseResponseData]
  }
  
  @scala.inline
  implicit class EnterpriseAdminListProvisionedIdentitiesEnterpriseResponseDataMutableBuilder[Self <: EnterpriseAdminListProvisionedIdentitiesEnterpriseResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResources(value: js.Array[Active]): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesVarargs(value: Active*): Self = StObject.set(x, "Resources", js.Array(value :_*))
    
    @scala.inline
    def setSchemas(value: js.Array[String]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasVarargs(value: String*): Self = StObject.set(x, "schemas", js.Array(value :_*))
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalResults(value: Double): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
  }
}
