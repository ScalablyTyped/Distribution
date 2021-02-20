package typings.npmRunPath

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get your [PATH](https://en.wikipedia.org/wiki/PATH_(variable)) prepended with locally installed binaries.
  	@returns The augmented path string.
  	@example
  	```
  	import * as childProcess from 'child_process';
  	import npmRunPath = require('npm-run-path');
  	console.log(process.env.PATH);
  	//=> '/usr/local/bin'
  	console.log(npmRunPath());
  	//=> '/Users/sindresorhus/dev/foo/node_modules/.bin:/Users/sindresorhus/dev/node_modules/.bin:/Users/sindresorhus/node_modules/.bin:/Users/node_modules/.bin:/node_modules/.bin:/usr/local/bin'
  	// `foo` is a locally installed binary
  	childProcess.execFileSync('foo', {
  		env: npmRunPath.env()
  	});
  	```
  	*/
  @JSImport("npm-run-path", JSImport.Namespace)
  @js.native
  def apply(): String = js.native
  @JSImport("npm-run-path", JSImport.Namespace)
  @js.native
  def apply(options: RunPathOptions): String = js.native
  
  @JSImport("npm-run-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release
  @JSImport("npm-run-path", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof npmRunPath */ js.Any = js.native
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof npmRunPath */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  /**
  	@returns The augmented [`process.env`](https://nodejs.org/api/process.html#process_process_env) object.
  	*/
  @JSImport("npm-run-path", "env")
  @js.native
  def env(): ProcessEnv = js.native
  @JSImport("npm-run-path", "env")
  @js.native
  def env(options: EnvOptions): ProcessEnv = js.native
  
  @js.native
  trait EnvOptions extends StObject {
    
    /**
    		Working directory.
    		@default process.cwd()
    		*/
    val cwd: js.UndefOr[String] = js.native
    
    /**
    		Accepts an object of environment variables, like `process.env`, and modifies the PATH using the correct [PATH key](https://github.com/sindresorhus/path-key). Use this if you're modifying the PATH for use in the `child_process` options.
    		*/
    val env: js.UndefOr[ProcessEnv] = js.native
    
    /**
    		Path to the current Node.js executable. Its directory is pushed to the front of PATH.
    		This can be either an absolute path or a path relative to the `cwd` option.
    		@default process.execPath
    		*/
    val execPath: js.UndefOr[String] = js.native
  }
  object EnvOptions {
    
    @scala.inline
    def apply(): EnvOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnvOptions]
    }
    
    @scala.inline
    implicit class EnvOptionsMutableBuilder[Self <: EnvOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setExecPath(value: String): Self = StObject.set(x, "execPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecPathUndefined: Self = StObject.set(x, "execPath", js.undefined)
    }
  }
  
  type ProcessEnv = StringDictionary[js.UndefOr[String]]
  
  @js.native
  trait RunPathOptions extends StObject {
    
    /**
    		Working directory.
    		@default process.cwd()
    		*/
    val cwd: js.UndefOr[String] = js.native
    
    /**
    		Path to the Node.js executable to use in child processes if that is different from the current one. Its directory is pushed to the front of PATH.
    		This can be either an absolute path or a path relative to the `cwd` option.
    		@default process.execPath
    		*/
    val execPath: js.UndefOr[String] = js.native
    
    /**
    		PATH to be appended. Default: [`PATH`](https://github.com/sindresorhus/path-key).
    		Set it to an empty string to exclude the default PATH.
    		*/
    val path: js.UndefOr[String] = js.native
  }
  object RunPathOptions {
    
    @scala.inline
    def apply(): RunPathOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunPathOptions]
    }
    
    @scala.inline
    implicit class RunPathOptionsMutableBuilder[Self <: RunPathOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setExecPath(value: String): Self = StObject.set(x, "execPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecPathUndefined: Self = StObject.set(x, "execPath", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
