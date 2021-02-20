package typings.naverWhale.whale

import typings.chrome.chrome.events.Event
import typings.chrome.chrome.runtime.MessageSender
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Extension
////////////////////
/**
  * The chrome.extension API has utilities that can be used by any extension page. It includes support for exchanging messages between an extension and its content scripts or between extensions, as described in detail in Message Passing.
  * Availability: Since Chrome 5.
  */
object extension {
  
  @js.native
  trait FetchProperties extends StObject {
    
    /** Optional. The type of view to get. If omitted, returns all views (including background pages and tabs). Valid values: 'tab', 'notification', 'popup'.  */
    var `type`: js.UndefOr[String] = js.native
    
    /** Optional. The window to restrict the search to. If omitted, returns all views.  */
    var windowId: js.UndefOr[Double] = js.native
  }
  object FetchProperties {
    
    @scala.inline
    def apply(): FetchProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchProperties]
    }
    
    @scala.inline
    implicit class FetchPropertiesMutableBuilder[Self <: FetchProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  @js.native
  trait LastError extends StObject {
    
    /** Description of the error that has taken place. */
    var message: String = js.native
  }
  object LastError {
    
    @scala.inline
    def apply(message: String): LastError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[LastError]
    }
    
    @scala.inline
    implicit class LastErrorMutableBuilder[Self <: LastError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  type OnRequestEvent = Event[
    (js.Function3[
      /* request */ js.Any, 
      /* sender */ MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]) | (js.Function2[
      /* sender */ MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ])
  ]
}
