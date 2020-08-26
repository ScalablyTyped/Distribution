package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/validation-rules relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.ValidationRule")
@js.native
class ValidationRule protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FValidationRule: IModel = js.native
  def attribute: IAttribute = js.native
  def attributeQualifiedName: String = js.native
  def attribute_=(newValue: IAttribute): Unit = js.native
  def containerAsEntity: Entity = js.native
  def errorMessage: Text = js.native
  def errorMessage_=(newValue: Text): Unit = js.native
  def ruleInfo: RuleInfo = js.native
  def ruleInfo_=(newValue: RuleInfo): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.ValidationRule")
@js.native
object ValidationRule extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ValidationRule instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ValidationRule = js.native
  /**
    * Creates and returns a new ValidationRule instance in the SDK and on the server.
    * The new ValidationRule will be automatically stored in the 'validationRules' property
    * of the parent Entity element passed as argument.
    */
  def createIn(container: Entity): ValidationRule = js.native
}

