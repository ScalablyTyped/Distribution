package typings.mendixmodelsdk.srcGenWorkflowsMod.workflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.srcGenWorkflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/call-microflow relevant section in reference guide}
  *
  * In version 9.0.5: removed experimental
  * In version 9.0.2: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.IWorkflowActivity because Already inherited
- typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.IConditionOutcomeActivity because Already inherited
- typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.ICallMicroflowTask because var conflicts: containerAsFlow, id, isLoaded, model, outcomes, structureTypeName, unit. Inlined microflow, microflowQualifiedName */ @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.CallMicroflowTask")
@js.native
open class CallMicroflowTask protected () extends ConditionOutcomeActivity {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsFlow")
  def containerAsFlow_MCallMicroflowTask: Flow = js.native
  
  def microflow: IMicroflow | Null = js.native
  
  def microflowQualifiedName: String | Null = js.native
  @JSName("microflowQualifiedName")
  val microflowQualifiedName_FCallMicroflowTask: String | Null = js.native
  
  def microflow_=(newValue: IMicroflow | Null): Unit = js.native
  @JSName("microflow")
  val microflow_FCallMicroflowTask: IMicroflow | Null = js.native
  
  def parameterMappings: IList[MicroflowCallParameterMapping] = js.native
}
object CallMicroflowTask {
  
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.CallMicroflowTask")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new CallMicroflowTask instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): CallMicroflowTask = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[CallMicroflowTask]
  
  /**
    * Creates and returns a new CallMicroflowTask instance in the SDK and on the server.
    * The new CallMicroflowTask will be automatically stored in the 'activities' property
    * of the parent Flow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createIn(container: Flow): CallMicroflowTask = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[CallMicroflowTask]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.CallMicroflowTask.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.CallMicroflowTask.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
