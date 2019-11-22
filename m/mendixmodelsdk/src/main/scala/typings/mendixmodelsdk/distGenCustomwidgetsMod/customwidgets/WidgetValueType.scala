package typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.WidgetValueType")
@js.native
class WidgetValueType protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var allowNonPersistableEntities: Boolean = js.native
  val attributeTypes: IList[CustomWidgetAttributeType] = js.native
  val containerAsWidgetPropertyType: WidgetPropertyType = js.native
  /**
    * In version 8.4.0: introduced
    */
  var dataSourceProperty: String = js.native
  var defaultValue: String = js.native
  var entityProperty: String = js.native
  val enumerationValues: IList[WidgetEnumerationValue] = js.native
  var isList: Boolean = js.native
  var isPath: IsPath = js.native
  @JSName("model")
  var model_WidgetValueType: IModel = js.native
  var multiline: Boolean = js.native
  var objectType: WidgetObjectType | Null = js.native
  /**
    * In version 8.0.0: introduced
    */
  var onChangeProperty: String = js.native
  var parameterIsList: Boolean = js.native
  var pathType: PathType = js.native
  var required: Boolean = js.native
  var returnType: WidgetReturnType | Null = js.native
  val translations: IList[WidgetTranslation] = js.native
  var `type`: WidgetValueTypeEnum = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.WidgetValueType")
@js.native
object WidgetValueType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new WidgetValueType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): WidgetValueType = js.native
  /**
    * Creates and returns a new WidgetValueType instance in the SDK and on the server.
    * The new WidgetValueType will be automatically stored in the 'valueType' property
    * of the parent WidgetPropertyType element passed as argument.
    */
  def createIn(container: WidgetPropertyType): WidgetValueType = js.native
}

