package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.nodeRedEditorClientBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Workspaces extends StObject {
  
  def active(): js.Object = js.native
  
  def add(ws: js.Object, skipHistoryEntry: Boolean, targetIndex: Double): js.Object = js.native
  @JSName("add")
  def add_false(ws: `false`, skipHistoryEntry: Boolean, targetIndex: Double): js.Object = js.native
  
  def contains(id: String): Boolean = js.native
  
  def count(): Double = js.native
  
  def disable(id: String): Unit = js.native
  
  def edit(id: String): Unit = js.native
  
  def enable(id: String): Unit = js.native
  
  def init(): Unit = js.native
  
  def order(order: js.Array[String]): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def remove(ws: js.Object): Unit = js.native
  
  def resize(): Unit = js.native
  
  def selection(): js.Array[js.Object] = js.native
  
  def show(id: String): Unit = js.native
}
