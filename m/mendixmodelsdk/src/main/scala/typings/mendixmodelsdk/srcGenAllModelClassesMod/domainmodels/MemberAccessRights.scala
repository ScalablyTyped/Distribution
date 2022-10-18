package typings.mendixmodelsdk.srcGenAllModelClassesMod.domainmodels

import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.MemberAccessRights")
@js.native
open class MemberAccessRights protected ()
  extends typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.MemberAccessRights {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object MemberAccessRights {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.MemberAccessRights")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.MemberAccessRights.None")
  @js.native
  def None: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.MemberAccessRights = js.native
  inline def None_=(x: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.MemberAccessRights): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.MemberAccessRights.ReadOnly")
  @js.native
  def ReadOnly: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.MemberAccessRights = js.native
  inline def ReadOnly_=(x: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.MemberAccessRights): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReadOnly")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.MemberAccessRights.ReadWrite")
  @js.native
  def ReadWrite: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.MemberAccessRights = js.native
  inline def ReadWrite_=(x: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.MemberAccessRights): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReadWrite")(x.asInstanceOf[js.Any])
}
