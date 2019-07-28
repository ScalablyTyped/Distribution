package typings.mfiles.MFilesNs

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IObjID
import typings.mfiles.IObjVer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ObjVer")
@js.native
class ObjVer () extends IObjVer {
  /* CompleteClass */
  override var ID: Double = js.native
  /* CompleteClass */
  override var ObjID: IObjID = js.native
  /* CompleteClass */
  override var Type: Double = js.native
  /* CompleteClass */
  override var Version: Double = js.native
  /* CompleteClass */
  override def Clone(): IObjVer = js.native
  /* CompleteClass */
  override def CloneFrom(ObjVer: IObjVer): Unit = js.native
  /* CompleteClass */
  override def Serialize(): js.Array[Double] = js.native
  /* CompleteClass */
  override def SetIDs(ObjType: Double, ID: Double, Version: Double): Unit = js.native
  /* CompleteClass */
  override def SetObjIDAndVersion(ObjID: IObjID, Version: Double): Unit = js.native
  /* CompleteClass */
  override def ToJSON(): String = js.native
  /* CompleteClass */
  override def Unserialize(Bytes: js.Array[Double]): Unit = js.native
}

@JSGlobal("MFiles.ObjVer")
@js.native
object ObjVer extends Instantiable0[IObjVer]

