package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tarballurl extends StObject {
  
  var commit: ShaUrl = js.native
  
  var name: String = js.native
  
  var tarball_url: String = js.native
  
  var zipball_url: String = js.native
}
object Tarballurl {
  
  @scala.inline
  def apply(commit: ShaUrl, name: String, tarball_url: String, zipball_url: String): Tarballurl = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tarball_url = tarball_url.asInstanceOf[js.Any], zipball_url = zipball_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tarballurl]
  }
  
  @scala.inline
  implicit class TarballurlMutableBuilder[Self <: Tarballurl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommit(value: ShaUrl): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarball_url(value: String): Self = StObject.set(x, "tarball_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZipball_url(value: String): Self = StObject.set(x, "zipball_url", value.asInstanceOf[js.Any])
  }
}
