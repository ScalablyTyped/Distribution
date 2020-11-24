package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LighthouseCategoryV5 extends js.Object {
  
  /** An array of references to all the audit members of this category. */
  var auditRefs: js.UndefOr[js.Array[AuditRefs]] = js.native
  
  /** A more detailed description of the category and its importance. */
  var description: js.UndefOr[String] = js.native
  
  /** The string identifier of the category. */
  var id: js.UndefOr[String] = js.native
  
  /** A description for the manual audits in the category. */
  var manualDescription: js.UndefOr[String] = js.native
  
  /** The overall score of the category, the weighted average of all its audits. (The category's score, can be null.) */
  var score: js.UndefOr[js.Any] = js.native
  
  /** The human-friendly name of the category. */
  var title: js.UndefOr[String] = js.native
}
object LighthouseCategoryV5 {
  
  @scala.inline
  def apply(): LighthouseCategoryV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LighthouseCategoryV5]
  }
  
  @scala.inline
  implicit class LighthouseCategoryV5Ops[Self <: LighthouseCategoryV5] (val x: Self) extends AnyVal {
    
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
    def setAuditRefsVarargs(value: AuditRefs*): Self = this.set("auditRefs", js.Array(value :_*))
    
    @scala.inline
    def setAuditRefs(value: js.Array[AuditRefs]): Self = this.set("auditRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuditRefs: Self = this.set("auditRefs", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setManualDescription(value: String): Self = this.set("manualDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualDescription: Self = this.set("manualDescription", js.undefined)
    
    @scala.inline
    def setScore(value: js.Any): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
