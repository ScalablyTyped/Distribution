package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitidEvent extends StObject {
  
  var comments: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['commit-comment'] */ js.Any
    ]
  ] = js.undefined
  
  var commit_id: js.UndefOr[String] = js.undefined
  
  var event: js.UndefOr[String] = js.undefined
  
  var node_id: js.UndefOr[String] = js.undefined
}
object CommitidEvent {
  
  inline def apply(): CommitidEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitidEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommitidEvent] (val x: Self) extends AnyVal {
    
    inline def setComments(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['commit-comment'] */ js.Any
        ]
    ): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['commit-comment'] */ js.Any)*
    ): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setCommit_id(value: String): Self = StObject.set(x, "commit_id", value.asInstanceOf[js.Any])
    
    inline def setCommit_idUndefined: Self = StObject.set(x, "commit_id", js.undefined)
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
  }
}
