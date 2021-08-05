package typings.mongodbMemoryServerCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveConfigMod {
  
  @JSImport("mongodb-memory-server-core/lib/util/resolve-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(variableName: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(variableName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def envToBool(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("envToBool")().asInstanceOf[Boolean]
  inline def envToBool(env: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("envToBool")(env.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def findPackageJson(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("findPackageJson")().asInstanceOf[Unit]
  inline def findPackageJson(directory: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("findPackageJson")(directory.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("mongodb-memory-server-core/lib/util/resolve-config", "reInitializePackageJson")
  @js.native
  val reInitializePackageJson: js.Function1[/* directory */ js.UndefOr[String], Unit] = js.native
  
  inline def setDefaultValue(key: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultValue")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
