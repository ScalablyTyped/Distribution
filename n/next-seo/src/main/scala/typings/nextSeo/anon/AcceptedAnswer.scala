package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptedAnswer extends StObject {
  
  var `@type`: String
  
  var acceptedAnswer: Text
  
  var name: String
}
object AcceptedAnswer {
  
  inline def apply(`@type`: String, acceptedAnswer: Text, name: String): AcceptedAnswer = {
    val __obj = js.Dynamic.literal(acceptedAnswer = acceptedAnswer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptedAnswer]
  }
  
  extension [Self <: AcceptedAnswer](x: Self) {
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setAcceptedAnswer(value: Text): Self = StObject.set(x, "acceptedAnswer", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
