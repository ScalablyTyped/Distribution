package typings.mendixmodelsdk.projectsMod.projects

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/projects", "projects.ProtectedModuleType")
@js.native
open class ProtectedModuleType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ProtectedModuleType {
  
  @JSImport("mendixmodelsdk/src/gen/projects", "projects.ProtectedModuleType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/projects", "projects.ProtectedModuleType.AddOn")
  @js.native
  def AddOn: ProtectedModuleType = js.native
  inline def AddOn_=(x: ProtectedModuleType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AddOn")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/projects", "projects.ProtectedModuleType.Solution")
  @js.native
  def Solution: ProtectedModuleType = js.native
  inline def Solution_=(x: ProtectedModuleType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Solution")(x.asInstanceOf[js.Any])
}
