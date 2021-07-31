package typings.mongodbMemoryServerCore

import typings.mongodbMemoryServerCore.getosMod.AnyOS
import typings.mongodbMemoryServerCore.getosMod.LinuxOS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mongoBinaryDownloadUrlMod {
  
  @JSImport("mongodb-memory-server-core/lib/util/MongoBinaryDownloadUrl", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with MongoBinaryDownloadUrl {
    def this(hasPlatformArchVersionOs: MongoBinaryDownloadUrlOpts) = this()
    
    /* CompleteClass */
    var arch: String = js.native
    
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
    
    /* CompleteClass */
    var platform: String = js.native
    
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
    
    /* CompleteClass */
    var version: String = js.native
  }
  
  trait MongoBinaryDownloadUrl extends StObject {
    
    var arch: String
    
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
    
    var os: js.UndefOr[AnyOS] = js.undefined
    
    var platform: String
    
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
    
    var version: String
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
      version: String
    ): MongoBinaryDownloadUrl = {
      val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], getArchiveName = js.Any.fromFunction0(getArchiveName), getArchiveNameLinux = js.Any.fromFunction0(getArchiveNameLinux), getArchiveNameOsx = js.Any.fromFunction0(getArchiveNameOsx), getArchiveNameWin = js.Any.fromFunction0(getArchiveNameWin), getDebianVersionString = js.Any.fromFunction1(getDebianVersionString), getDownloadUrl = js.Any.fromFunction0(getDownloadUrl), getElementaryOSVersionString = js.Any.fromFunction1(getElementaryOSVersionString), getFedoraVersionString = js.Any.fromFunction1(getFedoraVersionString), getLegacyVersionString = js.Any.fromFunction1(getLegacyVersionString), getLinuxOSVersionString = js.Any.fromFunction1(getLinuxOSVersionString), getMintVersionString = js.Any.fromFunction1(getMintVersionString), getRhelVersionString = js.Any.fromFunction1(getRhelVersionString), getSuseVersionString = js.Any.fromFunction1(getSuseVersionString), getUbuntuVersionString = js.Any.fromFunction1(getUbuntuVersionString), platform = platform.asInstanceOf[js.Any], translateArch = js.Any.fromFunction2(translateArch), translatePlatform = js.Any.fromFunction1(translatePlatform), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[MongoBinaryDownloadUrl]
    }
    
    @scala.inline
    implicit class MongoBinaryDownloadUrlMutableBuilder[Self <: MongoBinaryDownloadUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetArchiveName(value: () => js.Promise[String]): Self = StObject.set(x, "getArchiveName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetArchiveNameLinux(value: () => js.Promise[String]): Self = StObject.set(x, "getArchiveNameLinux", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetArchiveNameOsx(value: () => js.Promise[String]): Self = StObject.set(x, "getArchiveNameOsx", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetArchiveNameWin(value: () => js.Promise[String]): Self = StObject.set(x, "getArchiveNameWin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDebianVersionString(value: LinuxOS => String): Self = StObject.set(x, "getDebianVersionString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDownloadUrl(value: () => js.Promise[String]): Self = StObject.set(x, "getDownloadUrl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElementaryOSVersionString(value: LinuxOS => String): Self = StObject.set(x, "getElementaryOSVersionString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFedoraVersionString(value: LinuxOS => String): Self = StObject.set(x, "getFedoraVersionString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetLegacyVersionString(value: AnyOS => String): Self = StObject.set(x, "getLegacyVersionString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetLinuxOSVersionString(value: LinuxOS => String): Self = StObject.set(x, "getLinuxOSVersionString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetMintVersionString(value: LinuxOS => String): Self = StObject.set(x, "getMintVersionString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetRhelVersionString(value: LinuxOS => String): Self = StObject.set(x, "getRhelVersionString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSuseVersionString(value: LinuxOS => String): Self = StObject.set(x, "getSuseVersionString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetUbuntuVersionString(value: LinuxOS => String): Self = StObject.set(x, "getUbuntuVersionString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOs(value: AnyOS): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateArch(value: (String, String) => String): Self = StObject.set(x, "translateArch", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTranslatePlatform(value: String => String): Self = StObject.set(x, "translatePlatform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait MongoBinaryDownloadUrlOpts extends StObject {
    
    var arch: String
    
    var os: js.UndefOr[AnyOS] = js.undefined
    
    var platform: String
    
    var version: String
  }
  object MongoBinaryDownloadUrlOpts {
    
    @scala.inline
    def apply(arch: String, platform: String, version: String): MongoBinaryDownloadUrlOpts = {
      val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[MongoBinaryDownloadUrlOpts]
    }
    
    @scala.inline
    implicit class MongoBinaryDownloadUrlOptsMutableBuilder[Self <: MongoBinaryDownloadUrlOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOs(value: AnyOS): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
