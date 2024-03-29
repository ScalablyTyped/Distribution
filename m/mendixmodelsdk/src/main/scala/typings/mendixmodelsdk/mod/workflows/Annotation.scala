package typings.mendixmodelsdk.mod.workflows

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
  * In version 9.15.0: introduced
  */
@JSImport("mendixmodelsdk", "workflows.Annotation")
@js.native
open class Annotation protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.workflows.Annotation {
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
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.Annotation]
  
  /**
    * Creates and returns a new Annotation instance in the SDK and on the server.
    * The new Annotation will be automatically stored in the 'annotation' property
    * of the parent WorkflowActivity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.15.0 and higher
    */
  /* static member */
  inline def createInWorkflowActivityUnderAnnotation(container: typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.WorkflowActivity): typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWorkflowActivityUnderAnnotation")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.Annotation]
  
  /**
    * Creates and returns a new Annotation instance in the SDK and on the server.
    * The new Annotation will be automatically stored in the 'annotation' property
    * of the parent Workflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.15.0 and higher
    */
  /* static member */
  inline def createInWorkflowUnderAnnotation(container: typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.Workflow): typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWorkflowUnderAnnotation")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.Annotation]
  
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
