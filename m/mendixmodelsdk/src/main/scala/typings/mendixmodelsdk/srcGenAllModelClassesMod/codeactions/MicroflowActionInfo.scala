package typings.mendixmodelsdk.srcGenAllModelClassesMod.codeactions

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCodeactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.Microflow
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "codeactions.MicroflowActionInfo")
@js.native
open class MicroflowActionInfo protected ()
  extends typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.MicroflowActionInfo {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object MicroflowActionInfo {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "codeactions.MicroflowActionInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.MicroflowActionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.MicroflowActionInfo]
  
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * The new MicroflowActionInfo will be automatically stored in the 'modelerActionInfo' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  inline def createIn(container: typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.CodeAction): typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.MicroflowActionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.MicroflowActionInfo]
  
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * The new MicroflowActionInfo will be automatically stored in the 'modelerActionInfo' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  inline def createInCodeActionUnderModelerActionInfo(container: typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.CodeAction): typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.MicroflowActionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCodeActionUnderModelerActionInfo")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.MicroflowActionInfo]
  
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * The new MicroflowActionInfo will be automatically stored in the 'microflowActionInfo' property
    * of the parent microflows.Microflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInMicroflowUnderMicroflowActionInfo(container: Microflow): typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.MicroflowActionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowUnderMicroflowActionInfo")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.MicroflowActionInfo]
  
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * The new MicroflowActionInfo will be automatically stored in the 'workflowActionInfo' property
    * of the parent microflows.Microflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInMicroflowUnderWorkflowActionInfo(container: Microflow): typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.MicroflowActionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowUnderWorkflowActionInfo")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.MicroflowActionInfo]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "codeactions.MicroflowActionInfo.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "codeactions.MicroflowActionInfo.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
