package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hide from docs
  * --------
  * Query parameters used when fetching team information
  */
trait TeamInstanceParameters extends StObject {
  
  /**
    * Flag allowing to select favorite teams only
    */
  var favoriteTeamsOnly: js.UndefOr[Boolean] = js.undefined
}
object TeamInstanceParameters {
  
  inline def apply(): TeamInstanceParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamInstanceParameters]
  }
  
  extension [Self <: TeamInstanceParameters](x: Self) {
    
    inline def setFavoriteTeamsOnly(value: Boolean): Self = StObject.set(x, "favoriteTeamsOnly", value.asInstanceOf[js.Any])
    
    inline def setFavoriteTeamsOnlyUndefined: Self = StObject.set(x, "favoriteTeamsOnly", js.undefined)
  }
}
