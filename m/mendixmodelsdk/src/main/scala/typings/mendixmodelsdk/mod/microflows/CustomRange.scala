package typings.mendixmodelsdk.mod.microflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "microflows.CustomRange")
@js.native
open class CustomRange protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.microflows.CustomRange {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object CustomRange {
  
  @JSImport("mendixmodelsdk", "microflows.CustomRange")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new CustomRange instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.CustomRange = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.CustomRange]
  
  /**
    * Creates and returns a new CustomRange instance in the SDK and on the server.
    * The new CustomRange will be automatically stored in the 'range' property
    * of the parent DatabaseRetrieveSource element passed as argument.
    */
  /* static member */
  inline def createInDatabaseRetrieveSourceUnderRange(container: typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.DatabaseRetrieveSource): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.CustomRange = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDatabaseRetrieveSourceUnderRange")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.CustomRange]
  
  /**
    * Creates and returns a new CustomRange instance in the SDK and on the server.
    * The new CustomRange will be automatically stored in the 'range' property
    * of the parent ImportMappingCall element passed as argument.
    */
  /* static member */
  inline def createInImportMappingCallUnderRange(container: typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ImportMappingCall): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.CustomRange = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingCallUnderRange")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.CustomRange]
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.CustomRange.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.CustomRange.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
