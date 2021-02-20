package typings.pollyjsAdapter

import org.scalablytyped.runtime.StringDictionary
import typings.pollyjsAdapter.anon.Body
import typings.pollyjsCore.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pollyjs/adapter", JSImport.Default)
  @js.native
  class default () extends Adapter
  /* static members */
  object default {
    
    @JSImport("@pollyjs/adapter", "default.id")
    @js.native
    val id: String = js.native
    
    @JSImport("@pollyjs/adapter", "default.type")
    @js.native
    val `type`: String = js.native
  }
  
  @js.native
  trait Adapter extends StObject {
    
    def connect(): Unit = js.native
    
    def disconnect(): Unit = js.native
    
    val options: StringDictionary[js.Any] = js.native
    
    def passthroughRequest(pollyRequest: Request): js.Promise[Body] = js.native
  }
  object Adapter {
    
    @scala.inline
    def apply(
      connect: () => Unit,
      disconnect: () => Unit,
      options: StringDictionary[js.Any],
      passthroughRequest: Request => js.Promise[Body]
    ): Adapter = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), disconnect = js.Any.fromFunction0(disconnect), options = options.asInstanceOf[js.Any], passthroughRequest = js.Any.fromFunction1(passthroughRequest))
      __obj.asInstanceOf[Adapter]
    }
    
    @scala.inline
    implicit class AdapterMutableBuilder[Self <: Adapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnect(value: () => Unit): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassthroughRequest(value: Request => js.Promise[Body]): Self = StObject.set(x, "passthroughRequest", js.Any.fromFunction1(value))
    }
  }
}
