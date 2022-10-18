package typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.AssociationType")
@js.native
open class AssociationType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object AssociationType {
  
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.AssociationType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.AssociationType.Reference")
  @js.native
  def Reference: AssociationType = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.AssociationType.ReferenceSet")
  @js.native
  def ReferenceSet: AssociationType = js.native
  inline def ReferenceSet_=(x: AssociationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReferenceSet")(x.asInstanceOf[js.Any])
  
  inline def Reference_=(x: AssociationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Reference")(x.asInstanceOf[js.Any])
}
