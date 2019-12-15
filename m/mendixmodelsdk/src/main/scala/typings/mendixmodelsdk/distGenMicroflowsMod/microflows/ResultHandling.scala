package typings.mendixmodelsdk.distGenMicroflowsMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDatatypesMod.datatypes.DataType
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ResultHandling")
@js.native
class ResultHandling protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FResultHandling: IModel = js.native
  def containerAsImportXmlAction(): ImportXmlAction = js.native
  def containerAsRestCallAction(): RestCallAction = js.native
  def containerAsWebServiceCallAction(): WebServiceCallAction = js.native
  def importMappingCall(): ImportMappingCall | Null = js.native
  def importMappingCall(newValue: ImportMappingCall): js.Any = js.native
  @JSName("importMappingCall")
  def importMappingCall_Any(): js.Any = js.native
  def outputVariableName(): String = js.native
  def outputVariableName(newValue: String): js.Any = js.native
  def storeInVariable(): Boolean = js.native
  def storeInVariable(newValue: Boolean): js.Any = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    * In version 6.10.0: introduced
    */
  def variableDataType(): String = js.native
  def variableDataType(newValue: String): js.Any = js.native
  /**
    * In version 7.9.0: introduced
    */
  def variableType(): DataType = js.native
  def variableType(newValue: DataType): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ResultHandling")
@js.native
object ResultHandling extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ResultHandling instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ResultHandling = js.native
  /**
    * Creates and returns a new ResultHandling instance in the SDK and on the server.
    * The new ResultHandling will be automatically stored in the 'resultHandling' property
    * of the parent ImportXmlAction element passed as argument.
    */
  def createInImportXmlActionUnderResultHandling(container: ImportXmlAction): ResultHandling = js.native
  /**
    * Creates and returns a new ResultHandling instance in the SDK and on the server.
    * The new ResultHandling will be automatically stored in the 'resultHandling' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  def createInRestCallActionUnderResultHandling(container: RestCallAction): ResultHandling = js.native
  /**
    * Creates and returns a new ResultHandling instance in the SDK and on the server.
    * The new ResultHandling will be automatically stored in the 'resultHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  def createInWebServiceCallActionUnderResultHandling(container: WebServiceCallAction): ResultHandling = js.native
}

