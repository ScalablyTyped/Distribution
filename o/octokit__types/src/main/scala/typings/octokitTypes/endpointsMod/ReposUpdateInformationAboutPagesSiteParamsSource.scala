package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.Slash
import typings.octokitTypes.octokitTypesStrings.Slashdocs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposUpdateInformationAboutPagesSiteParamsSource extends js.Object {
  
  var branch: String = js.native
  
  var path: Slash | Slashdocs = js.native
}
object ReposUpdateInformationAboutPagesSiteParamsSource {
  
  @scala.inline
  def apply(branch: String, path: Slash | Slashdocs): ReposUpdateInformationAboutPagesSiteParamsSource = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateInformationAboutPagesSiteParamsSource]
  }
  
  @scala.inline
  implicit class ReposUpdateInformationAboutPagesSiteParamsSourceOps[Self <: ReposUpdateInformationAboutPagesSiteParamsSource] (val x: Self) extends AnyVal {
    
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
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: Slash | Slashdocs): Self = this.set("path", value.asInstanceOf[js.Any])
  }
}
