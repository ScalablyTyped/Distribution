package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotlyHTMLElement
  extends stdLib.HTMLElement {
  def on(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_afterexport | plotlyDotJsLib.plotlyDotJsLibStrings.plotly_afterplot | plotlyDotJsLib.plotlyDotJsLibStrings.plotly_animated | plotlyDotJsLib.plotlyDotJsLibStrings.plotly_animationinterrupted | plotlyDotJsLib.plotlyDotJsLibStrings.plotly_autosize | plotlyDotJsLib.plotlyDotJsLibStrings.plotly_beforeexport | plotlyDotJsLib.plotlyDotJsLibStrings.plotly_deselect | plotlyDotJsLib.plotlyDotJsLibStrings.plotly_doubleclick | plotlyDotJsLib.plotlyDotJsLibStrings.plotly_framework | plotlyDotJsLib.plotlyDotJsLibStrings.plotly_redraw | plotlyDotJsLib.plotlyDotJsLibStrings.plotly_transitioning | plotlyDotJsLib.plotlyDotJsLibStrings.plotly_transitioninterrupted,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotlyanimatingframe(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_animatingframe,
    callback: js.Function1[/* event */ FrameAnimationEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotlybeforeplot(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_beforeplot,
    callback: js.Function1[/* event */ BeforePlotEvent, scala.Boolean]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotlyclick(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_click,
    callback: js.Function1[/* event */ PlotMouseEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotlyclickannotation(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_clickannotation,
    callback: js.Function1[/* event */ ClickAnnotationEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotlyevent(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_event,
    callback: js.Function1[/* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotlyhover(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_hover,
    callback: js.Function1[/* event */ PlotMouseEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotlylegendclick(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_legendclick,
    callback: js.Function1[/* event */ LegendClickEvent, scala.Boolean]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotlylegenddoubleclick(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_legenddoubleclick,
    callback: js.Function1[/* event */ LegendClickEvent, scala.Boolean]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotlyrelayout(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_relayout,
    callback: js.Function1[/* event */ PlotRelayoutEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotlyrestyle(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_restyle,
    callback: js.Function1[/* data */ PlotRestyleEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotlyselected(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_selected,
    callback: js.Function1[/* event */ PlotSelectionEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotlyselecting(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_selecting,
    callback: js.Function1[/* event */ PlotSelectionEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotlysliderchange(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_sliderchange,
    callback: js.Function1[/* event */ SliderChangeEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotlysliderend(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_sliderend,
    callback: js.Function1[/* event */ SliderEndEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotlysliderstart(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_sliderstart,
    callback: js.Function1[/* event */ SliderStartEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotlyunhover(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_unhover,
    callback: js.Function1[/* event */ PlotMouseEvent, scala.Unit]
  ): scala.Unit = js.native
  def removeAllListeners(handler: java.lang.String): scala.Unit = js.native
}

