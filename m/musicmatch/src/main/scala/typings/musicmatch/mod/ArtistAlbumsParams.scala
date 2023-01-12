package typings.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtistAlbumsParams
  extends StObject
     with ArtistParams
     with Pageable {
  
  var g_album_name: js.UndefOr[TBoolean] = js.undefined
  
  var s_release_date: js.UndefOr[TSort] = js.undefined
}
object ArtistAlbumsParams {
  
  inline def apply(): ArtistAlbumsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtistAlbumsParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArtistAlbumsParams] (val x: Self) extends AnyVal {
    
    inline def setG_album_name(value: TBoolean): Self = StObject.set(x, "g_album_name", value.asInstanceOf[js.Any])
    
    inline def setG_album_nameUndefined: Self = StObject.set(x, "g_album_name", js.undefined)
    
    inline def setS_release_date(value: TSort): Self = StObject.set(x, "s_release_date", value.asInstanceOf[js.Any])
    
    inline def setS_release_dateUndefined: Self = StObject.set(x, "s_release_date", js.undefined)
  }
}
