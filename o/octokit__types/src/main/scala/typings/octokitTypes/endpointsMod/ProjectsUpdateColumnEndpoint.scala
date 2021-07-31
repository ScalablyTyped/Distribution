package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.inertia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsUpdateColumnEndpoint
  extends StObject
     with RequiredPreview[inertia] {
  
  var column_id: Double
  
  /**
    * The new name of the column.
    */
  var name: String
}
object ProjectsUpdateColumnEndpoint {
  
  @scala.inline
  def apply(column_id: Double, mediaType: `0`[inertia], name: String): ProjectsUpdateColumnEndpoint = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsUpdateColumnEndpoint]
  }
  
  @scala.inline
  implicit class ProjectsUpdateColumnEndpointMutableBuilder[Self <: ProjectsUpdateColumnEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn_id(value: Double): Self = StObject.set(x, "column_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
