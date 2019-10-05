package typings.npmDashRunDashPath.npmDashRunDashPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("npm-run-path", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof npmRunPath */ js.Any = js.native
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
  def apply(): String = js.native
  def apply(options: RunPathOptions): String = js.native
  /**
  	@returns The augmented [`process.env`](https://nodejs.org/api/process.html#process_process_env) object.
  	*/
  def env(): ProcessEnv = js.native
  def env(options: EnvOptions): ProcessEnv = js.native
}

