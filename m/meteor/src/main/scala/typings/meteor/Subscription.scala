package typings.meteor

import typings.meteor.Meteor.Connection
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscription extends StObject {
  
  def added(collection: String, id: String, fields: js.Object): Unit
  
  def changed(collection: String, id: String, fields: js.Object): Unit
  
  var connection: Connection
  
  def error(error: Error): Unit
  
  def onStop(func: js.Function): Unit
  
  def ready(): Unit
  
  def removed(collection: String, id: String): Unit
  
  def stop(): Unit
  
  var userId: String | Null
}
object Subscription {
  
  inline def apply(
    added: (String, String, js.Object) => Unit,
    changed: (String, String, js.Object) => Unit,
    connection: Connection,
    error: Error => Unit,
    onStop: js.Function => Unit,
    ready: () => Unit,
    removed: (String, String) => Unit,
    stop: () => Unit
  ): Subscription = {
    val __obj = js.Dynamic.literal(added = js.Any.fromFunction3(added), changed = js.Any.fromFunction3(changed), connection = connection.asInstanceOf[js.Any], error = js.Any.fromFunction1(error), onStop = js.Any.fromFunction1(onStop), ready = js.Any.fromFunction0(ready), removed = js.Any.fromFunction2(removed), stop = js.Any.fromFunction0(stop), userId = null)
    __obj.asInstanceOf[Subscription]
  }
  
  extension [Self <: Subscription](x: Self) {
    
    inline def setAdded(value: (String, String, js.Object) => Unit): Self = StObject.set(x, "added", js.Any.fromFunction3(value))
    
    inline def setChanged(value: (String, String, js.Object) => Unit): Self = StObject.set(x, "changed", js.Any.fromFunction3(value))
    
    inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setError(value: Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setOnStop(value: js.Function => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction1(value))
    
    inline def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
    
    inline def setRemoved(value: (String, String) => Unit): Self = StObject.set(x, "removed", js.Any.fromFunction2(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
  }
}
