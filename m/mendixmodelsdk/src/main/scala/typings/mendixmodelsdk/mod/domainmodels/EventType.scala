package typings.mendixmodelsdk.mod.domainmodels

import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "domainmodels.EventType")
@js.native
open class EventType protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.domainmodels.EventType {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object EventType {
  
  @JSImport("mendixmodelsdk", "domainmodels.EventType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.EventType.Commit")
  @js.native
  def Commit: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.EventType = js.native
  inline def Commit_=(x: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.EventType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Commit")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.EventType.Create")
  @js.native
  def Create: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.EventType = js.native
  inline def Create_=(x: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.EventType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Create")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.EventType.Delete")
  @js.native
  def Delete: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.EventType = js.native
  inline def Delete_=(x: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.EventType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Delete")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.EventType.RollBack")
  @js.native
  def RollBack: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.EventType = js.native
  inline def RollBack_=(x: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.EventType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RollBack")(x.asInstanceOf[js.Any])
}
