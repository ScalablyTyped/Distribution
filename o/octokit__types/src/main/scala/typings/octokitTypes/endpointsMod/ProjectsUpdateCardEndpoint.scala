package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.inertia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsUpdateCardEndpoint
  extends StObject
     with RequiredPreview[inertia] {
  
  /**
    * Use `true` to archive a project card. Specify `false` if you need to restore a previously archived project card.
    */
  var archived: js.UndefOr[Boolean] = js.undefined
  
  var card_id: Double
  
  /**
    * The card's note content. Only valid for cards without another type of content, so this cannot be specified if the card already has a `content_id` and `content_type`.
    */
  var note: js.UndefOr[String] = js.undefined
}
object ProjectsUpdateCardEndpoint {
  
  inline def apply(card_id: Double, mediaType: `0`[inertia]): ProjectsUpdateCardEndpoint = {
    val __obj = js.Dynamic.literal(card_id = card_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsUpdateCardEndpoint]
  }
  
  extension [Self <: ProjectsUpdateCardEndpoint](x: Self) {
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    inline def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    inline def setCard_id(value: Double): Self = StObject.set(x, "card_id", value.asInstanceOf[js.Any])
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
  }
}
