package typings.mongodbMemoryServerCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb-memory-server-core/lib/util/resolve-config", JSImport.Namespace)
@js.native
object resolveConfigMod extends js.Object {
  def default(variableName: String): js.UndefOr[String] = js.native
  def envToBool(env: String): Boolean = js.native
  def reInitializePackageJson(): Unit = js.native
  def reInitializePackageJson(directory: String): Unit = js.native
  def setDefaultValue(key: String, value: String): Unit = js.native
}

