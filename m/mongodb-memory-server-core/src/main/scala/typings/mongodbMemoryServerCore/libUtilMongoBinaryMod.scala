package typings.mongodbMemoryServerCore

import typings.mongodbMemoryServerCore.anon.RequiredMongoBinaryOpts
import typings.mongodbMemoryServerCore.libUtilDryMongoBinaryMod.BaseDryMongoBinaryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilMongoBinaryMod {
  
  @JSImport("mongodb-memory-server-core/lib/util/MongoBinary", JSImport.Default)
  @js.native
  open class default () extends MongoBinary
  /* static members */
  object default {
    
    @JSImport("mongodb-memory-server-core/lib/util/MongoBinary", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Probe download path and download the binary
      * @param options Options Configuring which binary to download and to which path
      * @returns The BinaryPath the binary has been downloaded to
      */
    inline def download(options: RequiredMongoBinaryOpts): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("download")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    /**
      * Probe all supported paths for an binary and return the binary path
      * @param opts Options configuring which binary to search for
      * @throws {Error} if no valid BinaryPath has been found
      * @returns The first found BinaryPath
      */
    inline def getPath(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")().asInstanceOf[js.Promise[String]]
    inline def getPath(opts: MongoBinaryOpts): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/MongoBinary", "MongoBinary")
  @js.native
  open class MongoBinary () extends StObject
  /* static members */
  object MongoBinary {
    
    @JSImport("mongodb-memory-server-core/lib/util/MongoBinary", "MongoBinary")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Probe download path and download the binary
      * @param options Options Configuring which binary to download and to which path
      * @returns The BinaryPath the binary has been downloaded to
      */
    inline def download(options: RequiredMongoBinaryOpts): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("download")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    /**
      * Probe all supported paths for an binary and return the binary path
      * @param opts Options configuring which binary to search for
      * @throws {Error} if no valid BinaryPath has been found
      * @returns The first found BinaryPath
      */
    inline def getPath(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")().asInstanceOf[js.Promise[String]]
    inline def getPath(opts: MongoBinaryOpts): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  }
  
  trait MongoBinaryOpts
    extends StObject
       with BaseDryMongoBinaryOptions {
    
    var checkMD5: js.UndefOr[Boolean] = js.undefined
  }
  object MongoBinaryOpts {
    
    inline def apply(): MongoBinaryOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MongoBinaryOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MongoBinaryOpts] (val x: Self) extends AnyVal {
      
      inline def setCheckMD5(value: Boolean): Self = StObject.set(x, "checkMD5", value.asInstanceOf[js.Any])
      
      inline def setCheckMD5Undefined: Self = StObject.set(x, "checkMD5", js.undefined)
    }
  }
}
