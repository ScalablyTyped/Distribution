package typings.mongodbMemoryServerCore.mongoBinaryDownloadUrlMod

import typings.mongodbMemoryServerCore.getosMod.AnyOS
import typings.mongodbMemoryServerCore.getosMod.LinuxOS
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
  /**
    * Get the archive
    * Version independent
    */
  /* CompleteClass */
  override def getArchiveName(): js.Promise[String] = js.native
  /**
    * Get the archive for Linux
    * (from: https://www.mongodb.org/dl/linux)
    */
  /* CompleteClass */
  override def getArchiveNameLinux(): js.Promise[String] = js.native
  /**
    * Get the archive for OSX (Mac)
    * (from: https://www.mongodb.org/dl/osx)
    */
  /* CompleteClass */
  override def getArchiveNameOsx(): js.Promise[String] = js.native
  /**
    * Get the archive for Windows
    * (from: https://www.mongodb.org/dl/win32)
    */
  /* CompleteClass */
  override def getArchiveNameWin(): js.Promise[String] = js.native
  /**
    * Get the version string for Debain
    * @param os LinuxOS Object
    */
  /* CompleteClass */
  override def getDebianVersionString(os: LinuxOS): String = js.native
  /**
    * Assemble the URL to download
    * Calls all the necessary functions to determine the URL
    */
  /* CompleteClass */
  override def getDownloadUrl(): js.Promise[String] = js.native
  /**
    * Get the version string for ElementaryOS
    * @param os LinuxOS Object
    */
  /* CompleteClass */
  override def getElementaryOSVersionString(os: LinuxOS): String = js.native
  /**
    * Get the version string for Fedora
    * @param os LinuxOS Object
    */
  /* CompleteClass */
  override def getFedoraVersionString(os: LinuxOS): String = js.native
  /**
    * Linux Fallback
    * @param os LinuxOS Object
    */
  /* CompleteClass */
  override def getLegacyVersionString(os: AnyOS): String = js.native
  /**
    * Get the version string (with distro)
    * @param os LinuxOS Object
    */
  /* CompleteClass */
  override def getLinuxOSVersionString(os: LinuxOS): String = js.native
  /**
    * Get the version string for Linux Mint
    * @param os LinuxOS Object
    */
  /* CompleteClass */
  override def getMintVersionString(os: LinuxOS): String = js.native
  /**
    * Get the version string for Red Hat Enterprise Linux
    * @param os LinuxOS Object
    */
  /* CompleteClass */
  override def getRhelVersionString(os: LinuxOS): String = js.native
  /**
    * Get the version string for Suse / OpenSuse
    * @param os LinuxOS Object
    */
  /* CompleteClass */
  override def getSuseVersionString(os: LinuxOS): String = js.native
  /**
    * Get the version string for Ubuntu
    * @param os LinuxOS Object
    */
  /* CompleteClass */
  override def getUbuntuVersionString(os: LinuxOS): String = js.native
  /**
    * Translate input arch to mongodb useable arch
    * @example
    * x64 -> x86_64
    * @param platform The Platform to translate
    */
  /* CompleteClass */
  override def translateArch(arch: String, mongoPlatform: String): String = js.native
  /**
    * Translate input platform to mongodb useable platfrom
    * @example
    * darwin -> osx
    * @param platform The Platform to translate
    */
  /* CompleteClass */
  override def translatePlatform(platform: String): String = js.native
}

