package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ObjVer")
@js.native
class ObjVer ()
  extends mfilesLib.IObjVer {
  /* CompleteClass */
  override var ID: scala.Double = js.native
  /* CompleteClass */
  override var ObjID: mfilesLib.IObjID = js.native
  /* CompleteClass */
  override var Type: scala.Double = js.native
  /* CompleteClass */
  override var Version: scala.Double = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IObjVer = js.native
  /* CompleteClass */
  override def CloneFrom(ObjVer: mfilesLib.IObjVer): scala.Unit = js.native
  /* CompleteClass */
  override def Serialize(): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def SetIDs(ObjType: scala.Double, ID: scala.Double, Version: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def SetObjIDAndVersion(ObjID: mfilesLib.IObjID, Version: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def ToJSON(): java.lang.String = js.native
  /* CompleteClass */
  override def Unserialize(Bytes: js.Array[scala.Double]): scala.Unit = js.native
}

@JSGlobal("MFiles.ObjVer")
@js.native
object ObjVer
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IObjVer]

