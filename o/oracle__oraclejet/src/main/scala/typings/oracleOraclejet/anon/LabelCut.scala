package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelCut extends StObject {
  
  var labelCut: js.UndefOr[String] = js.native
  
  var labelPasteAfter: js.UndefOr[String] = js.native
  
  var labelPasteBefore: js.UndefOr[String] = js.native
}
object LabelCut {
  
  @scala.inline
  def apply(): LabelCut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelCut]
  }
  
  @scala.inline
  implicit class LabelCutMutableBuilder[Self <: LabelCut] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelCut(value: String): Self = StObject.set(x, "labelCut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelCutUndefined: Self = StObject.set(x, "labelCut", js.undefined)
    
    @scala.inline
    def setLabelPasteAfter(value: String): Self = StObject.set(x, "labelPasteAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPasteAfterUndefined: Self = StObject.set(x, "labelPasteAfter", js.undefined)
    
    @scala.inline
    def setLabelPasteBefore(value: String): Self = StObject.set(x, "labelPasteBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPasteBeforeUndefined: Self = StObject.set(x, "labelPasteBefore", js.undefined)
  }
}
