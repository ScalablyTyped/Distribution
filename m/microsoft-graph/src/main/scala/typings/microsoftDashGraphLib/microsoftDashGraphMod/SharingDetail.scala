package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharingDetail extends js.Object {
  var sharedBy: js.UndefOr[InsightIdentity] = js.undefined
  var sharedDateTime: js.UndefOr[java.lang.String] = js.undefined
  var sharingReference: js.UndefOr[ResourceReference] = js.undefined
  var sharingSubject: js.UndefOr[java.lang.String] = js.undefined
  var sharingType: js.UndefOr[java.lang.String] = js.undefined
}

object SharingDetail {
  @scala.inline
  def apply(
    sharedBy: InsightIdentity = null,
    sharedDateTime: java.lang.String = null,
    sharingReference: ResourceReference = null,
    sharingSubject: java.lang.String = null,
    sharingType: java.lang.String = null
  ): SharingDetail = {
    val __obj = js.Dynamic.literal()
    if (sharedBy != null) __obj.updateDynamic("sharedBy")(sharedBy)
    if (sharedDateTime != null) __obj.updateDynamic("sharedDateTime")(sharedDateTime)
    if (sharingReference != null) __obj.updateDynamic("sharingReference")(sharingReference)
    if (sharingSubject != null) __obj.updateDynamic("sharingSubject")(sharingSubject)
    if (sharingType != null) __obj.updateDynamic("sharingType")(sharingType)
    __obj.asInstanceOf[SharingDetail]
  }
}

