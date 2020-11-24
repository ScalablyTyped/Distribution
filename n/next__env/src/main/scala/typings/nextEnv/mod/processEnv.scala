package typings.nextEnv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@next/env", "processEnv")
@js.native
object processEnv extends js.Object {
  
  def apply(loadedEnvFiles: LoadedEnvFiles): Env = js.native
  def apply(loadedEnvFiles: LoadedEnvFiles, dir: js.UndefOr[scala.Nothing], log: Log): Env = js.native
  def apply(loadedEnvFiles: LoadedEnvFiles, dir: String): Env = js.native
  def apply(loadedEnvFiles: LoadedEnvFiles, dir: String, log: Log): Env = js.native
}
