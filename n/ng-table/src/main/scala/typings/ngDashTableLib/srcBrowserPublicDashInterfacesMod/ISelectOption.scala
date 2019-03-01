package typings
package ngDashTableLib.srcBrowserPublicDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectOption extends js.Object {
  var id: java.lang.String | scala.Double
  var title: java.lang.String
}

object ISelectOption {
  @scala.inline
  def apply(id: java.lang.String | scala.Double, title: java.lang.String): ISelectOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ISelectOption]
  }
}

