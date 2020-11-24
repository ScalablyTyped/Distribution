package typings.mobxStateTree.mstOperationsMod

import typings.mobxStateTree.jsonPatchMod.IJsonPatch
import typings.mobxStateTree.nodeUtilsMod.IAnyStateTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPatchRecorder extends js.Object {
  
  var inversePatches: js.Array[IJsonPatch] = js.native
  
  var patches: js.Array[IJsonPatch] = js.native
  
  val recording: Boolean = js.native
  
  def replay(): Unit = js.native
  def replay(target: IAnyStateTreeNode): Unit = js.native
  
  def resume(): Unit = js.native
  
  var reversedInversePatches: js.Array[IJsonPatch] = js.native
  
  def stop(): Unit = js.native
  
  def undo(): Unit = js.native
  def undo(target: IAnyStateTreeNode): Unit = js.native
}
