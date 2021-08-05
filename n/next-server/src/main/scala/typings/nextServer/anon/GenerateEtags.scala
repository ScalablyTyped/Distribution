package typings.nextServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateEtags extends StObject {
  
  var generateEtags: Boolean
  
  var poweredByHeader: Boolean
}
object GenerateEtags {
  
  inline def apply(generateEtags: Boolean, poweredByHeader: Boolean): GenerateEtags = {
    val __obj = js.Dynamic.literal(generateEtags = generateEtags.asInstanceOf[js.Any], poweredByHeader = poweredByHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateEtags]
  }
  
  extension [Self <: GenerateEtags](x: Self) {
    
    inline def setGenerateEtags(value: Boolean): Self = StObject.set(x, "generateEtags", value.asInstanceOf[js.Any])
    
    inline def setPoweredByHeader(value: Boolean): Self = StObject.set(x, "poweredByHeader", value.asInstanceOf[js.Any])
  }
}
