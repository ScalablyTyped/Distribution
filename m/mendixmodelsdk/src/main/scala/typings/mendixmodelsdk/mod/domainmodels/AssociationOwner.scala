package typings.mendixmodelsdk.mod.domainmodels

import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "domainmodels.AssociationOwner")
@js.native
open class AssociationOwner protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.domainmodels.AssociationOwner {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object AssociationOwner {
  
  @JSImport("mendixmodelsdk", "domainmodels.AssociationOwner")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AssociationOwner.Both")
  @js.native
  def Both: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AssociationOwner = js.native
  inline def Both_=(x: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AssociationOwner): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Both")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AssociationOwner.Default")
  @js.native
  def Default: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AssociationOwner = js.native
  inline def Default_=(x: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AssociationOwner): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
}
