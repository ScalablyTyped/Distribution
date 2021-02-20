package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RangeRuleInfo")
@js.native
class RangeRuleInfo protected () extends RuleInfo {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def maxAttribute: IAttribute | Null = js.native
  
  def maxAttributeQualifiedName: String | Null = js.native
  
  def maxAttribute_=(newValue: IAttribute | Null): Unit = js.native
  
  def maxValue: String = js.native
  def maxValue_=(newValue: String): Unit = js.native
  
  def minAttribute: IAttribute | Null = js.native
  
  def minAttributeQualifiedName: String | Null = js.native
  
  def minAttribute_=(newValue: IAttribute | Null): Unit = js.native
  
  def minValue: String = js.native
  def minValue_=(newValue: String): Unit = js.native
  
  def typeOfRange: RangeType = js.native
  def typeOfRange_=(newValue: RangeType): Unit = js.native
  
  def useMaxValue: Boolean = js.native
  def useMaxValue_=(newValue: Boolean): Unit = js.native
  
  def useMinValue: Boolean = js.native
  def useMinValue_=(newValue: Boolean): Unit = js.native
}
object RangeRuleInfo {
  
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RangeRuleInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new RangeRuleInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RangeRuleInfo.create")
  @js.native
  def create(model: IModel): RangeRuleInfo = js.native
  
  /**
    * Creates and returns a new RangeRuleInfo instance in the SDK and on the server.
    * The new RangeRuleInfo will be automatically stored in the 'ruleInfo' property
    * of the parent ValidationRule element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RangeRuleInfo.createIn")
  @js.native
  def createIn(container: ValidationRule): RangeRuleInfo = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RangeRuleInfo.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RangeRuleInfo.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
