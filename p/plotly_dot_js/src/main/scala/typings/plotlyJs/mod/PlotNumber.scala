package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialFont
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotNumber extends StObject {
  
  var font: PartialFont
  
  var prefix: String
  
  var suffix: String
  
  var valueformat: String
}
object PlotNumber {
  
  @scala.inline
  def apply(font: PartialFont, prefix: String, suffix: String, valueformat: String): PlotNumber = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], valueformat = valueformat.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotNumber]
  }
  
  @scala.inline
  implicit class PlotNumberMutableBuilder[Self <: PlotNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: PartialFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueformat(value: String): Self = StObject.set(x, "valueformat", value.asInstanceOf[js.Any])
  }
}
