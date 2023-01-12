package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.Dot
import typings.plotlyJs.plotlyJsStrings.Plussign
import typings.plotlyJs.plotlyJsStrings.Slash
import typings.plotlyJs.plotlyJsStrings.Verticalline
import typings.plotlyJs.plotlyJsStrings._empty
import typings.plotlyJs.plotlyJsStrings.`-_`
import typings.plotlyJs.plotlyJsStrings.overlay
import typings.plotlyJs.plotlyJsStrings.replace
import typings.plotlyJs.plotlyJsStrings.x
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pattern extends StObject {
  
  /**
    * When there is no colorscale sets the color of background pattern fill.
    * Defaults to a `marker.color` background when `fillmode` is *overlay*.
    * Otherwise, defaults to a transparent background.
    */
  var bgcolor: js.UndefOr[String] = js.undefined
  
  /**
    * When there is no colorscale sets the color of foreground pattern fill.
    * Defaults to a `marker.color` background when `fillmode` is *replace*.
    * Otherwise, defaults to dark grey or white
    * to increase contrast with the `bgcolor`.
    */
  var fgcolor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the opacity of the foreground pattern fill.
    * Defaults to a 0.5 when `fillmode` is *overlay*.
    * Otherwise, defaults to 1.
    */
  var fgopacity: js.UndefOr[String] = js.undefined
  
  /**
    * Determines whether `marker.color` should be used
    * as a default to `bgcolor` or a `fgcolor`.
    */
  var fillmode: js.UndefOr[replace | overlay] = js.undefined
  
  /**
    * Sets the shape of the pattern fill.
    * By default, no pattern is used for filling the area.
    */
  var shape: js.UndefOr[_empty | Slash | (/* \ */ String) | x | `-_` | Verticalline | Plussign | Dot] = js.undefined
  
  /**
    * Sets the size of unit squares of the pattern fill in pixels,
    * which corresponds to the interval of repetition of the pattern.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the solidity of the pattern fill.
    * Solidity is roughly the fraction of the area filled by the pattern.
    * Solidity of 0 shows only the background color without pattern
    * and solidty of 1 shows only the foreground color without pattern.
    */
  var solidity: js.UndefOr[Double] = js.undefined
}
object Pattern {
  
  inline def apply(): Pattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pattern]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pattern] (val x: Self) extends AnyVal {
    
    inline def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    inline def setFgcolor(value: String): Self = StObject.set(x, "fgcolor", value.asInstanceOf[js.Any])
    
    inline def setFgcolorUndefined: Self = StObject.set(x, "fgcolor", js.undefined)
    
    inline def setFgopacity(value: String): Self = StObject.set(x, "fgopacity", value.asInstanceOf[js.Any])
    
    inline def setFgopacityUndefined: Self = StObject.set(x, "fgopacity", js.undefined)
    
    inline def setFillmode(value: replace | overlay): Self = StObject.set(x, "fillmode", value.asInstanceOf[js.Any])
    
    inline def setFillmodeUndefined: Self = StObject.set(x, "fillmode", js.undefined)
    
    inline def setShape(
      value: _empty | Slash | (/* \ */ String) | typings.plotlyJs.plotlyJsStrings.x | `-_` | Verticalline | Plussign | Dot
    ): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSolidity(value: Double): Self = StObject.set(x, "solidity", value.asInstanceOf[js.Any])
    
    inline def setSolidityUndefined: Self = StObject.set(x, "solidity", js.undefined)
  }
}
