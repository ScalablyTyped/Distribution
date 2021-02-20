package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevisionCheckResponse extends StObject {
  
  /** The version of the API this client revision should use when calling API methods. */
  var apiVersion: js.UndefOr[String] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#revisionCheckResponse`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The result of the revision check. */
  var revisionStatus: js.UndefOr[String] = js.native
}
object RevisionCheckResponse {
  
  @scala.inline
  def apply(): RevisionCheckResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevisionCheckResponse]
  }
  
  @scala.inline
  implicit class RevisionCheckResponseMutableBuilder[Self <: RevisionCheckResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRevisionStatus(value: String): Self = StObject.set(x, "revisionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionStatusUndefined: Self = StObject.set(x, "revisionStatus", js.undefined)
  }
}
