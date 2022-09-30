package typings.prettierPackageJson

import typings.prettierPackageJson.anon.Files
import typings.prettierPackageJson.typesMod.PackageJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortFilesMod {
  
  @JSImport("prettier-package-json/build/sort-files", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(packageJson: PackageJson): Files = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(packageJson.asInstanceOf[js.Any]).asInstanceOf[Files]
}
