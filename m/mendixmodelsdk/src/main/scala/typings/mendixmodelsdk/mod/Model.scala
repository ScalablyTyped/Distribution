package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.srcCommonMod.common.IErrorCallback
import typings.mendixmodelsdk.srcModelMod.IModel
import typings.mendixmodelsdk.srcModelSdkClientImplMod.ModelSdkClientImpl
import typings.mendixmodelsdk.srcSdkConfigurationMod.configuration.ISdkConfig
import typings.mendixmodelsdk.srcSdkInternalImodelserverclientMod.IModelServerClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "Model")
@js.native
open class Model protected ()
  extends typings.mendixmodelsdk.srcModelMod.Model {
  def this(_client: IModelServerClient, _errorHandler: IErrorCallback) = this()
}
/* static members */
object Model {
  
  @JSImport("mendixmodelsdk", "Model")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSdkClient(connectionConfig: ISdkConfig): ModelSdkClientImpl[IModel, typings.mendixmodelsdk.srcModelMod.Model] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSdkClient")(connectionConfig.asInstanceOf[js.Any]).asInstanceOf[ModelSdkClientImpl[IModel, typings.mendixmodelsdk.srcModelMod.Model]]
}
