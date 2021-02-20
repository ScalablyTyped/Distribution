package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  card_id :number,   position :string,   column_id :number | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
@js.native
trait ProjectsMoveCardEndpoint extends StObject {
  
  var card_id: Double = js.native
  
  /**
    * The `id` value of a column in the same project.
    */
  var column_id: js.UndefOr[Double] = js.native
  
  var mediaType: `7` = js.native
  
  /**
    * Can be one of `top`, `bottom`, or `after:<card_id>`, where `<card_id>` is the `id` value of a card in the same column, or in the new column specified by `column_id`.
    */
  var position: String = js.native
}
object ProjectsMoveCardEndpoint {
  
  @scala.inline
  def apply(card_id: Double, mediaType: `7`, position: String): ProjectsMoveCardEndpoint = {
    val __obj = js.Dynamic.literal(card_id = card_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsMoveCardEndpoint]
  }
  
  @scala.inline
  implicit class ProjectsMoveCardEndpointMutableBuilder[Self <: ProjectsMoveCardEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCard_id(value: Double): Self = StObject.set(x, "card_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn_id(value: Double): Self = StObject.set(x, "column_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn_idUndefined: Self = StObject.set(x, "column_id", js.undefined)
    
    @scala.inline
    def setMediaType(value: `7`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
