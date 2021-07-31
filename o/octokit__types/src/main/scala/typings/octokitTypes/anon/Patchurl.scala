package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Patchurl extends StObject {
  
  var diff_url: String
  
  var html_url: String
  
  var patch_url: String
}
object Patchurl {
  
  @scala.inline
  def apply(diff_url: String, html_url: String, patch_url: String): Patchurl = {
    val __obj = js.Dynamic.literal(diff_url = diff_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], patch_url = patch_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Patchurl]
  }
  
  @scala.inline
  implicit class PatchurlMutableBuilder[Self <: Patchurl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiff_url(value: String): Self = StObject.set(x, "diff_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatch_url(value: String): Self = StObject.set(x, "patch_url", value.asInstanceOf[js.Any])
  }
}
