package typings.ngDashTable.srcBrowserPublicDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilterTemplateDef extends js.Object {
  /**
    * A url to a html template or an alias to a url registered using the {@link ngTableFilterConfigProvider}
    */
  var id: String
  /**
    * The text that should be rendered as a prompt to assist the user when entering a filter value
    */
  var placeholder: String
}

object IFilterTemplateDef {
  @scala.inline
  def apply(id: String, placeholder: String): IFilterTemplateDef = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFilterTemplateDef]
  }
}

