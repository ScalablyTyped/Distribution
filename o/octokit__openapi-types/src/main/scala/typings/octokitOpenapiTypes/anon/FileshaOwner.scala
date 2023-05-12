package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileshaOwner extends StObject {
  
  var file_sha: String
  
  var owner: String
  
  var repo: String
}
object FileshaOwner {
  
  inline def apply(file_sha: String, owner: String, repo: String): FileshaOwner = {
    val __obj = js.Dynamic.literal(file_sha = file_sha.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileshaOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileshaOwner] (val x: Self) extends AnyVal {
    
    inline def setFile_sha(value: String): Self = StObject.set(x, "file_sha", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
