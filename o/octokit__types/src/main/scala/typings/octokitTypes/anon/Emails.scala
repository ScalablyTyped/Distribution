package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Emails extends js.Object {
  var active: Boolean
  var emails: js.Array[Primary]
  var externalId: String
  var id: String
  var meta: Created
  var name: FamilyName
  var schemas: js.Array[String]
  var userName: String
}

object Emails {
  @scala.inline
  def apply(
    active: Boolean,
    emails: js.Array[Primary],
    externalId: String,
    id: String,
    meta: Created,
    name: FamilyName,
    schemas: js.Array[String],
    userName: String
  ): Emails = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], externalId = externalId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Emails]
  }
}

