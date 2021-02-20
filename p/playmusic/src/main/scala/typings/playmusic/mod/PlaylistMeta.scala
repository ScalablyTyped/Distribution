package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistMeta extends StObject {
  
  var description: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var shareState: js.UndefOr[String] = js.native
}
object PlaylistMeta {
  
  @scala.inline
  def apply(): PlaylistMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistMeta]
  }
  
  @scala.inline
  implicit class PlaylistMetaMutableBuilder[Self <: PlaylistMeta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setShareState(value: String): Self = StObject.set(x, "shareState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareStateUndefined: Self = StObject.set(x, "shareState", js.undefined)
  }
}
