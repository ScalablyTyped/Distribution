package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Emails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScimListProvisionedIdentitiesResponseData extends js.Object {
  var Resources: js.Array[Emails]
  var itemsPerPage: Double
  var schemas: js.Array[String]
  var startIndex: Double
  var totalResults: Double
}

object ScimListProvisionedIdentitiesResponseData {
  @scala.inline
  def apply(
    Resources: js.Array[Emails],
    itemsPerPage: Double,
    schemas: js.Array[String],
    startIndex: Double,
    totalResults: Double
  ): ScimListProvisionedIdentitiesResponseData = {
    val __obj = js.Dynamic.literal(Resources = Resources.asInstanceOf[js.Any], itemsPerPage = itemsPerPage.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], totalResults = totalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScimListProvisionedIdentitiesResponseData]
  }
}

