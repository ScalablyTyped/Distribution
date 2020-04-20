package typings.minappEnv.App

import typings.minappEnv.IAnyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPageNotFoundOption extends js.Object {
  /** 是否本次启动的首个页面（例如从分享等入口进来，首个页面是开发者配置的分享页面） */
  var isEntryPage: Boolean
  /** 不存在页面的路径 */
  var path: String
  /** 打开不存在页面的 query */
  var query: IAnyObject
}

object IPageNotFoundOption {
  @scala.inline
  def apply(isEntryPage: Boolean, path: String, query: IAnyObject): IPageNotFoundOption = {
    val __obj = js.Dynamic.literal(isEntryPage = isEntryPage.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPageNotFoundOption]
  }
}

