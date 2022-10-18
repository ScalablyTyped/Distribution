package typings.mendixmodelsdk.mod.domainmodels

import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "domainmodels.DeletingBehavior")
@js.native
open class DeletingBehavior protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.domainmodels.DeletingBehavior {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object DeletingBehavior {
  
  @JSImport("mendixmodelsdk", "domainmodels.DeletingBehavior")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.DeletingBehavior.DeleteMeAndReferences")
  @js.native
  def DeleteMeAndReferences: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DeletingBehavior = js.native
  inline def DeleteMeAndReferences_=(x: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DeletingBehavior): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeleteMeAndReferences")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.DeletingBehavior.DeleteMeButKeepReferences")
  @js.native
  def DeleteMeButKeepReferences: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DeletingBehavior = js.native
  inline def DeleteMeButKeepReferences_=(x: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DeletingBehavior): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeleteMeButKeepReferences")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.DeletingBehavior.DeleteMeIfNoReferences")
  @js.native
  def DeleteMeIfNoReferences: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DeletingBehavior = js.native
  inline def DeleteMeIfNoReferences_=(x: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DeletingBehavior): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeleteMeIfNoReferences")(x.asInstanceOf[js.Any])
}
