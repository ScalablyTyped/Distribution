package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.nextBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/lib/load-env-config", JSImport.Namespace)
@js.native
object loadEnvConfigMod extends js.Object {
  def loadEnvConfig(dir: String): Env | `false` = js.native
  def loadEnvConfig(dir: String, dev: Boolean): Env | `false` = js.native
  type Env = StringDictionary[String]
}

