package typings
package orientjsLib.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerConfiguration extends js.Object {
  def get(name: java.lang.String): java.lang.String
  def list(): js.Any
  def set(key: java.lang.String, value: java.lang.String): java.lang.String
}

object ServerConfiguration {
  @scala.inline
  def apply(
    get: java.lang.String => java.lang.String,
    list: () => js.Any,
    set: (java.lang.String, java.lang.String) => java.lang.String
  ): ServerConfiguration = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction0(list), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[ServerConfiguration]
  }
}

