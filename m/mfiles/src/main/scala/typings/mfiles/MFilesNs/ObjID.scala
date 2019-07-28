package typings.mfiles.MFilesNs

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IObjID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ObjID")
@js.native
class ObjID () extends IObjID {
  /* CompleteClass */
  override var ID: Double = js.native
  /* CompleteClass */
  override var Type: Double = js.native
  /* CompleteClass */
  override def Clone(): IObjID = js.native
  /* CompleteClass */
  override def CloneFrom(ObjID: IObjID): Unit = js.native
  /* CompleteClass */
  override def Serialize(): js.Array[Double] = js.native
  /* CompleteClass */
  override def SetIDs(ObjType: Double, ID: Double): Unit = js.native
  /* CompleteClass */
  override def ToJSON(): String = js.native
  /* CompleteClass */
  override def Unserialize(Bytes: js.Array[Double]): Unit = js.native
}

@JSGlobal("MFiles.ObjID")
@js.native
object ObjID extends Instantiable0[IObjID]

