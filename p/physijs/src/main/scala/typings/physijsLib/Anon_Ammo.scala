package typings
package physijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ammo extends js.Object {
  var ammo: java.lang.String
  var worker: java.lang.String
}

object Anon_Ammo {
  @scala.inline
  def apply(ammo: java.lang.String, worker: java.lang.String): Anon_Ammo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ammo")(ammo)
    __obj.updateDynamic("worker")(worker)
    __obj.asInstanceOf[Anon_Ammo]
  }
}

