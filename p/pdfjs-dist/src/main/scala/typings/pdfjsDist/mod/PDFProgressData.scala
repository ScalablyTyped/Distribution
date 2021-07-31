package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFProgressData extends StObject {
  
  var loaded: Double
  
  var total: Double
}
object PDFProgressData {
  
  @scala.inline
  def apply(loaded: Double, total: Double): PDFProgressData = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFProgressData]
  }
  
  @scala.inline
  implicit class PDFProgressDataMutableBuilder[Self <: PDFProgressData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
