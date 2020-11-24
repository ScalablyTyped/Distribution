package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchSize extends js.Object {
  
  var fetchSize: js.UndefOr[Double] = js.native
  
  var maxCount: js.UndefOr[Double] = js.native
  
  var scroller: js.UndefOr[typings.std.Element] = js.native
}
object FetchSize {
  
  @scala.inline
  def apply(): FetchSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchSize]
  }
  
  @scala.inline
  implicit class FetchSizeOps[Self <: FetchSize] (val x: Self) extends AnyVal {
    
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
    def setFetchSize(value: Double): Self = this.set("fetchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchSize: Self = this.set("fetchSize", js.undefined)
    
    @scala.inline
    def setMaxCount(value: Double): Self = this.set("maxCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCount: Self = this.set("maxCount", js.undefined)
    
    @scala.inline
    def setScroller(value: typings.std.Element): Self = this.set("scroller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroller: Self = this.set("scroller", js.undefined)
  }
}
