package typings.mendixmodelsdk.distGenMicroflowsMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenExpressionsMod.expressions.Expression
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.FormDataPart")
@js.native
class FormDataPart protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val containerAsFormDataRequestHandling: FormDataRequestHandling = js.native
  var key: String = js.native
  @JSName("model")
  var model_FormDataPart: IModel = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  var value: String = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  var valueModel: Expression = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.FormDataPart")
@js.native
object FormDataPart extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new FormDataPart instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): FormDataPart = js.native
  /**
    * Creates and returns a new FormDataPart instance in the SDK and on the server.
    * The new FormDataPart will be automatically stored in the 'parts' property
    * of the parent FormDataRequestHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createIn(container: FormDataRequestHandling): FormDataPart = js.native
}

