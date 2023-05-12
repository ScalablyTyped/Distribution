package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialFont
import typings.plotlyJs.anon.PartialPadding
import typings.plotlyJs.anon.PartialUpdateMenuButton
import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.buttons
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.down
import typings.plotlyJs.plotlyJsStrings.dropdown
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.top
import typings.plotlyJs.plotlyJsStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMenu extends StObject {
  
  /**
    * Determines which button (by index starting from 0) is considered active.
    */
  var active: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the background color of the update menu buttons.
    */
  var bgcolor: js.UndefOr[Color] = js.undefined
  
  /**
    * Sets the color of the border enclosing the update menu.
    */
  var bordercolor: js.UndefOr[Color] = js.undefined
  
  /**
    * Sets the width (in px) of the border enclosing the update menu.
    */
  var borderwidth: Double
  
  /**
    * array of object where each object has one or more of the keys listed below.
    */
  var buttons: js.Array[PartialUpdateMenuButton]
  
  /**
    * Determines the direction in which the buttons are laid out, whether
    * in a dropdown menu or a row/column of buttons. For `left` and `up`,
    * the buttons will still appear in left-to-right or top-to-bottom order
    * respectively.
    */
  var direction: left | up | right | down
  
  /**
    * Sets the font of the update menu button text.
    */
  var font: PartialFont
  
  /**
    * When used in a template, named items are created in the output
    * figure in addition to any items the figure already has in this array.
    * You can modify these items in the output figure by making your own item
    * with `templateitemname` matching this `name` alongside your modifications
    * (including `visible: false` or `enabled: false` to hide it). Has no
    * effect outside of a template.
    */
  var name: String
  
  /**
    * Sets the padding around the buttons or dropdown menu.
    */
  var pad: PartialPadding
  
  /**
    * Highlights active dropdown item or active button if true.
    */
  var showactive: Boolean
  
  /**
    * Used to refer to a named item in this array in the template. Named
    * items from the template will be created even without a matching item
    * in the input figure, but you can modify one by making an item with
    * `templateitemname` matching its `name`, alongside your modifications
    * (including `visible: false` or `enabled: false` to hide it). If there
    * is no template or no matching item, this item will be hidden unless
    * you explicitly show it with `visible: true`.
    */
  var templateitemname: String
  
  /**
    * Determines whether the buttons are accessible via a dropdown menu or
    * whether the buttons are stacked horizontally or vertically
    */
  var `type`: dropdown | buttons
  
  /**
    * Determines whether or not the update menu is visible.
    */
  var visible: Boolean
  
  /**
    * Sets the x position (in normalized coordinates) of the update menu.
    */
  var x: Double
  
  /**
    * Sets the update menu's horizontal position anchor. This anchor binds
    * the `x` position to the "left", "center" or "right" of the range selector.
    */
  var xanchor: auto | left | center | right
  
  /**
    * Sets the y position (in normalized coordinates) of the update menu.
    */
  var y: Double
  
  /**
    * Sets the update menu's vertical position anchor This anchor binds
    * the `y` position to the "top", "middle" or "bottom" of the range selector.
    */
  var yanchor: auto | top | middle | bottom
}
object UpdateMenu {
  
  inline def apply(
    borderwidth: Double,
    buttons: js.Array[PartialUpdateMenuButton],
    direction: left | up | right | down,
    font: PartialFont,
    name: String,
    pad: PartialPadding,
    showactive: Boolean,
    templateitemname: String,
    `type`: dropdown | buttons,
    visible: Boolean,
    x: Double,
    xanchor: auto | left | center | right,
    y: Double,
    yanchor: auto | top | middle | bottom
  ): UpdateMenu = {
    val __obj = js.Dynamic.literal(borderwidth = borderwidth.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], showactive = showactive.asInstanceOf[js.Any], templateitemname = templateitemname.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMenu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMenu] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setBgcolor(value: Color): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    inline def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bgcolor", js.Array(value*))
    
    inline def setBordercolor(value: Color): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    inline def setBordercolorUndefined: Self = StObject.set(x, "bordercolor", js.undefined)
    
    inline def setBordercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bordercolor", js.Array(value*))
    
    inline def setBorderwidth(value: Double): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    inline def setButtons(value: js.Array[PartialUpdateMenuButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsVarargs(value: PartialUpdateMenuButton*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setDirection(value: left | up | right | down): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setFont(value: PartialFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPad(value: PartialPadding): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setShowactive(value: Boolean): Self = StObject.set(x, "showactive", value.asInstanceOf[js.Any])
    
    inline def setTemplateitemname(value: String): Self = StObject.set(x, "templateitemname", value.asInstanceOf[js.Any])
    
    inline def setType(value: dropdown | buttons): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXanchor(value: auto | left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYanchor(value: auto | top | middle | bottom): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
  }
}
