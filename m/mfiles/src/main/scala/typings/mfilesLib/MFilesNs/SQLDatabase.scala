package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.SQLDatabase")
@js.native
class SQLDatabase ()
  extends mfilesLib.ISQLDatabase {
  /* CompleteClass */
  override var AdminUser: mfilesLib.IImpersonation = js.native
  /* CompleteClass */
  override var BasicUser: mfilesLib.IImpersonation = js.native
  /* CompleteClass */
  override var Engine: MFDBEngine = js.native
  /* CompleteClass */
  override var Name: java.lang.String = js.native
  /* CompleteClass */
  override var Server: java.lang.String = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.ISQLDatabase = js.native
}

