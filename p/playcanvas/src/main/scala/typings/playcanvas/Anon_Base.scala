package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base extends js.Object {
  var base: Double
  var count: Double
  var indexed: Boolean
  var `type`: Double
}

object Anon_Base {
  @scala.inline
  def apply(base: Double, count: Double, indexed: Boolean, `type`: Double): Anon_Base = {
    val __obj = js.Dynamic.literal(base = base, count = count, indexed = indexed)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Base]
  }
}

