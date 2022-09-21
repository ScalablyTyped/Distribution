package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDriveActivityResponse extends StObject {
  
  /** List of activity requested. */
  var activities: js.UndefOr[js.Array[DriveActivity]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object QueryDriveActivityResponse {
  
  inline def apply(): QueryDriveActivityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDriveActivityResponse]
  }
  
  extension [Self <: QueryDriveActivityResponse](x: Self) {
    
    inline def setActivities(value: js.Array[DriveActivity]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    inline def setActivitiesVarargs(value: DriveActivity*): Self = StObject.set(x, "activities", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
