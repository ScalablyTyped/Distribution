package typings.mobxReact.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ @js.native
trait Mixins extends js.Object {
  var locks: Double = js.native
  var methods: js.Array[js.Function] = js.native
}

object Mixins {
  @scala.inline
  def apply(locks: Double, methods: js.Array[js.Function]): Mixins = {
    val __obj = js.Dynamic.literal(locks = locks.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mixins]
  }
  @scala.inline
  implicit class MixinsOps[Self <: Mixins] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLocks(value: Double): Self = this.set("locks", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethodsVarargs(value: js.Function*): Self = this.set("methods", js.Array(value :_*))
    @scala.inline
    def setMethods(value: js.Array[js.Function]): Self = this.set("methods", value.asInstanceOf[js.Any])
  }
  
}

