package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.Slash
import typings.octokitTypes.octokitTypesStrings.Slashdocs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposUpdateInformationAboutPagesSiteParamsSource extends StObject {
  
  var branch: String
  
  var path: Slash | Slashdocs
}
object ReposUpdateInformationAboutPagesSiteParamsSource {
  
  @scala.inline
  def apply(branch: String, path: Slash | Slashdocs): ReposUpdateInformationAboutPagesSiteParamsSource = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateInformationAboutPagesSiteParamsSource]
  }
  
  @scala.inline
  implicit class ReposUpdateInformationAboutPagesSiteParamsSourceMutableBuilder[Self <: ReposUpdateInformationAboutPagesSiteParamsSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: Slash | Slashdocs): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
