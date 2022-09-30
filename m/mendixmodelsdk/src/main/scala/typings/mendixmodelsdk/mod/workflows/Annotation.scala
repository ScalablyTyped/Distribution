package typings.mendixmodelsdk.mod.workflows

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.workflowsMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Workflows`.
  */
/**
  * In version 9.15.0: introduced
  */
@JSImport("mendixmodelsdk", "workflows.Annotation")
@js.native
open class Annotation protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.workflows.Annotation {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object Annotation {
  
  @JSImport("mendixmodelsdk", "workflows.Annotation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Annotation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.Annotation]
  
  /**
    * Creates and returns a new Annotation instance in the SDK and on the server.
    * The new Annotation will be automatically stored in the 'annotation' property
    * of the parent WorkflowActivity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.15.0 and higher
    */
  /* static member */
  inline def createInWorkflowActivityUnderAnnotation(container: typings.mendixmodelsdk.workflowsMod.workflows.WorkflowActivity): typings.mendixmodelsdk.workflowsMod.workflows.Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWorkflowActivityUnderAnnotation")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.Annotation]
  
  /**
    * Creates and returns a new Annotation instance in the SDK and on the server.
    * The new Annotation will be automatically stored in the 'annotation' property
    * of the parent Workflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.15.0 and higher
    */
  /* static member */
  inline def createInWorkflowUnderAnnotation(container: typings.mendixmodelsdk.workflowsMod.workflows.Workflow): typings.mendixmodelsdk.workflowsMod.workflows.Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWorkflowUnderAnnotation")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.Annotation]
  
  /* static member */
  @JSImport("mendixmodelsdk", "workflows.Annotation.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "workflows.Annotation.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
