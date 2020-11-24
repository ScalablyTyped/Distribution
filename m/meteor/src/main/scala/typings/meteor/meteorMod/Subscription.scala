package typings.meteor.meteorMod

import typings.meteor.meteorMod.Meteor.Connection
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscription extends js.Object {
  
  def added(collection: String, id: String, fields: js.Object): Unit = js.native
  
  def changed(collection: String, id: String, fields: js.Object): Unit = js.native
  
  var connection: Connection = js.native
  
  def error(error: Error): Unit = js.native
  
  def onStop(func: js.Function): Unit = js.native
  
  def ready(): Unit = js.native
  
  def removed(collection: String, id: String): Unit = js.native
  
  def stop(): Unit = js.native
  
  var userId: String | Null = js.native
}
object Subscription {
  
  @scala.inline
  def apply(
    added: (String, String, js.Object) => Unit,
    changed: (String, String, js.Object) => Unit,
    connection: Connection,
    error: Error => Unit,
    onStop: js.Function => Unit,
    ready: () => Unit,
    removed: (String, String) => Unit,
    stop: () => Unit
  ): Subscription = {
    val __obj = js.Dynamic.literal(added = js.Any.fromFunction3(added), changed = js.Any.fromFunction3(changed), connection = connection.asInstanceOf[js.Any], error = js.Any.fromFunction1(error), onStop = js.Any.fromFunction1(onStop), ready = js.Any.fromFunction0(ready), removed = js.Any.fromFunction2(removed), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdded(value: (String, String, js.Object) => Unit): Self = this.set("added", js.Any.fromFunction3(value))
    
    @scala.inline
    def setChanged(value: (String, String, js.Object) => Unit): Self = this.set("changed", js.Any.fromFunction3(value))
    
    @scala.inline
    def setConnection(value: Connection): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Error => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStop(value: js.Function => Unit): Self = this.set("onStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReady(value: () => Unit): Self = this.set("ready", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoved(value: (String, String) => Unit): Self = this.set("removed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdNull: Self = this.set("userId", null)
  }
}
