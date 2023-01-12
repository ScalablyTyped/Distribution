package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blobsha extends StObject {
  
  /**
    * @description SHA-1 hash ID of the associated blob
    * @example af5626b4a114abcb82d63db7c8082c3c4756e51b
    */
  var blob_sha: String
  
  /** @description The API URL to get the associated blob resource */
  var blob_url: String
  
  /**
    * @description SHA-1 hash ID of the associated commit
    * @example af5626b4a114abcb82d63db7c8082c3c4756e51b
    */
  var commit_sha: String
  
  /** @description The API URL to get the associated commit resource */
  var commit_url: String
  
  /** @description The column at which the secret ends within the end line when the file is interpreted as 8BIT ASCII */
  var end_column: Double
  
  /** @description Line number at which the secret ends in the file */
  var end_line: Double
  
  /**
    * @description The file path in the repository
    * @example /example/secrets.txt
    */
  var path: String
  
  /** @description The column at which the secret starts within the start line when the file is interpreted as 8BIT ASCII */
  var start_column: Double
  
  /** @description Line number at which the secret starts in the file */
  var start_line: Double
}
object Blobsha {
  
  inline def apply(
    blob_sha: String,
    blob_url: String,
    commit_sha: String,
    commit_url: String,
    end_column: Double,
    end_line: Double,
    path: String,
    start_column: Double,
    start_line: Double
  ): Blobsha = {
    val __obj = js.Dynamic.literal(blob_sha = blob_sha.asInstanceOf[js.Any], blob_url = blob_url.asInstanceOf[js.Any], commit_sha = commit_sha.asInstanceOf[js.Any], commit_url = commit_url.asInstanceOf[js.Any], end_column = end_column.asInstanceOf[js.Any], end_line = end_line.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], start_column = start_column.asInstanceOf[js.Any], start_line = start_line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blobsha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Blobsha] (val x: Self) extends AnyVal {
    
    inline def setBlob_sha(value: String): Self = StObject.set(x, "blob_sha", value.asInstanceOf[js.Any])
    
    inline def setBlob_url(value: String): Self = StObject.set(x, "blob_url", value.asInstanceOf[js.Any])
    
    inline def setCommit_sha(value: String): Self = StObject.set(x, "commit_sha", value.asInstanceOf[js.Any])
    
    inline def setCommit_url(value: String): Self = StObject.set(x, "commit_url", value.asInstanceOf[js.Any])
    
    inline def setEnd_column(value: Double): Self = StObject.set(x, "end_column", value.asInstanceOf[js.Any])
    
    inline def setEnd_line(value: Double): Self = StObject.set(x, "end_line", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setStart_column(value: Double): Self = StObject.set(x, "start_column", value.asInstanceOf[js.Any])
    
    inline def setStart_line(value: Double): Self = StObject.set(x, "start_line", value.asInstanceOf[js.Any])
  }
}
