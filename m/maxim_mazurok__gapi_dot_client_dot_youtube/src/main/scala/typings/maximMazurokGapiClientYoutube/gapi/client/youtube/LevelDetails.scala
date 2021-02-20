package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LevelDetails extends StObject {
  
  /** The name that should be used when referring to this level. */
  var displayName: js.UndefOr[String] = js.native
}
object LevelDetails {
  
  @scala.inline
  def apply(): LevelDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LevelDetails]
  }
  
  @scala.inline
  implicit class LevelDetailsMutableBuilder[Self <: LevelDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
