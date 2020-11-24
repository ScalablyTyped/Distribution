package typings.mendixmodelsdk.securityMod.security

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/user-roles relevant section in reference guide}
  */
@js.native
trait IUserRole
  extends IElement
     with IByNameReferrable {
  
  val containerAsProjectSecurity: IProjectSecurity = js.native
  
  @JSName("model")
  val model_IUserRole: IModel = js.native
  
  val name: String = js.native
}
