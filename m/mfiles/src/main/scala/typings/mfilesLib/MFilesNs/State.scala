package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.State")
@js.native
class State ()
  extends mfilesLib.IState {
  /* CompleteClass */
  override val ID: scala.Double = js.native
  /* CompleteClass */
  override var Name: java.lang.String = js.native
  /* CompleteClass */
  override var Selectable: scala.Boolean = js.native
  /* CompleteClass */
  override var SelectableFlagAffectedByPseudoUsers: scala.Boolean = js.native
  /* CompleteClass */
  override def GetAsLookup(): mfilesLib.ILookup = js.native
  /* CompleteClass */
  override def GetAsTypedValue(): mfilesLib.ITypedValue = js.native
}

@JSGlobal("MFiles.State")
@js.native
object State
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IState]

