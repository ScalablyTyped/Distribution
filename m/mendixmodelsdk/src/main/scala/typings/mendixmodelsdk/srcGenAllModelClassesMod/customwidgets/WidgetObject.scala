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

@JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetObject")
@js.native
open class WidgetObject protected ()
  extends typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObject {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object WidgetObject {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetObject")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WidgetObject instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObject = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObject]
  
  /**
    * Creates and returns a new WidgetObject instance in the SDK and on the server.
    * The new WidgetObject will be automatically stored in the 'object' property
    * of the parent CustomWidget element passed as argument.
    */
  /* static member */
  inline def createInCustomWidgetUnderObject(container: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomWidgetUnderObject")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObject]
  
  /**
    * Creates and returns a new WidgetObject instance in the SDK and on the server.
    * The new WidgetObject will be automatically stored in the 'objects' property
    * of the parent WidgetValue element passed as argument.
    */
  /* static member */
  inline def createInWidgetValueUnderObjects(container: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderObjects")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObject]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetObject.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetObject.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
