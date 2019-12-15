package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenExpressionsMod.expressions.Expression
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenTextsMod.texts.Text
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.WidgetValidation")
@js.native
class WidgetValidation protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FWidgetValidation: IModel = js.native
  def containerAsAttributeWidget(): AttributeWidget = js.native
  def containerAsReferenceSelector(): ReferenceSelector = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def expression(): String = js.native
  def expression(newValue: String): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  def expressionModel(): Expression = js.native
  def expressionModel(newValue: Expression): js.Any = js.native
  def message(): Text = js.native
  def message(newValue: Text): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.WidgetValidation")
@js.native
object WidgetValidation extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new WidgetValidation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): WidgetValidation = js.native
  /**
    * Creates and returns a new WidgetValidation instance in the SDK and on the server.
    * The new WidgetValidation will be automatically stored in the 'validation' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  def createInAttributeWidgetUnderValidation(container: AttributeWidget): WidgetValidation = js.native
  /**
    * Creates and returns a new WidgetValidation instance in the SDK and on the server.
    * The new WidgetValidation will be automatically stored in the 'validation' property
    * of the parent ReferenceSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  def createInReferenceSelectorUnderValidation(container: ReferenceSelector): WidgetValidation = js.native
}

