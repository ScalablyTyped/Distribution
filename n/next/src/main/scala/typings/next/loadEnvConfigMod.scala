package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.CombinedEnv
import typings.next.anon.Contents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/lib/load-env-config", JSImport.Namespace)
@js.native
object loadEnvConfigMod extends js.Object {
  def loadEnvConfig(dir: String): CombinedEnv = js.native
  def loadEnvConfig(dir: String, dev: Boolean): CombinedEnv = js.native
  def processEnv(loadedEnvFiles: LoadedEnvFiles): Env = js.native
  def processEnv(loadedEnvFiles: LoadedEnvFiles, dir: String): Env = js.native
  type Env = StringDictionary[String]
  type LoadedEnvFiles = js.Array[Contents]
}

