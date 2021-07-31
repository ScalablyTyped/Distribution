package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the InkAnalysisWord object, for use in "inkAnalysisWord.set({ ... })". */
trait InkAnalysisWordUpdateData extends StObject {
  
  /**
    *
    * Reference to the parent InkAnalysisLine.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var line: js.UndefOr[InkAnalysisLineUpdateData] = js.undefined
}
object InkAnalysisWordUpdateData {
  
  @scala.inline
  def apply(): InkAnalysisWordUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisWordUpdateData]
  }
  
  @scala.inline
  implicit class InkAnalysisWordUpdateDataMutableBuilder[Self <: InkAnalysisWordUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: InkAnalysisLineUpdateData): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
