package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bloburl extends StObject {
  
  var additions: Double
  
  var blob_url: String
  
  var changes: Double
  
  var contents_url: String
  
  var deletions: Double
  
  var filename: String
  
  var patch: String
  
  var raw_url: String
  
  var sha: String
  
  var status: String
}
object Bloburl {
  
  @scala.inline
  def apply(
    additions: Double,
    blob_url: String,
    changes: Double,
    contents_url: String,
    deletions: Double,
    filename: String,
    patch: String,
    raw_url: String,
    sha: String,
    status: String
  ): Bloburl = {
    val __obj = js.Dynamic.literal(additions = additions.asInstanceOf[js.Any], blob_url = blob_url.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], contents_url = contents_url.asInstanceOf[js.Any], deletions = deletions.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], raw_url = raw_url.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bloburl]
  }
  
  @scala.inline
  implicit class BloburlMutableBuilder[Self <: Bloburl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditions(value: Double): Self = StObject.set(x, "additions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlob_url(value: String): Self = StObject.set(x, "blob_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChanges(value: Double): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContents_url(value: String): Self = StObject.set(x, "contents_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletions(value: Double): Self = StObject.set(x, "deletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatch(value: String): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw_url(value: String): Self = StObject.set(x, "raw_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
