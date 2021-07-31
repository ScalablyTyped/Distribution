package typings.mongodbMemoryServerCore

import org.scalablytyped.runtime.StringDictionary
import typings.mongodbMemoryServerCore.anon.RequiredMongoBinaryOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mongoBinaryMod {
  
  @JSImport("mongodb-memory-server-core/lib/util/MongoBinary", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with MongoBinary
  /* static members */
  object default {
    
    @JSImport("mongodb-memory-server-core/lib/util/MongoBinary", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mongodb-memory-server-core/lib/util/MongoBinary", "default.cache")
    @js.native
    def cache: MongoBinaryCache = js.native
    @scala.inline
    def cache_=(x: MongoBinaryCache): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
    
    /**
      * Check if specified version already exists in the cache
      * @param version The Version to check for
      */
    @scala.inline
    def getCachePath(version: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCachePath")(version.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Probe download path and download the binary
      * @param options Options Configuring which binary to download and to which path
      * @returns The BinaryPath the binary has been downloaded to
      */
    @scala.inline
    def getDownloadPath(options: RequiredMongoBinaryOpts): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDownloadPath")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    /**
      * Probe all supported paths for an binary and return the binary path
      * @param opts Options configuring which binary to search for
      * @throws {Error} if no valid BinaryPath has been found
      * @return The first found BinaryPath
      */
    @scala.inline
    def getPath(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")().asInstanceOf[js.Promise[String]]
    @scala.inline
    def getPath(opts: MongoBinaryOpts): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    /**
      * Probe if the provided "systemBinary" is an existing path
      * @param systemBinary The Path to probe for an System-Binary
      * @return System Binary path or empty string
      */
    @scala.inline
    def getSystemPath(systemBinary: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSystemPath")(systemBinary.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/MongoBinary", "LATEST_VERSION")
  @js.native
  val LATEST_VERSION: String = js.native
  
  trait MongoBinary extends StObject
  
  type MongoBinaryCache = StringDictionary[String]
  
  trait MongoBinaryOpts extends StObject {
    
    var arch: js.UndefOr[String] = js.undefined
    
    var checkMD5: js.UndefOr[Boolean] = js.undefined
    
    var downloadDir: js.UndefOr[String] = js.undefined
    
    var platform: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object MongoBinaryOpts {
    
    @scala.inline
    def apply(): MongoBinaryOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MongoBinaryOpts]
    }
    
    @scala.inline
    implicit class MongoBinaryOptsMutableBuilder[Self <: MongoBinaryOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
      
      @scala.inline
      def setCheckMD5(value: Boolean): Self = StObject.set(x, "checkMD5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckMD5Undefined: Self = StObject.set(x, "checkMD5", js.undefined)
      
      @scala.inline
      def setDownloadDir(value: String): Self = StObject.set(x, "downloadDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadDirUndefined: Self = StObject.set(x, "downloadDir", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
