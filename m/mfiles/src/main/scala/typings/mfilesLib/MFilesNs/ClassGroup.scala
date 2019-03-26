package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ClassGroup")
@js.native
class ClassGroup ()
  extends mfilesLib.IClassGroup {
  /* CompleteClass */
  override var ID: scala.Double = js.native
  /* CompleteClass */
  override var Members: mfilesLib.IIDs = js.native
  /* CompleteClass */
  override var Name: java.lang.String = js.native
  /* CompleteClass */
  override var ObjectType: MFBuiltInObjectType | scala.Double = js.native
  /* CompleteClass */
  override def AddMember(Member: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IClassGroup = js.native
  /* CompleteClass */
  override def RemoveMember(Member: scala.Double): scala.Unit = js.native
}

