package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflowParameter
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.19.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowParameterMapping")
@js.native
class MicroflowParameterMapping protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FMicroflowParameterMapping: IModel = js.native
  def containerAsMicroflowSettings(): MicroflowSettings = js.native
  def parameter(): IMicroflowParameter = js.native
  def parameter(newValue: IMicroflowParameter): js.Any = js.native
  def parameterQualifiedName(): String = js.native
  /**
    * In version 8.4.0: deleted
    */
  def useAllPages(): Boolean = js.native
  def useAllPages(newValue: Boolean): js.Any = js.native
  /**
    * In version 8.4.0: introduced
    */
  def variable(): PageVariable = js.native
  def variable(newValue: PageVariable): js.Any = js.native
  /**
    * In version 8.4.0: deleted
    */
  def widget(): EntityWidget | Null = js.native
  def widget(newValue: EntityWidget): js.Any = js.native
  def widgetLocalName(): String | Null = js.native
  @JSName("widget")
  def widget_Any(): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowParameterMapping")
@js.native
object MicroflowParameterMapping extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MicroflowParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MicroflowParameterMapping = js.native
  /**
    * Creates and returns a new MicroflowParameterMapping instance in the SDK and on the server.
    * The new MicroflowParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent MicroflowSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  def createIn(container: MicroflowSettings): MicroflowParameterMapping = js.native
}

