package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharingDetail extends js.Object {
  var sharedBy: js.UndefOr[InsightIdentity] = js.undefined
  var sharedDateTime: js.UndefOr[String] = js.undefined
  var sharingReference: js.UndefOr[ResourceReference] = js.undefined
  var sharingSubject: js.UndefOr[String] = js.undefined
  var sharingType: js.UndefOr[String] = js.undefined
}

object SharingDetail {
  @scala.inline
  def apply(
    sharedBy: InsightIdentity = null,
    sharedDateTime: String = null,
    sharingReference: ResourceReference = null,
    sharingSubject: String = null,
    sharingType: String = null
  ): SharingDetail = {
    val __obj = js.Dynamic.literal()
    if (sharedBy != null) __obj.updateDynamic("sharedBy")(sharedBy.asInstanceOf[js.Any])
    if (sharedDateTime != null) __obj.updateDynamic("sharedDateTime")(sharedDateTime.asInstanceOf[js.Any])
    if (sharingReference != null) __obj.updateDynamic("sharingReference")(sharingReference.asInstanceOf[js.Any])
    if (sharingSubject != null) __obj.updateDynamic("sharingSubject")(sharingSubject.asInstanceOf[js.Any])
    if (sharingType != null) __obj.updateDynamic("sharingType")(sharingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharingDetail]
  }
}

