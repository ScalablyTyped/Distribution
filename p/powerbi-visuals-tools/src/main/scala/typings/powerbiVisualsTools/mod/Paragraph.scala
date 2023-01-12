package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paragraph extends StObject {
  
  var horizontalTextAlignment: js.UndefOr[String] = js.undefined
  
  var textRuns: js.Array[TextRun]
}
object Paragraph {
  
  inline def apply(textRuns: js.Array[TextRun]): Paragraph = {
    val __obj = js.Dynamic.literal(textRuns = textRuns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paragraph]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Paragraph] (val x: Self) extends AnyVal {
    
    inline def setHorizontalTextAlignment(value: String): Self = StObject.set(x, "horizontalTextAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalTextAlignmentUndefined: Self = StObject.set(x, "horizontalTextAlignment", js.undefined)
    
    inline def setTextRuns(value: js.Array[TextRun]): Self = StObject.set(x, "textRuns", value.asInstanceOf[js.Any])
    
    inline def setTextRunsVarargs(value: TextRun*): Self = StObject.set(x, "textRuns", js.Array(value*))
  }
}
