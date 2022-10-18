package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Favorite extends StObject {
  
  /**
    * Current favorite state
    */
  var favorite: js.UndefOr[Boolean] = js.undefined
}
object Favorite {
  
  inline def apply(): Favorite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Favorite]
  }
  
  extension [Self <: Favorite](x: Self) {
    
    inline def setFavorite(value: Boolean): Self = StObject.set(x, "favorite", value.asInstanceOf[js.Any])
    
    inline def setFavoriteUndefined: Self = StObject.set(x, "favorite", js.undefined)
  }
}
