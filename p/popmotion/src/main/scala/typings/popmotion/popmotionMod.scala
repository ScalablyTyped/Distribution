package typings.popmotion

import org.scalablytyped.runtime.StringDictionary
import typings.atPopmotionEasing.atPopmotionEasingMod.Easing
import typings.atPopmotionEasing.atPopmotionEasingMod.EasingModifier
import typings.atPopmotionPopcorn.Anon_X
import typings.atPopmotionPopcorn.libTypesMod.Point
import typings.atPopmotionPopcorn.libTypesMod.Point2D
import typings.atPopmotionPopcorn.libUtilsConditionalMod.Apply
import typings.atPopmotionPopcorn.libUtilsConditionalMod.Check
import typings.atPopmotionPopcorn.libUtilsDistanceMod._Point
import typings.atPopmotionPopcorn.libUtilsInterpolateMod.InterpolateOptions
import typings.atPopmotionPopcorn.libUtilsInterpolateMod.Mix
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
import typings.popmotion.libReactionsValueMod.ValueProps
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Window
import typings.styleDashValueDashTypes.libTypesMod.HSLA
import typings.styleDashValueDashTypes.libTypesMod.RGBA
import typings.styleDashValueDashTypes.libTypesMod.ValueType
import typings.stylefire.libStylerTypesMod.Props
import typings.stylefire.libStylerTypesMod.Styler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", JSImport.Namespace)
@js.native
object popmotionMod extends js.Object {
  @js.native
  class Action ()
    extends typings.popmotion.libActionMod.Action
  
  @js.native
  class ValueReaction protected ()
    extends typings.popmotion.libReactionsValueMod.ValueReaction {
    def this(props: ValueProps) = this()
  }
  
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
  @js.native
  object calc extends js.Object {
    def angle(a: Point): Double = js.native
    def angle(a: Point, b: Point): Double = js.native
    def degreesToRadians(degrees: Double): Double = js.native
    def dilate(from: Double, to: Double, progress: Double): Double = js.native
    def distance(a: _Point): Double = js.native
    def distance(a: _Point, b: _Point): Double = js.native
    def getProgressFromValue(from: Double, to: Double, value: Double): Double = js.native
    def getValueFromProgress(from: Double, to: Double, progress: Double): Double = js.native
    def isPoint(point: js.Object): /* is @popmotion/popcorn.@popmotion/popcorn/lib/types.Point */ Boolean = js.native
    def isPoint3D(point: Point): /* is @popmotion/popcorn.@popmotion/popcorn/lib/types.Point3D */ Boolean = js.native
    def pointFromAngleAndDistance(origin: Point2D, angle: Double, distance: Double): Anon_X = js.native
    def radiansToDegrees(radians: Double): Double = js.native
    def smooth(prevValue: Double, nextValue: Double, duration: Double): Double = js.native
    def smooth(prevValue: Double, nextValue: Double, duration: Double, smoothing: Double): Double = js.native
    def speedPerFrame(xps: Double, frameDuration: Double): Double = js.native
    def speedPerSecond(velocity: Double, frameDuration: Double): Double = js.native
    def stepProgress(steps: Double, progress: Double): Double = js.native
  }
  
  @js.native
  object easing extends js.Object {
    val anticipate: Easing = js.native
    val backIn: Easing = js.native
    val backInOut: Easing = js.native
    val backOut: Easing = js.native
    val circIn: Easing = js.native
    val circInOut: Easing = js.native
    val circOut: Easing = js.native
    val createMirroredEasing: EasingModifier = js.native
    val createReversedEasing: EasingModifier = js.native
    val easeIn: Easing = js.native
    val easeInOut: Easing = js.native
    val easeOut: Easing = js.native
    val linear: Easing = js.native
    val mirrored: EasingModifier = js.native
    val reversed: EasingModifier = js.native
    def bounceIn(p: Double): Double = js.native
    def bounceInOut(p: Double): Double = js.native
    def bounceOut(p: Double): Double = js.native
    def createAnticipateEasing(power: Double): Easing = js.native
    def createBackIn(power: Double): Easing = js.native
    def createExpoIn(power: Double): Easing = js.native
    def cubicBezier(mX1: Double, mY1: Double, mX2: Double, mY2: Double): js.Function1[/* aX */ Double, Double] = js.native
  }
  
