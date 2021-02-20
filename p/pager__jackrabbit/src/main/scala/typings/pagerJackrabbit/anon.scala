package typings.pagerJackrabbit

import typings.amqplib.mod.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Amqp extends StObject {
    
    var amqp: js.Any = js.native
    
    var connection: Connection = js.native
  }
  object Amqp {
    
    @scala.inline
    def apply(amqp: js.Any, connection: Connection): Amqp = {
      val __obj = js.Dynamic.literal(amqp = amqp.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any])
      __obj.asInstanceOf[Amqp]
    }
    
    @scala.inline
    implicit class AmqpMutableBuilder[Self <: Amqp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmqp(value: js.Any): Self = StObject.set(x, "amqp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    }
  }
}
