package typings.nextServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateEtags extends StObject {
  
  var generateEtags: Boolean = js.native
  
  var poweredByHeader: Boolean = js.native
}
object GenerateEtags {
  
  @scala.inline
  def apply(generateEtags: Boolean, poweredByHeader: Boolean): GenerateEtags = {
    val __obj = js.Dynamic.literal(generateEtags = generateEtags.asInstanceOf[js.Any], poweredByHeader = poweredByHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateEtags]
  }
  
  @scala.inline
  implicit class GenerateEtagsMutableBuilder[Self <: GenerateEtags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGenerateEtags(value: Boolean): Self = StObject.set(x, "generateEtags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoweredByHeader(value: Boolean): Self = StObject.set(x, "poweredByHeader", value.asInstanceOf[js.Any])
  }
}
