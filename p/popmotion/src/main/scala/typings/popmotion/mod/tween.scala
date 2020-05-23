package typings.popmotion.mod

import typings.popmotion.actionMod.Action
import typings.popmotion.tweenTypesMod.TweenInterface
import typings.popmotion.tweenTypesMod.TweenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", "tween")
@js.native
object tween extends js.Object {
  def apply(): Action[TweenInterface[Double]] = js.native
  def apply(props: TweenProps): Action[TweenInterface[Double]] = js.native
}

