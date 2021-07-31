package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  /** A target specified by a set of document names. */
  var documents: js.UndefOr[DocumentsTarget] = js.undefined
  
  /** If the target should be removed once it is current and consistent. */
  var once: js.UndefOr[Boolean] = js.undefined
  
  /** A target specified by a query. */
  var query: js.UndefOr[QueryTarget] = js.undefined
  
  /** Start listening after a specific `read_time`. The client must know the state of matching documents at this time. */
  var readTime: js.UndefOr[String] = js.undefined
  
  /** A resume token from a prior TargetChange for an identical target. Using a resume token with a different target is unsupported and may fail. */
  var resumeToken: js.UndefOr[String] = js.undefined
  
  /** The target ID that identifies the target on the stream. Must be a positive number and non-zero. */
  var targetId: js.UndefOr[Double] = js.undefined
}
object Target {
  
  @scala.inline
  def apply(): Target = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocuments(value: DocumentsTarget): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    @scala.inline
    def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    
    @scala.inline
    def setQuery(value: QueryTarget): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    @scala.inline
    def setResumeToken(value: String): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
    
    @scala.inline
    def setTargetId(value: Double): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
  }
}
