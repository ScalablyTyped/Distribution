package typings.mendixmodelsdk.srcGenRestMod.rest

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/rest", "rest.AssociationNavigability")
@js.native
open class AssociationNavigability protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object AssociationNavigability {
  
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.AssociationNavigability")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.AssociationNavigability.BothDirections")
  @js.native
  def BothDirections: AssociationNavigability = js.native
  inline def BothDirections_=(x: AssociationNavigability): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BothDirections")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.AssociationNavigability.ChildToParent")
  @js.native
  def ChildToParent: AssociationNavigability = js.native
  inline def ChildToParent_=(x: AssociationNavigability): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ChildToParent")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.AssociationNavigability.ParentToChild")
  @js.native
  def ParentToChild: AssociationNavigability = js.native
  inline def ParentToChild_=(x: AssociationNavigability): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ParentToChild")(x.asInstanceOf[js.Any])
}
