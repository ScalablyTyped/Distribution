package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Align extends StObject {
  
  var align: js.UndefOr[left | right | auto] = js.undefined
  
  var bgcolor: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var bordercolor: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var font: js.UndefOr[Family] = js.undefined
  
  var namelength: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var split: js.UndefOr[Boolean] = js.undefined
}
object Align {
  
  inline def apply(): Align = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Align]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Align] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: left | right | auto): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setBgcolor(value: String | js.Array[String]): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    inline def setBgcolorVarargs(value: String*): Self = StObject.set(x, "bgcolor", js.Array(value*))
    
    inline def setBordercolor(value: String | js.Array[String]): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    inline def setBordercolorUndefined: Self = StObject.set(x, "bordercolor", js.undefined)
    
    inline def setBordercolorVarargs(value: String*): Self = StObject.set(x, "bordercolor", js.Array(value*))
    
    inline def setFont(value: Family): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setNamelength(value: Double | js.Array[Double]): Self = StObject.set(x, "namelength", value.asInstanceOf[js.Any])
    
    inline def setNamelengthUndefined: Self = StObject.set(x, "namelength", js.undefined)
    
    inline def setNamelengthVarargs(value: Double*): Self = StObject.set(x, "namelength", js.Array(value*))
    
    inline def setSplit(value: Boolean): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
    
    inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
  }
}
