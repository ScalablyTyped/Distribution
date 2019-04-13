package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.IndirectPropertyID")
@js.native
class IndirectPropertyID ()
  extends mfilesLib.IIndirectPropertyID {
  /* CompleteClass */
  override val Count: scala.Double = js.native
  /* CompleteClass */
  override def Add(Index: scala.Double, IndirectPropertyIDLevel: mfilesLib.IIndirectPropertyIDLevel): scala.Unit = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IIndirectPropertyID = js.native
  /* CompleteClass */
  override def EqualTo(IndirectPropertyID: mfilesLib.IIndirectPropertyID): scala.Boolean = js.native
  /* CompleteClass */
  override def Item(Index: scala.Double): mfilesLib.IIndirectPropertyIDLevel = js.native
  /* CompleteClass */
  override def Remove(Index: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def ToJSON(): java.lang.String = js.native
}

@JSGlobal("MFiles.IndirectPropertyID")
@js.native
object IndirectPropertyID
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IIndirectPropertyID]

