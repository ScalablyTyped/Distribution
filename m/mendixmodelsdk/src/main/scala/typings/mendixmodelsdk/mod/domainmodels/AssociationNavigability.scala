package typings.mendixmodelsdk.mod.domainmodels

import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "domainmodels.AssociationNavigability")
@js.native
class AssociationNavigability protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.domainmodels.AssociationNavigability {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object AssociationNavigability {
  
  @JSImport("mendixmodelsdk", "domainmodels.AssociationNavigability")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AssociationNavigability.BothDirections")
  @js.native
  def BothDirections: typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationNavigability = js.native
  inline def BothDirections_=(x: typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationNavigability): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BothDirections")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AssociationNavigability.ChildToParent")
  @js.native
  def ChildToParent: typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationNavigability = js.native
  inline def ChildToParent_=(x: typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationNavigability): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ChildToParent")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AssociationNavigability.ParentToChild")
  @js.native
  def ParentToChild: typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationNavigability = js.native
  inline def ParentToChild_=(x: typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationNavigability): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ParentToChild")(x.asInstanceOf[js.Any])
}
