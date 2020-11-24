package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EdgeSearchEngineCustom extends EdgeSearchEngineBase {
  
  /**
    * Points to a https link containing the OpenSearch xml file that contains, at minimum, the short name and the URL to the
    * search Engine.
    */
  var edgeSearchEngineOpenSearchXmlUrl: js.UndefOr[String] = js.native
}
object EdgeSearchEngineCustom {
  
  @scala.inline
  def apply(): EdgeSearchEngineCustom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeSearchEngineCustom]
  }
  
  @scala.inline
  implicit class EdgeSearchEngineCustomOps[Self <: EdgeSearchEngineCustom] (val x: Self) extends AnyVal {
    
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
    def setEdgeSearchEngineOpenSearchXmlUrl(value: String): Self = this.set("edgeSearchEngineOpenSearchXmlUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeSearchEngineOpenSearchXmlUrl: Self = this.set("edgeSearchEngineOpenSearchXmlUrl", js.undefined)
  }
}
