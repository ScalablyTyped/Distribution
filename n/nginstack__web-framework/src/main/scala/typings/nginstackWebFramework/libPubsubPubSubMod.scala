package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPubsubPubSubMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/pubsub/PubSub", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with PubSub
  @JSImport("@nginstack/web-framework/lib/pubsub/PubSub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait PubSub extends StObject {
    
    def clear(): Unit = js.native
    def clear(opt_topic: String): Unit = js.native
    
    def disposeInternal(): Unit = js.native
    
    def getCount(): Double = js.native
    def getCount(opt_topic: String): Double = js.native
    
    /* private */ var key_ : Any = js.native
    
    /* private */ var pendingKeys_ : Any = js.native
    
    def publish(topic: String, args: Any*): Boolean = js.native
    
    /* private */ var publishDepth_ : Any = js.native
    
    def subscribe(topic: String, fn: js.Function1[/* arg0 */ Any, Any]): Double = js.native
    def subscribe(topic: String, fn: js.Function1[/* arg0 */ Any, Any], opt_context: Any): Double = js.native
    
    def subscribeOnce(topic: String, fn: js.Function1[/* arg0 */ Any, Any]): Double = js.native
    def subscribeOnce(topic: String, fn: js.Function1[/* arg0 */ Any, Any], opt_context: Any): Double = js.native
    
    /* private */ var subscriptions_ : Any = js.native
    
    /* private */ var topics_ : Any = js.native
    
    def unsubscribe(topic: String, fn: js.Function1[/* arg0 */ Any, Any]): Boolean = js.native
    def unsubscribe(topic: String, fn: js.Function1[/* arg0 */ Any, Any], opt_context: Any): Boolean = js.native
    
    def unsubscribeByKey(key: Double): Boolean = js.native
  }
}
