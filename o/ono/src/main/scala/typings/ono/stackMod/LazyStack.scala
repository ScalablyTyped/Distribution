package typings.ono.stackMod

import typings.ono.onoBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Property Descriptor of a lazily-computed `stack` property.
  */
trait LazyStack extends js.Object {
  var configurable: `true`
  /**
    * Lazily computes the error's stack trace.
    */
  def get(): js.UndefOr[String]
}

object LazyStack {
  @scala.inline
  def apply(configurable: `true`, get: () => js.UndefOr[String]): LazyStack = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], get = js.Any.fromFunction0(get))
  
    __obj.asInstanceOf[LazyStack]
  }
}

