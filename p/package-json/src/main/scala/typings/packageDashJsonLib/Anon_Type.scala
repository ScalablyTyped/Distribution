package typings
package packageDashJsonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type extends js.Object {
  val `type`: java.lang.String
  val url: java.lang.String
}

object Anon_Type {
  @scala.inline
  def apply(`type`: java.lang.String, url: java.lang.String): Anon_Type = {
    val __obj = js.Dynamic.literal(url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Type]
  }
}

