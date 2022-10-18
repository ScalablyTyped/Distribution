package typings.mendixmodelsdk.srcGenAllModelClassesMod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.ConfirmationInfo")
@js.native
open class ConfirmationInfo protected ()
  extends typings.mendixmodelsdk.srcGenPagesMod.pages.ConfirmationInfo {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ConfirmationInfo {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.ConfirmationInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenPagesMod.pages.ConfirmationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.ConfirmationInfo]
  
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * The new ConfirmationInfo will be automatically stored in the 'confirmationInfo' property
    * of the parent MicroflowSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.7.0
    */
  /* static member */
  inline def createIn(container: typings.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings): typings.mendixmodelsdk.srcGenPagesMod.pages.ConfirmationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.ConfirmationInfo]
  
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * The new ConfirmationInfo will be automatically stored in the 'confirmationInfo' property
    * of the parent CallNanoflowClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.8.0 and higher
    */
  /* static member */
  inline def createInCallNanoflowClientActionUnderConfirmationInfo(container: typings.mendixmodelsdk.srcGenPagesMod.pages.CallNanoflowClientAction): typings.mendixmodelsdk.srcGenPagesMod.pages.ConfirmationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCallNanoflowClientActionUnderConfirmationInfo")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.ConfirmationInfo]
  
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * The new ConfirmationInfo will be automatically stored in the 'confirmationInfo' property
    * of the parent CallWorkflowClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.12.0 and higher
    */
  /* static member */
  inline def createInCallWorkflowClientActionUnderConfirmationInfo(container: typings.mendixmodelsdk.srcGenPagesMod.pages.CallWorkflowClientAction): typings.mendixmodelsdk.srcGenPagesMod.pages.ConfirmationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCallWorkflowClientActionUnderConfirmationInfo")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.ConfirmationInfo]
  
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * The new ConfirmationInfo will be automatically stored in the 'confirmationInfo' property
    * of the parent MicroflowSettings element passed as argument.
    */
  /* static member */
  inline def createInMicroflowSettingsUnderConfirmationInfo(container: typings.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings): typings.mendixmodelsdk.srcGenPagesMod.pages.ConfirmationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowSettingsUnderConfirmationInfo")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.ConfirmationInfo]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.ConfirmationInfo.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.ConfirmationInfo.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
