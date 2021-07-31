package typings.nvd3.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tooltip extends StObject {
  
  /*For tooltip: Parent dom element of the SVG that holds the chart. This will make the tooltip dom be created inside this container instead of on the document body.*/
  def chartContainer(): HTMLElement = js.native
  /*For tooltip: Parent dom element of the SVG that holds the chart. This will make the tooltip dom be created inside this container instead of on the document body.*/
  def chartContainer(el: HTMLElement): this.type = js.native
  
  /*Attaches additional CSS classes to the tooltip DIV that is created.*/
  def classes(): String = js.native
  /*Attaches additional CSS classes to the tooltip DIV that is created.*/
  def classes(el: String): this.type = js.native
  
  /*Function that generates the tooltip content html.*/
  def contentGenerator(): js.Function1[/* d */ js.Any, String] = js.native
  /*Function that generates the tooltip content html.*/
  def contentGenerator(func: js.Function1[/* d */ js.Any, String]): this.type = js.native
  
  def data(): js.Any = js.native
  def data(value: js.Any): this.type = js.native
  
  def distance(): Double = js.native
  def distance(value: Double): this.type = js.native
  
  /*Duration in ms to take when updating chart. For things like bar charts, each bar can animate by itself but the total time taken should be this value.*/
  def duration(): Double = js.native
  /*Duration in ms to take when updating chart. For things like bar charts, each bar can animate by itself but the total time taken should be this value.*/
  def duration(value: Double): this.type = js.native
  
  /*For tooltip: completely enables or disabled the tooltip*/
  def enabled(): Boolean = js.native
  /*For tooltip: completely enables or disabled the tooltip*/
  def enabled(value: Boolean): this.type = js.native
  
  /*For tooltip: If not null, this fixes the top position of the tooltip.*/
  def fixedTop(): Double = js.native
  /*For tooltip: If not null, this fixes the top position of the tooltip.*/
  def fixedTop(value: Double): this.type = js.native
  
  /*Can be 'n','s','e','w'. Determines how tooltip is positioned*/
  def gravity(): String = js.native
  /*Can be 'n','s','e','w'. Determines how tooltip is positioned*/
  def gravity(value: String): this.type = js.native
  
  /*For tooltip: show the x axis value in the tooltip or not (not valid for pie charts for instance)*/
  def headerEnabled(): Boolean = js.native
  /*For tooltip: show the x axis value in the tooltip or not (not valid for pie charts for instance)*/
  def headerEnabled(value: Boolean): this.type = js.native
  
  /*For tooltip: formats the x axis value in the tooltip*/
  def headerFormatter(): js.Function1[/* d */ js.Any, String] = js.native
  /*For tooltip: formats the x axis value in the tooltip*/
  def headerFormatter(func: js.Function1[/* d */ js.Any, String]): this.type = js.native
  
  /*For tooltip: show or hide the tooltip by setting this to true or false. Tooltips used to be created and destroyed, but now we re-used the element and set opacity to 1 or 0.*/
  def hidden(): Boolean = js.native
  /*For tooltip: show or hide the tooltip by setting this to true or false. Tooltips used to be created and destroyed, but now we re-used the element and set opacity to 1 or 0.*/
  def hidden(value: Boolean): this.type = js.native
  
  /*Delay in ms before the tooltip hides itself after a mouseout event. A new mouseover event cancels the hide if within this timeout period.*/
  def hideDelay(): Double = js.native
  /*Delay in ms before the tooltip hides itself after a mouseout event. A new mouseover event cancels the hide if within this timeout period.*/
  def hideDelay(value: Double): this.type = js.native
  
  /**/
  def id(): js.Any = js.native
  
  def keyFormatter(): js.Function2[/* d */ js.Any, /* i */ Double, String] = js.native
  def keyFormatter(func: js.Function2[/* d */ js.Any, /* i */ Double, String]): this.type = js.native
  
  def offset(): Offset = js.native
  def offset(value: Offset): this.type = js.native
  
  /*sets the top/left positioning for the tooltip. Should be given an object with 'left' and/or 'top' attributes. You can override just one, just like the 'margin' option on charts*/
  def position(): Offset = js.native
  /*sets the top/left positioning for the tooltip. Should be given an object with 'left' and/or 'top' attributes. You can override just one, just like the 'margin' option on charts*/
  def position(value: Offset): this.type = js.native
  
  /*Tolerance allowed before tooltip is moved from its current position (creates 'snapping' effect)*/
  def snapDistance(): Double = js.native
  /*Tolerance allowed before tooltip is moved from its current position (creates 'snapping' effect)*/
  def snapDistance(value: Double): this.type = js.native
  
  /*returns the dom element of the tooltip.*/
  def tooltipElem(): HTMLElement = js.native
  
  /*formats the y axis value(s) in the tooltip*/
  def valueFormatter(): js.Function1[/* d */ js.Any, String] = js.native
  /*formats the y axis value(s) in the tooltip*/
  def valueFormatter(func: js.Function1[/* d */ js.Any, String]): this.type = js.native
}
