package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Codeofconduct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposGetCommunityProfileMetricsResponseData extends StObject {
  
  var description: String
  
  var documentation: Boolean
  
  var files: Codeofconduct
  
  var health_percentage: Double
  
  var updated_at: String
}
object ReposGetCommunityProfileMetricsResponseData {
  
  @scala.inline
  def apply(
    description: String,
    documentation: Boolean,
    files: Codeofconduct,
    health_percentage: Double,
    updated_at: String
  ): ReposGetCommunityProfileMetricsResponseData = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], health_percentage = health_percentage.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetCommunityProfileMetricsResponseData]
  }
  
  @scala.inline
  implicit class ReposGetCommunityProfileMetricsResponseDataMutableBuilder[Self <: ReposGetCommunityProfileMetricsResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentation(value: Boolean): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiles(value: Codeofconduct): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealth_percentage(value: Double): Self = StObject.set(x, "health_percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
  }
}
