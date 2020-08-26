package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdgeSearchEngine extends EdgeSearchEngineBase {
  /**
    * Allows IT admins to set a predefined default search engine for MDM-Controlled devices. Possible values are: default,
    * bing.
    */
  var edgeSearchEngineType: js.UndefOr[EdgeSearchEngineType] = js.native
}

object EdgeSearchEngine {
  @scala.inline
  def apply(): EdgeSearchEngine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeSearchEngine]
  }
  @scala.inline
  implicit class EdgeSearchEngineOps[Self <: EdgeSearchEngine] (val x: Self) extends AnyVal {
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
    def setEdgeSearchEngineType(value: EdgeSearchEngineType): Self = this.set("edgeSearchEngineType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeSearchEngineType: Self = this.set("edgeSearchEngineType", js.undefined)
  }
  
}

