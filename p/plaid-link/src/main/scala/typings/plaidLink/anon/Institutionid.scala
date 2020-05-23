package typings.plaidLink.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Institutionid extends js.Object {
  var institution_id: String
  var name: String
}

object Institutionid {
  @scala.inline
  def apply(institution_id: String, name: String): Institutionid = {
    val __obj = js.Dynamic.literal(institution_id = institution_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Institutionid]
  }
}

