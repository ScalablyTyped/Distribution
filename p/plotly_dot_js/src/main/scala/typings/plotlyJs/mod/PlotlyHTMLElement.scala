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
import typings.plotlyJs.plotlyJsStrings.plotly_sunburstclick
import typings.plotlyJs.plotlyJsStrings.plotly_transitioning
import typings.plotlyJs.plotlyJsStrings.plotly_transitioninterrupted
import typings.plotlyJs.plotlyJsStrings.plotly_unhover
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotlyHTMLElement
  extends StObject
     with HTMLElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  def on(
    event: plotly_afterexport | plotly_afterplot | plotly_animated | plotly_animationinterrupted | plotly_autosize | plotly_beforeexport | plotly_deselect | plotly_doubleclick | plotly_framework | plotly_redraw | plotly_transitioning | plotly_transitioninterrupted,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def on(
    event: plotly_click | plotly_legendclick | plotly_legenddoubleclick | plotly_relayout | plotly_relayouting | plotly_selected | plotly_selecting | plotly_unhover,
    callback: js.Function1[
      (/* event */ LegendClickEvent) | (/* event */ PlotMouseEvent) | (/* event */ PlotRelayoutEvent) | (/* event */ PlotSelectionEvent), 
      Boolean | Unit
    ]
  ): Unit = js.native
  @JSName("on")
  def on_plotlyanimatingframe(event: plotly_animatingframe, callback: js.Function1[/* event */ FrameAnimationEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlybeforeplot(event: plotly_beforeplot, callback: js.Function1[/* event */ BeforePlotEvent, Boolean]): Unit = js.native
  @JSName("on")
  def on_plotlyclickannotation(event: plotly_clickannotation, callback: js.Function1[/* event */ ClickAnnotationEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyevent(event: plotly_event, callback: js.Function1[/* data */ Any, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyhover(event: plotly_hover, callback: js.Function1[/* event */ PlotHoverEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyrestyle(event: plotly_restyle, callback: js.Function1[/* data */ PlotRestyleEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlysliderchange(event: plotly_sliderchange, callback: js.Function1[/* event */ SliderChangeEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlysliderend(event: plotly_sliderend, callback: js.Function1[/* event */ SliderEndEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlysliderstart(event: plotly_sliderstart, callback: js.Function1[/* event */ SliderStartEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlysunburstclick(event: plotly_sunburstclick, callback: js.Function1[/* event */ SunburstClickEvent, Unit]): Unit = js.native
  
  def removeAllListeners(handler: String): Unit = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
}
