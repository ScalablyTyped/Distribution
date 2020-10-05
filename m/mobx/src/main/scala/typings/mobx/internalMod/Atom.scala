package typings.mobx.internalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/internal", "Atom")
@js.native
/**
  * Create a new atom. For debugging purposes it is recommended to give it a name.
  * The onBecomeObserved and onBecomeUnobserved callbacks can be used for resource management.
  */
class Atom ()
  extends typings.mobx.atomMod.Atom {
  def this(name: String) = this()
}

