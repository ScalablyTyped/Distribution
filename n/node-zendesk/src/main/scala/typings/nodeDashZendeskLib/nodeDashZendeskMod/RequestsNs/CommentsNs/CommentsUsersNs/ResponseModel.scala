package typings
package nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs.CommentsNs.CommentsUsersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseModel
  extends nodeDashZendeskLib.nodeDashZendeskMod.PersistableModel {
  val agent: scala.Boolean
  val name: java.lang.String
  val organization_id: scala.Double | scala.Null
  val photo: nodeDashZendeskLib.nodeDashZendeskMod.AttachmentsNs.Model | scala.Null
}

object ResponseModel {
  @scala.inline
  def apply(
    agent: scala.Boolean,
    id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    name: java.lang.String,
    organization_id: scala.Int | scala.Double = null,
    photo: nodeDashZendeskLib.nodeDashZendeskMod.AttachmentsNs.Model = null
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(agent = agent, id = id, name = name)
    if (organization_id != null) __obj.updateDynamic("organization_id")(organization_id.asInstanceOf[js.Any])
    if (photo != null) __obj.updateDynamic("photo")(photo)
    __obj.asInstanceOf[ResponseModel]
  }
}

