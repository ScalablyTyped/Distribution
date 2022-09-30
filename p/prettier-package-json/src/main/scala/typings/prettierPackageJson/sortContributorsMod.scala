package typings.prettierPackageJson

import org.scalablytyped.runtime.StringDictionary
import typings.parseAuthor.mod.Author
import typings.prettierPackageJson.prettierPackageJsonStrings.author
import typings.prettierPackageJson.prettierPackageJsonStrings.contributors
import typings.prettierPackageJson.prettierPackageJsonStrings.maintainers
import typings.prettierPackageJson.typesMod.Options
import typings.prettierPackageJson.typesMod.PackageJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortContributorsMod {
  
  @JSImport("prettier-package-json/build/sort-contributors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TKey /* <: author | contributors | maintainers */](key: TKey, packageJson: PackageJson): StringDictionary[(js.Array[Author | String]) | Author | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any], packageJson.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[(js.Array[Author | String]) | Author | String]]
  inline def default[TKey /* <: author | contributors | maintainers */](key: TKey, packageJson: PackageJson, opts: Options): StringDictionary[(js.Array[Author | String]) | Author | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any], packageJson.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[(js.Array[Author | String]) | Author | String]]
}
