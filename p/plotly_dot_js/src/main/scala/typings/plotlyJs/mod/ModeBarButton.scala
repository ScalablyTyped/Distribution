package typings.plotlyJs.mod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModeBarButton extends js.Object {
  
  /**
    * attribute associated with button,
    * use this with 'val' to keep track of the state
    */
  var attr: js.UndefOr[String] = js.native
  
  /**
    * click handler associated with the button, a function of
    * 'gd' (the main graph object) and
    * 'ev' (the event object)
    */
  def click(gd: PlotlyHTMLElement, ev: MouseEvent): Unit = js.native
  /**
    * click handler associated with the button, a function of
    * 'gd' (the main graph object) and
    * 'ev' (the event object)
    */
  @JSName("click")
  var click_Original: ButtonClickEvent = js.native
  
  /** icon positioning */
  var gravity: js.UndefOr[String] = js.native
  
  /**
    * svg icon object associated with the button
    * can be linked to Plotly.Icons to use the default plotly icons
    */
  var icon: String | Icon = js.native
  
  /** name / id of the buttons (for tracking) */
  var name: String = js.native
  
  /**
    * text that appears while hovering over the button,
    * enter null, false or '' for no hover text
    */
  var title: String = js.native
  
  /** is the button a toggle button? */
  var toggle: js.UndefOr[Boolean] = js.native
  
  /** initial 'attr' value, can be a function of gd */
  var `val`: js.UndefOr[js.Any] = js.native
}
