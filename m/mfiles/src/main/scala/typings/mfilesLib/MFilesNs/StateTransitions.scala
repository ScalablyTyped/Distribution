package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.StateTransitions")
@js.native
class StateTransitions ()
  extends mfilesLib.IStateTransitions {
  /* CompleteClass */
  override val Count: scala.Double = js.native
  /* CompleteClass */
  override def Add(Index: scala.Double, StateTransition: mfilesLib.IStateTransition): scala.Unit = js.native
  /* CompleteClass */
  override def Item(Index: scala.Double): mfilesLib.IStateTransition = js.native
  /* CompleteClass */
  override def Remove(Index: scala.Double): scala.Unit = js.native
}

@JSGlobal("MFiles.StateTransitions")
@js.native
object StateTransitions
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IStateTransitions]

