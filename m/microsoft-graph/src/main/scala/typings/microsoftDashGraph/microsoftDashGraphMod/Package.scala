package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Package extends js.Object {
  /**
    * A string indicating the type of package. While oneNote is the only currently defined value, you should expect other
    * package types to be returned and handle them accordingly.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Package {
  @scala.inline
  def apply(`type`: String = null): Package = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Package]
  }
}

