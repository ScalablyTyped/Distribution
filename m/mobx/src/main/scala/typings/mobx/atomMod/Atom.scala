package typings.mobx.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/atom", "Atom")
@js.native
/**
  * Create a new atom. For debugging purposes it is recommended to give it a name.
  * The onBecomeObserved and onBecomeUnobserved callbacks can be used for resource management.
  */
class Atom () extends IAtom {
  def this(name: String) = this()
}

