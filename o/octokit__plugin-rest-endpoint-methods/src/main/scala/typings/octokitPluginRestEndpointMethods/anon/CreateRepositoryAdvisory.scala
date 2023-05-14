package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRepositoryAdvisory extends StObject {
  
  var createPrivateVulnerabilityReport: `1612`
  
  var createRepositoryAdvisory: `1613`
  
  var getRepositoryAdvisory: `1614`
  
  var listRepositoryAdvisories: `1615`
  
  var updateRepositoryAdvisory: `1616`
}
object CreateRepositoryAdvisory {
  
  inline def apply(
    createPrivateVulnerabilityReport: `1612`,
    createRepositoryAdvisory: `1613`,
    getRepositoryAdvisory: `1614`,
    listRepositoryAdvisories: `1615`,
    updateRepositoryAdvisory: `1616`
  ): CreateRepositoryAdvisory = {
    val __obj = js.Dynamic.literal(createPrivateVulnerabilityReport = createPrivateVulnerabilityReport.asInstanceOf[js.Any], createRepositoryAdvisory = createRepositoryAdvisory.asInstanceOf[js.Any], getRepositoryAdvisory = getRepositoryAdvisory.asInstanceOf[js.Any], listRepositoryAdvisories = listRepositoryAdvisories.asInstanceOf[js.Any], updateRepositoryAdvisory = updateRepositoryAdvisory.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRepositoryAdvisory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRepositoryAdvisory] (val x: Self) extends AnyVal {
    
    inline def setCreatePrivateVulnerabilityReport(value: `1612`): Self = StObject.set(x, "createPrivateVulnerabilityReport", value.asInstanceOf[js.Any])
    
    inline def setCreateRepositoryAdvisory(value: `1613`): Self = StObject.set(x, "createRepositoryAdvisory", value.asInstanceOf[js.Any])
    
    inline def setGetRepositoryAdvisory(value: `1614`): Self = StObject.set(x, "getRepositoryAdvisory", value.asInstanceOf[js.Any])
    
    inline def setListRepositoryAdvisories(value: `1615`): Self = StObject.set(x, "listRepositoryAdvisories", value.asInstanceOf[js.Any])
    
    inline def setUpdateRepositoryAdvisory(value: `1616`): Self = StObject.set(x, "updateRepositoryAdvisory", value.asInstanceOf[js.Any])
  }
}
