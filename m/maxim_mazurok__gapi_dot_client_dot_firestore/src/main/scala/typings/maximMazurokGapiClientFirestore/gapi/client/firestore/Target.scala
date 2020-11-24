package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Target extends js.Object {
  
  /** A target specified by a set of document names. */
  var documents: js.UndefOr[DocumentsTarget] = js.native
  
  /** If the target should be removed once it is current and consistent. */
  var once: js.UndefOr[Boolean] = js.native
  
  /** A target specified by a query. */
  var query: js.UndefOr[QueryTarget] = js.native
  
  /** Start listening after a specific `read_time`. The client must know the state of matching documents at this time. */
  var readTime: js.UndefOr[String] = js.native
  
  /** A resume token from a prior TargetChange for an identical target. Using a resume token with a different target is unsupported and may fail. */
  var resumeToken: js.UndefOr[String] = js.native
  
  /** The target ID that identifies the target on the stream. Must be a positive number and non-zero. */
  var targetId: js.UndefOr[Double] = js.native
}
object Target {
  
  @scala.inline
  def apply(): Target = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit class TargetOps[Self <: Target] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDocuments(value: DocumentsTarget): Self = this.set("documents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocuments: Self = this.set("documents", js.undefined)
    
    @scala.inline
    def setOnce(value: Boolean): Self = this.set("once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnce: Self = this.set("once", js.undefined)
    
    @scala.inline
    def setQuery(value: QueryTarget): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setReadTime(value: String): Self = this.set("readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadTime: Self = this.set("readTime", js.undefined)
    
    @scala.inline
    def setResumeToken(value: String): Self = this.set("resumeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResumeToken: Self = this.set("resumeToken", js.undefined)
    
    @scala.inline
    def setTargetId(value: Double): Self = this.set("targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetId: Self = this.set("targetId", js.undefined)
  }
}
