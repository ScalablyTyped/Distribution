package typings.ngDashTable.srcBrowserNgTableGroupRowControllerMod

import typings.ngDashTable.srcCoreGroupingGroupingFuncMod.IGroupingFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScopeExtensions[T] extends js.Object {
  @JSName("$selGroup")
  var $selGroup: IGroupingFunc[_] | String
  @JSName("$selGroupTitle")
  var $selGroupTitle: String
}

object IScopeExtensions {
  @scala.inline
  def apply[T]($selGroup: IGroupingFunc[_] | String, $selGroupTitle: String): IScopeExtensions[T] = {
    val __obj = js.Dynamic.literal($selGroup = $selGroup.asInstanceOf[js.Any], $selGroupTitle = $selGroupTitle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IScopeExtensions[T]]
  }
}

