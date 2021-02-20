package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.`bottom center`
import typings.plotlyJs.plotlyJsStrings.`bottom left`
import typings.plotlyJs.plotlyJsStrings.`bottom right`
import typings.plotlyJs.plotlyJsStrings.`middle center`
import typings.plotlyJs.plotlyJsStrings.`top center`
import typings.plotlyJs.plotlyJsStrings.`top left`
import typings.plotlyJs.plotlyJsStrings.`top right`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.DataTitle> */
@js.native
trait PartialDataTitleFont extends StObject {
  
  var font: js.UndefOr[PartialFont] = js.native
  
  var position: js.UndefOr[
    (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`)
  ] = js.native
  
  var standoff: js.UndefOr[Double] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object PartialDataTitleFont {
  
  @scala.inline
  def apply(): PartialDataTitleFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDataTitleFont]
  }
  
  @scala.inline
  implicit class PartialDataTitleFontMutableBuilder[Self <: PartialDataTitleFont] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: PartialFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setPosition(
      value: (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`)
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setStandoff(value: Double): Self = StObject.set(x, "standoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandoffUndefined: Self = StObject.set(x, "standoff", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
