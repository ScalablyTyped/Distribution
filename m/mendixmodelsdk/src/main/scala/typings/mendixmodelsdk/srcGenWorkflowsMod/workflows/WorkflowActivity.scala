package typings.mendixmodelsdk.srcGenWorkflowsMod.workflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenWorkflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/workflows relevant section in reference guide}
  *
  * In version 9.0.5: removed experimental
  * In version 9.0.2: introduced
  */
/* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.IWorkflowActivity because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsFlow, name, caption */ @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.WorkflowActivity")
@js.native
open class WorkflowActivity protected ()
  extends Element[IModel]
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 9.15.0: introduced
    */
  def annotation: Annotation | Null = js.native
  def annotation_=(newValue: Annotation | Null): Unit = js.native
  
  def caption: String = js.native
  def caption_=(newValue: String): Unit = js.native
  @JSName("caption")
  val caption_FWorkflowActivity: String = js.native
  
  def containerAsFlow: Flow = js.native
  @JSName("containerAsFlow")
  val containerAsFlow_FWorkflowActivity: IFlow = js.native
  
  /**
    * In version 9.0.5: introduced
    */
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  /**
    * In version 9.0.5: introduced
    */
  @JSName("name")
  val name_FWorkflowActivity: String = js.native
  
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  @JSName("qualifiedName")
  def qualifiedName_MWorkflowActivity: String | Null = js.native
}
object WorkflowActivity {
  
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.WorkflowActivity")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.WorkflowActivity.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.WorkflowActivity.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
