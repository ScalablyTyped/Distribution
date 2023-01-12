package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Indicates information about the tab instance for filtering purposes.
  */
trait TabInstanceParameters extends StObject {
  
  /**
    * Flag allowing to select favorite channels only
    */
  var favoriteChannelsOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Flag allowing to select favorite teams only
    */
  var favoriteTeamsOnly: js.UndefOr[Boolean] = js.undefined
}
object TabInstanceParameters {
  
  inline def apply(): TabInstanceParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabInstanceParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabInstanceParameters] (val x: Self) extends AnyVal {
    
    inline def setFavoriteChannelsOnly(value: Boolean): Self = StObject.set(x, "favoriteChannelsOnly", value.asInstanceOf[js.Any])
    
    inline def setFavoriteChannelsOnlyUndefined: Self = StObject.set(x, "favoriteChannelsOnly", js.undefined)
    
    inline def setFavoriteTeamsOnly(value: Boolean): Self = StObject.set(x, "favoriteTeamsOnly", value.asInstanceOf[js.Any])
    
    inline def setFavoriteTeamsOnlyUndefined: Self = StObject.set(x, "favoriteTeamsOnly", js.undefined)
  }
}
