package typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueType")
@js.native
open class WidgetValueType protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def allowNonPersistableEntities: Boolean = js.native
  def allowNonPersistableEntities_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 9.12.0: introduced
    */
  def associationTypes: IList[CustomWidgetAssociationType] = js.native
  
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
  
  /**
    * In version 9.12.0: introduced
    */
  def selectableObjectsProperty: String = js.native
  def selectableObjectsProperty_=(newValue: String): Unit = js.native
  
  /**
    * In version 9.23.0: introduced
    */
  def selectionTypes: IList[CustomWidgetSelectionType] = js.native
  
  def translations: IList[WidgetTranslation] = js.native
  
  def `type`: WidgetValueTypeEnum = js.native
  def type_=(newValue: WidgetValueTypeEnum): Unit = js.native
  
  /**
    * In version 9.12.0: deleted
    * In version 9.10.0: introduced
    */
  def universeDataSourceProperty: String = js.native
  def universeDataSourceProperty_=(newValue: String): Unit = js.native
}
object WidgetValueType {
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WidgetValueType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): WidgetValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[WidgetValueType]
  
  /**
    * Creates and returns a new WidgetValueType instance in the SDK and on the server.
    * The new WidgetValueType will be automatically stored in the 'valueType' property
    * of the parent WidgetPropertyType element passed as argument.
    */
  /* static member */
  inline def createIn(container: WidgetPropertyType): WidgetValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[WidgetValueType]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
