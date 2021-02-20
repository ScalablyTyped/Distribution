package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.DeletingBehavior")
@js.native
class DeletingBehavior protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object DeletingBehavior {
  
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.DeletingBehavior")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.DeletingBehavior.DeleteMeAndReferences")
  @js.native
  def DeleteMeAndReferences: DeletingBehavior = js.native
  @scala.inline
  def DeleteMeAndReferences_=(x: DeletingBehavior): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeleteMeAndReferences")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.DeletingBehavior.DeleteMeButKeepReferences")
  @js.native
  def DeleteMeButKeepReferences: DeletingBehavior = js.native
  @scala.inline
  def DeleteMeButKeepReferences_=(x: DeletingBehavior): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeleteMeButKeepReferences")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.DeletingBehavior.DeleteMeIfNoReferences")
  @js.native
  def DeleteMeIfNoReferences: DeletingBehavior = js.native
  @scala.inline
  def DeleteMeIfNoReferences_=(x: DeletingBehavior): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeleteMeIfNoReferences")(x.asInstanceOf[js.Any])
}
