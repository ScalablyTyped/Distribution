package typings.mongodbDashMemoryDashServerDashCore.libUtilMongoBinaryDownloadUrlMod

import typings.mongodbDashMemoryDashServerDashCore.libUtilGetosMod.AnyOS
import typings.mongodbDashMemoryDashServerDashCore.libUtilGetosMod.LinuxOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb-memory-server-core/lib/util/MongoBinaryDownloadUrl", JSImport.Default)
@js.native
class default protected () extends MongoBinaryDownloadUrl {
  def this(hasPlatformArchVersionOs: MongoBinaryDownloadUrlOpts) = this()
  /* CompleteClass */
  override var arch: String = js.native
  /* CompleteClass */
  override var platform: String = js.native
  /* CompleteClass */
  override var version: String = js.native
  /* CompleteClass */
  override def getArchiveName(): js.Promise[String] = js.native
  /* CompleteClass */
  override def getArchiveNameLinux(): js.Promise[String] = js.native
  /* CompleteClass */
  override def getArchiveNameOsx(): js.Promise[String] = js.native
  /* CompleteClass */
  override def getArchiveNameWin(): js.Promise[String] = js.native
  /* CompleteClass */
  override def getDebianVersionString(os: LinuxOS): String = js.native
  /* CompleteClass */
  override def getDownloadUrl(): js.Promise[String] = js.native
  /* CompleteClass */
  override def getElementaryOSVersionString(os: LinuxOS): String = js.native
  /* CompleteClass */
  override def getFedoraVersionString(os: LinuxOS): String = js.native
  /* CompleteClass */
  override def getLegacyVersionString(os: AnyOS): String = js.native
  /* CompleteClass */
  override def getLinuxOSVersionString(os: LinuxOS): String = js.native
  /* CompleteClass */
  override def getMintVersionString(os: LinuxOS): String = js.native
  /* CompleteClass */
  override def getRhelVersionString(os: LinuxOS): String = js.native
  /* CompleteClass */
  override def getSuseVersionString(os: LinuxOS): String = js.native
  /* CompleteClass */
  override def getUbuntuVersionString(os: LinuxOS): String = js.native
  /* CompleteClass */
  override def translateArch(arch: String, mongoPlatform: String): String = js.native
  /* CompleteClass */
  override def translatePlatform(platform: String): String = js.native
}

