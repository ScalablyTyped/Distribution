package typings.mongodbMemoryServerCore

import typings.mongodbMemoryServerCore.libUtilGetosMod.AnyOS
import typings.mongodbMemoryServerCore.libUtilGetosMod.LinuxOS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilMongoBinaryDownloadUrlMod {
  
  @JSImport("mongodb-memory-server-core/lib/util/MongoBinaryDownloadUrl", JSImport.Default)
  @js.native
  open class default protected () extends MongoBinaryDownloadUrl {
    def this(opts: MongoBinaryDownloadUrlOpts) = this()
  }
  /* static members */
  object default {
    
    @JSImport("mongodb-memory-server-core/lib/util/MongoBinaryDownloadUrl", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Translate input arch to mongodb useable arch
      * @example
      * x64 -> x86_64
      * @param platform The Platform to translate
      */
    inline def translateArch(arch: String, mongoPlatform: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translateArch")(arch.asInstanceOf[js.Any], mongoPlatform.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/MongoBinaryDownloadUrl", "MongoBinaryDownloadUrl")
  @js.native
  open class MongoBinaryDownloadUrl protected ()
    extends StObject
       with MongoBinaryDownloadUrlOpts {
    def this(opts: MongoBinaryDownloadUrlOpts) = this()
    
    /* CompleteClass */
    var arch: String = js.native
    
    /**
      * Get the version string for Amazon Distro
      * @param os LinuxOS Object
      */
    def getAmazonVersionString(os: LinuxOS): String = js.native
    
    /**
      * Get the archive
      */
    def getArchiveName(): js.Promise[String] = js.native
    
    /**
      * Get the archive for Linux
      * (from: https://www.mongodb.org/dl/linux)
      */
    def getArchiveNameLinux(): js.Promise[String] = js.native
    
    /**
      * Get the archive for OSX (Mac)
      * (from: https://www.mongodb.org/dl/osx)
      */
    def getArchiveNameOsx(): String = js.native
    
    /**
      * Get the archive for Windows
      * (from: https://www.mongodb.org/dl/win32)
      */
    def getArchiveNameWin(): String = js.native
    
    /**
      * Get the version string for Debian
      * @param os LinuxOS Object
      */
    def getDebianVersionString(os: LinuxOS): String = js.native
    
    /**
      * Assemble the URL to download
      * Calls all the necessary functions to determine the URL
      */
    def getDownloadUrl(): js.Promise[String] = js.native
    
    /**
      * Get the version string for Fedora
      * @param os LinuxOS Object
      */
    def getFedoraVersionString(os: LinuxOS): String = js.native
    
    /**
      * Linux Fallback
      */
    def getLegacyVersionString(): String = js.native
    
    /**
      * Get the version string (with distro)
      * @param os LinuxOS Object
      */
    def getLinuxOSVersionString(os: LinuxOS): String = js.native
    
    /**
      * Get the version string for Red Hat Enterprise Linux
      * @param os LinuxOS Object
      */
    def getRhelVersionString(os: LinuxOS): String = js.native
    
    /**
      * Get the version string for Suse / OpenSuse
      * @param os LinuxOS Object
      */
    def getSuseVersionString(os: LinuxOS): String = js.native
    
    /**
      * Get the version string for Ubuntu
      * @param os LinuxOS Object
      */
    def getUbuntuVersionString(os: LinuxOS): String = js.native
    
    /* CompleteClass */
    var platform: String = js.native
    
    /**
      * Translate input platform to mongodb useable platform
      * @example
      * darwin -> osx
      * @param platform The Platform to translate
      */
    def translatePlatform(platform: String): String = js.native
    
    /* CompleteClass */
    var version: String = js.native
  }
  /* static members */
  object MongoBinaryDownloadUrl {
    
    @JSImport("mongodb-memory-server-core/lib/util/MongoBinaryDownloadUrl", "MongoBinaryDownloadUrl")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Translate input arch to mongodb useable arch
      * @example
      * x64 -> x86_64
      * @param platform The Platform to translate
      */
    inline def translateArch(arch: String, mongoPlatform: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translateArch")(arch.asInstanceOf[js.Any], mongoPlatform.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  trait MongoBinaryDownloadUrlOpts extends StObject {
    
    var arch: String
    
    var os: js.UndefOr[AnyOS] = js.undefined
    
    var platform: String
    
    var version: String
  }
  object MongoBinaryDownloadUrlOpts {
    
    inline def apply(arch: String, platform: String, version: String): MongoBinaryDownloadUrlOpts = {
      val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[MongoBinaryDownloadUrlOpts]
    }
    
    extension [Self <: MongoBinaryDownloadUrlOpts](x: Self) {
      
      inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setOs(value: AnyOS): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
