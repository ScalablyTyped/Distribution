package typings.mobx.mobxMod

import typings.mobx.libCoreDerivationMod.IDerivation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx", "Reaction")
@js.native
class Reaction protected ()
  extends typings.mobx.libInternalMod.Reaction {
  def this(name: String, onInvalidate: js.Function0[Unit]) = this()
  def this(
    name: String,
    onInvalidate: js.Function0[Unit],
    errorHandler: js.Function2[/* error */ js.Any, /* derivation */ IDerivation, Unit]
  ) = this()
}

