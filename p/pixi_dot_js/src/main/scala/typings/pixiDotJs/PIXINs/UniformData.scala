package typings.pixiDotJs.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniformData[V] extends js.Object {
  // name is set by pixi if uniforms were automatically extracted from shader code, but not used anywhere
  var name: js.UndefOr[String] = js.undefined
  var `type`: String
  var value: V
}

object UniformData {
  @scala.inline
  def apply[V](`type`: String, value: V, name: String = null): UniformData[V] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[UniformData[V]]
  }
}

