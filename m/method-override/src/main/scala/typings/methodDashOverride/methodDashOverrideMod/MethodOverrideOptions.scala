package typings.methodDashOverride.methodDashOverrideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodOverrideOptions extends js.Object {
  var methods: js.Array[String]
}

object MethodOverrideOptions {
  @scala.inline
  def apply(methods: js.Array[String]): MethodOverrideOptions = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MethodOverrideOptions]
  }
}

