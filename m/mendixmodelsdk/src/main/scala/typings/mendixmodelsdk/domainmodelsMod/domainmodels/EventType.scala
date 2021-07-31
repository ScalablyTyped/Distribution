package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EventType")
@js.native
class EventType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object EventType {
  
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EventType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EventType.Commit")
  @js.native
  def Commit: EventType = js.native
  @scala.inline
  def Commit_=(x: EventType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Commit")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EventType.Create")
  @js.native
  def Create: EventType = js.native
  @scala.inline
  def Create_=(x: EventType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Create")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EventType.Delete")
  @js.native
  def Delete: EventType = js.native
  @scala.inline
  def Delete_=(x: EventType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Delete")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EventType.RollBack")
  @js.native
  def RollBack: EventType = js.native
  @scala.inline
  def RollBack_=(x: EventType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RollBack")(x.asInstanceOf[js.Any])
}
