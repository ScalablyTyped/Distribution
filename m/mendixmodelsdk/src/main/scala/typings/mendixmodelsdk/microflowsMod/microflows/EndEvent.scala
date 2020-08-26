package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.expressionsMod.expressions.Expression
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/end-event relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.EndEvent")
@js.native
class EndEvent protected () extends MicroflowObject {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FEndEvent: IModel = js.native
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def returnValue: String = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  def returnValueModel: Expression = js.native
  def returnValueModel_=(newValue: Expression): Unit = js.native
  def returnValue_=(newValue: String): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.EndEvent")
@js.native
object EndEvent extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new EndEvent instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): EndEvent = js.native
  /**
    * Creates and returns a new EndEvent instance in the SDK and on the server.
    * The new EndEvent will be automatically stored in the 'objects' property
    * of the parent MicroflowObjectCollection element passed as argument.
    */
  def createIn(container: MicroflowObjectCollection): EndEvent = js.native
}

