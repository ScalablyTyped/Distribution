package typings.mendixmodelsdk.srcGenAllModelClassesMod.customwidgets

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetObjectType")
@js.native
open class WidgetObjectType protected ()
  extends typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObjectType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object WidgetObjectType {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetObjectType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObjectType]
  
  /**
    * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
    * The new WidgetObjectType will be automatically stored in the 'objectType' property
    * of the parent CustomWidgetType element passed as argument.
    */
  /* static member */
  inline def createInCustomWidgetTypeUnderObjectType(container: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetType): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomWidgetTypeUnderObjectType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObjectType]
  
  /**
    * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
    * The new WidgetObjectType will be automatically stored in the 'objectType' property
    * of the parent WidgetValueType element passed as argument.
    */
  /* static member */
  inline def createInWidgetValueTypeUnderObjectType(container: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueType): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueTypeUnderObjectType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObjectType]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetObjectType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetObjectType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
