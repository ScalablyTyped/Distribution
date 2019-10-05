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
  var maxAttribute: IAttribute | Null = js.native
  val maxAttributeQualifiedName: String | Null = js.native
  var maxValue: String = js.native
  var minAttribute: IAttribute | Null = js.native
  val minAttributeQualifiedName: String | Null = js.native
  var minValue: String = js.native
  var typeOfRange: RangeType = js.native
  var useMaxValue: Boolean = js.native
  var useMinValue: Boolean = js.native
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

