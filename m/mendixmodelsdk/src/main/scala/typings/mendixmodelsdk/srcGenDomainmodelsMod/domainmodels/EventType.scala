package typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.EventType")
@js.native
open class EventType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object EventType {
  
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.EventType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.EventType.Commit")
  @js.native
  def Commit: EventType = js.native
  inline def Commit_=(x: EventType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Commit")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.EventType.Create")
  @js.native
  def Create: EventType = js.native
  inline def Create_=(x: EventType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Create")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.EventType.Delete")
  @js.native
  def Delete: EventType = js.native
  inline def Delete_=(x: EventType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Delete")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.EventType.RollBack")
  @js.native
  def RollBack: EventType = js.native
  inline def RollBack_=(x: EventType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RollBack")(x.asInstanceOf[js.Any])
}
