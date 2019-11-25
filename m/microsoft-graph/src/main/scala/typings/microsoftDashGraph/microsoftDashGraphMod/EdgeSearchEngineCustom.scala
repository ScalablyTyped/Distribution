package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeSearchEngineCustom extends EdgeSearchEngineBase {
  /**
    * Points to a https link containing the OpenSearch xml file that contains, at minimum, the short name and the URL to the
    * search Engine.
    */
  var edgeSearchEngineOpenSearchXmlUrl: js.UndefOr[String] = js.undefined
}

object EdgeSearchEngineCustom {
  @scala.inline
  def apply(edgeSearchEngineOpenSearchXmlUrl: String = null): EdgeSearchEngineCustom = {
    val __obj = js.Dynamic.literal()
    if (edgeSearchEngineOpenSearchXmlUrl != null) __obj.updateDynamic("edgeSearchEngineOpenSearchXmlUrl")(edgeSearchEngineOpenSearchXmlUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeSearchEngineCustom]
  }
}

