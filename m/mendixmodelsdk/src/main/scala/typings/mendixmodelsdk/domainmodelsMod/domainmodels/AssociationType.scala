package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationType")
@js.native
class AssociationType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object AssociationType {
  
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationType.Reference")
  @js.native
  def Reference: AssociationType = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationType.ReferenceSet")
  @js.native
  def ReferenceSet: AssociationType = js.native
  @scala.inline
  def ReferenceSet_=(x: AssociationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReferenceSet")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Reference_=(x: AssociationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Reference")(x.asInstanceOf[js.Any])
}
