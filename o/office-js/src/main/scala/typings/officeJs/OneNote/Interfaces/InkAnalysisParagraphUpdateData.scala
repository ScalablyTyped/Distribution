package typings.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the InkAnalysisParagraph object, for use in "inkAnalysisParagraph.set({ ... })". */
@js.native
trait InkAnalysisParagraphUpdateData extends js.Object {
  
  /**
    *
    * Reference to the parent InkAnalysisPage.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkAnalysis: js.UndefOr[InkAnalysisUpdateData] = js.native
}
object InkAnalysisParagraphUpdateData {
  
  @scala.inline
  def apply(): InkAnalysisParagraphUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisParagraphUpdateData]
  }
  
  @scala.inline
  implicit class InkAnalysisParagraphUpdateDataOps[Self <: InkAnalysisParagraphUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInkAnalysis(value: InkAnalysisUpdateData): Self = this.set("inkAnalysis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInkAnalysis: Self = this.set("inkAnalysis", js.undefined)
  }
}
