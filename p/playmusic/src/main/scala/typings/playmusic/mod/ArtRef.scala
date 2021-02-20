package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtRef extends StObject {
  
  var url: js.UndefOr[String] = js.native
}
object ArtRef {
  
  @scala.inline
  def apply(): ArtRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtRef]
  }
  
  @scala.inline
  implicit class ArtRefMutableBuilder[Self <: ArtRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
