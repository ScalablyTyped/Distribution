package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.inertia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsMoveColumnEndpoint
  extends StObject
     with RequiredPreview[inertia] {
  
  var column_id: Double
  
  /**
    * Can be one of `first`, `last`, or `after:<column_id>`, where `<column_id>` is the `id` value of a column in the same project.
    */
  var position: String
}
object ProjectsMoveColumnEndpoint {
  
  inline def apply(column_id: Double, mediaType: `0`[inertia], position: String): ProjectsMoveColumnEndpoint = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsMoveColumnEndpoint]
  }
  
  extension [Self <: ProjectsMoveColumnEndpoint](x: Self) {
    
    inline def setColumn_id(value: Double): Self = StObject.set(x, "column_id", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
