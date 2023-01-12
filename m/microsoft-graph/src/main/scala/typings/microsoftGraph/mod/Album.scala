package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Album extends StObject {
  
  // Unique identifier of the [driveItem][] that is the cover of the album.
  var coverImageItemId: js.UndefOr[NullableOption[String]] = js.undefined
}
object Album {
  
  inline def apply(): Album = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Album]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Album] (val x: Self) extends AnyVal {
    
    inline def setCoverImageItemId(value: NullableOption[String]): Self = StObject.set(x, "coverImageItemId", value.asInstanceOf[js.Any])
    
    inline def setCoverImageItemIdNull: Self = StObject.set(x, "coverImageItemId", null)
    
    inline def setCoverImageItemIdUndefined: Self = StObject.set(x, "coverImageItemId", js.undefined)
  }
}
