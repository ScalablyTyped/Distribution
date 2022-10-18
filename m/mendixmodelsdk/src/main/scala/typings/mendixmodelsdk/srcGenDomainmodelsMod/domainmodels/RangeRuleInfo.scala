package typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.RangeRuleInfo")
@js.native
open class RangeRuleInfo protected () extends RuleInfo {
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
  
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.RangeRuleInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new RangeRuleInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): RangeRuleInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[RangeRuleInfo]
  
  /**
    * Creates and returns a new RangeRuleInfo instance in the SDK and on the server.
    * The new RangeRuleInfo will be automatically stored in the 'ruleInfo' property
    * of the parent ValidationRule element passed as argument.
    */
  /* static member */
  inline def createIn(container: ValidationRule): RangeRuleInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[RangeRuleInfo]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.RangeRuleInfo.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.RangeRuleInfo.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
