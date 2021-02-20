package typings.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtistAlbumsParams
  extends ArtistParams
     with Pageable {
  
  var g_album_name: js.UndefOr[TBoolean] = js.native
  
  var s_release_date: js.UndefOr[TSort] = js.native
}
object ArtistAlbumsParams {
  
  @scala.inline
  def apply(): ArtistAlbumsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtistAlbumsParams]
  }
  
  @scala.inline
  implicit class ArtistAlbumsParamsMutableBuilder[Self <: ArtistAlbumsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setG_album_name(value: TBoolean): Self = StObject.set(x, "g_album_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG_album_nameUndefined: Self = StObject.set(x, "g_album_name", js.undefined)
    
    @scala.inline
    def setS_release_date(value: TSort): Self = StObject.set(x, "s_release_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS_release_dateUndefined: Self = StObject.set(x, "s_release_date", js.undefined)
  }
}
