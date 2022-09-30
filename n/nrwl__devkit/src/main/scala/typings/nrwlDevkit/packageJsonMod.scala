package typings.nrwlDevkit

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packageJsonMod {
  
  @JSImport("@nrwl/devkit/src/utils/package-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addDependenciesToPackageJson(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    dependencies: Record[String, String],
    devDependencies: Record[String, String]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addDependenciesToPackageJson")(tree.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], devDependencies.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addDependenciesToPackageJson(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    dependencies: Record[String, String],
    devDependencies: Record[String, String],
    packageJsonPath: String
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addDependenciesToPackageJson")(tree.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], devDependencies.asInstanceOf[js.Any], packageJsonPath.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def removeDependenciesFromPackageJson(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    dependencies: js.Array[String],
    devDependencies: js.Array[String]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("removeDependenciesFromPackageJson")(tree.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], devDependencies.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def removeDependenciesFromPackageJson(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    dependencies: js.Array[String],
    devDependencies: js.Array[String],
    packageJsonPath: String
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("removeDependenciesFromPackageJson")(tree.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], devDependencies.asInstanceOf[js.Any], packageJsonPath.asInstanceOf[js.Any])).asInstanceOf[Any]
}
