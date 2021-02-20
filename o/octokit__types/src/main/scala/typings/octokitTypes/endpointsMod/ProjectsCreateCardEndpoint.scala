package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  column_id :number,   note :string | undefined,   content_id :number | undefined,   content_type :string | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
@js.native
trait ProjectsCreateCardEndpoint extends StObject {
  
  var column_id: Double = js.native
  
  /**
    * The issue or pull request id you want to associate with this card. You can use the [List repository issues](https://developer.github.com/v3/issues/#list-repository-issues) and [List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests) endpoints to find this id.
    * **Note:** Depending on whether you use the issue id or pull request id, you will need to specify `Issue` or `PullRequest` as the `content_type`.
    */
  var content_id: js.UndefOr[Double] = js.native
  
  /**
    * **Required if you provide `content_id`**. The type of content you want to associate with this card. Use `Issue` when `content_id` is an issue id and use `PullRequest` when `content_id` is a pull request id.
    */
  var content_type: js.UndefOr[String] = js.native
  
  var mediaType: `7` = js.native
  
  /**
    * The card's note content. Only valid for cards without another type of content, so you must omit when specifying `content_id` and `content_type`.
    */
  var note: js.UndefOr[String] = js.native
}
object ProjectsCreateCardEndpoint {
  
  @scala.inline
  def apply(column_id: Double, mediaType: `7`): ProjectsCreateCardEndpoint = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsCreateCardEndpoint]
  }
  
  @scala.inline
  implicit class ProjectsCreateCardEndpointMutableBuilder[Self <: ProjectsCreateCardEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn_id(value: Double): Self = StObject.set(x, "column_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_id(value: Double): Self = StObject.set(x, "content_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_idUndefined: Self = StObject.set(x, "content_id", js.undefined)
    
    @scala.inline
    def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
    
    @scala.inline
    def setMediaType(value: `7`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
  }
}
