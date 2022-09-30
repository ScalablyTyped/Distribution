package typings.mendixmodelsdk.allModelClassesMod.domainmodels

import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.EventType")
@js.native
open class EventType protected ()
  extends typings.mendixmodelsdk.domainmodelsMod.domainmodels.EventType {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object EventType {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.EventType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.EventType.Commit")
  @js.native
  def Commit: typings.mendixmodelsdk.domainmodelsMod.domainmodels.EventType = js.native
  inline def Commit_=(x: typings.mendixmodelsdk.domainmodelsMod.domainmodels.EventType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Commit")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.EventType.Create")
  @js.native
  def Create: typings.mendixmodelsdk.domainmodelsMod.domainmodels.EventType = js.native
  inline def Create_=(x: typings.mendixmodelsdk.domainmodelsMod.domainmodels.EventType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Create")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.EventType.Delete")
  @js.native
  def Delete: typings.mendixmodelsdk.domainmodelsMod.domainmodels.EventType = js.native
  inline def Delete_=(x: typings.mendixmodelsdk.domainmodelsMod.domainmodels.EventType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Delete")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.EventType.RollBack")
  @js.native
  def RollBack: typings.mendixmodelsdk.domainmodelsMod.domainmodels.EventType = js.native
  inline def RollBack_=(x: typings.mendixmodelsdk.domainmodelsMod.domainmodels.EventType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RollBack")(x.asInstanceOf[js.Any])
}
