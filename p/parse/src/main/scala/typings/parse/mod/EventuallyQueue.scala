package typings.parse.mod

import typings.parse.mod.global.Parse.Attributes
import typings.parse.mod.global.Parse.Object.SaveOptions
import typings.parse.mod.global.Parse.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventuallyQueue {
  
  @JSImport("parse", "EventuallyQueue")
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
  inline def destroy(`object`: typings.parse.mod.global.Parse.Object[Attributes]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def destroy(`object`: typings.parse.mod.global.Parse.Object[Attributes], serverOptions: RequestOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(`object`.asInstanceOf[js.Any], serverOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
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
  inline def save(`object`: typings.parse.mod.global.Parse.Object[Attributes]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("save")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def save(`object`: typings.parse.mod.global.Parse.Object[Attributes], serverOptions: SaveOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(`object`.asInstanceOf[js.Any], serverOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Sends the queue to the server.
    * @returns Returns true if queue was sent successfully.
    */
  inline def sendQueue(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendQueue")().asInstanceOf[js.Promise[Boolean]]
  
  /**
    * Turns off polling.
    */
  inline def stopPoll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopPoll")().asInstanceOf[Unit]
}
