package typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EqualsToRuleInfo")
@js.native
class EqualsToRuleInfo protected () extends RuleInfo {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FEqualsToRuleInfo: IModel = js.native
  def equalsToAttribute(): IAttribute | Null = js.native
  def equalsToAttribute(newValue: IAttribute): js.Any = js.native
  def equalsToAttributeQualifiedName(): String | Null = js.native
  @JSName("equalsToAttribute")
  def equalsToAttribute_Any(): js.Any = js.native
  def equalsToValue(): String = js.native
  def equalsToValue(newValue: String): js.Any = js.native
  def useValue(): Boolean = js.native
  def useValue(newValue: Boolean): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EqualsToRuleInfo")
@js.native
object EqualsToRuleInfo extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new EqualsToRuleInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): EqualsToRuleInfo = js.native
  /**
    * Creates and returns a new EqualsToRuleInfo instance in the SDK and on the server.
    * The new EqualsToRuleInfo will be automatically stored in the 'ruleInfo' property
    * of the parent ValidationRule element passed as argument.
    */
  def createIn(container: ValidationRule): EqualsToRuleInfo = js.native
}

