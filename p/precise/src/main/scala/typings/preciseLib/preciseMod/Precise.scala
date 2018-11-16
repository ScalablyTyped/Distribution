package typings
package preciseLib.preciseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("precise", "Precise")
@js.native
class Precise ()
  extends preciseLib.preciseMod.underscorePreciseNs.Precise {
  /**
           * Returns the nanoseconds from `start()` to `stop()`
           */
  /* CompleteClass */
  override def diff(): scala.Double = js.native
  /**
           * Starts a timer
           */
  /* CompleteClass */
  override def start(): preciseLib.preciseMod.underscorePreciseNs.Precise = js.native
  /**
           * Stops a timer
           */
  /* CompleteClass */
  override def stop(): preciseLib.preciseMod.underscorePreciseNs.Precise = js.native
}

