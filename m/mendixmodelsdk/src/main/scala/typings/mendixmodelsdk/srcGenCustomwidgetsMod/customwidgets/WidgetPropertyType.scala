package typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetPropertyType")
@js.native
open class WidgetPropertyType protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def caption: String = js.native
  def caption_=(newValue: String): Unit = js.native
  
  def category: String = js.native
  def category_=(newValue: String): Unit = js.native
  
  def containerAsWidgetObjectType: WidgetObjectType = js.native
  
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  
  def isDefault: Boolean = js.native
  def isDefault_=(newValue: Boolean): Unit = js.native
  
  def key: String = js.native
  def key_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.13.0: added optional
    */
  def valueType: WidgetValueType | Null = js.native
  def valueType_=(newValue: WidgetValueType | Null): Unit = js.native
}
object WidgetPropertyType {
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetPropertyType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WidgetPropertyType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): WidgetPropertyType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[WidgetPropertyType]
  
  /**
    * Creates and returns a new WidgetPropertyType instance in the SDK and on the server.
    * The new WidgetPropertyType will be automatically stored in the 'propertyTypes' property
    * of the parent WidgetObjectType element passed as argument.
    */
  /* static member */
  inline def createIn(container: WidgetObjectType): WidgetPropertyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[WidgetPropertyType]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetPropertyType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetPropertyType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
