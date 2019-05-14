package typings
package popmotionLib.popmotionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val decay: popmotionLib.libActionVectorMod.ActionFactory = js.native
  val inertia: popmotionLib.libActionVectorMod.ActionFactory = js.native
  val listen: popmotionLib.libInputListenTypesMod.ListenFactory = js.native
  val physics: popmotionLib.libActionVectorMod.ActionFactory = js.native
  val spring: popmotionLib.libActionVectorMod.ActionFactory = js.native
  def action(init: popmotionLib.libActionTypesMod.ActionInit): popmotionLib.libActionMod.Action = js.native
  def chain(actions: popmotionLib.libActionMod.Action*): popmotionLib.libActionMod.Action = js.native
  def composite(actions: popmotionLib.libCompositorsCompositeMod.ActionMap): popmotionLib.libActionMod.Action = js.native
  def crossfade(a: popmotionLib.libActionMod.Action, b: popmotionLib.libActionMod.Action): popmotionLib.libActionMod.Action = js.native
  def css(element: stdLib.HTMLElement, props: js.Object): stylefireLib.libStylerTypesMod.Styler = js.native
  def delay(timeToDelay: scala.Double): popmotionLib.libActionMod.Action = js.native
  def everyFrame(): popmotionLib.libActionMod.Action = js.native
  def keyframes(hasEasingsEaseTimesValuesTweenProps: popmotionLib.libAnimationsKeyframesTypesMod.KeyframesProps): popmotionLib.libActionMod.Action = js.native
  def merge(actions: popmotionLib.libActionMod.Action*): popmotionLib.libActionMod.Action = js.native
  def mouse(): popmotionLib.libActionMod.Action = js.native
  def mouse(hasPreventDefault: popmotionLib.libInputPointerTypesMod.PointerProps): popmotionLib.libActionMod.Action = js.native
  def multicast(): popmotionLib.libReactionsMulticastMod.Multicast = js.native
  def multitouch(): popmotionLib.libActionMod.Action = js.native
  def multitouch(hasPreventDefaultScaleRotate: popmotionLib.libInputPointerTypesMod.PointerProps): popmotionLib.libActionMod.Action = js.native
  def parallel(actions: popmotionLib.libActionMod.Action*): popmotionLib.libActionMod.Action = js.native
  def pointer(): popmotionLib.libActionMod.Action = js.native
  def pointer(hasXYProps: popmotionLib.libInputPointerTypesMod.PointerProps): popmotionLib.libActionMod.Action = js.native
  def schedule(scheduler: popmotionLib.libActionMod.Action, schedulee: popmotionLib.libActionMod.Action): popmotionLib.libActionMod.Action = js.native
  def stagger(
    actions: js.Array[popmotionLib.libActionMod.Action],
    interval: popmotionLib.libCompositorsStaggerMod.Interval
  ): popmotionLib.libActionMod.Action = js.native
  def styler(nodeOrSelector: java.lang.String): stylefireLib.libStylerTypesMod.Styler = js.native
  def styler(nodeOrSelector: java.lang.String, props: stylefireLib.libStylerTypesMod.Props): stylefireLib.libStylerTypesMod.Styler = js.native
  def styler(nodeOrSelector: stdLib.Element): stylefireLib.libStylerTypesMod.Styler = js.native
  def styler(nodeOrSelector: stdLib.Element, props: stylefireLib.libStylerTypesMod.Props): stylefireLib.libStylerTypesMod.Styler = js.native
  def styler(nodeOrSelector: stdLib.Window): stylefireLib.libStylerTypesMod.Styler = js.native
  def styler(nodeOrSelector: stdLib.Window, props: stylefireLib.libStylerTypesMod.Props): stylefireLib.libStylerTypesMod.Styler = js.native
  def svg(element: stdLib.HTMLElement, props: js.Object): stylefireLib.libStylerTypesMod.Styler = js.native
  def timeline(instructions: js.Array[popmotionLib.libAnimationsTimelineTypesMod.Instruction]): popmotionLib.libActionMod.Action = js.native
  def timeline(
    instructions: js.Array[popmotionLib.libAnimationsTimelineTypesMod.Instruction],
    hasDurationElapsedEaseLoopFlipYoyo: popmotionLib.libAnimationsTweenTypesMod.TweenProps
  ): popmotionLib.libActionMod.Action = js.native
  def tween(): popmotionLib.libActionMod.Action = js.native
  def tween(props: popmotionLib.libAnimationsTweenTypesMod.TweenProps): popmotionLib.libActionMod.Action = js.native
  def value(value: popmotionLib.libReactionsValueMod.Value): popmotionLib.libReactionsValueMod.ValueReaction = js.native
  def value(value: popmotionLib.libReactionsValueMod.Value, initialSubscription: js.Function): popmotionLib.libReactionsValueMod.ValueReaction = js.native
}

