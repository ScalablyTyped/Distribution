package typings.mongodbDashMemoryDashServerDashCore.libUtilMongoBinaryDownloadUrlMod

import typings.mongodbDashMemoryDashServerDashCore.libUtilGetosMod.AnyOS
import typings.mongodbDashMemoryDashServerDashCore.libUtilGetosMod.LinuxOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoBinaryDownloadUrl extends js.Object {
  var arch: String
  var os: js.UndefOr[AnyOS] = js.undefined
  var platform: String
  var version: String
  def getArchiveName(): js.Promise[String]
  def getArchiveNameLinux(): js.Promise[String]
  def getArchiveNameOsx(): js.Promise[String]
  def getArchiveNameWin(): js.Promise[String]
  def getDebianVersionString(os: LinuxOS): String
  def getDownloadUrl(): js.Promise[String]
  def getElementaryOSVersionString(os: LinuxOS): String
  def getFedoraVersionString(os: LinuxOS): String
  def getLegacyVersionString(os: AnyOS): String
  def getLinuxOSVersionString(os: LinuxOS): String
  def getMintVersionString(os: LinuxOS): String
  def getRhelVersionString(os: LinuxOS): String
  def getSuseVersionString(os: LinuxOS): String
  def getUbuntuVersionString(os: LinuxOS): String
  def translateArch(arch: String, mongoPlatform: String): String
  def translatePlatform(platform: String): String
}

object MongoBinaryDownloadUrl {
  @scala.inline
  def apply(
    arch: String,
    getArchiveName: () => js.Promise[String],
    getArchiveNameLinux: () => js.Promise[String],
    getArchiveNameOsx: () => js.Promise[String],
    getArchiveNameWin: () => js.Promise[String],
    getDebianVersionString: LinuxOS => String,
    getDownloadUrl: () => js.Promise[String],
    getElementaryOSVersionString: LinuxOS => String,
    getFedoraVersionString: LinuxOS => String,
    getLegacyVersionString: AnyOS => String,
    getLinuxOSVersionString: LinuxOS => String,
    getMintVersionString: LinuxOS => String,
    getRhelVersionString: LinuxOS => String,
    getSuseVersionString: LinuxOS => String,
    getUbuntuVersionString: LinuxOS => String,
    platform: String,
    translateArch: (String, String) => String,
    translatePlatform: String => String,
    version: String,
    os: AnyOS = null
  ): MongoBinaryDownloadUrl = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], getArchiveName = js.Any.fromFunction0(getArchiveName), getArchiveNameLinux = js.Any.fromFunction0(getArchiveNameLinux), getArchiveNameOsx = js.Any.fromFunction0(getArchiveNameOsx), getArchiveNameWin = js.Any.fromFunction0(getArchiveNameWin), getDebianVersionString = js.Any.fromFunction1(getDebianVersionString), getDownloadUrl = js.Any.fromFunction0(getDownloadUrl), getElementaryOSVersionString = js.Any.fromFunction1(getElementaryOSVersionString), getFedoraVersionString = js.Any.fromFunction1(getFedoraVersionString), getLegacyVersionString = js.Any.fromFunction1(getLegacyVersionString), getLinuxOSVersionString = js.Any.fromFunction1(getLinuxOSVersionString), getMintVersionString = js.Any.fromFunction1(getMintVersionString), getRhelVersionString = js.Any.fromFunction1(getRhelVersionString), getSuseVersionString = js.Any.fromFunction1(getSuseVersionString), getUbuntuVersionString = js.Any.fromFunction1(getUbuntuVersionString), platform = platform.asInstanceOf[js.Any], translateArch = js.Any.fromFunction2(translateArch), translatePlatform = js.Any.fromFunction1(translatePlatform), version = version.asInstanceOf[js.Any])
    if (os != null) __obj.updateDynamic("os")(os.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoBinaryDownloadUrl]
  }
}

