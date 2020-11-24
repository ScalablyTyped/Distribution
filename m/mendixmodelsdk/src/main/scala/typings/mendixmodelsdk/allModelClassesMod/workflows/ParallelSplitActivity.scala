package typings.mendixmodelsdk.allModelClassesMod.workflows

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.workflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 9.0.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ParallelSplitActivity")
@js.native
class ParallelSplitActivity protected ()
  extends typings.mendixmodelsdk.workflowsMod.workflows.ParallelSplitActivity {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ParallelSplitActivity")
@js.native
object ParallelSplitActivity extends js.Object {
  
  /**
    * Creates and returns a new ParallelSplitActivity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.ParallelSplitActivity = js.native
  
  /**
    * Creates and returns a new ParallelSplitActivity instance in the SDK and on the server.
    * The new ParallelSplitActivity will be automatically stored in the 'activities' property
    * of the parent Flow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.0 and higher
    */
  def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.Flow): typings.mendixmodelsdk.workflowsMod.workflows.ParallelSplitActivity = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
