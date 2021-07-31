package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.inertia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsGetColumnEndpoint
  extends StObject
     with RequiredPreview[inertia] {
  
  var column_id: Double
}
object ProjectsGetColumnEndpoint {
  
  @scala.inline
  def apply(column_id: Double, mediaType: `0`[inertia]): ProjectsGetColumnEndpoint = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsGetColumnEndpoint]
  }
  
  @scala.inline
  implicit class ProjectsGetColumnEndpointMutableBuilder[Self <: ProjectsGetColumnEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn_id(value: Double): Self = StObject.set(x, "column_id", value.asInstanceOf[js.Any])
  }
}
