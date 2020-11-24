package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbuseReport extends js.Object {
  
  var abuseTypes: js.UndefOr[js.Array[AbuseType]] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var relatedEntities: js.UndefOr[js.Array[RelatedEntity]] = js.native
  
  var subject: js.UndefOr[Entity] = js.native
}
object AbuseReport {
  
  @scala.inline
  def apply(): AbuseReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbuseReport]
  }
  
  @scala.inline
  implicit class AbuseReportOps[Self <: AbuseReport] (val x: Self) extends AnyVal {
    
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
    def setAbuseTypesVarargs(value: AbuseType*): Self = this.set("abuseTypes", js.Array(value :_*))
    
    @scala.inline
    def setAbuseTypes(value: js.Array[AbuseType]): Self = this.set("abuseTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbuseTypes: Self = this.set("abuseTypes", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setRelatedEntitiesVarargs(value: RelatedEntity*): Self = this.set("relatedEntities", js.Array(value :_*))
    
    @scala.inline
    def setRelatedEntities(value: js.Array[RelatedEntity]): Self = this.set("relatedEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedEntities: Self = this.set("relatedEntities", js.undefined)
    
    @scala.inline
    def setSubject(value: Entity): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
}
