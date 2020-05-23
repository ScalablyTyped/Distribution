package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Groupdescription extends js.Object {
  var group_description: String
  var group_id: String
  var group_name: String
}

object Groupdescription {
  @scala.inline
  def apply(group_description: String, group_id: String, group_name: String): Groupdescription = {
    val __obj = js.Dynamic.literal(group_description = group_description.asInstanceOf[js.Any], group_id = group_id.asInstanceOf[js.Any], group_name = group_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groupdescription]
  }
}

