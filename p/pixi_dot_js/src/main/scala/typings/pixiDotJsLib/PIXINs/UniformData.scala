package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniformData[V] extends js.Object {
  // name is set by pixi if uniforms were automatically extracted from shader code, but not used anywhere
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
  var value: V
}

object UniformData {
  @scala.inline
  def apply[V](`type`: java.lang.String, value: V, name: java.lang.String = null): UniformData[V] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[UniformData[V]]
  }
}

