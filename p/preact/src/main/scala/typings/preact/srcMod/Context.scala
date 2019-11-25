package typings.preact.srcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context[T] extends js.Object {
  var Consumer: typings.preact.srcMod.Consumer[T]
  var Provider: typings.preact.srcMod.Provider[T]
}

object Context {
  @scala.inline
  def apply[T](Consumer: Consumer[T], Provider: Provider[T]): Context[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Context[T]]
  }
}

