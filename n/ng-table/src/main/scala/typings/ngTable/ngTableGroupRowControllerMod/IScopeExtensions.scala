package typings.ngTable.ngTableGroupRowControllerMod

import typings.ngTable.groupingFuncMod.IGroupingFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScopeExtensions[T] extends js.Object {
  @JSName("$selGroup")
  var $selGroup: IGroupingFunc[_] | String = js.native
  @JSName("$selGroupTitle")
  var $selGroupTitle: String = js.native
}

object IScopeExtensions {
  @scala.inline
  def apply[T]($selGroup: IGroupingFunc[_] | String, $selGroupTitle: String): IScopeExtensions[T] = {
    val __obj = js.Dynamic.literal($selGroup = $selGroup.asInstanceOf[js.Any], $selGroupTitle = $selGroupTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScopeExtensions[T]]
  }
  @scala.inline
  implicit class IScopeExtensionsOps[Self <: IScopeExtensions[_], T] (val x: Self with IScopeExtensions[T]) extends AnyVal {
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
    def set$selGroup(value: IGroupingFunc[_] | String): Self = this.set("$selGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def set$selGroupTitle(value: String): Self = this.set("$selGroupTitle", value.asInstanceOf[js.Any])
  }
  
}

