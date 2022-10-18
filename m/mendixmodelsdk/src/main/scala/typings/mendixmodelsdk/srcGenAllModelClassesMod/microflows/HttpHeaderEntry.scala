package typings.mendixmodelsdk.srcGenAllModelClassesMod.microflows

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

@JSImport("mendixmodelsdk/src/gen/all-model-classes", "microflows.HttpHeaderEntry")
@js.native
open class HttpHeaderEntry protected ()
  extends typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpHeaderEntry {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object HttpHeaderEntry {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "microflows.HttpHeaderEntry")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new HttpHeaderEntry instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpHeaderEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpHeaderEntry]
  
  /**
    * Creates and returns a new HttpHeaderEntry instance in the SDK and on the server.
    * The new HttpHeaderEntry will be automatically stored in the 'headerEntries' property
    * of the parent HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 9.1.0
    */
  /* static member */
  inline def createIn(container: typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpConfiguration): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpHeaderEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpHeaderEntry]
  
  /**
    * Creates and returns a new HttpHeaderEntry instance in the SDK and on the server.
    * The new HttpHeaderEntry will be automatically stored in the 'headerEntries' property
    * of the parent FormDataPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.2.0 and higher
    */
  /* static member */
  inline def createInFormDataPartUnderHeaderEntries(container: typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.FormDataPart): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpHeaderEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("createInFormDataPartUnderHeaderEntries")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpHeaderEntry]
  
  /**
    * Creates and returns a new HttpHeaderEntry instance in the SDK and on the server.
    * The new HttpHeaderEntry will be automatically stored in the 'headerEntries' property
    * of the parent HttpConfiguration element passed as argument.
    */
  /* static member */
  inline def createInHttpConfigurationUnderHeaderEntries(container: typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpConfiguration): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpHeaderEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHttpConfigurationUnderHeaderEntries")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpHeaderEntry]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "microflows.HttpHeaderEntry.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "microflows.HttpHeaderEntry.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
