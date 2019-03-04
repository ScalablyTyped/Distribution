package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base extends js.Object {
  var base: scala.Double
  var count: scala.Double
  var indexed: scala.Boolean
  var `type`: scala.Double
}

object Anon_Base {
  @scala.inline
  def apply(base: scala.Double, count: scala.Double, indexed: scala.Boolean, `type`: scala.Double): Anon_Base = {
    val __obj = js.Dynamic.literal(base = base, count = count, indexed = indexed)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Base]
  }
}

