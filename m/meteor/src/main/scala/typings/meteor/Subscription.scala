package typings.meteor

import typings.meteor.Meteor.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscription extends StObject {
  
  /**
    * Call inside the publish function.  Informs the subscriber that a document has been added to the record set.
    * @param collection The name of the collection that contains the new document.
    * @param id The new document's ID.
    * @param fields The fields in the new document.  If `_id` is present it is ignored.
    */
  def added(collection: String, id: String, fields: js.Object): Unit
  
  /**
    * Call inside the publish function. Informs the subscriber that a document in the record set has been modified.
    * @param collection The name of the collection that contains the changed document.
    * @param id The changed document's ID.
    * @param fields The fields in the document that have changed, together with their new values.  If a field is not present in `fields` it was left unchanged; if it is present in `fields` and
    * has a value of `undefined` it was removed from the document.  If `_id` is present it is ignored.
    */
  def changed(collection: String, id: String, fields: js.Object): Unit
  
  /** Access inside the publish function. The incoming connection for this subscription. */
  var connection: Connection
  
  /**
    * Call inside the publish function. Stops this client's subscription, triggering a call on the client to the `onStop` callback passed to `Meteor.subscribe`, if any. If `error` is not a
    * `Meteor.Error`, it will be sanitized.
    * @param error The error to pass to the client.
    */
  def error(error: js.Error): Unit
  
  /**
    * Call inside the publish function. Registers a callback function to run when the subscription is stopped.
    * @param func The callback function
    */
  def onStop(func: js.Function): Unit
  
  /**
    * Call inside the publish function. Informs the subscriber that an initial, complete snapshot of the record set has been sent.  This will trigger a call on the client to the `onReady`
    * callback passed to  `Meteor.subscribe`, if any.
    */
  def ready(): Unit
  
  /**
    * Call inside the publish function. Informs the subscriber that a document has been removed from the record set.
    * @param collection The name of the collection that the document has been removed from.
    * @param id The ID of the document that has been removed.
    */
  def removed(collection: String, id: String): Unit
  
  /**
    * Access inside the publish function. The incoming connection for this subscription.
    */
  def stop(): Unit
  
  /**
    * Call inside the publish function. Allows subsequent methods or subscriptions for the client of this subscription
    * to begin running without waiting for the publishing to become ready.
    */
  def unblock(): Unit
  
  /** Access inside the publish function. The id of the logged-in user, or `null` if no user is logged in. */
  var userId: String | Null
}
object Subscription {
  
  inline def apply(
    added: (String, String, js.Object) => Unit,
    changed: (String, String, js.Object) => Unit,
    connection: Connection,
    error: js.Error => Unit,
    onStop: js.Function => Unit,
    ready: () => Unit,
    removed: (String, String) => Unit,
    stop: () => Unit,
    unblock: () => Unit
  ): Subscription = {
    val __obj = js.Dynamic.literal(added = js.Any.fromFunction3(added), changed = js.Any.fromFunction3(changed), connection = connection.asInstanceOf[js.Any], error = js.Any.fromFunction1(error), onStop = js.Any.fromFunction1(onStop), ready = js.Any.fromFunction0(ready), removed = js.Any.fromFunction2(removed), stop = js.Any.fromFunction0(stop), unblock = js.Any.fromFunction0(unblock), userId = null)
    __obj.asInstanceOf[Subscription]
  }
  
  extension [Self <: Subscription](x: Self) {
    
    inline def setAdded(value: (String, String, js.Object) => Unit): Self = StObject.set(x, "added", js.Any.fromFunction3(value))
    
    inline def setChanged(value: (String, String, js.Object) => Unit): Self = StObject.set(x, "changed", js.Any.fromFunction3(value))
    
    inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setError(value: js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setOnStop(value: js.Function => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction1(value))
    
    inline def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
    
    inline def setRemoved(value: (String, String) => Unit): Self = StObject.set(x, "removed", js.Any.fromFunction2(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    inline def setUnblock(value: () => Unit): Self = StObject.set(x, "unblock", js.Any.fromFunction0(value))
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
  }
}
