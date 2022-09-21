package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.added
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.changed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.copied
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.modified
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.removed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.renamed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.unchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bloburl extends StObject {
  
  /** @example 103 */
  var additions: Double
  
  /**
    * Format: uri
    * @example https://github.com/octocat/Hello-World/blob/6dcb09b5b57875f334f61aebed695e2e4193db5e/file1.txt
    */
  var blob_url: String
  
  /** @example 124 */
  var changes: Double
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/contents/file1.txt?ref=6dcb09b5b57875f334f61aebed695e2e4193db5e
    */
  var contents_url: String
  
  /** @example 21 */
  var deletions: Double
  
  /** @example file1.txt */
  var filename: String
  
  /** @example @@ -132,7 +132,7 @@ module Test @@ -1000,7 +1000,7 @@ module Test */
  var patch: js.UndefOr[String] = js.undefined
  
  /** @example file.txt */
  var previous_filename: js.UndefOr[String] = js.undefined
  
  /**
    * Format: uri
    * @example https://github.com/octocat/Hello-World/raw/6dcb09b5b57875f334f61aebed695e2e4193db5e/file1.txt
    */
  var raw_url: String
  
  /** @example bbcd538c8e72b8c175046e27cc8f907076331401 */
  var sha: String
  
  /**
    * @example added
    * @enum {string}
    */
  var status: added | removed | modified | renamed | copied | changed | unchanged
}
object Bloburl {
  
  inline def apply(
    additions: Double,
    blob_url: String,
    changes: Double,
    contents_url: String,
    deletions: Double,
    filename: String,
    raw_url: String,
    sha: String,
    status: added | removed | modified | renamed | copied | changed | unchanged
  ): Bloburl = {
    val __obj = js.Dynamic.literal(additions = additions.asInstanceOf[js.Any], blob_url = blob_url.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], contents_url = contents_url.asInstanceOf[js.Any], deletions = deletions.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], raw_url = raw_url.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bloburl]
  }
  
  extension [Self <: Bloburl](x: Self) {
    
    inline def setAdditions(value: Double): Self = StObject.set(x, "additions", value.asInstanceOf[js.Any])
    
    inline def setBlob_url(value: String): Self = StObject.set(x, "blob_url", value.asInstanceOf[js.Any])
    
    inline def setChanges(value: Double): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setContents_url(value: String): Self = StObject.set(x, "contents_url", value.asInstanceOf[js.Any])
    
    inline def setDeletions(value: Double): Self = StObject.set(x, "deletions", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: String): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    
    inline def setPrevious_filename(value: String): Self = StObject.set(x, "previous_filename", value.asInstanceOf[js.Any])
    
    inline def setPrevious_filenameUndefined: Self = StObject.set(x, "previous_filename", js.undefined)
    
    inline def setRaw_url(value: String): Self = StObject.set(x, "raw_url", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: added | removed | modified | renamed | copied | changed | unchanged): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
