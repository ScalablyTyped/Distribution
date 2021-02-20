package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.MemberAccessRights")
@js.native
class MemberAccessRights protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object MemberAccessRights {
  
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.MemberAccessRights")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.MemberAccessRights.None")
  @js.native
  def None: MemberAccessRights = js.native
  @scala.inline
  def None_=(x: MemberAccessRights): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.MemberAccessRights.ReadOnly")
  @js.native
  def ReadOnly: MemberAccessRights = js.native
  @scala.inline
  def ReadOnly_=(x: MemberAccessRights): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReadOnly")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.MemberAccessRights.ReadWrite")
  @js.native
  def ReadWrite: MemberAccessRights = js.native
  @scala.inline
  def ReadWrite_=(x: MemberAccessRights): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReadWrite")(x.asInstanceOf[js.Any])
}
