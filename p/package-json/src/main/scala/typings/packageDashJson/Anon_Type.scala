package typings.packageDashJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type extends js.Object {
  val `type`: String
  val url: String
}

object Anon_Type {
  @scala.inline
  def apply(`type`: String, url: String): Anon_Type = {
    val __obj = js.Dynamic.literal(url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Type]
  }
}

