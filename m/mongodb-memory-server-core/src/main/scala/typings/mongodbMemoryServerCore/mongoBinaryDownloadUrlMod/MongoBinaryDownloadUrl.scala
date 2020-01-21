package typings.mongodbMemoryServerCore.mongoBinaryDownloadUrlMod

import typings.mongodbMemoryServerCore.getosMod.AnyOS
import typings.mongodbMemoryServerCore.getosMod.LinuxOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoBinaryDownloadUrl extends js.Object {
  var arch: String
  var os: js.UndefOr[AnyOS] = js.undefined
  var platform: String
  var version: String
  /**
    * Get the archive
    * Version independent
    */
  def getArchiveName(): js.Promise[String]
  /**
    * Get the archive for Linux
    * (from: https://www.mongodb.org/dl/linux)
    */
  def getArchiveNameLinux(): js.Promise[String]
  /**
    * Get the archive for OSX (Mac)
    * (from: https://www.mongodb.org/dl/osx)
    */
  def getArchiveNameOsx(): js.Promise[String]
  /**
    * Get the archive for Windows
    * (from: https://www.mongodb.org/dl/win32)
    */
  def getArchiveNameWin(): js.Promise[String]
  /**
    * Get the version string for Debain
    * @param os LinuxOS Object
    */
  def getDebianVersionString(os: LinuxOS): String
  /**
    * Assemble the URL to download
    * Calls all the necessary functions to determine the URL
    */
  def getDownloadUrl(): js.Promise[String]
  /**
    * Get the version string for ElementaryOS
    * @param os LinuxOS Object
    */
  def getElementaryOSVersionString(os: LinuxOS): String
  /**
    * Get the version string for Fedora
    * @param os LinuxOS Object
    */
  def getFedoraVersionString(os: LinuxOS): String
  /**
    * Linux Fallback
    * @param os LinuxOS Object
    */
  def getLegacyVersionString(os: AnyOS): String
  /**
    * Get the version string (with distro)
    * @param os LinuxOS Object
    */
  def getLinuxOSVersionString(os: LinuxOS): String
  /**
    * Get the version string for Linux Mint
    * @param os LinuxOS Object
    */
  def getMintVersionString(os: LinuxOS): String
  /**
    * Get the version string for Red Hat Enterprise Linux
    * @param os LinuxOS Object
    */
  def getRhelVersionString(os: LinuxOS): String
  /**
    * Get the version string for Suse / OpenSuse
    * @param os LinuxOS Object
    */
  def getSuseVersionString(os: LinuxOS): String
  /**
    * Get the version string for Ubuntu
    * @param os LinuxOS Object
    */
  def getUbuntuVersionString(os: LinuxOS): String
  /**
    * Translate input arch to mongodb useable arch
    * @example
    * x64 -> x86_64
    * @param platform The Platform to translate
    */
  def translateArch(arch: String, mongoPlatform: String): String
  /**
    * Translate input platform to mongodb useable platfrom
    * @example
    * darwin -> osx
    * @param platform The Platform to translate
    */
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

