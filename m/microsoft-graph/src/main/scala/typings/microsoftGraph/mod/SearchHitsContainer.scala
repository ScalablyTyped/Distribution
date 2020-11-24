package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchHitsContainer extends js.Object {
  
  var hits: js.UndefOr[NullableOption[js.Array[SearchHit]]] = js.native
  
  var moreResultsAvailable: js.UndefOr[NullableOption[Boolean]] = js.native
  
  var total: js.UndefOr[NullableOption[Double]] = js.native
}
object SearchHitsContainer {
  
  @scala.inline
  def apply(): SearchHitsContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchHitsContainer]
  }
  
  @scala.inline
  implicit class SearchHitsContainerOps[Self <: SearchHitsContainer] (val x: Self) extends AnyVal {
    
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
    def setHitsVarargs(value: SearchHit*): Self = this.set("hits", js.Array(value :_*))
    
    @scala.inline
    def setHits(value: NullableOption[js.Array[SearchHit]]): Self = this.set("hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHits: Self = this.set("hits", js.undefined)
    
    @scala.inline
    def setHitsNull: Self = this.set("hits", null)
    
    @scala.inline
    def setMoreResultsAvailable(value: NullableOption[Boolean]): Self = this.set("moreResultsAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoreResultsAvailable: Self = this.set("moreResultsAvailable", js.undefined)
    
    @scala.inline
    def setMoreResultsAvailableNull: Self = this.set("moreResultsAvailable", null)
    
    @scala.inline
    def setTotal(value: NullableOption[Double]): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
    
    @scala.inline
    def setTotalNull: Self = this.set("total", null)
  }
}
