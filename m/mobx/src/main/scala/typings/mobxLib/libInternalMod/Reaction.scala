package typings
package mobxLib.libInternalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "Reaction")
@js.native
class Reaction protected ()
  extends mobxLib.libCoreReactionMod.Reaction {
  def this(name: java.lang.String, onInvalidate: js.Function0[scala.Unit]) = this()
  def this(name: java.lang.String, onInvalidate: js.Function0[scala.Unit], errorHandler: js.Function2[
      /* error */ js.Any, 
      /* derivation */ mobxLib.libCoreDerivationMod.IDerivation, 
      scala.Unit
    ]) = this()
}

