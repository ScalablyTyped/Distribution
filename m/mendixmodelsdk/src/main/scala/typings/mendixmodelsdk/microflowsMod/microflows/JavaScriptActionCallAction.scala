package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.javascriptactionsMod.javascriptactions.IJavaScriptAction
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.4.0: removed experimental
  * In version 7.21.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.JavaScriptActionCallAction")
@js.native
class JavaScriptActionCallAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FJavaScriptActionCallAction: IModel = js.native
  def javaScriptAction(): js.Any = js.native
  def javaScriptAction(newValue: IJavaScriptAction): js.Any = js.native
  def javaScriptActionQualifiedName(): String | Null = js.native
  @JSName("javaScriptAction")
  def javaScriptAction_Union(): IJavaScriptAction | Null = js.native
  def outputVariableName(): String = js.native
  def outputVariableName(newValue: String): js.Any = js.native
  def parameterMappings(): IList[JavaScriptActionParameterMapping] = js.native
  def useReturnVariable(): Boolean = js.native
  def useReturnVariable(newValue: Boolean): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.JavaScriptActionCallAction")
@js.native
object JavaScriptActionCallAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new JavaScriptActionCallAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): JavaScriptActionCallAction = js.native
  /**
    * Creates and returns a new JavaScriptActionCallAction instance in the SDK and on the server.
    * The new JavaScriptActionCallAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createIn(container: ActionActivity): JavaScriptActionCallAction = js.native
}

