package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteControl extends StObject {
  
  /**
    * The optional revision ID of the document the write request is applied to. If this is not the latest revision of the document, the request is not processed and returns a 400 bad
    * request error. When a required revision ID is returned in a response, it indicates the revision ID of the document after the request was applied.
    */
  var requiredRevisionId: js.UndefOr[String] = js.undefined
  
  /**
    * The optional target revision ID of the document the write request is applied to. If collaborator changes have occurred after the document was read using the API, the changes
    * produced by this write request are applied against the collaborator changes. This results in a new revision of the document that incorporates both the collaborator changes and the
    * changes in the request, with the Docs server resolving conflicting changes. When using target revision ID, the API client can be thought of as another collaborator of the document.
    * The target revision ID can only be used to write to recent versions of a document. If the target revision is too far behind the latest revision, the request is not processed and
    * returns a 400 bad request error. The request should be tried again after retrieving the latest version of the document. Usually a revision ID remains valid for use as a target
    * revision for several minutes after it's read, but for frequently edited documents this window might be shorter.
    */
  var targetRevisionId: js.UndefOr[String] = js.undefined
}
object WriteControl {
  
  inline def apply(): WriteControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WriteControl] (val x: Self) extends AnyVal {
    
    inline def setRequiredRevisionId(value: String): Self = StObject.set(x, "requiredRevisionId", value.asInstanceOf[js.Any])
    
    inline def setRequiredRevisionIdUndefined: Self = StObject.set(x, "requiredRevisionId", js.undefined)
    
    inline def setTargetRevisionId(value: String): Self = StObject.set(x, "targetRevisionId", value.asInstanceOf[js.Any])
    
    inline def setTargetRevisionIdUndefined: Self = StObject.set(x, "targetRevisionId", js.undefined)
  }
}
