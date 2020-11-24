package typings.naverWhale.whale.history

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemovedResult extends js.Object {
  
  /** True if all history was removed. If true, then urls will be empty. */
  var allHistory: Boolean = js.native
  
  /** Optional. */
  var urls: js.UndefOr[js.Array[String]] = js.native
}
object RemovedResult {
  
  @scala.inline
  def apply(allHistory: Boolean): RemovedResult = {
    val __obj = js.Dynamic.literal(allHistory = allHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovedResult]
  }
  
  @scala.inline
  implicit class RemovedResultOps[Self <: RemovedResult] (val x: Self) extends AnyVal {
    
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
    def setAllHistory(value: Boolean): Self = this.set("allHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsVarargs(value: String*): Self = this.set("urls", js.Array(value :_*))
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = this.set("urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
  }
}
