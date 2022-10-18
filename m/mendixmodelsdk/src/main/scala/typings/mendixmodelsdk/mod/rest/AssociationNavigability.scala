package typings.mendixmodelsdk.mod.rest

import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "rest.AssociationNavigability")
@js.native
open class AssociationNavigability protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.rest.AssociationNavigability {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object AssociationNavigability {
  
  @JSImport("mendixmodelsdk", "rest.AssociationNavigability")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "rest.AssociationNavigability.BothDirections")
  @js.native
  def BothDirections: typings.mendixmodelsdk.srcGenRestMod.rest.AssociationNavigability = js.native
  inline def BothDirections_=(x: typings.mendixmodelsdk.srcGenRestMod.rest.AssociationNavigability): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BothDirections")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "rest.AssociationNavigability.ChildToParent")
  @js.native
  def ChildToParent: typings.mendixmodelsdk.srcGenRestMod.rest.AssociationNavigability = js.native
  inline def ChildToParent_=(x: typings.mendixmodelsdk.srcGenRestMod.rest.AssociationNavigability): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ChildToParent")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "rest.AssociationNavigability.ParentToChild")
  @js.native
  def ParentToChild: typings.mendixmodelsdk.srcGenRestMod.rest.AssociationNavigability = js.native
  inline def ParentToChild_=(x: typings.mendixmodelsdk.srcGenRestMod.rest.AssociationNavigability): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ParentToChild")(x.asInstanceOf[js.Any])
}
