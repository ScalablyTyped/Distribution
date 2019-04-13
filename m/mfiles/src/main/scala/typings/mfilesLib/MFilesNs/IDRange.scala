package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.IDRange")
@js.native
class IDRange ()
  extends mfilesLib.IIDRange {
  /* CompleteClass */
  override var MaxID: scala.Double = js.native
  /* CompleteClass */
  override var MaxID_32bit: java.lang.String = js.native
  /* CompleteClass */
  override var MinID: scala.Double = js.native
  /* CompleteClass */
  override var MinID_32bit: java.lang.String = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IIDRange = js.native
  /* CompleteClass */
  override def SetIDs(MinID: scala.Double, MaxID: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def SetIDs_32bit(MinID: java.lang.String, MaxID: java.lang.String): scala.Unit = js.native
}

@JSGlobal("MFiles.IDRange")
@js.native
object IDRange
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IIDRange]

