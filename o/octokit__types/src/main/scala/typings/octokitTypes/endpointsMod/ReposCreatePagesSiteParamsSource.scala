package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.Slash
import typings.octokitTypes.octokitTypesStrings.Slashdocs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposCreatePagesSiteParamsSource extends StObject {
  
  var branch: String
  
  var path: js.UndefOr[Slash | Slashdocs] = js.undefined
}
object ReposCreatePagesSiteParamsSource {
  
  @scala.inline
  def apply(branch: String): ReposCreatePagesSiteParamsSource = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreatePagesSiteParamsSource]
  }
  
  @scala.inline
  implicit class ReposCreatePagesSiteParamsSourceMutableBuilder[Self <: ReposCreatePagesSiteParamsSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: Slash | Slashdocs): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
