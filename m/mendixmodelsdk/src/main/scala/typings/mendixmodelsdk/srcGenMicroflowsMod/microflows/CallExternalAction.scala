package typings.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenRestMod.rest.IConsumedODataService
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/call-external-action relevant section in reference guide}
  *
  * In version 9.19.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.CallExternalAction")
@js.native
open class CallExternalAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.23.0: added optional
    */
  def consumedODataService: IConsumedODataService | Null = js.native
  
  def consumedODataServiceQualifiedName: String | Null = js.native
  
  def consumedODataService_=(newValue: IConsumedODataService | Null): Unit = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
}
object CallExternalAction {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.CallExternalAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new CallExternalAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): CallExternalAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[CallExternalAction]
  
  /**
    * Creates and returns a new CallExternalAction instance in the SDK and on the server.
    * The new CallExternalAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.19.0 and higher
    */
  /* static member */
  inline def createIn(container: ActionActivity): CallExternalAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[CallExternalAction]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.CallExternalAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.CallExternalAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
