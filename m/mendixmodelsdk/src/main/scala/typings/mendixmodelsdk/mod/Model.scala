package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.commonMod.common.IErrorCallback
import typings.mendixmodelsdk.configurationMod.configuration.ISdkConfig
import typings.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import typings.mendixmodelsdk.modelMod.IModel
import typings.mendixmodelsdk.modelSdkClientImplMod.ModelSdkClientImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "Model")
@js.native
class Model protected ()
  extends typings.mendixmodelsdk.modelMod.Model {
  def this(_client: IModelServerClient, _errorHandler: IErrorCallback) = this()
}
/* static members */
object Model {
  
  @JSImport("mendixmodelsdk", "Model")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSdkClient(connectionConfig: ISdkConfig): ModelSdkClientImpl[IModel, typings.mendixmodelsdk.modelMod.Model] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSdkClient")(connectionConfig.asInstanceOf[js.Any]).asInstanceOf[ModelSdkClientImpl[IModel, typings.mendixmodelsdk.modelMod.Model]]
}
