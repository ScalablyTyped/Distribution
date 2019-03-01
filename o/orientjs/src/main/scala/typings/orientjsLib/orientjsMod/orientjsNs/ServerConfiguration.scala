package typings
package orientjsLib.orientjsMod.orientjsNs

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
    get: js.Function1[java.lang.String, java.lang.String],
    list: js.Function0[js.Any],
    set: js.Function2[java.lang.String, java.lang.String, java.lang.String]
  ): ServerConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[ServerConfiguration]
  }
}

