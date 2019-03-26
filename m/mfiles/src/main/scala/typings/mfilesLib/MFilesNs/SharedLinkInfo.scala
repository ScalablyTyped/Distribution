package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.SharedLinkInfo")
@js.native
class SharedLinkInfo ()
  extends mfilesLib.ISharedLinkInfo {
  /* CompleteClass */
  override val AccessKey: java.lang.String = js.native
  /* CompleteClass */
  override val CreatedByUser: scala.Double = js.native
  /* CompleteClass */
  override val CreationTime: mfilesLib.ITimestamp = js.native
  /* CompleteClass */
  override var Description: java.lang.String = js.native
  /* CompleteClass */
  override var ExpirationTime: mfilesLib.ITimestamp = js.native
  /* CompleteClass */
  override var FileVer: mfilesLib.IFileVer = js.native
  /* CompleteClass */
  override var ObjVer: mfilesLib.IObjVer = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.ISharedLinkInfo = js.native
  /* CompleteClass */
  override def Set(ObjVer: mfilesLib.IObjVer, FileVer: mfilesLib.IFileVer): scala.Unit = js.native
}

