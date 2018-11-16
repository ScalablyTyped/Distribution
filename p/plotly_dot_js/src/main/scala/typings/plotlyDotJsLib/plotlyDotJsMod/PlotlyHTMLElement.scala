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
  def on_plotly_animatingframe(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_animatingframe,
    callback: js.Function1[/* event */ FrameAnimationEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotly_beforeplot(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_beforeplot,
    callback: js.Function1[/* event */ BeforePlotEvent, scala.Boolean]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotly_click(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_click,
    callback: js.Function1[/* event */ PlotMouseEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotly_clickannotation(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_clickannotation,
    callback: js.Function1[/* event */ ClickAnnotationEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotly_event(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_event,
    callback: js.Function1[/* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotly_hover(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_hover,
    callback: js.Function1[/* event */ PlotMouseEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotly_legendclick(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_legendclick,
    callback: js.Function1[/* event */ LegendClickEvent, scala.Boolean]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotly_legenddoubleclick(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_legenddoubleclick,
    callback: js.Function1[/* event */ LegendClickEvent, scala.Boolean]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotly_relayout(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_relayout,
    callback: js.Function1[/* event */ PlotRelayoutEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotly_restyle(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_restyle,
    callback: js.Function1[/* data */ PlotRestyleEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotly_selected(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_selected,
    callback: js.Function1[/* event */ PlotSelectionEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotly_selecting(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_selecting,
    callback: js.Function1[/* event */ PlotSelectionEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotly_sliderchange(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_sliderchange,
    callback: js.Function1[/* event */ SliderChangeEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotly_sliderend(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_sliderend,
    callback: js.Function1[/* event */ SliderEndEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotly_sliderstart(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_sliderstart,
    callback: js.Function1[/* event */ SliderStartEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_plotly_unhover(
    event: plotlyDotJsLib.plotlyDotJsLibStrings.plotly_unhover,
    callback: js.Function1[/* event */ PlotMouseEvent, scala.Unit]
  ): scala.Unit = js.native
  def removeAllListeners(handler: java.lang.String): scala.Unit = js.native
}

