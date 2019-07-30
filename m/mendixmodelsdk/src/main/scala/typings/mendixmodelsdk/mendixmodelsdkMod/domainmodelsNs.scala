package typings.mendixmodelsdk.mendixmodelsdkMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgetsNs.WidgetValue
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.AttributeWidget
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.DataGridColumn
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.EntityWidget
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.GridSortItem
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.SortItem
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ClientTemplateParameter
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.CreateObjectClientAction
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.EntityPathSource
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.GridColumn
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ListViewSearch
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.MemberWidget
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.NewButton
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.RangeSearchField
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ReferenceSetSelector
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.SelectorXPathSource
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.SingleSearchField
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.StaticOrDynamicString
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IModule
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.AccessRuleContainerBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "domainmodels")
@js.native
object domainmodelsNs extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `DomainModels`.
    */
  /**
    * See: {@link https://docs.mendix.com/refguide7/access-rules relevant section in reference guide}
    */
  @js.native
  class AccessRule protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.AccessRule {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class ActionMoment ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.ActionMoment
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/annotations relevant section in reference guide}
    */
  @js.native
  class Annotation protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.Annotation {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/associations relevant section in reference guide}
    */
  @js.native
  class Association protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.Association {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/associations relevant section in reference guide}
    */
  @js.native
  abstract class AssociationBase protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.AssociationBase {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class AssociationDeleteBehavior protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.AssociationDeleteBehavior {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class AssociationOwner ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.AssociationOwner
  
  /**
    * In version 7.11.0: introduced
    */
  @js.native
  class AssociationRef protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.AssociationRef {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class AssociationType ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.AssociationType
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/attributes relevant section in reference guide}
    */
  @js.native
  class Attribute protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.Attribute {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * In version 7.11.0: introduced
    */
  @js.native
  class AttributeRef protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.AttributeRef {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  abstract class AttributeType protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.AttributeType {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class AutoNumberAttributeType protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.AutoNumberAttributeType {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class BinaryAttributeType protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.BinaryAttributeType {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class BooleanAttributeType protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.BooleanAttributeType {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * In version 6.6.0: added public
    */
  @js.native
  class CalculatedValue protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.CalculatedValue {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class CrossAssociation protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.CrossAssociation {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * In version 6.0.0: deprecated
    */
  @js.native
  class CurrencyAttributeType protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.CurrencyAttributeType {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class DateTimeAttributeType protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.DateTimeAttributeType {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class DecimalAttributeType protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.DecimalAttributeType {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  abstract class DecimalAttributeTypeBase protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.DecimalAttributeTypeBase {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class DeletingBehavior ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.DeletingBehavior
  
  /**
    * In version 7.11.0: introduced
    */
  @js.native
  class DirectEntityRef protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.DirectEntityRef {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/domain-model relevant section in reference guide}
    */
  @js.native
  class DomainModel protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.DomainModel {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IModule
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/entities relevant section in reference guide}
    */
  @js.native
  class Entity protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.Entity {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * In version 7.11.0: introduced
    */
  @js.native
  abstract class EntityRef protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.EntityRef {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * In version 7.11.0: introduced
    */
  @js.native
  class EntityRefStep protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.EntityRefStep {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class EnumerationAttributeType protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.EnumerationAttributeType {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class EqualsToRuleInfo protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.EqualsToRuleInfo {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/event-handlers relevant section in reference guide}
    */
  @js.native
  class EventHandler protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.EventHandler {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class EventType ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.EventType
  
  /**
    * In version 6.0.0: deprecated
    */
  @js.native
  class FloatAttributeType protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.FloatAttributeType {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  abstract class FloatAttributeTypeBase protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.FloatAttributeTypeBase {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class Generalization protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.Generalization {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  abstract class GeneralizationBase protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.GeneralizationBase {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class HashedStringAttributeType protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.HashedStringAttributeType {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/indexes relevant section in reference guide}
    */
  @js.native
  class Index protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.Index {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class IndexedAttribute protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.IndexedAttribute {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class IndexedAttributeType ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.IndexedAttributeType
  
  /**
    * In version 7.11.0: introduced
    */
  @js.native
  class IndirectEntityRef protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.IndirectEntityRef {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class IntegerAttributeType protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.IntegerAttributeType {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  abstract class IntegerAttributeTypeBase protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.IntegerAttributeTypeBase {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class LongAttributeType protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.LongAttributeType {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class MaxLengthRuleInfo protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.MaxLengthRuleInfo {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class MemberAccess protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.MemberAccess {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class MemberAccessRights ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.MemberAccessRights
  
  /**
    * In version 7.11.0: introduced
    */
  @js.native
  abstract class MemberRef protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.MemberRef {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class NoGeneralization protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.NoGeneralization {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  abstract class NumericAttributeTypeBase protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.NumericAttributeTypeBase {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class RangeRuleInfo protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.RangeRuleInfo {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class RangeType ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.RangeType
  
  @js.native
  class RegExRuleInfo protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.RegExRuleInfo {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class RequiredRuleInfo protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.RequiredRuleInfo {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  abstract class RuleInfo protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.RuleInfo {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * In version 6.6.0: added public
    */
  @js.native
  class StoredValue protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.StoredValue {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class StringAttributeType protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.StringAttributeType {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class UniqueRuleInfo protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.UniqueRuleInfo {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/validation-rules relevant section in reference guide}
    */
  @js.native
  class ValidationRule protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.ValidationRule {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * In version 6.6.0: added public
    */
  @js.native
  abstract class ValueType protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodelsNs.ValueType {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object AccessRule extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new AccessRule instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AccessRule = js.native
    /**
      * Creates and returns a new AccessRule instance in the SDK and on the server.
      * The new AccessRule will be automatically stored in the 'accessRules' property
      * of the parent security.AccessRuleContainerBase element passed as argument.
      */
    def createInAccessRuleContainerBaseUnderAccessRules(container: AccessRuleContainerBase): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AccessRule = js.native
    /**
      * Creates and returns a new AccessRule instance in the SDK and on the server.
      * The new AccessRule will be automatically stored in the 'accessRules' property
      * of the parent Entity element passed as argument.
      */
    def createInEntityUnderAccessRules(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Entity): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AccessRule = js.native
  }
  
  /* static members */
  @js.native
  object ActionMoment extends js.Object {
    var After: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.ActionMoment = js.native
    var Before: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.ActionMoment = js.native
  }
  
  /* static members */
  @js.native
  object Annotation extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Annotation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Annotation = js.native
    /**
      * Creates and returns a new Annotation instance in the SDK and on the server.
      * The new Annotation will be automatically stored in the 'annotations' property
      * of the parent DomainModel element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DomainModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Annotation = js.native
  }
  
  /* static members */
  @js.native
  object Association extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Association instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Association = js.native
    /**
      * Creates and returns a new Association instance in the SDK and on the server.
      * The new Association will be automatically stored in the 'associations' property
      * of the parent DomainModel element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DomainModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Association = js.native
  }
  
  /* static members */
  @js.native
  object AssociationBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object AssociationDeleteBehavior extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new AssociationDeleteBehavior instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AssociationDeleteBehavior = js.native
    /**
      * Creates and returns a new AssociationDeleteBehavior instance in the SDK and on the server.
      * The new AssociationDeleteBehavior will be automatically stored in the 'deleteBehavior' property
      * of the parent AssociationBase element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AssociationBase): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AssociationDeleteBehavior = js.native
  }
  
  /* static members */
  @js.native
  object AssociationOwner extends js.Object {
    var Both: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AssociationOwner = js.native
    var Default: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AssociationOwner = js.native
  }
  
  /* static members */
  @js.native
  object AssociationRef extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new AssociationRef instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AssociationRef = js.native
  }
  
  /* static members */
  @js.native
  object AssociationType extends js.Object {
    var Reference: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AssociationType = js.native
    var ReferenceSet: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AssociationType = js.native
  }
  
  /* static members */
  @js.native
  object Attribute extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Attribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Attribute = js.native
    /**
      * Creates and returns a new Attribute instance in the SDK and on the server.
      * The new Attribute will be automatically stored in the 'attributes' property
      * of the parent Entity element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Entity): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Attribute = js.native
  }
  
  /* static members */
  @js.native
  object AttributeRef extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent documenttemplates.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInAttributeWidgetUnderAttributeRef(container: AttributeWidget): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent pages.ClientTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInClientTemplateParameterUnderAttributeRef(container: ClientTemplateParameter): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent documenttemplates.DataGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInDataGridColumnUnderAttributeRef(container: DataGridColumn): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent documenttemplates.GridSortItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInDocumentTemplatesGridSortItemUnderAttributeRef(container: GridSortItem): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent pages.GridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInGridColumnUnderAttributeRef(container: GridColumn): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'searchRefs' property
      * of the parent pages.ListViewSearch element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInListViewSearchUnderSearchRefs(container: ListViewSearch): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent pages.MemberWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInMemberWidgetUnderAttributeRef(container: MemberWidget): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent pages.GridSortItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInPagesGridSortItemUnderAttributeRef(container: typings.mendixmodelsdk.distGenPagesMod.pagesNs.GridSortItem): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'lowerBoundRef' property
      * of the parent pages.RangeSearchField element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInRangeSearchFieldUnderLowerBoundRef(container: RangeSearchField): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'upperBoundRef' property
      * of the parent pages.RangeSearchField element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInRangeSearchFieldUnderUpperBoundRef(container: RangeSearchField): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent pages.SingleSearchField element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInSingleSearchFieldUnderAttributeRef(container: SingleSearchField): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent microflows.SortItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInSortItemUnderAttributeRef(container: SortItem): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent pages.StaticOrDynamicString element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInStaticOrDynamicStringUnderAttributeRef(container: StaticOrDynamicString): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'member' property
      * of the parent expressions.VariableRefExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInVariableRefExpressionUnderMember(container: VariableRefExpression): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInWidgetValueUnderAttributeRef(container: WidgetValue): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
  }
  
  /* static members */
  @js.native
  object AttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object AutoNumberAttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new AutoNumberAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AutoNumberAttributeType = js.native
    /**
      * Creates and returns a new AutoNumberAttributeType instance in the SDK and on the server.
      * The new AutoNumberAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Attribute): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AutoNumberAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object BinaryAttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new BinaryAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.BinaryAttributeType = js.native
    /**
      * Creates and returns a new BinaryAttributeType instance in the SDK and on the server.
      * The new BinaryAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Attribute): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.BinaryAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object BooleanAttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new BooleanAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.BooleanAttributeType = js.native
    /**
      * Creates and returns a new BooleanAttributeType instance in the SDK and on the server.
      * The new BooleanAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Attribute): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.BooleanAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object CalculatedValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new CalculatedValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.CalculatedValue = js.native
    /**
      * Creates and returns a new CalculatedValue instance in the SDK and on the server.
      * The new CalculatedValue will be automatically stored in the 'value' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Attribute): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.CalculatedValue = js.native
  }
  
  /* static members */
  @js.native
  object CrossAssociation extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new CrossAssociation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.CrossAssociation = js.native
    /**
      * Creates and returns a new CrossAssociation instance in the SDK and on the server.
      * The new CrossAssociation will be automatically stored in the 'crossAssociations' property
      * of the parent DomainModel element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DomainModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.CrossAssociation = js.native
  }
  
  /* static members */
  @js.native
  object CurrencyAttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new CurrencyAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.CurrencyAttributeType = js.native
    /**
      * Creates and returns a new CurrencyAttributeType instance in the SDK and on the server.
      * The new CurrencyAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Attribute): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.CurrencyAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object DateTimeAttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DateTimeAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DateTimeAttributeType = js.native
    /**
      * Creates and returns a new DateTimeAttributeType instance in the SDK and on the server.
      * The new DateTimeAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Attribute): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DateTimeAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object DecimalAttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DecimalAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DecimalAttributeType = js.native
    /**
      * Creates and returns a new DecimalAttributeType instance in the SDK and on the server.
      * The new DecimalAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Attribute): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DecimalAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object DecimalAttributeTypeBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object DeletingBehavior extends js.Object {
    var DeleteMeAndReferences: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DeletingBehavior = js.native
    var DeleteMeButKeepReferences: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DeletingBehavior = js.native
    var DeleteMeIfNoReferences: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DeletingBehavior = js.native
  }
  
  /* static members */
  @js.native
  object DirectEntityRef extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DirectEntityRef = js.native
    /**
      * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
      * The new DirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent pages.CreateObjectClientAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInCreateObjectClientActionUnderEntityRef(container: CreateObjectClientAction): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DirectEntityRef = js.native
    /**
      * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
      * The new DirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent pages.EntityPathSource element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInEntityPathSourceUnderEntityRef(container: EntityPathSource): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DirectEntityRef = js.native
    /**
      * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
      * The new DirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent documenttemplates.EntityWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInEntityWidgetUnderEntityRef(container: EntityWidget): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DirectEntityRef = js.native
    /**
      * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
      * The new DirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent pages.NewButton element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 to 7.16.0
      */
    def createInNewButtonUnderEntityRef(container: NewButton): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DirectEntityRef = js.native
    /**
      * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
      * The new DirectEntityRef will be automatically stored in the 'constrainedByRefs' property
      * of the parent pages.ReferenceSetSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInReferenceSetSelectorUnderConstrainedByRefs(container: ReferenceSetSelector): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DirectEntityRef = js.native
    /**
      * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
      * The new DirectEntityRef will be automatically stored in the 'constrainedByRefs' property
      * of the parent pages.SelectorXPathSource element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInSelectorXPathSourceUnderConstrainedByRefs(container: SelectorXPathSource): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DirectEntityRef = js.native
    /**
      * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
      * The new DirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInWidgetValueUnderEntityRef(container: WidgetValue): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DirectEntityRef = js.native
  }
  
  /* static members */
  @js.native
  object DomainModel extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates a new DomainModel unit in the SDK and on the server.
      * Expects one argument, the projects.IModule in which this unit is contained.
      */
    def createIn(container: IModule): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DomainModel = js.native
  }
  
  /* static members */
  @js.native
  object Entity extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Entity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Entity = js.native
    /**
      * Creates and returns a new Entity instance in the SDK and on the server.
      * The new Entity will be automatically stored in the 'entities' property
      * of the parent DomainModel element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DomainModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Entity = js.native
  }
  
  /* static members */
  @js.native
  object EntityRef extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object EntityRefStep extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EntityRefStep instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.EntityRefStep = js.native
    /**
      * Creates and returns a new EntityRefStep instance in the SDK and on the server.
      * The new EntityRefStep will be automatically stored in the 'steps' property
      * of the parent IndirectEntityRef element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IndirectEntityRef): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.EntityRefStep = js.native
  }
  
  /* static members */
  @js.native
  object EnumerationAttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EnumerationAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.EnumerationAttributeType = js.native
    /**
      * Creates and returns a new EnumerationAttributeType instance in the SDK and on the server.
      * The new EnumerationAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Attribute): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.EnumerationAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object EqualsToRuleInfo extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EqualsToRuleInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.EqualsToRuleInfo = js.native
    /**
      * Creates and returns a new EqualsToRuleInfo instance in the SDK and on the server.
      * The new EqualsToRuleInfo will be automatically stored in the 'ruleInfo' property
      * of the parent ValidationRule element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.ValidationRule): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.EqualsToRuleInfo = js.native
  }
  
  /* static members */
  @js.native
  object EventHandler extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EventHandler instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.EventHandler = js.native
    /**
      * Creates and returns a new EventHandler instance in the SDK and on the server.
      * The new EventHandler will be automatically stored in the 'eventHandlers' property
      * of the parent Entity element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Entity): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.EventHandler = js.native
  }
  
  /* static members */
  @js.native
  object EventType extends js.Object {
    var Commit: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.EventType = js.native
    var Create: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.EventType = js.native
    var Delete: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.EventType = js.native
    var RollBack: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.EventType = js.native
  }
  
  /* static members */
  @js.native
  object FloatAttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new FloatAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.FloatAttributeType = js.native
    /**
      * Creates and returns a new FloatAttributeType instance in the SDK and on the server.
      * The new FloatAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Attribute): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.FloatAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object FloatAttributeTypeBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object Generalization extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Generalization instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Generalization = js.native
    /**
      * Creates and returns a new Generalization instance in the SDK and on the server.
      * The new Generalization will be automatically stored in the 'generalization' property
      * of the parent Entity element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Entity): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Generalization = js.native
  }
  
  /* static members */
  @js.native
  object GeneralizationBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object HashedStringAttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new HashedStringAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.HashedStringAttributeType = js.native
    /**
      * Creates and returns a new HashedStringAttributeType instance in the SDK and on the server.
      * The new HashedStringAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Attribute): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.HashedStringAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object Index extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Index instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Index = js.native
    /**
      * Creates and returns a new Index instance in the SDK and on the server.
      * The new Index will be automatically stored in the 'indexes' property
      * of the parent Entity element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Entity): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Index = js.native
  }
  
  /* static members */
  @js.native
  object IndexedAttribute extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new IndexedAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IndexedAttribute = js.native
    /**
      * Creates and returns a new IndexedAttribute instance in the SDK and on the server.
      * The new IndexedAttribute will be automatically stored in the 'attributes' property
      * of the parent Index element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Index): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IndexedAttribute = js.native
  }
  
  /* static members */
  @js.native
  object IndexedAttributeType extends js.Object {
    var ChangedDate: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IndexedAttributeType = js.native
    var CreatedDate: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IndexedAttributeType = js.native
    var Normal: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IndexedAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object IndirectEntityRef extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IndirectEntityRef = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent pages.CreateObjectClientAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInCreateObjectClientActionUnderEntityRef(container: CreateObjectClientAction): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IndirectEntityRef = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent pages.EntityPathSource element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInEntityPathSourceUnderEntityRef(container: EntityPathSource): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IndirectEntityRef = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent documenttemplates.EntityWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInEntityWidgetUnderEntityRef(container: EntityWidget): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IndirectEntityRef = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent MemberRef element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInMemberRefUnderEntityRef(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.MemberRef): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IndirectEntityRef = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent pages.NewButton element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 to 7.16.0
      */
    def createInNewButtonUnderEntityRef(container: NewButton): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IndirectEntityRef = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * The new IndirectEntityRef will be automatically stored in the 'constrainedByRefs' property
      * of the parent pages.ReferenceSetSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInReferenceSetSelectorUnderConstrainedByRefs(container: ReferenceSetSelector): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IndirectEntityRef = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * The new IndirectEntityRef will be automatically stored in the 'constrainedByRefs' property
      * of the parent pages.SelectorXPathSource element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInSelectorXPathSourceUnderConstrainedByRefs(container: SelectorXPathSource): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IndirectEntityRef = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInWidgetValueUnderEntityRef(container: WidgetValue): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IndirectEntityRef = js.native
  }
  
  /* static members */
  @js.native
  object IntegerAttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new IntegerAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IntegerAttributeType = js.native
    /**
      * Creates and returns a new IntegerAttributeType instance in the SDK and on the server.
      * The new IntegerAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Attribute): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IntegerAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object IntegerAttributeTypeBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object LongAttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new LongAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.LongAttributeType = js.native
    /**
      * Creates and returns a new LongAttributeType instance in the SDK and on the server.
      * The new LongAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Attribute): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.LongAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object MaxLengthRuleInfo extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MaxLengthRuleInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.MaxLengthRuleInfo = js.native
    /**
      * Creates and returns a new MaxLengthRuleInfo instance in the SDK and on the server.
      * The new MaxLengthRuleInfo will be automatically stored in the 'ruleInfo' property
      * of the parent ValidationRule element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.ValidationRule): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.MaxLengthRuleInfo = js.native
  }
  
  /* static members */
  @js.native
  object MemberAccess extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MemberAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.MemberAccess = js.native
    /**
      * Creates and returns a new MemberAccess instance in the SDK and on the server.
      * The new MemberAccess will be automatically stored in the 'memberAccesses' property
      * of the parent AccessRule element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AccessRule): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.MemberAccess = js.native
  }
  
  /* static members */
  @js.native
  object MemberAccessRights extends js.Object {
    var None: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.MemberAccessRights = js.native
    var ReadOnly: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.MemberAccessRights = js.native
    var ReadWrite: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.MemberAccessRights = js.native
  }
  
  /* static members */
  @js.native
  object MemberRef extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object NoGeneralization extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NoGeneralization instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.NoGeneralization = js.native
    /**
      * Creates and returns a new NoGeneralization instance in the SDK and on the server.
      * The new NoGeneralization will be automatically stored in the 'generalization' property
      * of the parent Entity element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Entity): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.NoGeneralization = js.native
  }
  
  /* static members */
  @js.native
  object NumericAttributeTypeBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object RangeRuleInfo extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new RangeRuleInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.RangeRuleInfo = js.native
    /**
      * Creates and returns a new RangeRuleInfo instance in the SDK and on the server.
      * The new RangeRuleInfo will be automatically stored in the 'ruleInfo' property
      * of the parent ValidationRule element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.ValidationRule): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.RangeRuleInfo = js.native
  }
  
  /* static members */
  @js.native
  object RangeType extends js.Object {
    var Between: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.RangeType = js.native
    var GreaterThanOrEqualTo: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.RangeType = js.native
    var SmallerThanOrEqualTo: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.RangeType = js.native
  }
  
  /* static members */
  @js.native
  object RegExRuleInfo extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new RegExRuleInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.RegExRuleInfo = js.native
    /**
      * Creates and returns a new RegExRuleInfo instance in the SDK and on the server.
      * The new RegExRuleInfo will be automatically stored in the 'ruleInfo' property
      * of the parent ValidationRule element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.ValidationRule): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.RegExRuleInfo = js.native
  }
  
  /* static members */
  @js.native
  object RequiredRuleInfo extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new RequiredRuleInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.RequiredRuleInfo = js.native
    /**
      * Creates and returns a new RequiredRuleInfo instance in the SDK and on the server.
      * The new RequiredRuleInfo will be automatically stored in the 'ruleInfo' property
      * of the parent ValidationRule element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.ValidationRule): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.RequiredRuleInfo = js.native
  }
  
  /* static members */
  @js.native
  object RuleInfo extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object StoredValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new StoredValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.StoredValue = js.native
    /**
      * Creates and returns a new StoredValue instance in the SDK and on the server.
      * The new StoredValue will be automatically stored in the 'value' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Attribute): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.StoredValue = js.native
  }
  
  /* static members */
  @js.native
  object StringAttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new StringAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.StringAttributeType = js.native
    /**
      * Creates and returns a new StringAttributeType instance in the SDK and on the server.
      * The new StringAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Attribute): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.StringAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object UniqueRuleInfo extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new UniqueRuleInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.UniqueRuleInfo = js.native
    /**
      * Creates and returns a new UniqueRuleInfo instance in the SDK and on the server.
      * The new UniqueRuleInfo will be automatically stored in the 'ruleInfo' property
      * of the parent ValidationRule element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.ValidationRule): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.UniqueRuleInfo = js.native
  }
  
  /* static members */
  @js.native
  object ValidationRule extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ValidationRule instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.ValidationRule = js.native
    /**
      * Creates and returns a new ValidationRule instance in the SDK and on the server.
      * The new ValidationRule will be automatically stored in the 'validationRules' property
      * of the parent Entity element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Entity): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.ValidationRule = js.native
  }
  
  /* static members */
  @js.native
  object ValueType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
  }
  
}

