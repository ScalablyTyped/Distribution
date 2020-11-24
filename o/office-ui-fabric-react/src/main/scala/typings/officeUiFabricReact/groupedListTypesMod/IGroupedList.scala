package typings.officeUiFabricReact.groupedListTypesMod

import typings.officeUiFabricReact.listTypesMod.IList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGroupedList extends IList {
  
  /**
    * Toggles the collapsed state of all the groups in the list.
    */
  def toggleCollapseAll(allCollapsed: Boolean): Unit = js.native
}
