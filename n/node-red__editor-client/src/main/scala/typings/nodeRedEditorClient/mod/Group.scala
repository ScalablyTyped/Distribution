package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group extends StObject {
  
  def addToGroup(group: js.Object, nodes: js.Array[js.Object]): Unit = js.native
  def addToGroup(group: js.Object, nodes: js.Object): Unit = js.native
  
  def contains(group: js.Object, item: js.Object): Boolean = js.native
  
  def createGroup(nodes: js.Array[js.Object]): js.Object = js.native
  
  var `def`: js.Object = js.native
  
  def getNodes(group: js.Object, recursive: Boolean): js.Array[js.Object] = js.native
  
  def init(): Unit = js.native
  
  def markDirty(group: js.Object): Unit = js.native
  
  def removeFromGroup(group: js.Object, nodes: js.Array[js.Object]): Unit = js.native
  def removeFromGroup(group: js.Object, nodes: js.Array[js.Object], reparent: Boolean): Unit = js.native
  def removeFromGroup(group: js.Object, nodes: js.Object): Unit = js.native
  def removeFromGroup(group: js.Object, nodes: js.Object, reparent: Boolean): Unit = js.native
  
  def ungroup(g: js.Object): js.Array[js.Object] = js.native
}
