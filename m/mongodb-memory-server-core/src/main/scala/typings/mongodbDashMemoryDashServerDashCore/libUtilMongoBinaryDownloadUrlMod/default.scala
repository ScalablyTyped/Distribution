package typings.mongodbDashMemoryDashServerDashCore.libUtilMongoBinaryDownloadUrlMod

import typings.getos.getosMod.LinuxOs
import typings.getos.getosMod.Os
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
  override def getDebianVersionString(os: Os): String = js.native
  /* CompleteClass */
  override def getDownloadUrl(): js.Promise[String] = js.native
  /* CompleteClass */
  override def getElementaryOSVersionString(os: Os): String = js.native
  /* CompleteClass */
  override def getFedoraVersionString(os: Os): String = js.native
  /* CompleteClass */
  override def getLegacyVersionString(os: Os): String = js.native
  /* CompleteClass */
  override def getLinuxOSVersionString(os: LinuxOs): String = js.native
  /* CompleteClass */
  override def getMintVersionString(os: Os): String = js.native
  /* CompleteClass */
  override def getRhelVersionString(os: Os): String = js.native
  /* CompleteClass */
  override def getSuseVersionString(os: Os): String = js.native
  /* CompleteClass */
  override def getUbuntuVersionString(os: LinuxOs): String = js.native
  /* CompleteClass */
  override def getos(): js.Promise[Os] = js.native
  /* CompleteClass */
  override def translateArch(arch: String, mongoPlatform: String): String = js.native
  /* CompleteClass */
  override def translatePlatform(platform: String): String = js.native
}

