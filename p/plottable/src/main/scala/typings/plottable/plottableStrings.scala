package typings.plottable

import typings.plottable.axisMod.AxisOrientation
import typings.plottable.barPlotMod.BarAlignment
import typings.plottable.barPlotMod.BarOrientation
import typings.plottable.barPlotMod.LabelsPosition
import typings.plottable.componentMod.XAlignment
import typings.plottable.componentMod.YAlignment
import typings.plottable.easingAnimatorMod.EaseName
import typings.plottable.linePlotMod.CurveName
import typings.plottable.plotMod.Renderer
import typings.plottable.renderControllerMod.Policy
import typings.plottable.stackingUtilsMod.IStackingOrder
import typings.plottable.timeAxisMod.TierLabelPosition
import typings.plottable.timeAxisMod.TimeAxisOrientation
import typings.plottable.timeAxisMod.TimeInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object plottableStrings {
  @js.native
  sealed trait animationFrame extends Policy
  
  @js.native
  sealed trait back extends EaseName
  
  @js.native
  sealed trait backIn extends EaseName
  
  @js.native
  sealed trait backInOut extends EaseName
  
  @js.native
  sealed trait backOut extends EaseName
  
  @js.native
  sealed trait basis extends CurveName
  
  @js.native
  sealed trait basisClosed extends CurveName
  
  @js.native
  sealed trait basisOpen extends CurveName
  
  @js.native
  sealed trait between extends TierLabelPosition
  
  @js.native
  sealed trait bottom
    extends AxisOrientation
       with TimeAxisOrientation
       with YAlignment
  
  @js.native
  sealed trait bottomup extends IStackingOrder
  
  @js.native
  sealed trait bounce extends EaseName
  
  @js.native
  sealed trait bounceIn extends EaseName
  
  @js.native
  sealed trait bounceInOut extends EaseName
  
  @js.native
  sealed trait bounceOut extends EaseName
  
  @js.native
  sealed trait bundle extends CurveName
  
  @js.native
  sealed trait canvas extends Renderer
  
  @js.native
  sealed trait cardinal extends CurveName
  
  @js.native
  sealed trait cardinalClosed extends CurveName
  
  @js.native
  sealed trait cardinalOpen extends CurveName
  
  @js.native
  sealed trait center
    extends TierLabelPosition
       with XAlignment
       with YAlignment
  
  @js.native
  sealed trait circle extends EaseName
  
  @js.native
  sealed trait circleIn extends EaseName
  
  @js.native
  sealed trait circleInOut extends EaseName
  
  @js.native
  sealed trait circleOut extends EaseName
  
  @js.native
  sealed trait cubic extends EaseName
  
  @js.native
  sealed trait cubicIn extends EaseName
  
  @js.native
  sealed trait cubicInOut extends EaseName
  
  @js.native
  sealed trait cubicOut extends EaseName
  
  @js.native
  sealed trait day extends TimeInterval
  
  @js.native
  sealed trait elastic extends EaseName
  
  @js.native
  sealed trait elasticIn extends EaseName
  
  @js.native
  sealed trait elasticInOut extends EaseName
  
  @js.native
  sealed trait elasticOut extends EaseName
  
  @js.native
  sealed trait end
    extends BarAlignment
       with LabelsPosition
  
  @js.native
  sealed trait exp extends EaseName
  
  @js.native
  sealed trait expIn extends EaseName
  
  @js.native
  sealed trait expInOut extends EaseName
  
  @js.native
  sealed trait expOut extends EaseName
  
  @js.native
  sealed trait horizontal extends BarOrientation
  
  @js.native
  sealed trait hour extends TimeInterval
  
  @js.native
  sealed trait immediate extends Policy
  
  @js.native
  sealed trait left
    extends AxisOrientation
       with XAlignment
  
  @js.native
  sealed trait linear
    extends CurveName
       with EaseName
  
  @js.native
  sealed trait linearClosed extends CurveName
  
  @js.native
  sealed trait makeEnum extends js.Object
  
  @js.native
  sealed trait middle
    extends BarAlignment
       with LabelsPosition
  
  @js.native
  sealed trait minute extends TimeInterval
  
  @js.native
  sealed trait monotone extends CurveName
  
  @js.native
  sealed trait month extends TimeInterval
  
  @js.native
  sealed trait outside extends LabelsPosition
  
  @js.native
  sealed trait poly extends EaseName
  
  @js.native
  sealed trait polyIn extends EaseName
  
  @js.native
  sealed trait polyInOut extends EaseName
  
  @js.native
  sealed trait polyOut extends EaseName
  
  @js.native
  sealed trait quad extends EaseName
  
  @js.native
  sealed trait quadIn extends EaseName
  
  @js.native
  sealed trait quadInOut extends EaseName
  
  @js.native
  sealed trait quadOut extends EaseName
  
  @js.native
  sealed trait right
    extends AxisOrientation
       with XAlignment
  
  @js.native
  sealed trait second extends TimeInterval
  
  @js.native
  sealed trait sin extends EaseName
  
  @js.native
  sealed trait sinIn extends EaseName
  
  @js.native
  sealed trait sinInOut extends EaseName
  
  @js.native
  sealed trait sinOut extends EaseName
  
  @js.native
  sealed trait start
    extends BarAlignment
       with LabelsPosition
  
  @js.native
  sealed trait step extends CurveName
  
  @js.native
  sealed trait stepAfter extends CurveName
  
  @js.native
  sealed trait stepBefore extends CurveName
  
  @js.native
  sealed trait svg extends Renderer
  
  @js.native
  sealed trait timeout extends Policy
  
  @js.native
  sealed trait top
    extends AxisOrientation
       with TimeAxisOrientation
       with YAlignment
  
  @js.native
  sealed trait topdown extends IStackingOrder
  
  @js.native
  sealed trait vertical extends BarOrientation
  
  @js.native
  sealed trait week extends TimeInterval
  
  @js.native
  sealed trait year extends TimeInterval
  
  @scala.inline
  def animationFrame: animationFrame = "animationFrame".asInstanceOf[animationFrame]
  @scala.inline
  def back: back = "back".asInstanceOf[back]
  @scala.inline
  def backIn: backIn = "backIn".asInstanceOf[backIn]
  @scala.inline
  def backInOut: backInOut = "backInOut".asInstanceOf[backInOut]
  @scala.inline
  def backOut: backOut = "backOut".asInstanceOf[backOut]
  @scala.inline
  def basis: basis = "basis".asInstanceOf[basis]
  @scala.inline
  def basisClosed: basisClosed = "basisClosed".asInstanceOf[basisClosed]
  @scala.inline
  def basisOpen: basisOpen = "basisOpen".asInstanceOf[basisOpen]
  @scala.inline
  def between: between = "between".asInstanceOf[between]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def bottomup: bottomup = "bottomup".asInstanceOf[bottomup]
  @scala.inline
  def bounce: bounce = "bounce".asInstanceOf[bounce]
  @scala.inline
  def bounceIn: bounceIn = "bounceIn".asInstanceOf[bounceIn]
  @scala.inline
  def bounceInOut: bounceInOut = "bounceInOut".asInstanceOf[bounceInOut]
  @scala.inline
  def bounceOut: bounceOut = "bounceOut".asInstanceOf[bounceOut]
  @scala.inline
  def bundle: bundle = "bundle".asInstanceOf[bundle]
  @scala.inline
  def canvas: canvas = "canvas".asInstanceOf[canvas]
  @scala.inline
  def cardinal: cardinal = "cardinal".asInstanceOf[cardinal]
  @scala.inline
  def cardinalClosed: cardinalClosed = "cardinalClosed".asInstanceOf[cardinalClosed]
  @scala.inline
  def cardinalOpen: cardinalOpen = "cardinalOpen".asInstanceOf[cardinalOpen]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def circle: circle = "circle".asInstanceOf[circle]
  @scala.inline
  def circleIn: circleIn = "circleIn".asInstanceOf[circleIn]
  @scala.inline
  def circleInOut: circleInOut = "circleInOut".asInstanceOf[circleInOut]
  @scala.inline
  def circleOut: circleOut = "circleOut".asInstanceOf[circleOut]
  @scala.inline
  def cubic: cubic = "cubic".asInstanceOf[cubic]
  @scala.inline
  def cubicIn: cubicIn = "cubicIn".asInstanceOf[cubicIn]
  @scala.inline
  def cubicInOut: cubicInOut = "cubicInOut".asInstanceOf[cubicInOut]
  @scala.inline
  def cubicOut: cubicOut = "cubicOut".asInstanceOf[cubicOut]
  @scala.inline
  def day: day = "day".asInstanceOf[day]
  @scala.inline
  def elastic: elastic = "elastic".asInstanceOf[elastic]
  @scala.inline
  def elasticIn: elasticIn = "elasticIn".asInstanceOf[elasticIn]
  @scala.inline
  def elasticInOut: elasticInOut = "elasticInOut".asInstanceOf[elasticInOut]
  @scala.inline
  def elasticOut: elasticOut = "elasticOut".asInstanceOf[elasticOut]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def exp: exp = "exp".asInstanceOf[exp]
  @scala.inline
  def expIn: expIn = "expIn".asInstanceOf[expIn]
  @scala.inline
  def expInOut: expInOut = "expInOut".asInstanceOf[expInOut]
  @scala.inline
  def expOut: expOut = "expOut".asInstanceOf[expOut]
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  @scala.inline
  def hour: hour = "hour".asInstanceOf[hour]
  @scala.inline
  def immediate: immediate = "immediate".asInstanceOf[immediate]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def linear: linear = "linear".asInstanceOf[linear]
  @scala.inline
  def linearClosed: linearClosed = "linearClosed".asInstanceOf[linearClosed]
  @scala.inline
  def makeEnum: makeEnum = "makeEnum".asInstanceOf[makeEnum]
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  @scala.inline
  def minute: minute = "minute".asInstanceOf[minute]
  @scala.inline
  def monotone: monotone = "monotone".asInstanceOf[monotone]
  @scala.inline
  def month: month = "month".asInstanceOf[month]
  @scala.inline
  def outside: outside = "outside".asInstanceOf[outside]
  @scala.inline
  def poly: poly = "poly".asInstanceOf[poly]
  @scala.inline
  def polyIn: polyIn = "polyIn".asInstanceOf[polyIn]
  @scala.inline
  def polyInOut: polyInOut = "polyInOut".asInstanceOf[polyInOut]
  @scala.inline
  def polyOut: polyOut = "polyOut".asInstanceOf[polyOut]
  @scala.inline
  def quad: quad = "quad".asInstanceOf[quad]
  @scala.inline
  def quadIn: quadIn = "quadIn".asInstanceOf[quadIn]
  @scala.inline
  def quadInOut: quadInOut = "quadInOut".asInstanceOf[quadInOut]
  @scala.inline
  def quadOut: quadOut = "quadOut".asInstanceOf[quadOut]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def second: second = "second".asInstanceOf[second]
  @scala.inline
  def sin: sin = "sin".asInstanceOf[sin]
  @scala.inline
  def sinIn: sinIn = "sinIn".asInstanceOf[sinIn]
  @scala.inline
  def sinInOut: sinInOut = "sinInOut".asInstanceOf[sinInOut]
  @scala.inline
  def sinOut: sinOut = "sinOut".asInstanceOf[sinOut]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def step: step = "step".asInstanceOf[step]
  @scala.inline
  def stepAfter: stepAfter = "stepAfter".asInstanceOf[stepAfter]
  @scala.inline
  def stepBefore: stepBefore = "stepBefore".asInstanceOf[stepBefore]
  @scala.inline
  def svg: svg = "svg".asInstanceOf[svg]
  @scala.inline
  def timeout: timeout = "timeout".asInstanceOf[timeout]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  @scala.inline
  def topdown: topdown = "topdown".asInstanceOf[topdown]
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
  @scala.inline
  def week: week = "week".asInstanceOf[week]
  @scala.inline
  def year: year = "year".asInstanceOf[year]
}

