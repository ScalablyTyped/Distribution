package typings.prettierPackageJson

import org.scalablytyped.runtime.StringDictionary
import typings.prettierPackageJson.buildTypesMod.PackageJson
import typings.prettierPackageJson.prettierPackageJsonStrings.bundleDependencies
import typings.prettierPackageJson.prettierPackageJsonStrings.bundledDependencies
import typings.prettierPackageJson.prettierPackageJsonStrings.dependencies
import typings.prettierPackageJson.prettierPackageJsonStrings.devDependencies
import typings.prettierPackageJson.prettierPackageJsonStrings.optionalDependencies
import typings.prettierPackageJson.prettierPackageJsonStrings.peerDependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSortDependenciesMod {
  
  @JSImport("prettier-package-json/build/sort-dependencies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TKey /* <: bundledDependencies | bundleDependencies | dependencies | devDependencies | optionalDependencies | peerDependencies */](key: TKey, packageJson: PackageJson): StringDictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: prettier-package-json.prettier-package-json/build/types.PackageJson[TKey] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any], packageJson.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: prettier-package-json.prettier-package-json/build/types.PackageJson[TKey] */ js.Any
  ]]
}
