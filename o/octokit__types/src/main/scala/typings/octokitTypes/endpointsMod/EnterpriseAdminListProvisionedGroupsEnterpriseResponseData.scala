package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.DisplayName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminListProvisionedGroupsEnterpriseResponseData extends StObject {
  
  var Resources: js.Array[DisplayName]
  
  var itemsPerPage: Double
  
  var schemas: js.Array[String]
  
  var startIndex: Double
  
  var totalResults: Double
}
object EnterpriseAdminListProvisionedGroupsEnterpriseResponseData {
  
  @scala.inline
  def apply(
    Resources: js.Array[DisplayName],
    itemsPerPage: Double,
    schemas: js.Array[String],
    startIndex: Double,
    totalResults: Double
  ): EnterpriseAdminListProvisionedGroupsEnterpriseResponseData = {
    val __obj = js.Dynamic.literal(Resources = Resources.asInstanceOf[js.Any], itemsPerPage = itemsPerPage.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], totalResults = totalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminListProvisionedGroupsEnterpriseResponseData]
  }
  
  @scala.inline
  implicit class EnterpriseAdminListProvisionedGroupsEnterpriseResponseDataMutableBuilder[Self <: EnterpriseAdminListProvisionedGroupsEnterpriseResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResources(value: js.Array[DisplayName]): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesVarargs(value: DisplayName*): Self = StObject.set(x, "Resources", js.Array(value :_*))
    
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
