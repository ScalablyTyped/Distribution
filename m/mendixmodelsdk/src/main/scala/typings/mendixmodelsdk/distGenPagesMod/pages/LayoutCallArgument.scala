package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutCallArgument")
@js.native
class LayoutCallArgument protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val containerAsLayoutCall: LayoutCall = js.native
  @JSName("model")
  var model_LayoutCallArgument: IModel = js.native
  /**
    * In version 6.8.0: introduced
    */
  var parameter: ILayoutParameter = js.native
  /**
    * In version 6.8.0: deleted
    */
  var parameterName: String = js.native
  val parameterQualifiedName: String = js.native
  /**
    * In version 7.15.0: deleted
    */
  var widget: Widget | Null = js.native
  /**
    * In version 7.15.0: introduced
    */
  val widgets: IList[Widget] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutCallArgument")
@js.native
object LayoutCallArgument extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new LayoutCallArgument instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): LayoutCallArgument = js.native
  /**
    * Creates and returns a new LayoutCallArgument instance in the SDK and on the server.
    * The new LayoutCallArgument will be automatically stored in the 'arguments' property
    * of the parent LayoutCall element passed as argument.
    */
  def createIn(container: LayoutCall): LayoutCallArgument = js.native
}

