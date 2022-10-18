package typings.meteorTypings

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.meteorTypings.anon.Author
import typings.meteorTypings.anon.Bare
import typings.meteorTypings.anon.Cwd
import typings.meteorTypings.anon.DebugOnly
import typings.meteorTypings.anon.LaunchExternal
import typings.meteorTypings.anon.Name
import typings.meteorTypings.anon.Unordered
import typings.std.Console
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meteorToolsMod {
  
  @JSImport("meteor/tools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object App {
    
    @JSImport("meteor/tools", "App")
    @js.native
    val ^ : js.Any = js.native
    
    inline def accessRule(pattern: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("accessRule")(pattern.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def accessRule(pattern: String, options: LaunchExternal): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("accessRule")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def configurePlugin(id: String, config: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configurePlugin")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def icons(icons: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("icons")(icons.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def info(options: Author): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def launchScreens(launchScreens: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("launchScreens")(launchScreens.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setPreference(name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPreference")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setPreference(name: String, value: String, platform: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPreference")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object Assets {
    
    @JSImport("meteor/tools", "Assets")
    @js.native
    val ^ : js.Any = js.native
    
    inline def absoluteFilePath(assetPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("absoluteFilePath")(assetPath.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getBinary(assetPath: String): EJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("getBinary")(assetPath.asInstanceOf[js.Any]).asInstanceOf[EJSON]
    inline def getBinary(assetPath: String, asyncCallback: js.Function): EJSON = (^.asInstanceOf[js.Dynamic].applyDynamic("getBinary")(assetPath.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[EJSON]
    
    inline def getText(assetPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getText")(assetPath.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getText(assetPath: String, asyncCallback: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getText")(assetPath.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object Cordova {
    
    @JSImport("meteor/tools", "Cordova")
    @js.native
    val ^ : js.Any = js.native
    
    inline def depends(dependencies: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("depends")(dependencies.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object Npm {
    
    @JSImport("meteor/tools", "Npm")
    @js.native
    val ^ : js.Any = js.native
    
    inline def depends(dependencies: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("depends")(dependencies.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def require(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("require")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  object Package {
    
    @JSImport("meteor/tools", "Package")
    @js.native
    val ^ : js.Any = js.native
    
    inline def describe(options: DebugOnly): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("describe")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onTest(func: js.Function1[/* api */ typings.meteorTypings.meteorToolsMod.PackageAPI, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onTest")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onUse(func: js.Function1[/* api */ typings.meteorTypings.meteorToolsMod.PackageAPI, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onUse")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def registerBuildPlugin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerBuildPlugin")().asInstanceOf[Unit]
    inline def registerBuildPlugin(options: Name): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerBuildPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("meteor/tools", "console")
  @js.native
  def console: Console = js.native
  inline def console_=(x: Console): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("console")(x.asInstanceOf[js.Any])
  
  inline def execFileAsync(command: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("execFileAsync")(command.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def execFileAsync(command: String, args: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileAsync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def execFileAsync(command: String, args: js.Array[Any], options: Cwd): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileAsync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def execFileAsync(command: String, args: Unit, options: Cwd): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileAsync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def execFileSync(command: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def execFileSync(command: String, args: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def execFileSync(command: String, args: js.Array[Any], options: Cwd): String = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def execFileSync(command: String, args: Unit, options: Cwd): String = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @js.native
  trait PackageAPI
    extends StObject
       with Instantiable0[typings.meteorTypings.meteorToolsMod.PackageAPI] {
    
    def addAssets(filenames: String, architecture: String): Unit = js.native
    def addAssets(filenames: String, architecture: js.Array[String]): Unit = js.native
    def addAssets(filenames: js.Array[String], architecture: String): Unit = js.native
    def addAssets(filenames: js.Array[String], architecture: js.Array[String]): Unit = js.native
    
    def addFiles(filenames: String): Unit = js.native
    def addFiles(filenames: String, architecture: String): Unit = js.native
    def addFiles(filenames: String, architecture: String, options: Bare): Unit = js.native
    def addFiles(filenames: String, architecture: js.Array[String]): Unit = js.native
    def addFiles(filenames: String, architecture: js.Array[String], options: Bare): Unit = js.native
    def addFiles(filenames: String, architecture: Unit, options: Bare): Unit = js.native
    def addFiles(filenames: js.Array[String]): Unit = js.native
    def addFiles(filenames: js.Array[String], architecture: String): Unit = js.native
    def addFiles(filenames: js.Array[String], architecture: String, options: Bare): Unit = js.native
    def addFiles(filenames: js.Array[String], architecture: js.Array[String]): Unit = js.native
    def addFiles(filenames: js.Array[String], architecture: js.Array[String], options: Bare): Unit = js.native
    def addFiles(filenames: js.Array[String], architecture: Unit, options: Bare): Unit = js.native
    
    def `export`(exportedObjects: String): Unit = js.native
    def `export`(exportedObjects: String, architecture: String): Unit = js.native
    def `export`(exportedObjects: String, architecture: String, exportOptions: js.Object): Unit = js.native
    def `export`(exportedObjects: String, architecture: String, exportOptions: js.Object, testOnly: Boolean): Unit = js.native
    def `export`(exportedObjects: String, architecture: String, exportOptions: Unit, testOnly: Boolean): Unit = js.native
    def `export`(exportedObjects: String, architecture: js.Array[String]): Unit = js.native
    def `export`(exportedObjects: String, architecture: js.Array[String], exportOptions: js.Object): Unit = js.native
    def `export`(
      exportedObjects: String,
      architecture: js.Array[String],
      exportOptions: js.Object,
      testOnly: Boolean
    ): Unit = js.native
    def `export`(exportedObjects: String, architecture: js.Array[String], exportOptions: Unit, testOnly: Boolean): Unit = js.native
    def `export`(exportedObjects: String, architecture: Unit, exportOptions: js.Object): Unit = js.native
    def `export`(exportedObjects: String, architecture: Unit, exportOptions: js.Object, testOnly: Boolean): Unit = js.native
    def `export`(exportedObjects: String, architecture: Unit, exportOptions: Unit, testOnly: Boolean): Unit = js.native
    def `export`(exportedObjects: js.Array[String]): Unit = js.native
    def `export`(exportedObjects: js.Array[String], architecture: String): Unit = js.native
    def `export`(exportedObjects: js.Array[String], architecture: String, exportOptions: js.Object): Unit = js.native
    def `export`(
      exportedObjects: js.Array[String],
      architecture: String,
      exportOptions: js.Object,
      testOnly: Boolean
    ): Unit = js.native
    def `export`(exportedObjects: js.Array[String], architecture: String, exportOptions: Unit, testOnly: Boolean): Unit = js.native
    def `export`(exportedObjects: js.Array[String], architecture: js.Array[String]): Unit = js.native
    def `export`(exportedObjects: js.Array[String], architecture: js.Array[String], exportOptions: js.Object): Unit = js.native
    def `export`(
      exportedObjects: js.Array[String],
      architecture: js.Array[String],
      exportOptions: js.Object,
      testOnly: Boolean
    ): Unit = js.native
    def `export`(
      exportedObjects: js.Array[String],
      architecture: js.Array[String],
      exportOptions: Unit,
      testOnly: Boolean
    ): Unit = js.native
    def `export`(exportedObjects: js.Array[String], architecture: Unit, exportOptions: js.Object): Unit = js.native
    def `export`(exportedObjects: js.Array[String], architecture: Unit, exportOptions: js.Object, testOnly: Boolean): Unit = js.native
    def `export`(exportedObjects: js.Array[String], architecture: Unit, exportOptions: Unit, testOnly: Boolean): Unit = js.native
    
    def imply(packageNames: String): Unit = js.native
    def imply(packageNames: String, architecture: String): Unit = js.native
    def imply(packageNames: String, architecture: js.Array[String]): Unit = js.native
    def imply(packageNames: js.Array[String]): Unit = js.native
    def imply(packageNames: js.Array[String], architecture: String): Unit = js.native
    def imply(packageNames: js.Array[String], architecture: js.Array[String]): Unit = js.native
    
    def use(packageNames: String): Unit = js.native
    def use(packageNames: String, architecture: String): Unit = js.native
    def use(packageNames: String, architecture: String, options: Unordered): Unit = js.native
    def use(packageNames: String, architecture: js.Array[String]): Unit = js.native
    def use(packageNames: String, architecture: js.Array[String], options: Unordered): Unit = js.native
    def use(packageNames: String, architecture: Unit, options: Unordered): Unit = js.native
    def use(packageNames: js.Array[String]): Unit = js.native
    def use(packageNames: js.Array[String], architecture: String): Unit = js.native
    def use(packageNames: js.Array[String], architecture: String, options: Unordered): Unit = js.native
    def use(packageNames: js.Array[String], architecture: js.Array[String]): Unit = js.native
    def use(packageNames: js.Array[String], architecture: js.Array[String], options: Unordered): Unit = js.native
    def use(packageNames: js.Array[String], architecture: Unit, options: Unordered): Unit = js.native
    
    def versionsFrom(meteorRelease: String): Unit = js.native
    def versionsFrom(meteorRelease: js.Array[String]): Unit = js.native
  }
}
