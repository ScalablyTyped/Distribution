package typings.mixpanelBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group extends js.Object {
  
  def remove(list_name: String, value: String): Group = js.native
  def remove(list_name: String, value: String, callback: Callback): Group = js.native
  
  def set(prop: String): Group = js.native
  def set(prop: String, to: js.UndefOr[String]): Group = js.native
  def set(prop: String, to: js.UndefOr[String], callback: Callback): Group = js.native
  def set(prop: Dict): Group = js.native
  def set(prop: Dict, to: js.UndefOr[String]): Group = js.native
  def set(prop: Dict, to: js.UndefOr[String], callback: Callback): Group = js.native
  
  def setOnce(prop: String): Group = js.native
  def setOnce(prop: String, to: js.UndefOr[String]): Group = js.native
  def setOnce(prop: String, to: js.UndefOr[String], callback: Callback): Group = js.native
  def setOnce(prop: Dict): Group = js.native
  def setOnce(prop: Dict, to: js.UndefOr[String]): Group = js.native
  def setOnce(prop: Dict, to: js.UndefOr[String], callback: Callback): Group = js.native
  
  def union(list_name: String, values: js.Array[String | Double]): Group = js.native
  def union(list_name: String, values: js.Array[String | Double], callback: Callback): Group = js.native
  
  def unset(prop: String): Unit = js.native
  def unset(prop: String, callback: Callback): Unit = js.native
}
