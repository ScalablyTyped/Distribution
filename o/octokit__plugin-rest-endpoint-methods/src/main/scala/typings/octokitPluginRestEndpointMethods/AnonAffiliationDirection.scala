package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAffiliationDirection extends js.Object {
  var affiliation: AnonType
  var direction: AnonEnum
  var page: AnonType
  var per_page: AnonType
  var sort: AnonEnum
  var `type`: AnonEnum
  var visibility: AnonEnum
}

object AnonAffiliationDirection {
  @scala.inline
  def apply(
    affiliation: AnonType,
    direction: AnonEnum,
    page: AnonType,
    per_page: AnonType,
    sort: AnonEnum,
    `type`: AnonEnum,
    visibility: AnonEnum
  ): AnonAffiliationDirection = {
    val __obj = js.Dynamic.literal(affiliation = affiliation.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAffiliationDirection]
  }
}

