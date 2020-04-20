package typings.mobxReact.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ trait Mixins extends js.Object {
  var locks: Double
  var methods: js.Array[js.Function]
}

object Mixins {
  @scala.inline
  def apply(locks: Double, methods: js.Array[js.Function]): Mixins = {
    val __obj = js.Dynamic.literal(locks = locks.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mixins]
  }
}

