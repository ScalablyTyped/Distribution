package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tarballurl extends StObject {
  
  var commit: ShaUrl
  
  /** @example v0.1 */
  var name: String
  
  var node_id: String
  
  /**
    * Format: uri
    * @example https://github.com/octocat/Hello-World/tarball/v0.1
    */
  var tarball_url: String
  
  /**
    * Format: uri
    * @example https://github.com/octocat/Hello-World/zipball/v0.1
    */
  var zipball_url: String
}
object Tarballurl {
  
  inline def apply(commit: ShaUrl, name: String, node_id: String, tarball_url: String, zipball_url: String): Tarballurl = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], tarball_url = tarball_url.asInstanceOf[js.Any], zipball_url = zipball_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tarballurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tarballurl] (val x: Self) extends AnyVal {
    
    inline def setCommit(value: ShaUrl): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setTarball_url(value: String): Self = StObject.set(x, "tarball_url", value.asInstanceOf[js.Any])
    
    inline def setZipball_url(value: String): Self = StObject.set(x, "zipball_url", value.asInstanceOf[js.Any])
  }
}
