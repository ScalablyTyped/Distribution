package typings.mobx.libCoreReactionMod

import typings.mobx.libCoreDerivationMod.IDerivation
import typings.mobx.libUtilsUtilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/reaction", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isReaction(x: js.Any): /* is mobx.mobx/lib/core/reaction.Reaction */ Boolean = js.native
  def onReactionError(handler: js.Function2[/* error */ js.Any, /* derivation */ IDerivation, Unit]): Lambda = js.native
  def runReactions(): Unit = js.native
  def setReactionScheduler(fn: js.Function1[/* f */ js.Function0[Unit], Unit]): Unit = js.native
}

