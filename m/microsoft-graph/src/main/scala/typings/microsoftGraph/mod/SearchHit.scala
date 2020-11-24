package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchHit extends js.Object {
  
  var contentSource: js.UndefOr[NullableOption[String]] = js.native
  
  var hitId: js.UndefOr[NullableOption[String]] = js.native
  
  var rank: js.UndefOr[NullableOption[Double]] = js.native
  
  var resource: js.UndefOr[NullableOption[Entity]] = js.native
  
  var summary: js.UndefOr[NullableOption[String]] = js.native
}
object SearchHit {
  
  @scala.inline
  def apply(): SearchHit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchHit]
  }
  
  @scala.inline
  implicit class SearchHitOps[Self <: SearchHit] (val x: Self) extends AnyVal {
    
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
    def setContentSource(value: NullableOption[String]): Self = this.set("contentSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentSource: Self = this.set("contentSource", js.undefined)
    
    @scala.inline
    def setContentSourceNull: Self = this.set("contentSource", null)
    
    @scala.inline
    def setHitId(value: NullableOption[String]): Self = this.set("hitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitId: Self = this.set("hitId", js.undefined)
    
    @scala.inline
    def setHitIdNull: Self = this.set("hitId", null)
    
    @scala.inline
    def setRank(value: NullableOption[Double]): Self = this.set("rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRank: Self = this.set("rank", js.undefined)
    
    @scala.inline
    def setRankNull: Self = this.set("rank", null)
    
    @scala.inline
    def setResource(value: NullableOption[Entity]): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setResourceNull: Self = this.set("resource", null)
    
    @scala.inline
    def setSummary(value: NullableOption[String]): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    
    @scala.inline
    def setSummaryNull: Self = this.set("summary", null)
  }
}
