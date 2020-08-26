package typings.mendixmodelsdk.customwidgetsMod.customwidgets

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
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
  @JSName("model")
  var model_FWidgetValueType: IModel = js.native
  def allowNonPersistableEntities: Boolean = js.native
  def allowNonPersistableEntities_=(newValue: Boolean): Unit = js.native
  def attributeTypes: IList[CustomWidgetAttributeType] = js.native
  def containerAsWidgetPropertyType: WidgetPropertyType = js.native
  /**
    * In version 8.4.0: introduced
    */
  def dataSourceProperty: String = js.native
  def dataSourceProperty_=(newValue: String): Unit = js.native
  def defaultValue: String = js.native
  def defaultValue_=(newValue: String): Unit = js.native
  def entityProperty: String = js.native
  def entityProperty_=(newValue: String): Unit = js.native
  def enumerationValues: IList[WidgetEnumerationValue] = js.native
  def isList: Boolean = js.native
  def isList_=(newValue: Boolean): Unit = js.native
  def isPath: IsPath = js.native
  def isPath_=(newValue: IsPath): Unit = js.native
  def multiline: Boolean = js.native
  def multiline_=(newValue: Boolean): Unit = js.native
  def objectType: WidgetObjectType | Null = js.native
  def objectType_=(newValue: WidgetObjectType | Null): Unit = js.native
  /**
    * In version 8.0.0: introduced
    */
  def onChangeProperty: String = js.native
  def onChangeProperty_=(newValue: String): Unit = js.native
  def parameterIsList: Boolean = js.native
  def parameterIsList_=(newValue: Boolean): Unit = js.native
  def pathType: PathType = js.native
  def pathType_=(newValue: PathType): Unit = js.native
  def required: Boolean = js.native
  def required_=(newValue: Boolean): Unit = js.native
  def returnType: WidgetReturnType | Null = js.native
  def returnType_=(newValue: WidgetReturnType | Null): Unit = js.native
  def translations: IList[WidgetTranslation] = js.native
  def `type`: WidgetValueTypeEnum = js.native
  def type_=(newValue: WidgetValueTypeEnum): Unit = js.native
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

