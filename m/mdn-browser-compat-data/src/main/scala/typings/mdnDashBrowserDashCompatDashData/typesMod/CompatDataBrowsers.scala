package typings.mdnDashBrowserDashCompatDashData.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompatDataBrowsers extends js.Object {
  /**
    * Contains data for each known browser.
    */
  var browsers: Browsers
}

object CompatDataBrowsers {
  @scala.inline
  def apply(browsers: Browsers): CompatDataBrowsers = {
    val __obj = js.Dynamic.literal(browsers = browsers)
  
    __obj.asInstanceOf[CompatDataBrowsers]
  }
}

