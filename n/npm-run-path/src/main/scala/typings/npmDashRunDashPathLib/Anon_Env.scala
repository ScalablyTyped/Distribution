package typings
package npmDashRunDashPathLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Env extends js.Object {
  /**
  	 * Get your [PATH](https://en.wikipedia.org/wiki/PATH_(variable)) prepended with locally installed binaries.
  	 *
  	 * @returns The augmented path string.
  	 */
  def apply(): java.lang.String = js.native
  def apply(options: npmDashRunDashPathLib.npmDashRunDashPathMod.RunPathOptions): java.lang.String = js.native
  /**
  	 * @returns The augmented [`process.env`](https://nodejs.org/api/process.html#process_process_env) object.
  	 */
  def env(): npmDashRunDashPathLib.npmDashRunDashPathMod.ProcessEnv = js.native
  def env(options: npmDashRunDashPathLib.npmDashRunDashPathMod.EnvOptions): npmDashRunDashPathLib.npmDashRunDashPathMod.ProcessEnv = js.native
}

