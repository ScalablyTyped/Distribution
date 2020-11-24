package typings.postmate.mod

import typings.std.HTMLIFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Composes an API to be used by the parent
  */
@js.native
trait ParentAPI extends js.Object {
  
  /**
    * Calls a function on the child's model
    *
    * @param key The string property to lookup in the child's model
    * @param data The optional data to send to the child function
    */
  def call(key: String): Unit = js.native
  def call(key: String, data: js.Any): Unit = js.native
  
  /**
    * Removes the iFrame element and destroys any message event listeners
    */
  def destroy(): Unit = js.native
  
  /**
    * The iFrame Element that the parent is communicating with
    */
  var frame: HTMLIFrameElement = js.native
  
  /**
    * Retrieves a value by property name from the child's model object.
    *
    * @param key The string property to lookup in the child's model
    * @returns child model property value
    */
  def get(key: String): js.Promise[_] = js.native
  
  /**
    * Listen to a particular event from the child
    *
    * @param eventName the name of the event
    * @param callback the event handler function
    */
  def on(eventName: String, callback: js.Function1[/* data */ js.UndefOr[js.Any], Unit]): Unit = js.native
}
