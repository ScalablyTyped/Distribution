package typings.popmotion.popmotionMod

import typings.popmotion.libActionTypesMod.ActionInit
import typings.popmotion.libActionVectorMod.ActionFactory
import typings.popmotion.libAnimationsKeyframesTypesMod.KeyframesProps
import typings.popmotion.libAnimationsTimelineTypesMod.Instruction
import typings.popmotion.libAnimationsTweenTypesMod.TweenProps
import typings.popmotion.libCompositorsCompositeMod.ActionMap
import typings.popmotion.libCompositorsStaggerMod.Interval
import typings.popmotion.libInputListenTypesMod.ListenFactory
import typings.popmotion.libInputPointerTypesMod.PointerProps
import typings.popmotion.libReactionsMulticastMod.Multicast
import typings.popmotion.libReactionsValueMod.Value
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Window
import typings.stylefire.libStylerTypesMod.Props
import typings.stylefire.libStylerTypesMod.Styler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val decay: ActionFactory = js.native
  val inertia: ActionFactory = js.native
  val listen: ListenFactory = js.native
  val physics: ActionFactory = js.native
  val spring: ActionFactory = js.native
  def action(init: ActionInit): typings.popmotion.libActionMod.Action = js.native
  def chain(actions: typings.popmotion.libActionMod.Action*): typings.popmotion.libActionMod.Action = js.native
  def composite(actions: ActionMap): typings.popmotion.libActionMod.Action = js.native
  def crossfade(a: typings.popmotion.libActionMod.Action, b: typings.popmotion.libActionMod.Action): typings.popmotion.libActionMod.Action = js.native
  def css(element: HTMLElement, props: js.Object): Styler = js.native
  def delay(timeToDelay: Double): typings.popmotion.libActionMod.Action = js.native
  def everyFrame(): typings.popmotion.libActionMod.Action = js.native
  def keyframes(hasEasingsEaseTimesValuesTweenProps: KeyframesProps): typings.popmotion.libActionMod.Action = js.native
  def merge(actions: typings.popmotion.libActionMod.Action*): typings.popmotion.libActionMod.Action = js.native
  def mouse(): typings.popmotion.libActionMod.Action = js.native
  def mouse(hasPreventDefault: PointerProps): typings.popmotion.libActionMod.Action = js.native
  def multicast(): Multicast = js.native
  def multitouch(): typings.popmotion.libActionMod.Action = js.native
  def multitouch(hasPreventDefaultScaleRotate: PointerProps): typings.popmotion.libActionMod.Action = js.native
  def parallel(actions: typings.popmotion.libActionMod.Action*): typings.popmotion.libActionMod.Action = js.native
  def pointer(): typings.popmotion.libActionMod.Action = js.native
  def pointer(hasXYProps: PointerProps): typings.popmotion.libActionMod.Action = js.native
  def schedule(scheduler: typings.popmotion.libActionMod.Action, schedulee: typings.popmotion.libActionMod.Action): typings.popmotion.libActionMod.Action = js.native
  def stagger(actions: js.Array[typings.popmotion.libActionMod.Action], interval: Interval): typings.popmotion.libActionMod.Action = js.native
  def styler(nodeOrSelector: String): Styler = js.native
  def styler(nodeOrSelector: String, props: Props): Styler = js.native
  def styler(nodeOrSelector: Element): Styler = js.native
  def styler(nodeOrSelector: Element, props: Props): Styler = js.native
  def styler(nodeOrSelector: Window): Styler = js.native
  def styler(nodeOrSelector: Window, props: Props): Styler = js.native
  def svg(element: HTMLElement, props: js.Object): Styler = js.native
  def timeline(instructions: js.Array[Instruction]): typings.popmotion.libActionMod.Action = js.native
  def timeline(instructions: js.Array[Instruction], hasDurationElapsedEaseLoopFlipYoyo: TweenProps): typings.popmotion.libActionMod.Action = js.native
  def tween(): typings.popmotion.libActionMod.Action = js.native
  def tween(props: TweenProps): typings.popmotion.libActionMod.Action = js.native
  def value(value: Value): typings.popmotion.libReactionsValueMod.ValueReaction = js.native
  def value(value: Value, initialSubscription: js.Function): typings.popmotion.libReactionsValueMod.ValueReaction = js.native
}

