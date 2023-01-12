package typings.phplint

import typings.grunt.IGrunt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("phplint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearCache(cacheDirName: String, tmpDir: String, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")(cacheDirName.asInstanceOf[js.Any], tmpDir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def clearCache(callback: Callback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def cli(paths: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cli")(paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cli(paths: String, options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cli")(paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cli(paths: js.Array[String], options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cli")(paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cli(paths: js.Array[String], options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cli")(paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def gruntPlugin(grunt: IGrunt): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("gruntPlugin")(grunt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def lint(files: String, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lint")(files.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lint(files: String, options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lint")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lint(files: js.Array[String], callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lint")(files.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lint(files: js.Array[String], options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lint")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Callback = js.Function3[
    /* error */ String, 
    /* stdout */ js.UndefOr[String], 
    /* stderr */ js.UndefOr[String], 
    Unit
  ]
  
  trait Options extends StObject {
    
    var cacheDirName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var phpCmd: js.UndefOr[String] = js.undefined
    
    var stderr: js.UndefOr[Boolean] = js.undefined
    
    var stdout: js.UndefOr[Boolean] = js.undefined
    
    var suppress: js.UndefOr[Boolean] = js.undefined
    
    var tmpDir: js.UndefOr[String] = js.undefined
    
    var useCache: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCacheDirName(value: String): Self = StObject.set(x, "cacheDirName", value.asInstanceOf[js.Any])
      
      inline def setCacheDirNameUndefined: Self = StObject.set(x, "cacheDirName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPhpCmd(value: String): Self = StObject.set(x, "phpCmd", value.asInstanceOf[js.Any])
      
      inline def setPhpCmdUndefined: Self = StObject.set(x, "phpCmd", js.undefined)
      
      inline def setStderr(value: Boolean): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      inline def setStdout(value: Boolean): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
      
      inline def setSuppress(value: Boolean): Self = StObject.set(x, "suppress", value.asInstanceOf[js.Any])
      
      inline def setSuppressUndefined: Self = StObject.set(x, "suppress", js.undefined)
      
      inline def setTmpDir(value: String): Self = StObject.set(x, "tmpDir", value.asInstanceOf[js.Any])
      
      inline def setTmpDirUndefined: Self = StObject.set(x, "tmpDir", js.undefined)
      
      inline def setUseCache(value: Boolean): Self = StObject.set(x, "useCache", value.asInstanceOf[js.Any])
      
      inline def setUseCacheUndefined: Self = StObject.set(x, "useCache", js.undefined)
    }
  }
}
