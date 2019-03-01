package typings
package mithrilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(key: java.lang.String | scala.Double = null): Anon_Key = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Key]
  }
}