  @js.native
  object transform extends js.Object {
    def appendUnit(unit: String): js.Function1[/* v */ Double, String] = js.native
    def applyOffset(from: Double): js.Function1[/* v */ Double, Double] = js.native
    def applyOffset(from: Double, to: Double): js.Function1[/* v */ Double, Double] = js.native
    def blendArray(from: js.Array[String | Double | RGBA | HSLA], to: js.Array[String | Double | RGBA | HSLA]): js.Function1[/* v */ Double, js.Array[String | Double | RGBA | HSLA]] = js.native
    def blendColor(from: String, to: String): js.Function1[/* v */ Double, _] = js.native
    def blendColor(from: String, to: HSLA): js.Function1[/* v */ Double, _] = js.native
    def blendColor(from: String, to: RGBA): js.Function1[/* v */ Double, _] = js.native
    def blendColor(from: HSLA, to: String): js.Function1[/* v */ Double, _] = js.native
    def blendColor(from: HSLA, to: HSLA): js.Function1[/* v */ Double, _] = js.native
    def blendColor(from: HSLA, to: RGBA): js.Function1[/* v */ Double, _] = js.native
    def blendColor(from: RGBA, to: String): js.Function1[/* v */ Double, _] = js.native
    def blendColor(from: RGBA, to: HSLA): js.Function1[/* v */ Double, _] = js.native
    def blendColor(from: RGBA, to: RGBA): js.Function1[/* v */ Double, _] = js.native
    def clamp(min: Double, max: Double): js.Any = js.native
    def clamp(min: Double, max: Double, v: Double): js.Any = js.native
    def conditional(check: Check, apply: Apply): js.Function1[/* v */ js.Any, _] = js.native
    def generateStaticSpring(): js.Function3[/* min */ Double, /* max */ Double, /* v */ js.UndefOr[Double], _] = js.native
    def generateStaticSpring(alterDisplacement: js.Function): js.Function3[/* min */ Double, /* max */ Double, /* v */ js.UndefOr[Double], _] = js.native
    def interpolate[T](input: js.Array[Double], output: js.Array[T]): Mix[T | String | Double] = js.native
    def interpolate[T](input: js.Array[Double], output: js.Array[T], hasClampEaseMixer: InterpolateOptions[T]): Mix[T | String | Double] = js.native
    def linearSpring(min: Double, max: Double): js.Any = js.native
    def linearSpring(min: Double, max: Double, v: Double): js.Any = js.native
    def nonlinearSpring(min: Double, max: Double): js.Any = js.native
    def nonlinearSpring(min: Double, max: Double, v: Double): js.Any = js.native
    def pipe(transformers: js.Function*): js.Function = js.native
    def smooth(): js.Function1[/* v */ Double, Double] = js.native
    def smooth(strength: Double): js.Function1[/* v */ Double, Double] = js.native
    def snap(points: js.Array[Double]): js.Function1[/* v */ Double, Double] = js.native
    def snap(points: Double): js.Function1[/* v */ Double, Double] = js.native
    def steps(st: Double): js.Function1[/* v */ Double, Double] = js.native
    def steps(st: Double, min: Double): js.Function1[/* v */ Double, Double] = js.native
    def steps(st: Double, min: Double, max: Double): js.Function1[/* v */ Double, Double] = js.native
    def transformMap(childTransformers: StringDictionary[js.Function]): js.Function1[/* v */ js.Any, StringDictionary[_]] = js.native
    def wrap(min: Double, max: Double): js.Any = js.native
    def wrap(min: Double, max: Double, v: Double): js.Any = js.native
  }
  
  @js.native
  object valueTypes extends js.Object {
    val alpha: ValueType = js.native
    val color: ValueType = js.native
    val degrees: ValueType = js.native
    val hex: ValueType = js.native
    val hsla: ValueType = js.native
    val number: ValueType = js.native
    val percent: ValueType = js.native
    val progressPercentage: ValueType = js.native
    val px: ValueType = js.native
    val rgbUnit: ValueType = js.native
    val rgba: ValueType = js.native
    val scale: ValueType = js.native
    val vh: ValueType = js.native
    val vw: ValueType = js.native
    @js.native
    object complex extends js.Object {
      def createTransformer(prop: String): js.Function1[/* v */ js.Array[Double | HSLA | RGBA], String] = js.native
      def getAnimatableNone(target: String): String = js.native
      def parse(v: js.Any): js.Array[Double | HSLA | RGBA] = js.native
      def test(v: js.Any): Boolean = js.native
    }
    
  }
  
}

