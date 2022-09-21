package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamNameBySubject extends StObject {
  
  var subject: String
}
object StreamNameBySubject {
  
  inline def apply(subject: String): StreamNameBySubject = {
    val __obj = js.Dynamic.literal(subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamNameBySubject]
  }
  
  extension [Self <: StreamNameBySubject](x: Self) {
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
  }
}
