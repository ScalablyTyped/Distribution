package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Closed extends StObject {
  
  var closed: js.Promise[Unit]
}
object Closed {
  
  inline def apply(closed: js.Promise[Unit]): Closed = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Closed]
  }
  
  extension [Self <: Closed](x: Self) {
    
    inline def setClosed(value: js.Promise[Unit]): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
  }
}
