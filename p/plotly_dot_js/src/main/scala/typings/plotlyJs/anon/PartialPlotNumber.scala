package typings.plotlyJs.anon

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.PlotNumber> */
@js.native
trait PartialPlotNumber extends StObject {
  
  var font: js.UndefOr[Partial[typings.plotlyJs.mod.Font]] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var suffix: js.UndefOr[String] = js.native
  
  var valueformat: js.UndefOr[String] = js.native
}
object PartialPlotNumber {
  
  @scala.inline
  def apply(): PartialPlotNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPlotNumber]
  }
  
  @scala.inline
  implicit class PartialPlotNumberMutableBuilder[Self <: PartialPlotNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: Partial[typings.plotlyJs.mod.Font]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    @scala.inline
    def setValueformat(value: String): Self = StObject.set(x, "valueformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueformatUndefined: Self = StObject.set(x, "valueformat", js.undefined)
  }
}
