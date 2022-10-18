package typings.mendixmodelsdk.srcGenWorkflowsMod.workflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
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
- typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.ICallWorkflowActivity because var conflicts: caption, containerAsFlow, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined workflow, workflowQualifiedName */ @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.CallWorkflowActivity")
@js.native
open class CallWorkflowActivity protected () extends WorkflowActivity {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsFlow")
  def containerAsFlow_MCallWorkflowActivity: Flow = js.native
  
  /**
    * In version 9.18.0: introduced
    */
  def executeAsync: Boolean = js.native
  def executeAsync_=(newValue: Boolean): Unit = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 9.18.0: deleted
    * In version 9.6.0: introduced
    */
  def parameterExpression: String = js.native
  def parameterExpression_=(newValue: String): Unit = js.native
  
  /**
    * In version 9.18.0: introduced
    */
  def parameterMappings: IList[WorkflowCallParameterMapping] = js.native
  
  def workflow: IWorkflow | Null = js.native
  
  def workflowQualifiedName: String | Null = js.native
  @JSName("workflowQualifiedName")
  val workflowQualifiedName_FCallWorkflowActivity: String | Null = js.native
  
  def workflow_=(newValue: IWorkflow | Null): Unit = js.native
  @JSName("workflow")
  val workflow_FCallWorkflowActivity: IWorkflow | Null = js.native
}
object CallWorkflowActivity {
  
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.CallWorkflowActivity")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new CallWorkflowActivity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): CallWorkflowActivity = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[CallWorkflowActivity]
  
  /**
    * Creates and returns a new CallWorkflowActivity instance in the SDK and on the server.
    * The new CallWorkflowActivity will be automatically stored in the 'activities' property
    * of the parent Flow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createIn(container: Flow): CallWorkflowActivity = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[CallWorkflowActivity]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.CallWorkflowActivity.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.CallWorkflowActivity.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
