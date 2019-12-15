package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.4.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageVariable")
@js.native
class PageVariable protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FPageVariable: IModel = js.native
  def containerAsMicroflowParameterMapping(): MicroflowParameterMapping = js.native
  def containerAsNanoflowParameterMapping(): NanoflowParameterMapping = js.native
  def useAllPages(): Boolean = js.native
  def useAllPages(newValue: Boolean): js.Any = js.native
  def widget(): Widget | Null = js.native
  def widget(newValue: Widget): js.Any = js.native
  def widgetLocalName(): String | Null = js.native
  @JSName("widget")
  def widget_Any(): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageVariable")
@js.native
object PageVariable extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): PageVariable = js.native
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'variable' property
    * of the parent MicroflowParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 and higher
    */
  def createInMicroflowParameterMappingUnderVariable(container: MicroflowParameterMapping): PageVariable = js.native
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'variable' property
    * of the parent NanoflowParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 and higher
    */
  def createInNanoflowParameterMappingUnderVariable(container: NanoflowParameterMapping): PageVariable = js.native
}

