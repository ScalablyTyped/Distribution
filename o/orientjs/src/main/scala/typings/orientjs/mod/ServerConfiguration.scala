package typings.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerConfiguration extends js.Object {
  def get(name: String): String
  def list(): js.Any
  def set(key: String, value: String): String
}

object ServerConfiguration {
  @scala.inline
  def apply(get: String => String, list: () => js.Any, set: (String, String) => String): ServerConfiguration = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction0(list), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[ServerConfiguration]
  }
}

