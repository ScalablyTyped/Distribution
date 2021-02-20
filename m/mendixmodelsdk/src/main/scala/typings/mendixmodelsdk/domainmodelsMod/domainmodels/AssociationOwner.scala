package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationOwner")
@js.native
class AssociationOwner protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object AssociationOwner {
  
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationOwner")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationOwner.Both")
  @js.native
  def Both: AssociationOwner = js.native
  @scala.inline
  def Both_=(x: AssociationOwner): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Both")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationOwner.Default")
  @js.native
  def Default: AssociationOwner = js.native
  @scala.inline
  def Default_=(x: AssociationOwner): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
}
