package typings.meteorTypings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ddpRateLimiterMod {
  
  object DDPRateLimiter {
    
    @JSImport("meteor/ddp-rate-limiter", "DDPRateLimiter")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def addRule(matcher: Matcher, numRequests: Double, timeInterval: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(matcher.asInstanceOf[js.Any], numRequests.asInstanceOf[js.Any], timeInterval.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def removeRule(ruleId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("removeRule")(ruleId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    trait Matcher extends StObject {
      
      var clientAddress: js.UndefOr[String | (js.Function1[/* clientAddress */ String, Boolean])] = js.undefined
      
      var connectionId: js.UndefOr[String | (js.Function1[/* connectionId */ String, Boolean])] = js.undefined
      
      var name: js.UndefOr[String | (js.Function1[/* name */ String, Boolean])] = js.undefined
      
      var `type`: js.UndefOr[String | (js.Function1[/* type */ String, Boolean])] = js.undefined
      
      var userId: js.UndefOr[String | (js.Function1[/* userId */ String, Boolean])] = js.undefined
    }
    object Matcher {
      
      @scala.inline
      def apply(): Matcher = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Matcher]
      }
      
      @scala.inline
      implicit class MatcherMutableBuilder[Self <: Matcher] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClientAddress(value: String | (js.Function1[/* clientAddress */ String, Boolean])): Self = StObject.set(x, "clientAddress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClientAddressFunction1(value: /* clientAddress */ String => Boolean): Self = StObject.set(x, "clientAddress", js.Any.fromFunction1(value))
        
        @scala.inline
        def setClientAddressUndefined: Self = StObject.set(x, "clientAddress", js.undefined)
        
        @scala.inline
        def setConnectionId(value: String | (js.Function1[/* connectionId */ String, Boolean])): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConnectionIdFunction1(value: /* connectionId */ String => Boolean): Self = StObject.set(x, "connectionId", js.Any.fromFunction1(value))
        
        @scala.inline
        def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
        
        @scala.inline
        def setName(value: String | (js.Function1[/* name */ String, Boolean])): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameFunction1(value: /* name */ String => Boolean): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setType(value: String | (js.Function1[/* type */ String, Boolean])): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeFunction1(value: /* type */ String => Boolean): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setUserId(value: String | (js.Function1[/* userId */ String, Boolean])): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserIdFunction1(value: /* userId */ String => Boolean): Self = StObject.set(x, "userId", js.Any.fromFunction1(value))
        
        @scala.inline
        def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
  }
}
