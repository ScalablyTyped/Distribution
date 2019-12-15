package typings.mendixmodelsdk.distGenAppservicesMod.appservices

import typings.mendixmodelsdk.distGenAppservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMicroflow")
@js.native
class MsdMicroflow protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FMsdMicroflow: IModel = js.native
  def containerAsMsdMetadata(): MsdMetadata = js.native
  def description(): String = js.native
  def description(newValue: String): js.Any = js.native
  def documentation(): String = js.native
  def documentation(newValue: String): js.Any = js.native
  def image(): String = js.native
  def image(newValue: String): js.Any = js.native
  def name(): String = js.native
  def name(newValue: String): js.Any = js.native
  def parameters(): IList[MsdMicroflowParameter] = js.native
  def returnType(): String = js.native
  def returnType(newValue: String): js.Any = js.native
  def returnTypeCanBeEmpty(): Boolean = js.native
  def returnTypeCanBeEmpty(newValue: Boolean): js.Any = js.native
  def returnTypeSpecification(): String = js.native
  def returnTypeSpecification(newValue: String): js.Any = js.native
  /**
    * In version 6.1.0: deleted
    */
  def systemEntityType(): String = js.native
  def systemEntityType(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMicroflow")
@js.native
object MsdMicroflow extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdMicroflow instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MsdMicroflow = js.native
  /**
    * Creates and returns a new MsdMicroflow instance in the SDK and on the server.
    * The new MsdMicroflow will be automatically stored in the 'microflows' property
    * of the parent MsdMetadata element passed as argument.
    */
  def createIn(container: MsdMetadata): MsdMicroflow = js.native
}

