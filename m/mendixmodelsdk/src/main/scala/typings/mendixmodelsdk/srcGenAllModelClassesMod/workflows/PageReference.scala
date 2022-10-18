package typings.mendixmodelsdk.srcGenAllModelClassesMod.workflows

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
  * In version 9.12.0: added public
  * In version 9.11.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "workflows.PageReference")
@js.native
open class PageReference protected ()
  extends typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.PageReference {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object PageReference {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "workflows.PageReference")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PageReference instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.PageReference = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.PageReference]
  
  /**
    * Creates and returns a new PageReference instance in the SDK and on the server.
    * The new PageReference will be automatically stored in the 'taskPage' property
    * of the parent UserTask element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.11.0 and higher
    */
  /* static member */
  inline def createInUserTaskUnderTaskPage(container: typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.UserTask): typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.PageReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createInUserTaskUnderTaskPage")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.PageReference]
  
  /**
    * Creates and returns a new PageReference instance in the SDK and on the server.
    * The new PageReference will be automatically stored in the 'adminPage' property
    * of the parent Workflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.11.0 and higher
    */
  /* static member */
  inline def createInWorkflowUnderAdminPage(container: typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.Workflow): typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.PageReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWorkflowUnderAdminPage")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.PageReference]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "workflows.PageReference.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "workflows.PageReference.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
