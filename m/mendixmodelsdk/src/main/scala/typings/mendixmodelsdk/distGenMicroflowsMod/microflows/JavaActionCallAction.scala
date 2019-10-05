package typings.mendixmodelsdk.distGenMicroflowsMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.IJavaAction
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/java-action-call relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.JavaActionCallAction")
@js.native
class JavaActionCallAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var javaAction: IJavaAction | Null = js.native
  val javaActionQualifiedName: String | Null = js.native
  var outputVariableName: String = js.native
  val parameterMappings: IList[JavaActionParameterMapping] = js.native
  /**
    * In version 7.13.0: introduced
    */
  var useReturnVariable: Boolean = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.JavaActionCallAction")
@js.native
object JavaActionCallAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new JavaActionCallAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): JavaActionCallAction = js.native
  /**
    * Creates and returns a new JavaActionCallAction instance in the SDK and on the server.
    * The new JavaActionCallAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  def createIn(container: ActionActivity): JavaActionCallAction = js.native
}

