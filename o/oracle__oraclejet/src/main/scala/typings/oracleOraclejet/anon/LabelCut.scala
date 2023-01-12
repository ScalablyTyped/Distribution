package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelCut extends StObject {
  
  var labelCut: js.UndefOr[String] = js.undefined
  
  var labelPasteAfter: js.UndefOr[String] = js.undefined
  
  var labelPasteBefore: js.UndefOr[String] = js.undefined
}
object LabelCut {
  
  inline def apply(): LabelCut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelCut]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelCut] (val x: Self) extends AnyVal {
    
    inline def setLabelCut(value: String): Self = StObject.set(x, "labelCut", value.asInstanceOf[js.Any])
    
    inline def setLabelCutUndefined: Self = StObject.set(x, "labelCut", js.undefined)
    
    inline def setLabelPasteAfter(value: String): Self = StObject.set(x, "labelPasteAfter", value.asInstanceOf[js.Any])
    
    inline def setLabelPasteAfterUndefined: Self = StObject.set(x, "labelPasteAfter", js.undefined)
    
    inline def setLabelPasteBefore(value: String): Self = StObject.set(x, "labelPasteBefore", value.asInstanceOf[js.Any])
    
    inline def setLabelPasteBeforeUndefined: Self = StObject.set(x, "labelPasteBefore", js.undefined)
  }
}
