package typings.mendixmodelsdk.appservicesMod.appservices

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAppServiceActionParameter
  extends IElement
     with IByNameReferrable {
  
  val containerAsAppServiceAction: IAppServiceAction = js.native
  
  @JSName("model")
  val model_IAppServiceActionParameter: IModel = js.native
  
  val name: String = js.native
}
