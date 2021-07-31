package typings.mendixmodelsdk.allModelClassesMod.microflows

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.CustomRange")
@js.native
class CustomRange protected ()
  extends typings.mendixmodelsdk.microflowsMod.microflows.CustomRange {
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
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.CustomRange")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new CustomRange instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): typings.mendixmodelsdk.microflowsMod.microflows.CustomRange = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.microflowsMod.microflows.CustomRange]
  
  /**
    * Creates and returns a new CustomRange instance in the SDK and on the server.
    * The new CustomRange will be automatically stored in the 'range' property
    * of the parent DatabaseRetrieveSource element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInDatabaseRetrieveSourceUnderRange(container: typings.mendixmodelsdk.microflowsMod.microflows.DatabaseRetrieveSource): typings.mendixmodelsdk.microflowsMod.microflows.CustomRange = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDatabaseRetrieveSourceUnderRange")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.microflowsMod.microflows.CustomRange]
  
  /**
    * Creates and returns a new CustomRange instance in the SDK and on the server.
    * The new CustomRange will be automatically stored in the 'range' property
    * of the parent ImportMappingCall element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInImportMappingCallUnderRange(container: typings.mendixmodelsdk.microflowsMod.microflows.ImportMappingCall): typings.mendixmodelsdk.microflowsMod.microflows.CustomRange = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingCallUnderRange")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.microflowsMod.microflows.CustomRange]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.CustomRange.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.CustomRange.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
