package typings.nrwlDevkit

import org.scalablytyped.runtime.StringDictionary
import typings.nrwlDevkit.anon.AppsDir
import typings.nrwlDevkit.anon.ClassName
import typings.nrwlDevkit.anon.ProjectRoot
import typings.nrwlDevkit.srcUtilsStringChangeMod.StringChange
import typings.std.Generator
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nrwl/devkit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nrwl/devkit", "ChangeType")
  @js.native
  object ChangeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.nrwlDevkit.srcUtilsStringChangeMod.ChangeType & String] = js.native
    
    /* "Delete" */ val Delete: typings.nrwlDevkit.srcUtilsStringChangeMod.ChangeType.Delete & String = js.native
    
    /* "Insert" */ val Insert: typings.nrwlDevkit.srcUtilsStringChangeMod.ChangeType.Insert & String = js.native
  }
  
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
  
  inline def applyChangesToString(text: String, changes: js.Array[StringChange]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyChangesToString")(text.asInstanceOf[js.Any], changes.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def convertNxExecutor(
    executor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Executor */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("convertNxExecutor")(executor.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def convertNxGenerator[T](generator: Generator[T, Any, Any]): js.Function1[
    /* generatorOptions */ T, 
    js.Function2[/* tree */ Any, /* context */ Any, js.Promise[Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertNxGenerator")(generator.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* generatorOptions */ T, 
    js.Function2[/* tree */ Any, /* context */ Any, js.Promise[Any]]
  ]]
  inline def convertNxGenerator[T](generator: Generator[T, Any, Any], skipWritingConfigInOldFormat: Boolean): js.Function1[
    /* generatorOptions */ T, 
    js.Function2[/* tree */ Any, /* context */ Any, js.Promise[Any]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertNxGenerator")(generator.asInstanceOf[js.Any], skipWritingConfigInOldFormat.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* generatorOptions */ T, 
    js.Function2[/* tree */ Any, /* context */ Any, js.Promise[Any]]
  ]]
  
  inline def formatFiles(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any
  ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("formatFiles")(tree.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def generateFiles(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    srcFolder: String,
    target: String,
    substitutions: StringDictionary[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateFiles")(tree.asInstanceOf[js.Any], srcFolder.asInstanceOf[js.Any], target.asInstanceOf[js.Any], substitutions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getWorkspaceLayout(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any
  ): AppsDir = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkspaceLayout")(tree.asInstanceOf[js.Any]).asInstanceOf[AppsDir]
  
  inline def installPackagesTask(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("installPackagesTask")(tree.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def installPackagesTask(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    alwaysRun: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("installPackagesTask")(tree.asInstanceOf[js.Any], alwaysRun.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def installPackagesTask(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    alwaysRun: Boolean,
    cwd: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("installPackagesTask")(tree.asInstanceOf[js.Any], alwaysRun.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def installPackagesTask(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    alwaysRun: Boolean,
    cwd: String,
    packageManager: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageManager */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("installPackagesTask")(tree.asInstanceOf[js.Any], alwaysRun.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], packageManager.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def installPackagesTask(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    alwaysRun: Boolean,
    cwd: Unit,
    packageManager: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageManager */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("installPackagesTask")(tree.asInstanceOf[js.Any], alwaysRun.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], packageManager.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def installPackagesTask(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    alwaysRun: Unit,
    cwd: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("installPackagesTask")(tree.asInstanceOf[js.Any], alwaysRun.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def installPackagesTask(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    alwaysRun: Unit,
    cwd: String,
    packageManager: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageManager */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("installPackagesTask")(tree.asInstanceOf[js.Any], alwaysRun.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], packageManager.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def installPackagesTask(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    alwaysRun: Unit,
    cwd: Unit,
    packageManager: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageManager */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("installPackagesTask")(tree.asInstanceOf[js.Any], alwaysRun.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], packageManager.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def moveFilesToNewDirectory(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    oldDir: String,
    newDir: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveFilesToNewDirectory")(tree.asInstanceOf[js.Any], oldDir.asInstanceOf[js.Any], newDir.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def names(name: String): ClassName = ^.asInstanceOf[js.Dynamic].applyDynamic("names")(name.asInstanceOf[js.Any]).asInstanceOf[ClassName]
  
  inline def offsetFromRoot(fullPathToDir: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("offsetFromRoot")(fullPathToDir.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseTargetString(targetString: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTargetString")(targetString.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def readTargetOptions[T](
    hasProjectTargetConfiguration: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Target */ Any,
    context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExecutorContext */ Any
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("readTargetOptions")(hasProjectTargetConfiguration.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[T]
  
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
  
  inline def targetToTargetString(
    hasProjectTargetConfiguration: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Target */ Any
  ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("targetToTargetString")(hasProjectTargetConfiguration.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toJS(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(tree.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def updateTsConfigsToJs(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    options: ProjectRoot
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateTsConfigsToJs")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def visitNotIgnoredFiles(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    dirPath: String,
    visitor: js.Function1[/* path */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visitNotIgnoredFiles")(tree.asInstanceOf[js.Any], dirPath.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
