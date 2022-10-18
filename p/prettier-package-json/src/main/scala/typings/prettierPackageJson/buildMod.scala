package typings.prettierPackageJson

import typings.prettierPackageJson.buildTypesMod.Options
import typings.prettierPackageJson.buildTypesMod.PackageJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("prettier-package-json/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def check(packageJson: String, opts: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(packageJson.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def check(packageJson: PackageJson, opts: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(packageJson.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def format(packageJson: PackageJson): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(packageJson.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(packageJson: PackageJson, opts: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(packageJson.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
}
