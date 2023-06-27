package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRepositoryAdvisory extends StObject {
  
  var createPrivateVulnerabilityReport: `1616`
  
  var createRepositoryAdvisory: `1617`
  
  var getRepositoryAdvisory: `1618`
  
  var listRepositoryAdvisories: `1619`
  
  var updateRepositoryAdvisory: `1620`
}
object CreateRepositoryAdvisory {
  
  inline def apply(
    createPrivateVulnerabilityReport: `1616`,
    createRepositoryAdvisory: `1617`,
    getRepositoryAdvisory: `1618`,
    listRepositoryAdvisories: `1619`,
    updateRepositoryAdvisory: `1620`
  ): CreateRepositoryAdvisory = {
    val __obj = js.Dynamic.literal(createPrivateVulnerabilityReport = createPrivateVulnerabilityReport.asInstanceOf[js.Any], createRepositoryAdvisory = createRepositoryAdvisory.asInstanceOf[js.Any], getRepositoryAdvisory = getRepositoryAdvisory.asInstanceOf[js.Any], listRepositoryAdvisories = listRepositoryAdvisories.asInstanceOf[js.Any], updateRepositoryAdvisory = updateRepositoryAdvisory.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRepositoryAdvisory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRepositoryAdvisory] (val x: Self) extends AnyVal {
    
    inline def setCreatePrivateVulnerabilityReport(value: `1616`): Self = StObject.set(x, "createPrivateVulnerabilityReport", value.asInstanceOf[js.Any])
    
    inline def setCreateRepositoryAdvisory(value: `1617`): Self = StObject.set(x, "createRepositoryAdvisory", value.asInstanceOf[js.Any])
    
    inline def setGetRepositoryAdvisory(value: `1618`): Self = StObject.set(x, "getRepositoryAdvisory", value.asInstanceOf[js.Any])
    
    inline def setListRepositoryAdvisories(value: `1619`): Self = StObject.set(x, "listRepositoryAdvisories", value.asInstanceOf[js.Any])
    
    inline def setUpdateRepositoryAdvisory(value: `1620`): Self = StObject.set(x, "updateRepositoryAdvisory", value.asInstanceOf[js.Any])
  }
}
