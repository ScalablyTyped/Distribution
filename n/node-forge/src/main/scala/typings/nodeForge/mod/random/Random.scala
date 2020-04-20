package typings.nodeForge.mod.random

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Random extends js.Object {
  def seedFile(needed: Double, cb: CB): Unit
  def seedFileSync(needed: Double): String
}

object Random {
  @scala.inline
  def apply(seedFile: (Double, CB) => Unit, seedFileSync: Double => String): Random = {
    val __obj = js.Dynamic.literal(seedFile = js.Any.fromFunction2(seedFile), seedFileSync = js.Any.fromFunction1(seedFileSync))
    __obj.asInstanceOf[Random]
  }
}

