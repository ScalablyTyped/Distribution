package typings.multiselect

import typings.multiselect.multiselectStrings.addOption
import typings.multiselect.multiselectStrings.deselect
import typings.multiselect.multiselectStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def multiSelect(): JQuery = js.native
  def multiSelect(methodOrOptions: Method): JQuery = js.native
  def multiSelect(methodOrOptions: Options): JQuery = js.native
  @JSName("multiSelect")
  def multiSelect_addOption(method: addOption, addOption: AddOption): JQuery = js.native
  @JSName("multiSelect")
  def multiSelect_deselect(method: deselect): JQuery = js.native
  @JSName("multiSelect")
  def multiSelect_deselect(method: deselect, options: String): JQuery = js.native
  @JSName("multiSelect")
  def multiSelect_deselect(method: deselect, options: js.Array[_]): JQuery = js.native
  @JSName("multiSelect")
  def multiSelect_select(method: select): JQuery = js.native
  @JSName("multiSelect")
  def multiSelect_select(method: select, options: String): JQuery = js.native
  @JSName("multiSelect")
  def multiSelect_select(method: select, options: js.Array[_]): JQuery = js.native
}
