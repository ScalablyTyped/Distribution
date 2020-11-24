package typings.mendixmodelsdk.allModelClassesMod.appservices

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "appservices.AppServiceAction")
@js.native
class AppServiceAction protected ()
  extends typings.mendixmodelsdk.appservicesMod.appservices.AppServiceAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "appservices.AppServiceAction")
@js.native
object AppServiceAction extends js.Object {
  
  /**
    * Creates and returns a new AppServiceAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.appservicesMod.appservices.AppServiceAction = js.native
  
  /**
    * Creates and returns a new AppServiceAction instance in the SDK and on the server.
    * The new AppServiceAction will be automatically stored in the 'actions' property
    * of the parent ConsumedAppService element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.appservicesMod.appservices.ConsumedAppService): typings.mendixmodelsdk.appservicesMod.appservices.AppServiceAction = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
