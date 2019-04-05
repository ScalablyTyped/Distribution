package typings
package npmDashRunDashPathLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DefaultEnv extends js.Object {
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: Anon_Default = js.native
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
  def apply(): java.lang.String = js.native
  def apply(options: npmDashRunDashPathLib.npmDashRunDashPathMod.npmRunPathNs.RunPathOptions): java.lang.String = js.native
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
  // TODO: Remove this for the next major release
  def default(): java.lang.String = js.native
  def default(options: npmDashRunDashPathLib.npmDashRunDashPathMod.npmRunPathNs.RunPathOptions): java.lang.String = js.native
  /**
  	@returns The augmented [`process.env`](https://nodejs.org/api/process.html#process_process_env) object.
  	*/
  def env(): npmDashRunDashPathLib.npmDashRunDashPathMod.npmRunPathNs.ProcessEnv = js.native
  def env(options: npmDashRunDashPathLib.npmDashRunDashPathMod.npmRunPathNs.EnvOptions): npmDashRunDashPathLib.npmDashRunDashPathMod.npmRunPathNs.ProcessEnv = js.native
}

