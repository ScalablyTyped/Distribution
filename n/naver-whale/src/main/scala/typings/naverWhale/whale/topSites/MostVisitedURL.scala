package typings.naverWhale.whale.topSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MostVisitedURL extends js.Object {
  
  /**
    * 방문기록에서 판단한 여부입니다.
    * api로 추가한 경우에는 false입니다.
    */
  var from_history: Boolean = js.native
  
  /** 페이지 제목 */
  var title: String = js.native
  
  /** 많이 방문한 url. */
  var url: String = js.native
}
object MostVisitedURL {
  
  @scala.inline
  def apply(from_history: Boolean, title: String, url: String): MostVisitedURL = {
    val __obj = js.Dynamic.literal(from_history = from_history.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MostVisitedURL]
  }
  
  @scala.inline
  implicit class MostVisitedURLOps[Self <: MostVisitedURL] (val x: Self) extends AnyVal {
    
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
    def setFrom_history(value: Boolean): Self = this.set("from_history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
