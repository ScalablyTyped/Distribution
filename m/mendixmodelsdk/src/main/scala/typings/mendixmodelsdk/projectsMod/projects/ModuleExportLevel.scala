package typings.mendixmodelsdk.projectsMod.projects

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/projects", "projects.ModuleExportLevel")
@js.native
open class ModuleExportLevel protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ModuleExportLevel {
  
  @JSImport("mendixmodelsdk/src/gen/projects", "projects.ModuleExportLevel")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/projects", "projects.ModuleExportLevel.Protected")
  @js.native
  def Protected: ModuleExportLevel = js.native
  inline def Protected_=(x: ModuleExportLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Protected")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/projects", "projects.ModuleExportLevel.Source")
  @js.native
  def Source: ModuleExportLevel = js.native
  inline def Source_=(x: ModuleExportLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Source")(x.asInstanceOf[js.Any])
}
