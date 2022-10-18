package typings.next.anon

import typings.next.nextStrings.`redirect-external`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destination extends StObject {
  
  var destination: String
  
  var `type`: `redirect-external`
}
object Destination {
  
  inline def apply(destination: String): Destination = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("redirect-external")
    __obj.asInstanceOf[Destination]
  }
  
  extension [Self <: Destination](x: Self) {
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setType(value: `redirect-external`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
