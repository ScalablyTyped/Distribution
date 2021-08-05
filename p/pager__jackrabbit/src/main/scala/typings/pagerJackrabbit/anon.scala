package typings.pagerJackrabbit

import typings.amqplib.mod.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Amqp extends StObject {
    
    var amqp: js.Any
    
    var connection: Connection
  }
  object Amqp {
    
    inline def apply(amqp: js.Any, connection: Connection): Amqp = {
      val __obj = js.Dynamic.literal(amqp = amqp.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any])
      __obj.asInstanceOf[Amqp]
    }
    
    extension [Self <: Amqp](x: Self) {
      
      inline def setAmqp(value: js.Any): Self = StObject.set(x, "amqp", value.asInstanceOf[js.Any])
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    }
  }
}
