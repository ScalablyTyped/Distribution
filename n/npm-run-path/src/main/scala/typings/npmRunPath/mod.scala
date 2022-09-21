package typings.npmRunPath

import typings.std.Record
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("npm-run-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def npmRunPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("npmRunPath")().asInstanceOf[String]
  inline def npmRunPath(options: RunPathOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("npmRunPath")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def npmRunPathEnv(): ProcessEnv = ^.asInstanceOf[js.Dynamic].applyDynamic("npmRunPathEnv")().asInstanceOf[ProcessEnv]
  inline def npmRunPathEnv(options: EnvOptions): ProcessEnv = ^.asInstanceOf[js.Dynamic].applyDynamic("npmRunPathEnv")(options.asInstanceOf[js.Any]).asInstanceOf[ProcessEnv]
  
  trait EnvOptions extends StObject {
    
    /**
    	The working directory.
    	@default process.cwd()
    	*/
    val cwd: js.UndefOr[String | URL] = js.undefined
    
    /**
    	Accepts an object of environment variables, like `process.env`, and modifies the PATH using the correct [PATH key](https://github.com/sindresorhus/path-key). Use this if you're modifying the PATH for use in the `child_process` options.
    	*/
    val env: js.UndefOr[ProcessEnv] = js.undefined
    
    /**
    	The path to the current Node.js executable. Its directory is pushed to the front of PATH.
    	This can be either an absolute path or a path relative to the `cwd` option.
    	@default process.execPath
    	*/
    val execPath: js.UndefOr[String] = js.undefined
  }
  object EnvOptions {
    
    inline def apply(): EnvOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnvOptions]
    }
    
    extension [Self <: EnvOptions](x: Self) {
      
      inline def setCwd(value: String | URL): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setExecPath(value: String): Self = StObject.set(x, "execPath", value.asInstanceOf[js.Any])
      
      inline def setExecPathUndefined: Self = StObject.set(x, "execPath", js.undefined)
    }
  }
  
  type ProcessEnv = Record[String, js.UndefOr[String]]
  
  trait RunPathOptions extends StObject {
    
    /**
    	Working directory.
    	@default process.cwd()
    	*/
    val cwd: js.UndefOr[String | URL] = js.undefined
    
    /**
    	Path to the Node.js executable to use in child processes if that is different from the current one. Its directory is pushed to the front of PATH.
    	This can be either an absolute path or a path relative to the `cwd` option.
    	@default process.execPath
    	*/
    val execPath: js.UndefOr[String] = js.undefined
    
    /**
    	PATH to be appended. Default: [`PATH`](https://github.com/sindresorhus/path-key).
    	Set it to an empty string to exclude the default PATH.
    	*/
    val path: js.UndefOr[String] = js.undefined
  }
  object RunPathOptions {
    
    inline def apply(): RunPathOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunPathOptions]
    }
    
    extension [Self <: RunPathOptions](x: Self) {
      
      inline def setCwd(value: String | URL): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setExecPath(value: String): Self = StObject.set(x, "execPath", value.asInstanceOf[js.Any])
      
      inline def setExecPathUndefined: Self = StObject.set(x, "execPath", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
