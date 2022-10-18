package typings.mendixmodelsdk.srcGenWorkflowsMod.workflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenWorkflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/decision-in-workflows relevant section in reference guide}
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
- typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.IExclusiveSplitActivity because var conflicts: containerAsFlow, id, isLoaded, model, outcomes, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.ExclusiveSplitActivity")
@js.native
open class ExclusiveSplitActivity protected () extends ConditionOutcomeActivity {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsFlow")
  def containerAsFlow_MExclusiveSplitActivity: Flow = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def expression: String = js.native
  def expression_=(newValue: String): Unit = js.native
}
object ExclusiveSplitActivity {
  
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.ExclusiveSplitActivity")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ExclusiveSplitActivity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): ExclusiveSplitActivity = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ExclusiveSplitActivity]
  
  /**
    * Creates and returns a new ExclusiveSplitActivity instance in the SDK and on the server.
    * The new ExclusiveSplitActivity will be automatically stored in the 'activities' property
    * of the parent Flow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createIn(container: Flow): ExclusiveSplitActivity = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ExclusiveSplitActivity]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.ExclusiveSplitActivity.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.ExclusiveSplitActivity.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
