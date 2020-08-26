package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.plotly_afterexport
import typings.plotlyJs.plotlyJsStrings.plotly_afterplot
import typings.plotlyJs.plotlyJsStrings.plotly_animated
import typings.plotlyJs.plotlyJsStrings.plotly_animatingframe
import typings.plotlyJs.plotlyJsStrings.plotly_animationinterrupted
import typings.plotlyJs.plotlyJsStrings.plotly_autosize
import typings.plotlyJs.plotlyJsStrings.plotly_beforeexport
import typings.plotlyJs.plotlyJsStrings.plotly_beforeplot
import typings.plotlyJs.plotlyJsStrings.plotly_click
import typings.plotlyJs.plotlyJsStrings.plotly_clickannotation
import typings.plotlyJs.plotlyJsStrings.plotly_deselect
import typings.plotlyJs.plotlyJsStrings.plotly_doubleclick
import typings.plotlyJs.plotlyJsStrings.plotly_event
import typings.plotlyJs.plotlyJsStrings.plotly_framework
import typings.plotlyJs.plotlyJsStrings.plotly_hover
import typings.plotlyJs.plotlyJsStrings.plotly_legendclick
import typings.plotlyJs.plotlyJsStrings.plotly_legenddoubleclick
import typings.plotlyJs.plotlyJsStrings.plotly_redraw
import typings.plotlyJs.plotlyJsStrings.plotly_relayout
import typings.plotlyJs.plotlyJsStrings.plotly_relayouting
import typings.plotlyJs.plotlyJsStrings.plotly_restyle
import typings.plotlyJs.plotlyJsStrings.plotly_selected
import typings.plotlyJs.plotlyJsStrings.plotly_selecting
import typings.plotlyJs.plotlyJsStrings.plotly_sliderchange
import typings.plotlyJs.plotlyJsStrings.plotly_sliderend
import typings.plotlyJs.plotlyJsStrings.plotly_sliderstart
import typings.plotlyJs.plotlyJsStrings.plotly_transitioning
import typings.plotlyJs.plotlyJsStrings.plotly_transitioninterrupted
import typings.plotlyJs.plotlyJsStrings.plotly_unhover
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotlyHTMLElement extends HTMLElement {
  @JSName("on")
  def on_plotlyafterexport(event: plotly_afterexport, callback: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyafterplot(event: plotly_afterplot, callback: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyanimated(event: plotly_animated, callback: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyanimatingframe(event: plotly_animatingframe, callback: js.Function1[/* event */ FrameAnimationEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyanimationinterrupted(event: plotly_animationinterrupted, callback: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyautosize(event: plotly_autosize, callback: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_plotlybeforeexport(event: plotly_beforeexport, callback: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_plotlybeforeplot(event: plotly_beforeplot, callback: js.Function1[/* event */ BeforePlotEvent, Boolean]): Unit = js.native
  @JSName("on")
  def on_plotlyclick(event: plotly_click, callback: js.Function1[/* event */ PlotMouseEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyclickannotation(event: plotly_clickannotation, callback: js.Function1[/* event */ ClickAnnotationEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlydeselect(event: plotly_deselect, callback: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_plotlydoubleclick(event: plotly_doubleclick, callback: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyevent(event: plotly_event, callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyframework(event: plotly_framework, callback: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyhover(event: plotly_hover, callback: js.Function1[/* event */ PlotMouseEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlylegendclick(event: plotly_legendclick, callback: js.Function1[/* event */ LegendClickEvent, Boolean]): Unit = js.native
  @JSName("on")
  def on_plotlylegenddoubleclick(event: plotly_legenddoubleclick, callback: js.Function1[/* event */ LegendClickEvent, Boolean]): Unit = js.native
  @JSName("on")
  def on_plotlyredraw(event: plotly_redraw, callback: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyrelayout(event: plotly_relayout, callback: js.Function1[/* event */ PlotRelayoutEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyrelayouting(event: plotly_relayouting, callback: js.Function1[/* event */ PlotRelayoutEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyrestyle(event: plotly_restyle, callback: js.Function1[/* data */ PlotRestyleEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyselected(event: plotly_selected, callback: js.Function1[/* event */ PlotSelectionEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyselecting(event: plotly_selecting, callback: js.Function1[/* event */ PlotSelectionEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlysliderchange(event: plotly_sliderchange, callback: js.Function1[/* event */ SliderChangeEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlysliderend(event: plotly_sliderend, callback: js.Function1[/* event */ SliderEndEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlysliderstart(event: plotly_sliderstart, callback: js.Function1[/* event */ SliderStartEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlytransitioning(event: plotly_transitioning, callback: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_plotlytransitioninterrupted(event: plotly_transitioninterrupted, callback: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyunhover(event: plotly_unhover, callback: js.Function1[/* event */ PlotMouseEvent, Unit]): Unit = js.native
  def removeAllListeners(handler: String): Unit = js.native
}

