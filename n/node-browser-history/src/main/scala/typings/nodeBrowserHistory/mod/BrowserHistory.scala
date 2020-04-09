package typings.nodeBrowserHistory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserHistory extends js.Object {
  var browser: String
  var title: String
  var url: String
  var utc_time: Double
}

object BrowserHistory {
  @scala.inline
  def apply(browser: String, title: String, url: String, utc_time: Double): BrowserHistory = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], utc_time = utc_time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BrowserHistory]
  }
}

