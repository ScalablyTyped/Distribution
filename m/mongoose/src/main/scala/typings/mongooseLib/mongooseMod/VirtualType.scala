package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section virtualtype.js
  * http://mongoosejs.com/docs/api.html#virtualtype-js
  */
trait VirtualType extends js.Object {
  /** Applies getters to value using optional scope. */
  def applyGetters(value: js.Any, scope: js.Any): js.Any
  /** Applies setters to value using optional scope. */
  def applySetters(value: js.Any, scope: js.Any): js.Any
  /** Defines a getter. */
  def get(fn: js.Function): this.type
  /** Defines a setter. */
  def set(fn: js.Function): this.type
}

object VirtualType {
  @scala.inline
  def apply(
    applyGetters: js.Function2[js.Any, js.Any, js.Any],
    applySetters: js.Function2[js.Any, js.Any, js.Any],
    get: js.Function1[js.Function, VirtualType],
    set: js.Function1[js.Function, VirtualType]
  ): VirtualType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applyGetters")(applyGetters)
    __obj.updateDynamic("applySetters")(applySetters)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[VirtualType]
  }
}

