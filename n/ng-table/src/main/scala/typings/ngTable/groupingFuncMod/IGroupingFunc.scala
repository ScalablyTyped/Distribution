package typings.ngTable.groupingFuncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGroupingFunc[T] extends js.Object {
  
  def apply(item: T): String = js.native
  
  /**
    * leave undefined to let the value of `ISettings.groupOptions.defaultSort` apply
    */
  var sortDirection: js.UndefOr[GroupSort] = js.native
  
  var title: js.UndefOr[String] = js.native
}
