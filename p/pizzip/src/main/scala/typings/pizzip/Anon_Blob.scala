package typings.pizzip

import typings.pizzip.pizzipStrings.blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Blob extends js.Object {
  var `type`: blob
}

object Anon_Blob {
  @scala.inline
  def apply(`type`: blob): Anon_Blob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Blob]
  }
}

