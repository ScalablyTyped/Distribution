package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  card_id :number,   note :string | undefined,   archived :boolean | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
@js.native
trait ProjectsUpdateCardEndpoint extends StObject {
  
  /**
    * Use `true` to archive a project card. Specify `false` if you need to restore a previously archived project card.
    */
  var archived: js.UndefOr[Boolean] = js.native
  
  var card_id: Double = js.native
  
  var mediaType: `7` = js.native
  
  /**
    * The card's note content. Only valid for cards without another type of content, so this cannot be specified if the card already has a `content_id` and `content_type`.
    */
  var note: js.UndefOr[String] = js.native
}
object ProjectsUpdateCardEndpoint {
  
  @scala.inline
  def apply(card_id: Double, mediaType: `7`): ProjectsUpdateCardEndpoint = {
    val __obj = js.Dynamic.literal(card_id = card_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsUpdateCardEndpoint]
  }
  
  @scala.inline
  implicit class ProjectsUpdateCardEndpointMutableBuilder[Self <: ProjectsUpdateCardEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    @scala.inline
    def setCard_id(value: Double): Self = StObject.set(x, "card_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: `7`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
  }
}
