package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ObjID")
@js.native
class ObjID ()
  extends mfilesLib.IObjID {
  /* CompleteClass */
  override var ID: scala.Double = js.native
  /* CompleteClass */
  override var Type: scala.Double = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IObjID = js.native
  /* CompleteClass */
  override def CloneFrom(ObjID: mfilesLib.IObjID): scala.Unit = js.native
  /* CompleteClass */
  override def Serialize(): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def SetIDs(ObjType: scala.Double, ID: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def ToJSON(): java.lang.String = js.native
  /* CompleteClass */
  override def Unserialize(Bytes: js.Array[scala.Double]): scala.Unit = js.native
}

@JSGlobal("MFiles.ObjID")
@js.native
object ObjID
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IObjID]

