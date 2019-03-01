package typings
package ngDashTableLib.srcBrowserPublicDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilterTemplateDef extends js.Object {
  /**
    * A url to a html template or an alias to a url registered using the {@link ngTableFilterConfigProvider}
    */
  var id: java.lang.String
  /**
    * The text that should be rendered as a prompt to assist the user when entering a filter value
    */
  var placeholder: java.lang.String
}

object IFilterTemplateDef {
  @scala.inline
  def apply(id: java.lang.String, placeholder: java.lang.String): IFilterTemplateDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("placeholder")(placeholder)
    __obj.asInstanceOf[IFilterTemplateDef]
  }
}

