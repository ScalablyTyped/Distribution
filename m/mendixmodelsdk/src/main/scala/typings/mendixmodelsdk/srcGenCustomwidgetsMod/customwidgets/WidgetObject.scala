package typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate
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

@JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetObject")
@js.native
open class WidgetObject protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsCustomWidget: CustomWidget = js.native
  
  def containerAsWidgetValue: WidgetValue = js.native
  
  /**
    * In version 8.1.0: deleted
    * In version 7.23.0: introduced
    */
  def labelTemplate: ClientTemplate | Null = js.native
  def labelTemplate_=(newValue: ClientTemplate | Null): Unit = js.native
  
  def properties: IList[WidgetProperty] = js.native
  
  /**
    * In version 7.13.0: added optional
    */
  def `type`: WidgetObjectType | Null = js.native
  def type_=(newValue: WidgetObjectType | Null): Unit = js.native
}
object WidgetObject {
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetObject")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WidgetObject instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): WidgetObject = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[WidgetObject]
  
  /**
    * Creates and returns a new WidgetObject instance in the SDK and on the server.
    * The new WidgetObject will be automatically stored in the 'object' property
    * of the parent CustomWidget element passed as argument.
    */
  /* static member */
  inline def createInCustomWidgetUnderObject(container: CustomWidget): WidgetObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomWidgetUnderObject")(container.asInstanceOf[js.Any]).asInstanceOf[WidgetObject]
  
  /**
    * Creates and returns a new WidgetObject instance in the SDK and on the server.
    * The new WidgetObject will be automatically stored in the 'objects' property
    * of the parent WidgetValue element passed as argument.
    */
  /* static member */
  inline def createInWidgetValueUnderObjects(container: WidgetValue): WidgetObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderObjects")(container.asInstanceOf[js.Any]).asInstanceOf[WidgetObject]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetObject.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetObject.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
