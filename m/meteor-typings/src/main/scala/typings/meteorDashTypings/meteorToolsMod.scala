package typings.meteorDashTypings

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.std.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/tools", JSImport.Namespace)
@js.native
object meteorToolsMod extends js.Object {
  @js.native
  trait PackageAPI
    extends Instantiable0[typings.meteorDashTypings.meteorToolsMod.PackageAPI] {
    def addAssets(filenames: String, architecture: String): Unit = js.native
    def addAssets(filenames: String, architecture: js.Array[String]): Unit = js.native
    def addAssets(filenames: js.Array[String], architecture: String): Unit = js.native
    def addAssets(filenames: js.Array[String], architecture: js.Array[String]): Unit = js.native
    def addFiles(filenames: String): Unit = js.native
    def addFiles(filenames: String, architecture: String): Unit = js.native
    def addFiles(filenames: String, architecture: String, options: Anon_Bare): Unit = js.native
    def addFiles(filenames: String, architecture: js.Array[String]): Unit = js.native
    def addFiles(filenames: String, architecture: js.Array[String], options: Anon_Bare): Unit = js.native
    def addFiles(filenames: js.Array[String]): Unit = js.native
    def addFiles(filenames: js.Array[String], architecture: String): Unit = js.native
    def addFiles(filenames: js.Array[String], architecture: String, options: Anon_Bare): Unit = js.native
    def addFiles(filenames: js.Array[String], architecture: js.Array[String]): Unit = js.native
    def addFiles(filenames: js.Array[String], architecture: js.Array[String], options: Anon_Bare): Unit = js.native
    def export(exportedObjects: String): Unit = js.native
    def export(exportedObjects: String, architecture: String): Unit = js.native
    def export(exportedObjects: String, architecture: String, exportOptions: js.Object): Unit = js.native
    def export(exportedObjects: String, architecture: String, exportOptions: js.Object, testOnly: Boolean): Unit = js.native
    def export(exportedObjects: String, architecture: js.Array[String]): Unit = js.native
    def export(exportedObjects: String, architecture: js.Array[String], exportOptions: js.Object): Unit = js.native
    def export(
      exportedObjects: String,
      architecture: js.Array[String],
      exportOptions: js.Object,
      testOnly: Boolean
    ): Unit = js.native
    def export(exportedObjects: js.Array[String]): Unit = js.native
    def export(exportedObjects: js.Array[String], architecture: String): Unit = js.native
    def export(exportedObjects: js.Array[String], architecture: String, exportOptions: js.Object): Unit = js.native
    def export(
      exportedObjects: js.Array[String],
      architecture: String,
      exportOptions: js.Object,
      testOnly: Boolean
    ): Unit = js.native
    def export(exportedObjects: js.Array[String], architecture: js.Array[String]): Unit = js.native
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
    def use(packageNames: String, architecture: String): Unit = js.native
    def use(packageNames: String, architecture: String, options: Anon_Unordered): Unit = js.native
    def use(packageNames: String, architecture: js.Array[String]): Unit = js.native
    def use(packageNames: String, architecture: js.Array[String], options: Anon_Unordered): Unit = js.native
    def use(packageNames: js.Array[String]): Unit = js.native
    def use(packageNames: js.Array[String], architecture: String): Unit = js.native
    def use(packageNames: js.Array[String], architecture: String, options: Anon_Unordered): Unit = js.native
    def use(packageNames: js.Array[String], architecture: js.Array[String]): Unit = js.native
    def use(packageNames: js.Array[String], architecture: js.Array[String], options: Anon_Unordered): Unit = js.native
    def versionsFrom(meteorRelease: String): Unit = js.native
    def versionsFrom(meteorRelease: js.Array[String]): Unit = js.native
  }
  
  var console: Console = js.native
  def execFileAsync(command: String): js.Any = js.native
  def execFileAsync(command: String, args: js.Array[_]): js.Any = js.native
  def execFileAsync(command: String, args: js.Array[_], options: Anon_Cwd): js.Any = js.native
  def execFileSync(command: String): String = js.native
  def execFileSync(command: String, args: js.Array[_]): String = js.native
  def execFileSync(command: String, args: js.Array[_], options: Anon_Cwd): String = js.native
  @js.native
  object App extends js.Object {
    def accessRule(pattern: String): Unit = js.native
    def accessRule(pattern: String, options: Anon_LaunchExternal): Unit = js.native
    def configurePlugin(id: String, config: js.Object): Unit = js.native
    def icons(icons: js.Object): Unit = js.native
    def info(options: Anon_Author): Unit = js.native
    def launchScreens(launchScreens: js.Object): Unit = js.native
    def setPreference(name: String, value: String): Unit = js.native
    def setPreference(name: String, value: String, platform: String): Unit = js.native
  }
  
  @js.native
  object Assets extends js.Object {
    def absoluteFilePath(assetPath: String): String = js.native
    def getBinary(assetPath: String): EJSON = js.native
    def getBinary(assetPath: String, asyncCallback: js.Function): EJSON = js.native
    def getText(assetPath: String): String = js.native
    def getText(assetPath: String, asyncCallback: js.Function): String = js.native
  }
  
  @js.native
  object Cordova extends js.Object {
    def depends(dependencies: StringDictionary[String]): Unit = js.native
  }
  
  @js.native
  object Npm extends js.Object {
    def depends(dependencies: StringDictionary[String]): Unit = js.native
    def require(name: String): js.Any = js.native
  }
  
  @js.native
  object Package extends js.Object {
    def describe(options: Anon_DebugOnly): Unit = js.native
    def onTest(func: js.Function1[/* api */ typings.meteorDashTypings.meteorToolsMod.PackageAPI, Unit]): Unit = js.native
    def onUse(func: js.Function1[/* api */ typings.meteorDashTypings.meteorToolsMod.PackageAPI, Unit]): Unit = js.native
    def registerBuildPlugin(): Unit = js.native
    def registerBuildPlugin(options: Anon_Name): Unit = js.native
  }
  
}

