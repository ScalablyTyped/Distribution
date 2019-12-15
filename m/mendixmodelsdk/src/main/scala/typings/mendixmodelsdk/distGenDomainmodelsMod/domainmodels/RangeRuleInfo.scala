package typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RangeRuleInfo")
@js.native
class RangeRuleInfo protected () extends RuleInfo {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FRangeRuleInfo: IModel = js.native
  def maxAttribute(): IAttribute | Null = js.native
  def maxAttribute(newValue: IAttribute): js.Any = js.native
  def maxAttributeQualifiedName(): String | Null = js.native
  @JSName("maxAttribute")
  def maxAttribute_Any(): js.Any = js.native
  def maxValue(): String = js.native
  def maxValue(newValue: String): js.Any = js.native
  def minAttribute(): IAttribute | Null = js.native
  def minAttribute(newValue: IAttribute): js.Any = js.native
  def minAttributeQualifiedName(): String | Null = js.native
  @JSName("minAttribute")
  def minAttribute_Any(): js.Any = js.native
  def minValue(): String = js.native
  def minValue(newValue: String): js.Any = js.native
  def typeOfRange(): RangeType = js.native
  def typeOfRange(newValue: RangeType): js.Any = js.native
  def useMaxValue(): Boolean = js.native
  def useMaxValue(newValue: Boolean): js.Any = js.native
  def useMinValue(): Boolean = js.native
  def useMinValue(newValue: Boolean): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RangeRuleInfo")
@js.native
object RangeRuleInfo extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new RangeRuleInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): RangeRuleInfo = js.native
  /**
    * Creates and returns a new RangeRuleInfo instance in the SDK and on the server.
    * The new RangeRuleInfo will be automatically stored in the 'ruleInfo' property
    * of the parent ValidationRule element passed as argument.
    */
  def createIn(container: ValidationRule): RangeRuleInfo = js.native
}

