package typings.parse.mod.global.Parse

import typings.parse.mod.global.Parse.Object.SaveOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventuallyQueue {
  
  @JSGlobal("Parse.EventuallyQueue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Removes all objects from queue.
    * @returns A promise that is fulfilled when queue is cleared.
    */
  inline def clear(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[js.Promise[Unit]]
  
  /**
    * Add object to queue with save operation.
    *
    * @param object Parse.Object to be destroyed eventually
    * @param serverOptions See {@link https://parseplatform.org/Parse-SDK-JS/api/master/Parse.Object.html#destroy Parse.Object.destroy} options
    * @returns A promise that is fulfilled if object is added to queue.
    * @see Parse.Object#destroyEventually
    */
  inline def destroy(`object`: Object[Attributes]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def destroy(`object`: Object[Attributes], serverOptions: RequestOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(`object`.asInstanceOf[js.Any], serverOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  // function store(data: any): Promise<void>;
  // function load(): Promise<void>;
  /**
    * Sets the in-memory queue from local storage and returns.
    */
  inline def getQueue(): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueue")().asInstanceOf[js.Promise[js.Array[Any]]]
  
  /**
    * Return true if pinging the server.
    */
  inline def isPolling(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPolling")().asInstanceOf[Boolean]
  
  /**
    * Return the number of objects in the queue.
    */
  inline def length(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("length")().asInstanceOf[js.Promise[Double]]
  
  /**
    * Start polling server for network connection.
    * Will send queue if connection is established.
    *
    * @param [ms] Milliseconds to ping the server. Default 2000ms
    */
  inline def poll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("poll")().asInstanceOf[Unit]
  inline def poll(ms: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("poll")(ms.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Add object to queue with save operation.
    *
    * @param object Parse.Object to be saved eventually
    * @param serverOptions See {@link https://parseplatform.org/Parse-SDK-JS/api/master/Parse.Object.html#save Parse.Object.save} options.
    * @returns A promise that is fulfilled if object is added to queue.
    * @see Parse.Object#saveEventually
    */
  inline def save(`object`: Object[Attributes]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("save")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def save(`object`: Object[Attributes], serverOptions: SaveOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(`object`.asInstanceOf[js.Any], serverOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Sends the queue to the server.
    * @returns Returns true if queue was sent successfully.
    */
  inline def sendQueue(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendQueue")().asInstanceOf[js.Promise[Boolean]]
  
  /**
    * Turns off polling.
    */
  inline def stopPoll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopPoll")().asInstanceOf[Unit]
  
  type Queue = js.Array[QueueObject]
  
  trait QueueObject extends StObject {
    
    var action: String
    
    var className: String
    
    var createdAt: js.Date
    
    var hash: String
    
    var id: String
    
    var `object`: Object[Attributes]
    
    var queueId: String
    
    var serverOptions: SaveOptions | RequestOptions
  }
  object QueueObject {
    
    inline def apply(
      action: String,
      className: String,
      createdAt: js.Date,
      hash: String,
      id: String,
      `object`: Object[Attributes],
      queueId: String,
      serverOptions: SaveOptions | RequestOptions
    ): QueueObject = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], queueId = queueId.asInstanceOf[js.Any], serverOptions = serverOptions.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueObject]
    }
    
    extension [Self <: QueueObject](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setObject(value: Object[Attributes]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setQueueId(value: String): Self = StObject.set(x, "queueId", value.asInstanceOf[js.Any])
      
      inline def setServerOptions(value: SaveOptions | RequestOptions): Self = StObject.set(x, "serverOptions", value.asInstanceOf[js.Any])
    }
  }
}
