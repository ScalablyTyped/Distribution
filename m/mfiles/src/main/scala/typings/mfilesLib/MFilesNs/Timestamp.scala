package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.Timestamp")
@js.native
class Timestamp ()
  extends mfilesLib.ITimestamp {
  /* CompleteClass */
  override var Day: scala.Double = js.native
  /* CompleteClass */
  override var Fraction: scala.Double = js.native
  /* CompleteClass */
  override var Hour: scala.Double = js.native
  /* CompleteClass */
  override var Minute: scala.Double = js.native
  /* CompleteClass */
  override var Month: scala.Double = js.native
  /* CompleteClass */
  override var Second: scala.Double = js.native
  /* CompleteClass */
  override var Year: scala.Double = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.ITimestamp = js.native
  /* CompleteClass */
  override def GetValue(): js.Any = js.native
  /* CompleteClass */
  override def LocalTimeToUtc(): mfilesLib.ITimestamp = js.native
  /* CompleteClass */
  override def SetValue(Value: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def UtcToLocalTime(): mfilesLib.ITimestamp = js.native
}

@JSGlobal("MFiles.Timestamp")
@js.native
object Timestamp
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.ITimestamp]

