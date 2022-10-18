package typings.mendixmodelsdk.srcGenAllModelClassesMod.javaactions

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenJavaactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: deleted
  * In version 7.2.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "javaactions.ExportMappingParameterType")
@js.native
open class ExportMappingParameterType protected ()
  extends typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.ExportMappingParameterType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ExportMappingParameterType {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "javaactions.ExportMappingParameterType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ExportMappingParameterType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.ExportMappingParameterType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.ExportMappingParameterType]
  
  /**
    * Creates and returns a new ExportMappingParameterType instance in the SDK and on the server.
    * The new ExportMappingParameterType will be automatically stored in the 'parameterType' property
    * of the parent JavaActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.2.0 to 7.20.0
    */
  /* static member */
  inline def createIn(container: typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.JavaActionParameter): typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.ExportMappingParameterType = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.ExportMappingParameterType]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "javaactions.ExportMappingParameterType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "javaactions.ExportMappingParameterType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
