package typings.meteor.meteorMeteorMod

import typings.meteor.meteorMeteorMod.Meteor.Connection
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  var connection: Connection
  var userId: String
  def added(collection: String, id: String, fields: js.Object): Unit
  def changed(collection: String, id: String, fields: js.Object): Unit
  def error(error: Error): Unit
  def onStop(func: js.Function): Unit
  def ready(): Unit
  def removed(collection: String, id: String): Unit
  def stop(): Unit
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
    stop: () => Unit,
    userId: String
  ): Subscription = {
    val __obj = js.Dynamic.literal(added = js.Any.fromFunction3(added), changed = js.Any.fromFunction3(changed), connection = connection, error = js.Any.fromFunction1(error), onStop = js.Any.fromFunction1(onStop), ready = js.Any.fromFunction0(ready), removed = js.Any.fromFunction2(removed), stop = js.Any.fromFunction0(stop), userId = userId)
  
    __obj.asInstanceOf[Subscription]
  }
}

