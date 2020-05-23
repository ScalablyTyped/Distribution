package typings.popmotion

import typings.popmotion.actionMod.Action
import typings.popmotion.tweenTypesMod.TweenInterface
import typings.popmotion.tweenTypesMod.TweenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/animations/tween", JSImport.Namespace)
@js.native
object tweenMod extends js.Object {
  def default(): Action[TweenInterface[Double]] = js.native
  def default(props: TweenProps): Action[TweenInterface[Double]] = js.native
}

