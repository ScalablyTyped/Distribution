package typings.meteor

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.meteor.anon.Author
import typings.meteor.anon.Bare
import typings.meteor.anon.Cwd
import typings.meteor.anon.DebugOnly
import typings.meteor.anon.LaunchExternal
import typings.meteor.anon.Name
import typings.meteor.anon.Unordered
import typings.std.Console
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsMod {
  
  @JSImport("meteor/tools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object App {
    
    @JSImport("meteor/tools", "App.accessRule")
    @js.native
    def accessRule(pattern: String): Unit = js.native
    @JSImport("meteor/tools", "App.accessRule")
    @js.native
    def accessRule(pattern: String, options: LaunchExternal): Unit = js.native
    
    @JSImport("meteor/tools", "App.configurePlugin")
    @js.native
    def configurePlugin(id: String, config: js.Object): Unit = js.native
    
    @JSImport("meteor/tools", "App.icons")
    @js.native
    def icons(icons: js.Object): Unit = js.native
    
    @JSImport("meteor/tools", "App.info")
    @js.native
    def info(options: Author): Unit = js.native
    
    @JSImport("meteor/tools", "App.launchScreens")
    @js.native
    def launchScreens(launchScreens: js.Object): Unit = js.native
    
    @JSImport("meteor/tools", "App.setPreference")
    @js.native
    def setPreference(name: String, value: String): Unit = js.native
    @JSImport("meteor/tools", "App.setPreference")
    @js.native
    def setPreference(name: String, value: String, platform: String): Unit = js.native
  }
  
  object Assets {
    
    @JSImport("meteor/tools", "Assets.absoluteFilePath")
    @js.native
    def absoluteFilePath(assetPath: String): String = js.native
    
    @JSImport("meteor/tools", "Assets.getBinary")
    @js.native
    def getBinary(assetPath: String): js.UndefOr[EJSON] = js.native
    @JSImport("meteor/tools", "Assets.getBinary")
    @js.native
    def getBinary(assetPath: String, asyncCallback: js.Function): js.UndefOr[EJSON] = js.native
    
    @JSImport("meteor/tools", "Assets.getText")
    @js.native
    def getText(assetPath: String): js.UndefOr[String] = js.native
    @JSImport("meteor/tools", "Assets.getText")
    @js.native
    def getText(assetPath: String, asyncCallback: js.Function): js.UndefOr[String] = js.native
  }
  
  object Cordova {
    
    @JSImport("meteor/tools", "Cordova.depends")
    @js.native
    def depends(dependencies: StringDictionary[String]): Unit = js.native
  }
  
  object Npm {
    
    @JSImport("meteor/tools", "Npm.depends")
    @js.native
    def depends(dependencies: StringDictionary[String]): Unit = js.native
    
    @JSImport("meteor/tools", "Npm.require")
    @js.native
    def require(name: String): js.Any = js.native
  }
  
  object Package {
    
    @JSImport("meteor/tools", "Package.describe")
    @js.native
    def describe(options: DebugOnly): Unit = js.native
    
    @JSImport("meteor/tools", "Package.onTest")
    @js.native
    def onTest(func: js.Function1[/* api */ typings.meteor.toolsMod.PackageAPI, Unit]): Unit = js.native
    
    @JSImport("meteor/tools", "Package.onUse")
    @js.native
    def onUse(func: js.Function1[/* api */ typings.meteor.toolsMod.PackageAPI, Unit]): Unit = js.native
    
    @JSImport("meteor/tools", "Package.registerBuildPlugin")
    @js.native
    def registerBuildPlugin(): Unit = js.native
    @JSImport("meteor/tools", "Package.registerBuildPlugin")
    @js.native
    def registerBuildPlugin(options: Name): Unit = js.native
  }
  
  @JSImport("meteor/tools", "console")
  @js.native
  def console: Console = js.native
  @scala.inline
  def console_=(x: Console): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("console")(x.asInstanceOf[js.Any])
  
  @JSImport("meteor/tools", "execFileAsync")
  @js.native
  def execFileAsync(command: String): js.Any = js.native
  @JSImport("meteor/tools", "execFileAsync")
  @js.native
  def execFileAsync(command: String, args: js.UndefOr[scala.Nothing], options: Cwd): js.Any = js.native
  @JSImport("meteor/tools", "execFileAsync")
  @js.native
  def execFileAsync(command: String, args: js.Array[_]): js.Any = js.native
  @JSImport("meteor/tools", "execFileAsync")
  @js.native
  def execFileAsync(command: String, args: js.Array[_], options: Cwd): js.Any = js.native
  
  @JSImport("meteor/tools", "execFileSync")
  @js.native
  def execFileSync(command: String): String = js.native
  @JSImport("meteor/tools", "execFileSync")
  @js.native
  def execFileSync(command: String, args: js.UndefOr[scala.Nothing], options: Cwd): String = js.native
  @JSImport("meteor/tools", "execFileSync")
  @js.native
  def execFileSync(command: String, args: js.Array[_]): String = js.native
  @JSImport("meteor/tools", "execFileSync")
  @js.native
  def execFileSync(command: String, args: js.Array[_], options: Cwd): String = js.native
  
  @js.native
  trait PackageAPI
    extends Instantiable0[typings.meteor.toolsMod.PackageAPI] {
    
    def addAssets(filenames: String, architecture: String): Unit = js.native
    def addAssets(filenames: String, architecture: js.Array[String]): Unit = js.native
    def addAssets(filenames: js.Array[String], architecture: String): Unit = js.native
    def addAssets(filenames: js.Array[String], architecture: js.Array[String]): Unit = js.native
    
    def addFiles(filenames: String): Unit = js.native
    def addFiles(filenames: String, architecture: js.UndefOr[scala.Nothing], options: Bare): Unit = js.native
    def addFiles(filenames: String, architecture: String): Unit = js.native
    def addFiles(filenames: String, architecture: String, options: Bare): Unit = js.native
    def addFiles(filenames: String, architecture: js.Array[String]): Unit = js.native
    def addFiles(filenames: String, architecture: js.Array[String], options: Bare): Unit = js.native
    def addFiles(filenames: js.Array[String]): Unit = js.native
    def addFiles(filenames: js.Array[String], architecture: js.UndefOr[scala.Nothing], options: Bare): Unit = js.native
    def addFiles(filenames: js.Array[String], architecture: String): Unit = js.native
    def addFiles(filenames: js.Array[String], architecture: String, options: Bare): Unit = js.native
    def addFiles(filenames: js.Array[String], architecture: js.Array[String]): Unit = js.native
    def addFiles(filenames: js.Array[String], architecture: js.Array[String], options: Bare): Unit = js.native
    
    def export(exportedObjects: String): Unit = js.native
    def export(
      exportedObjects: String,
      architecture: js.UndefOr[scala.Nothing],
      exportOptions: js.UndefOr[scala.Nothing],
      testOnly: Boolean
    ): Unit = js.native
    def export(exportedObjects: String, architecture: js.UndefOr[scala.Nothing], exportOptions: js.Object): Unit = js.native
    def export(
      exportedObjects: String,
      architecture: js.UndefOr[scala.Nothing],
      exportOptions: js.Object,
      testOnly: Boolean
    ): Unit = js.native
    def export(exportedObjects: String, architecture: String): Unit = js.native
    def export(
      exportedObjects: String,
      architecture: String,
      exportOptions: js.UndefOr[scala.Nothing],
      testOnly: Boolean
    ): Unit = js.native
    def export(exportedObjects: String, architecture: String, exportOptions: js.Object): Unit = js.native
    def export(exportedObjects: String, architecture: String, exportOptions: js.Object, testOnly: Boolean): Unit = js.native
    def export(exportedObjects: String, architecture: js.Array[String]): Unit = js.native
    def export(
      exportedObjects: String,
      architecture: js.Array[String],
      exportOptions: js.UndefOr[scala.Nothing],
      testOnly: Boolean
    ): Unit = js.native
    def export(exportedObjects: String, architecture: js.Array[String], exportOptions: js.Object): Unit = js.native
    def export(
      exportedObjects: String,
      architecture: js.Array[String],
      exportOptions: js.Object,
      testOnly: Boolean
    ): Unit = js.native
    def export(exportedObjects: js.Array[String]): Unit = js.native
    def export(
      exportedObjects: js.Array[String],
      architecture: js.UndefOr[scala.Nothing],
      exportOptions: js.UndefOr[scala.Nothing],
      testOnly: Boolean
    ): Unit = js.native
    def export(
      exportedObjects: js.Array[String],
      architecture: js.UndefOr[scala.Nothing],
      exportOptions: js.Object
    ): Unit = js.native
    def export(
      exportedObjects: js.Array[String],
      architecture: js.UndefOr[scala.Nothing],
      exportOptions: js.Object,
      testOnly: Boolean
    ): Unit = js.native
    def export(exportedObjects: js.Array[String], architecture: String): Unit = js.native
    def export(
      exportedObjects: js.Array[String],
      architecture: String,
      exportOptions: js.UndefOr[scala.Nothing],
      testOnly: Boolean
    ): Unit = js.native
    def export(exportedObjects: js.Array[String], architecture: String, exportOptions: js.Object): Unit = js.native
    def export(
      exportedObjects: js.Array[String],
      architecture: String,
      exportOptions: js.Object,
      testOnly: Boolean
    ): Unit = js.native
    def export(exportedObjects: js.Array[String], architecture: js.Array[String]): Unit = js.native
    def export(
      exportedObjects: js.Array[String],
      architecture: js.Array[String],
      exportOptions: js.UndefOr[scala.Nothing],
      testOnly: Boolean
    ): Unit = js.native
    def export(exportedObjects: js.Array[String], architecture: js.Array[String], exportOptions: js.Object): Unit = js.native
    def export(
      exportedObjects: js.Array[String],
      architecture: js.Array[String],
      exportOptions: js.Object,
      testOnly: Boolean
    ): Unit = js.native
    
    def imply(packageNames: String): Unit = js.native
    def imply(packageNames: String, architecture: String): Unit = js.native
    def imply(packageNames: String, architecture: js.Array[String]): Unit = js.native
    def imply(packageNames: js.Array[String]): Unit = js.native
    def imply(packageNames: js.Array[String], architecture: String): Unit = js.native
    def imply(packageNames: js.Array[String], architecture: js.Array[String]): Unit = js.native
    
    def use(packageNames: String): Unit = js.native
    def use(packageNames: String, architecture: js.UndefOr[scala.Nothing], options: Unordered): Unit = js.native
    def use(packageNames: String, architecture: String): Unit = js.native
    def use(packageNames: String, architecture: String, options: Unordered): Unit = js.native
    def use(packageNames: String, architecture: js.Array[String]): Unit = js.native
    def use(packageNames: String, architecture: js.Array[String], options: Unordered): Unit = js.native
    def use(packageNames: js.Array[String]): Unit = js.native
    def use(packageNames: js.Array[String], architecture: js.UndefOr[scala.Nothing], options: Unordered): Unit = js.native
    def use(packageNames: js.Array[String], architecture: String): Unit = js.native
    def use(packageNames: js.Array[String], architecture: String, options: Unordered): Unit = js.native
    def use(packageNames: js.Array[String], architecture: js.Array[String]): Unit = js.native
    def use(packageNames: js.Array[String], architecture: js.Array[String], options: Unordered): Unit = js.native
    
    def versionsFrom(meteorRelease: String): Unit = js.native
    def versionsFrom(meteorRelease: js.Array[String]): Unit = js.native
  }
}
