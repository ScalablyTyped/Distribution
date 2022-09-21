package typings.multiselect

import typings.multiselect.multiselectStrings.addOption
import typings.multiselect.multiselectStrings.deselect
import typings.multiselect.multiselectStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def multiSelect(): JQuery = js.native
  def multiSelect(methodOrOptions: Method): JQuery = js.native
  def multiSelect(methodOrOptions: Options): JQuery = js.native
  def multiSelect(method: select | deselect): JQuery = js.native
  def multiSelect(method: select | deselect, options: String): JQuery = js.native
  def multiSelect(method: select | deselect, options: js.Array[Any]): JQuery = js.native
  @JSName("multiSelect")
  def multiSelect_addOption(method: addOption, addOption: AddOption): JQuery = js.native
}
