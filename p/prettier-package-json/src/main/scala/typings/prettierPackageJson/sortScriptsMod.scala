package typings.prettierPackageJson

import typings.prettierPackageJson.anon.Scripts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortScriptsMod {
  
  @JSImport("prettier-package-json/build/sort-scripts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Scripts = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Scripts]
  inline def default(scripts: typings.typeFest.packageJsonMod.PackageJson.Scripts): Scripts = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scripts.asInstanceOf[js.Any]).asInstanceOf[Scripts]
}
