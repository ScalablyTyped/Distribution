package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeSearchEngine extends EdgeSearchEngineBase {
  /**
    * Allows IT admins to set a predefined default search engine for MDM-Controlled devices. Possible values are: default,
    * bing.
    */
  var edgeSearchEngineType: js.UndefOr[EdgeSearchEngineType] = js.undefined
}

object EdgeSearchEngine {
  @scala.inline
  def apply(edgeSearchEngineType: EdgeSearchEngineType = null): EdgeSearchEngine = {
    val __obj = js.Dynamic.literal()
    if (edgeSearchEngineType != null) __obj.updateDynamic("edgeSearchEngineType")(edgeSearchEngineType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeSearchEngine]
  }
}

