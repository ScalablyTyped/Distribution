package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.`squirrel-girl`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactionsDeleteLegacyEndpoint
  extends StObject
     with RequiredPreview[`squirrel-girl`] {
  
  var reaction_id: Double
}
object ReactionsDeleteLegacyEndpoint {
  
  @scala.inline
  def apply(mediaType: `0`[`squirrel-girl`], reaction_id: Double): ReactionsDeleteLegacyEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], reaction_id = reaction_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsDeleteLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ReactionsDeleteLegacyEndpointMutableBuilder[Self <: ReactionsDeleteLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReaction_id(value: Double): Self = StObject.set(x, "reaction_id", value.asInstanceOf[js.Any])
  }
}
