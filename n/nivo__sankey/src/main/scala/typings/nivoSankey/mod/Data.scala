package typings.nivoSankey.mod

import typings.nivoSankey.anon.Links
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: Links
}

object Data {
  @scala.inline
  def apply(data: Links): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

