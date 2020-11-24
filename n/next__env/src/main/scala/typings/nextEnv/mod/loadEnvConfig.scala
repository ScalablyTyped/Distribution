package typings.nextEnv.mod

import typings.nextEnv.anon.CombinedEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@next/env", "loadEnvConfig")
@js.native
object loadEnvConfig extends js.Object {
  
  def apply(dir: String): CombinedEnv = js.native
  def apply(dir: String, dev: js.UndefOr[scala.Nothing], log: Log): CombinedEnv = js.native
  def apply(dir: String, dev: Boolean): CombinedEnv = js.native
  def apply(dir: String, dev: Boolean, log: Log): CombinedEnv = js.native
}
