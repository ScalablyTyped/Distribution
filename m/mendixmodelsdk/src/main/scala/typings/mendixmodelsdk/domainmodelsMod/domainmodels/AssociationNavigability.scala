package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationNavigability")
@js.native
class AssociationNavigability protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object AssociationNavigability {
  
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationNavigability")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationNavigability.BothDirections")
  @js.native
  def BothDirections: AssociationNavigability = js.native
  @scala.inline
  def BothDirections_=(x: AssociationNavigability): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BothDirections")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationNavigability.ChildToParent")
  @js.native
  def ChildToParent: AssociationNavigability = js.native
  @scala.inline
  def ChildToParent_=(x: AssociationNavigability): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ChildToParent")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationNavigability.ParentToChild")
  @js.native
  def ParentToChild: AssociationNavigability = js.native
  @scala.inline
  def ParentToChild_=(x: AssociationNavigability): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ParentToChild")(x.asInstanceOf[js.Any])
}
