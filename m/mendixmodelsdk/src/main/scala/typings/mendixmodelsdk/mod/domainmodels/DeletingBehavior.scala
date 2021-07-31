package typings.mendixmodelsdk.mod.domainmodels

import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "domainmodels.DeletingBehavior")
@js.native
class DeletingBehavior protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.domainmodels.DeletingBehavior {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object DeletingBehavior {
  
  @JSImport("mendixmodelsdk", "domainmodels.DeletingBehavior")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.DeletingBehavior.DeleteMeAndReferences")
  @js.native
  def DeleteMeAndReferences: typings.mendixmodelsdk.domainmodelsMod.domainmodels.DeletingBehavior = js.native
  @scala.inline
  def DeleteMeAndReferences_=(x: typings.mendixmodelsdk.domainmodelsMod.domainmodels.DeletingBehavior): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeleteMeAndReferences")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.DeletingBehavior.DeleteMeButKeepReferences")
  @js.native
  def DeleteMeButKeepReferences: typings.mendixmodelsdk.domainmodelsMod.domainmodels.DeletingBehavior = js.native
  @scala.inline
  def DeleteMeButKeepReferences_=(x: typings.mendixmodelsdk.domainmodelsMod.domainmodels.DeletingBehavior): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeleteMeButKeepReferences")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.DeletingBehavior.DeleteMeIfNoReferences")
  @js.native
  def DeleteMeIfNoReferences: typings.mendixmodelsdk.domainmodelsMod.domainmodels.DeletingBehavior = js.native
  @scala.inline
  def DeleteMeIfNoReferences_=(x: typings.mendixmodelsdk.domainmodelsMod.domainmodels.DeletingBehavior): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeleteMeIfNoReferences")(x.asInstanceOf[js.Any])
}
