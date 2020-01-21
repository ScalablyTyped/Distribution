package typings.mendixmodelsdk.customwidgetsMod.customwidgets

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.WidgetPropertyType")
@js.native
class WidgetPropertyType protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FWidgetPropertyType: IModel = js.native
  def caption(): String = js.native
  def caption(newValue: String): js.Any = js.native
  def category(): String = js.native
  def category(newValue: String): js.Any = js.native
  def containerAsWidgetObjectType(): WidgetObjectType = js.native
  def description(): String = js.native
  def description(newValue: String): js.Any = js.native
  def isDefault(): Boolean = js.native
  def isDefault(newValue: Boolean): js.Any = js.native
  def key(): String = js.native
  def key(newValue: String): js.Any = js.native
  def valueType(): js.Any = js.native
  def valueType(newValue: WidgetValueType): js.Any = js.native
  /**
    * In version 7.13.0: added optional
    */
  @JSName("valueType")
  def valueType_Union(): WidgetValueType | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.WidgetPropertyType")
@js.native
object WidgetPropertyType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new WidgetPropertyType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): WidgetPropertyType = js.native
  /**
    * Creates and returns a new WidgetPropertyType instance in the SDK and on the server.
    * The new WidgetPropertyType will be automatically stored in the 'propertyTypes' property
    * of the parent WidgetObjectType element passed as argument.
    */
  def createIn(container: WidgetObjectType): WidgetPropertyType = js.native
}

