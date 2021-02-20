package typings.mongodbMemoryServerCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveConfigMod {
  
  @JSImport("mongodb-memory-server-core/lib/util/resolve-config", JSImport.Default)
  @js.native
  def default(variableName: String): js.UndefOr[String] = js.native
  
  @JSImport("mongodb-memory-server-core/lib/util/resolve-config", "envToBool")
  @js.native
  def envToBool(): Boolean = js.native
  @JSImport("mongodb-memory-server-core/lib/util/resolve-config", "envToBool")
  @js.native
  def envToBool(env: String): Boolean = js.native
  
  @JSImport("mongodb-memory-server-core/lib/util/resolve-config", "findPackageJson")
  @js.native
  def findPackageJson(): Unit = js.native
  @JSImport("mongodb-memory-server-core/lib/util/resolve-config", "findPackageJson")
  @js.native
  def findPackageJson(directory: String): Unit = js.native
  
  @JSImport("mongodb-memory-server-core/lib/util/resolve-config", "reInitializePackageJson")
  @js.native
  val reInitializePackageJson: js.Function1[/* directory */ js.UndefOr[String], Unit] = js.native
  
  @JSImport("mongodb-memory-server-core/lib/util/resolve-config", "setDefaultValue")
  @js.native
  def setDefaultValue(key: String, value: String): Unit = js.native
}
