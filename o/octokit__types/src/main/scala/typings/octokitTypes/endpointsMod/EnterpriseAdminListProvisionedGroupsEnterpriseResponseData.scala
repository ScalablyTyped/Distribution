package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.DisplayName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnterpriseAdminListProvisionedGroupsEnterpriseResponseData extends js.Object {
  var Resources: js.Array[DisplayName] = js.native
  var itemsPerPage: Double = js.native
  var schemas: js.Array[String] = js.native
  var startIndex: Double = js.native
  var totalResults: Double = js.native
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
  implicit class EnterpriseAdminListProvisionedGroupsEnterpriseResponseDataOps[Self <: EnterpriseAdminListProvisionedGroupsEnterpriseResponseData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResourcesVarargs(value: DisplayName*): Self = this.set("Resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[DisplayName]): Self = this.set("Resources", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsPerPage(value: Double): Self = this.set("itemsPerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemasVarargs(value: String*): Self = this.set("schemas", js.Array(value :_*))
    @scala.inline
    def setSchemas(value: js.Array[String]): Self = this.set("schemas", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalResults(value: Double): Self = this.set("totalResults", value.asInstanceOf[js.Any])
  }
  
}

