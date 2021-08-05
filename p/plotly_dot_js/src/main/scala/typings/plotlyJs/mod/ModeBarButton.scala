package typings.plotlyJs.mod

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModeBarButton extends StObject {
  
  /**
    * attribute associated with button,
    * use this with 'val' to keep track of the state
    */
  var attr: js.UndefOr[String] = js.undefined
  
  /**
    * click handler associated with the button, a function of
    * 'gd' (the main graph object) and
    * 'ev' (the event object)
    */
  def click(gd: PlotlyHTMLElement, ev: MouseEvent): Unit
  /**
    * click handler associated with the button, a function of
    * 'gd' (the main graph object) and
    * 'ev' (the event object)
    */
  @JSName("click")
  var click_Original: ButtonClickEvent
  
  /** icon positioning */
  var gravity: js.UndefOr[String] = js.undefined
  
  /**
    * svg icon object associated with the button
    * can be linked to Plotly.Icons to use the default plotly icons
    */
  var icon: String | Icon
  
  /** name / id of the buttons (for tracking) */
  var name: String
  
  /**
    * text that appears while hovering over the button,
    * enter null, false or '' for no hover text
    */
  var title: String
  
  /** is the button a toggle button? */
  var toggle: js.UndefOr[Boolean] = js.undefined
  
  /** initial 'attr' value, can be a function of gd */
  var `val`: js.UndefOr[js.Any] = js.undefined
}
object ModeBarButton {
  
  inline def apply(
    click: (/* gd */ PlotlyHTMLElement, /* ev */ MouseEvent) => Unit,
    icon: String | Icon,
    name: String,
    title: String
  ): ModeBarButton = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction2(click), icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModeBarButton]
  }
  
  extension [Self <: ModeBarButton](x: Self) {
    
    inline def setAttr(value: String): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
    
    inline def setClick(value: (/* gd */ PlotlyHTMLElement, /* ev */ MouseEvent) => Unit): Self = StObject.set(x, "click", js.Any.fromFunction2(value))
    
    inline def setGravity(value: String): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    inline def setIcon(value: String | Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    
    inline def setVal(value: js.Any): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    
    inline def setValUndefined: Self = StObject.set(x, "val", js.undefined)
  }
}
