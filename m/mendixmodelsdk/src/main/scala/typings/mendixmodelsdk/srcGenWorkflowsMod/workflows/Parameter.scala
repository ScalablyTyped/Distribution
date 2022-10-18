package typings.mendixmodelsdk.srcGenWorkflowsMod.workflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IIndirectEntityRef
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IndirectEntityRef
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
  * In version 9.6.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.IParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsWorkflow, entityRef, entity, entityQualifiedName, name */ @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.Parameter")
@js.native
open class Parameter protected ()
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
  
  def containerAsWorkflow: Workflow = js.native
  @JSName("containerAsWorkflow")
  val containerAsWorkflow_FParameter: IWorkflow = js.native
  
  /**
    * In version 9.10.0: introduced
    */
  def entity: IEntity | Null = js.native
  
  def entityQualifiedName: String | Null = js.native
  @JSName("entityQualifiedName")
  val entityQualifiedName_FParameter: String | Null = js.native
  
  /**
    * In version 9.10.0: deleted
    */
  def entityRef: IndirectEntityRef | Null = js.native
  def entityRef_=(newValue: IndirectEntityRef | Null): Unit = js.native
  /**
    * In version 9.10.0: deleted
    */
  @JSName("entityRef")
  val entityRef_FParameter: IIndirectEntityRef | Null = js.native
  
  def entity_=(newValue: IEntity | Null): Unit = js.native
  /**
    * In version 9.10.0: introduced
    */
  @JSName("entity")
  val entity_FParameter: IEntity | Null = js.native
  
  /**
    * In version 9.18.0: introduced
    */
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  /**
    * In version 9.18.0: introduced
    */
  @JSName("name")
  val name_FParameter: String = js.native
  
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  @JSName("qualifiedName")
  def qualifiedName_MParameter: String | Null = js.native
}
object Parameter {
  
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.Parameter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Parameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): Parameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[Parameter]
  
  /**
    * Creates and returns a new Parameter instance in the SDK and on the server.
    * The new Parameter will be automatically stored in the 'parameter' property
    * of the parent Workflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.6.0 and higher
    */
  /* static member */
  inline def createIn(container: Workflow): Parameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Parameter]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.Parameter.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.Parameter.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
