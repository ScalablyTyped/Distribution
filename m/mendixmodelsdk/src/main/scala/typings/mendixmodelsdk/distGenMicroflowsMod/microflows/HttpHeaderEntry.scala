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

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.HttpHeaderEntry")
@js.native
class HttpHeaderEntry protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FHttpHeaderEntry: IModel = js.native
  def containerAsHttpConfiguration(): HttpConfiguration = js.native
  def key(): String = js.native
  def key(newValue: String): js.Any = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def value(): String = js.native
  def value(newValue: String): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  def valueModel(): Expression = js.native
  def valueModel(newValue: Expression): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.HttpHeaderEntry")
@js.native
object HttpHeaderEntry extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new HttpHeaderEntry instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): HttpHeaderEntry = js.native
  /**
    * Creates and returns a new HttpHeaderEntry instance in the SDK and on the server.
    * The new HttpHeaderEntry will be automatically stored in the 'headerEntries' property
    * of the parent HttpConfiguration element passed as argument.
    */
  def createIn(container: HttpConfiguration): HttpHeaderEntry = js.native
}

