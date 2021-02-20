package typings.nodemailerSmtpTransport

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait MaxConnections extends StObject {
    
    /**
      * is the count of maximum simultaneous connections to make against the SMTP server (defaults to 5)
      */
    var maxConnections: js.UndefOr[Boolean] = js.native
    
    /**
      * limits the message count to be sent using a single connection (defaults to 100). After maxMessages is reached the connection is dropped and a new one is created for the following messages
      */
    var maxMessages: js.UndefOr[Boolean] = js.native
    
    /**
      * set to true to use pooled connections (defaults to false) instead of creating a new connection for every email
      */
    var pool: js.UndefOr[Boolean] = js.native
    
    /**
      * defines the time measuring period in milliseconds (defaults to 1000, ie. to 1 second) for rate limiting
      */
    var rateDelta: js.UndefOr[Boolean] = js.native
    
    /**
      * limits the message count to be sent in rateDelta time. Once rateLimit is reached, sending is paused until the end of the measuring period.
      */
    var rateLimit: js.UndefOr[Boolean] = js.native
  }
  object MaxConnections {
    
    @scala.inline
    def apply(): MaxConnections = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxConnections]
    }
    
    @scala.inline
    implicit class MaxConnectionsMutableBuilder[Self <: MaxConnections] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxConnections(value: Boolean): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
      
      @scala.inline
      def setMaxMessages(value: Boolean): Self = StObject.set(x, "maxMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxMessagesUndefined: Self = StObject.set(x, "maxMessages", js.undefined)
      
      @scala.inline
      def setPool(value: Boolean): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
      
      @scala.inline
      def setRateDelta(value: Boolean): Self = StObject.set(x, "rateDelta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateDeltaUndefined: Self = StObject.set(x, "rateDelta", js.undefined)
      
      @scala.inline
      def setRateLimit(value: Boolean): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
    }
  }
}
