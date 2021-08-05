package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.inertia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsCreateColumnEndpoint
  extends StObject
     with RequiredPreview[inertia] {
  
  /**
    * The name of the column.
    */
  var name: String
  
  var project_id: Double
}
object ProjectsCreateColumnEndpoint {
  
  inline def apply(mediaType: `0`[inertia], name: String, project_id: Double): ProjectsCreateColumnEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsCreateColumnEndpoint]
  }
  
  extension [Self <: ProjectsCreateColumnEndpoint](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProject_id(value: Double): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
  }
}
