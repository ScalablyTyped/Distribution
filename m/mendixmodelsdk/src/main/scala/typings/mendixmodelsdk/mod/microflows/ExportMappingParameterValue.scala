package typings.mendixmodelsdk.mod.microflows

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

/**
  * In version 7.21.0: introduced
  */
@JSImport("mendixmodelsdk", "microflows.ExportMappingParameterValue")
@js.native
class ExportMappingParameterValue protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.microflows.ExportMappingParameterValue {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ExportMappingParameterValue {
  
  @JSImport("mendixmodelsdk", "microflows.ExportMappingParameterValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ExportMappingParameterValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.microflowsMod.microflows.ExportMappingParameterValue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.microflowsMod.microflows.ExportMappingParameterValue]
  
  /**
    * Creates and returns a new ExportMappingParameterValue instance in the SDK and on the server.
    * The new ExportMappingParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  inline def createInJavaActionParameterMappingUnderParameterValue(container: typings.mendixmodelsdk.microflowsMod.microflows.JavaActionParameterMapping): typings.mendixmodelsdk.microflowsMod.microflows.ExportMappingParameterValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJavaActionParameterMappingUnderParameterValue")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.microflowsMod.microflows.ExportMappingParameterValue]
  
  /**
    * Creates and returns a new ExportMappingParameterValue instance in the SDK and on the server.
    * The new ExportMappingParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaScriptActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  inline def createInJavaScriptActionParameterMappingUnderParameterValue(container: typings.mendixmodelsdk.microflowsMod.microflows.JavaScriptActionParameterMapping): typings.mendixmodelsdk.microflowsMod.microflows.ExportMappingParameterValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJavaScriptActionParameterMappingUnderParameterValue")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.microflowsMod.microflows.ExportMappingParameterValue]
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ExportMappingParameterValue.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ExportMappingParameterValue.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
