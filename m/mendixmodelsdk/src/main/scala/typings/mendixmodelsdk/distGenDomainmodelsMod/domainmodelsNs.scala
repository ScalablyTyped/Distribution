package typings.mendixmodelsdk.distGenDomainmodelsMod

import typings.mendixmodelsdk.distCommonMod.commonNs.IPoint
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgetsNs.WidgetValue
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.AttributeWidget
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.DataGridColumn
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.EntityWidget
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.GridSortItem
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AccessRule
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.ActionMoment
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Annotation
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Association
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AssociationBase
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AssociationDeleteBehavior
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AssociationOwner
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AssociationRef
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AssociationType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Attribute
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AttributeRef
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AttributeType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AutoNumberAttributeType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.BinaryAttributeType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.BooleanAttributeType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.CalculatedValue
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.CrossAssociation
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.CurrencyAttributeType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DateTimeAttributeType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DecimalAttributeType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DecimalAttributeTypeBase
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DeletingBehavior
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DirectEntityRef
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.DomainModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Entity
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.EntityRef
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.EntityRefStep
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.EnumerationAttributeType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.EqualsToRuleInfo
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.EventHandler
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.EventType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.FloatAttributeType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.FloatAttributeTypeBase
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Generalization
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.GeneralizationBase
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.HashedStringAttributeType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IAssociation
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IAssociationBase
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IAttribute
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IAttributeType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.ICrossAssociation
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IDecimalAttributeTypeBase
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IDomainModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IEntity
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IFloatAttributeTypeBase
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IGeneralizationBase
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IIntegerAttributeTypeBase
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.INumericAttributeTypeBase
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IValueType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.Index
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IndexedAttribute
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IndexedAttributeType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IndirectEntityRef
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IntegerAttributeType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IntegerAttributeTypeBase
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.LongAttributeType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.MaxLengthRuleInfo
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.MemberAccess
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.MemberAccessRights
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.MemberRef
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.NoGeneralization
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.NumericAttributeTypeBase
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.RangeRuleInfo
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.RangeType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.RegExRuleInfo
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.RequiredRuleInfo
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.RuleInfo
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.StoredValue
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.StringAttributeType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.UniqueRuleInfo
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.ValidationRule
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.ValueType
import typings.mendixmodelsdk.distGenEnumerationsMod.enumerationsNs.IEnumeration
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression
import typings.mendixmodelsdk.distGenImagesMod.imagesNs.IImage
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflow
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
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IModuleDocument
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.Module
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.ModuleDocument
import typings.mendixmodelsdk.distGenRegularexpressionsMod.regularexpressionsNs.IRegularExpression
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.AccessRuleContainerBase
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.IModuleRole
import typings.mendixmodelsdk.distGenTextsMod.textsNs.Text
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalElementsMod.IElement
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels")
@js.native
object domainmodelsNs extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `DomainModels`.
    */
  /**
    * See: {@link https://docs.mendix.com/refguide7/access-rules relevant section in reference guide}
    */
  @js.native
  class AccessRule protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var allowCreate: Boolean = js.native
    var allowDelete: Boolean = js.native
    val containerAsAccessRuleContainerBase: AccessRuleContainerBase = js.native
    val containerAsEntity: Entity = js.native
    var defaultMemberAccessRights: MemberAccessRights = js.native
    var documentation: String = js.native
    val memberAccesses: IList[MemberAccess] = js.native
    @JSName("model")
    var model_AccessRule: IModel = js.native
    val moduleRoles: IList[IModuleRole] = js.native
    val moduleRolesQualifiedNames: js.Array[String] = js.native
    /**
      * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
      */
    var xPathConstraint: String = js.native
  }
  
  @js.native
  class ActionMoment () extends AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/annotations relevant section in reference guide}
    */
  @js.native
  class Annotation protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var caption: String = js.native
    val containerAsDomainModel: DomainModel = js.native
    var location: IPoint = js.native
    @JSName("model")
    var model_Annotation: IModel = js.native
    var width: Double = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/associations relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IAssociation because var conflicts: id, isLoaded, model, name, owner, parent, structureTypeName, `type`, unit. Inlined child */ @js.native
  class Association protected () extends AssociationBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var child: Entity | IEntity = js.native
    var childConnection: IPoint = js.native
    @JSName("containerAsDomainModel")
    val containerAsDomainModel_Association: DomainModel = js.native
    var parentConnection: IPoint = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/associations relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IAssociationBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsDomainModel, name, `type`, owner, parent */ @js.native
  abstract class AssociationBase protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsDomainModel: DomainModel | IDomainModel = js.native
    var dataStorageGuid: String = js.native
    var deleteBehavior: AssociationDeleteBehavior = js.native
    var documentation: String = js.native
    @JSName("model")
    var model_AssociationBase: IModel = js.native
    var name: String = js.native
    var owner: AssociationOwner = js.native
    var parent: Entity | IEntity = js.native
    val qualifiedName: String | Null = js.native
    var `type`: AssociationType = js.native
  }
  
  @js.native
  class AssociationDeleteBehavior protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var childDeleteBehavior: DeletingBehavior = js.native
    var childErrorMessage: Text | Null = js.native
    val containerAsAssociationBase: AssociationBase = js.native
    @JSName("model")
    var model_AssociationDeleteBehavior: IModel = js.native
    var parentDeleteBehavior: DeletingBehavior = js.native
    var parentErrorMessage: Text | Null = js.native
  }
  
  @js.native
  class AssociationOwner () extends AbstractEnum
  
  /**
    * In version 7.11.0: introduced
    */
  @js.native
  class AssociationRef protected () extends MemberRef {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var association: IAssociationBase = js.native
    val associationQualifiedName: String = js.native
  }
  
  @js.native
  class AssociationType () extends AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/attributes relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IAttribute because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsEntity, name, `type`, value */ @js.native
  class Attribute protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsEntity: Entity | IEntity = js.native
    var dataStorageGuid: String = js.native
    var documentation: String = js.native
    @JSName("model")
    var model_Attribute: IModel = js.native
    var name: String = js.native
    val qualifiedName: String | Null = js.native
    var `type`: AttributeType | IAttributeType = js.native
    /**
      * In version 6.6.0: added public
      */
    var value: IValueType | ValueType = js.native
  }
  
  /**
    * In version 7.11.0: introduced
    */
  @js.native
  class AttributeRef protected () extends MemberRef {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var attribute: IAttribute = js.native
    val attributeQualifiedName: String = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsAttribute */ @js.native
  abstract class AttributeType protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsAttribute: Attribute | IAttribute = js.native
    @JSName("model")
    var model_AttributeType: IModel = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IAutoNumberAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class AutoNumberAttributeType protected () extends IntegerAttributeTypeBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IBinaryAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class BinaryAttributeType protected () extends AttributeType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsAttribute")
    val containerAsAttribute_BinaryAttributeType: Attribute = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IBooleanAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class BooleanAttributeType protected () extends AttributeType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsAttribute")
    val containerAsAttribute_BooleanAttributeType: Attribute = js.native
  }
  
  /**
    * In version 6.6.0: added public
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.ICalculatedValue because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class CalculatedValue protected () extends ValueType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsAttribute")
    val containerAsAttribute_CalculatedValue: Attribute = js.native
    var microflow: IMicroflow | Null = js.native
    val microflowQualifiedName: String | Null = js.native
    var passEntity: Boolean = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.ICrossAssociation because var conflicts: id, isLoaded, model, name, owner, parent, structureTypeName, `type`, unit. Inlined child, childQualifiedName */ @js.native
  class CrossAssociation protected () extends AssociationBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var child: IEntity = js.native
    val childQualifiedName: String = js.native
    @JSName("containerAsDomainModel")
    val containerAsDomainModel_CrossAssociation: DomainModel = js.native
  }
  
  /**
    * In version 6.0.0: deprecated
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.ICurrencyAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class CurrencyAttributeType protected () extends FloatAttributeTypeBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IDateTimeAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class DateTimeAttributeType protected () extends AttributeType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsAttribute")
    val containerAsAttribute_DateTimeAttributeType: Attribute = js.native
    var localizeDate: Boolean = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IDecimalAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class DecimalAttributeType protected () extends DecimalAttributeTypeBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IDecimalAttributeTypeBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  abstract class DecimalAttributeTypeBase protected () extends NumericAttributeTypeBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  @js.native
  class DeletingBehavior () extends AbstractEnum
  
  /**
    * In version 7.11.0: introduced
    */
  @js.native
  class DirectEntityRef protected () extends EntityRef {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var entity: IEntity = js.native
    val entityQualifiedName: String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/domain-model relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IDomainModel because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined entities, associations, crossAssociations */ @js.native
  class DomainModel protected () extends ModuleDocument {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IModule
    ) = this()
    val annotations: IList[Annotation] = js.native
    val associations: IList[Association | IAssociation] = js.native
    @JSName("containerAsModule")
    val containerAsModule_DomainModel: Module = js.native
    val crossAssociations: IList[CrossAssociation | ICrossAssociation] = js.native
    var documentation: String = js.native
    val entities: IList[Entity | IEntity] = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/entities relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IEntity because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsDomainModel, name, generalization, attributes */ @js.native
  class Entity protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val accessRules: IList[AccessRule] = js.native
    val attributes: IList[Attribute | IAttribute] = js.native
    val containerAsDomainModel: DomainModel | IDomainModel = js.native
    var dataStorageGuid: String = js.native
    var documentation: String = js.native
    val eventHandlers: IList[EventHandler] = js.native
    var generalization: GeneralizationBase | IGeneralizationBase = js.native
    var image: IImage | Null = js.native
    val imageQualifiedName: String | Null = js.native
    val indexes: IList[Index] = js.native
    /**
      * In version 7.17.0: introduced
      */
    var isRemote: Boolean = js.native
    var location: IPoint = js.native
    @JSName("model")
    var model_Entity: IModel = js.native
    var name: String = js.native
    val qualifiedName: String | Null = js.native
    /**
      * In version 7.17.0: introduced
      */
    var remoteSource: String = js.native
    val validationRules: IList[ValidationRule] = js.native
  }
  
  /**
    * In version 7.11.0: introduced
    */
  @js.native
  abstract class EntityRef protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsCreateObjectClientAction: CreateObjectClientAction = js.native
    val containerAsEntityPathSource: EntityPathSource = js.native
    val containerAsEntityWidget: EntityWidget = js.native
    val containerAsMemberRef: MemberRef = js.native
    val containerAsNewButton: NewButton = js.native
    val containerAsReferenceSetSelector: ReferenceSetSelector = js.native
    val containerAsSelectorXPathSource: SelectorXPathSource = js.native
    val containerAsWidgetValue: WidgetValue = js.native
    @JSName("model")
    var model_EntityRef: IModel = js.native
  }
  
  /**
    * In version 7.11.0: introduced
    */
  @js.native
  class EntityRefStep protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var association: IAssociationBase = js.native
    val associationQualifiedName: String = js.native
    val containerAsIndirectEntityRef: IndirectEntityRef = js.native
    var destinationEntity: IEntity = js.native
    val destinationEntityQualifiedName: String = js.native
    @JSName("model")
    var model_EntityRefStep: IModel = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IEnumerationAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined enumeration, enumerationQualifiedName */ @js.native
  class EnumerationAttributeType protected () extends AttributeType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsAttribute")
    val containerAsAttribute_EnumerationAttributeType: Attribute = js.native
    var enumeration: IEnumeration = js.native
    val enumerationQualifiedName: String = js.native
  }
  
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
    var equalsToAttribute: IAttribute | Null = js.native
    val equalsToAttributeQualifiedName: String | Null = js.native
    var equalsToValue: String = js.native
    var useValue: Boolean = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/event-handlers relevant section in reference guide}
    */
  @js.native
  class EventHandler protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsEntity: Entity = js.native
    var event: EventType = js.native
    var microflow: IMicroflow | Null = js.native
    val microflowQualifiedName: String | Null = js.native
    @JSName("model")
    var model_EventHandler: IModel = js.native
    var moment: ActionMoment = js.native
    var passEventObject: Boolean = js.native
    var raiseErrorOnFalse: Boolean = js.native
  }
  
  @js.native
  class EventType () extends AbstractEnum
  
  /**
    * In version 6.0.0: deprecated
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IFloatAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class FloatAttributeType protected () extends FloatAttributeTypeBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IFloatAttributeTypeBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  abstract class FloatAttributeTypeBase protected () extends DecimalAttributeTypeBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IGeneralization because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined generalization, generalizationQualifiedName */ @js.native
  class Generalization protected () extends GeneralizationBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsEntity")
    val containerAsEntity_Generalization: Entity = js.native
    var generalization: IEntity = js.native
    val generalizationQualifiedName: String = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IGeneralizationBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsEntity */ @js.native
  abstract class GeneralizationBase protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsEntity: Entity | IEntity = js.native
    @JSName("model")
    var model_GeneralizationBase: IModel = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IHashedStringAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class HashedStringAttributeType protected () extends AttributeType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsAttribute")
    val containerAsAttribute_HashedStringAttributeType: Attribute = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/associations relevant section in reference guide}
    */
  @js.native
  trait IAssociation extends IAssociationBase {
    /**
      * This property is required and cannot be set to null.
      */
    val child: IEntity = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/associations relevant section in reference guide}
    */
  @js.native
  trait IAssociationBase
    extends IElement
       with IByNameReferrable {
    val containerAsDomainModel: IDomainModel = js.native
    @JSName("model")
    val model_IAssociationBase: IModel = js.native
    val name: String = js.native
    val owner: AssociationOwner = js.native
    /**
      * This property is required and cannot be set to null.
      */
    val parent: IEntity = js.native
    val `type`: AssociationType = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/attributes relevant section in reference guide}
    */
  @js.native
  trait IAttribute
    extends IElement
       with IByNameReferrable {
    val containerAsEntity: IEntity = js.native
    @JSName("model")
    val model_IAttribute: IModel = js.native
    val name: String = js.native
    /**
      * This property is required and cannot be set to null.
      */
    val `type`: IAttributeType = js.native
    /**
      * This property is required and cannot be set to null.
      *
      * In version 6.6.0: added public
      */
    val value: IValueType = js.native
  }
  
  @js.native
  trait IAttributeType extends IElement {
    val containerAsAttribute: IAttribute = js.native
    @JSName("model")
    val model_IAttributeType: IModel = js.native
  }
  
  @js.native
  trait IAutoNumberAttributeType extends IIntegerAttributeTypeBase
  
  @js.native
  trait IBinaryAttributeType extends IAttributeType
  
  @js.native
  trait IBooleanAttributeType extends IAttributeType
  
  /**
    * In version 6.6.0: added public
    */
  @js.native
  trait ICalculatedValue extends IValueType
  
  @js.native
  trait ICrossAssociation extends IAssociationBase {
    /**
      * This property is required and cannot be set to null.
      */
    val child: IEntity = js.native
    val childQualifiedName: String = js.native
  }
  
  /**
    * In version 6.0.0: deprecated
    */
  @js.native
  trait ICurrencyAttributeType extends IFloatAttributeTypeBase
  
  @js.native
  trait IDateTimeAttributeType extends IAttributeType
  
  @js.native
  trait IDecimalAttributeType extends IDecimalAttributeTypeBase
  
  @js.native
  trait IDecimalAttributeTypeBase extends INumericAttributeTypeBase
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/domain-model relevant section in reference guide}
    */
  @js.native
  trait IDomainModel extends IModuleDocument {
    val associations: IList[IAssociation] = js.native
    val crossAssociations: IList[ICrossAssociation] = js.native
    val entities: IList[IEntity] = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/entities relevant section in reference guide}
    */
  @js.native
  trait IEntity
    extends IElement
       with IByNameReferrable {
    val attributes: IList[IAttribute] = js.native
    val containerAsDomainModel: IDomainModel = js.native
    /**
      * This property is required and cannot be set to null.
      */
    val generalization: IGeneralizationBase = js.native
    @JSName("model")
    val model_IEntity: IModel = js.native
    val name: String = js.native
  }
  
  @js.native
  trait IEnumerationAttributeType extends IAttributeType {
    /**
      * This property is required and cannot be set to null.
      */
    val enumeration: IEnumeration = js.native
    val enumerationQualifiedName: String = js.native
  }
  
  /**
    * In version 6.0.0: deprecated
    */
  @js.native
  trait IFloatAttributeType extends IFloatAttributeTypeBase
  
  @js.native
  trait IFloatAttributeTypeBase extends IDecimalAttributeTypeBase
  
  @js.native
  trait IGeneralization extends IGeneralizationBase {
    /**
      * This property is required and cannot be set to null.
      */
    val generalization: IEntity = js.native
    val generalizationQualifiedName: String = js.native
  }
  
  @js.native
  trait IGeneralizationBase extends IElement {
    val containerAsEntity: IEntity = js.native
    @JSName("model")
    val model_IGeneralizationBase: IModel = js.native
  }
  
  @js.native
  trait IHashedStringAttributeType extends IAttributeType
  
  @js.native
  trait IIntegerAttributeType extends IIntegerAttributeTypeBase
  
  @js.native
  trait IIntegerAttributeTypeBase extends INumericAttributeTypeBase
  
  @js.native
  trait ILongAttributeType extends IIntegerAttributeTypeBase
  
  @js.native
  trait INoGeneralization extends IGeneralizationBase {
    val persistable: Boolean = js.native
  }
  
  @js.native
  trait INumericAttributeTypeBase extends IAttributeType
  
  /**
    * In version 6.6.0: added public
    */
  @js.native
  trait IStoredValue extends IValueType
  
  @js.native
  trait IStringAttributeType extends IAttributeType
  
  /**
    * In version 6.6.0: added public
    */
  @js.native
  trait IValueType extends IElement {
    val containerAsAttribute: IAttribute = js.native
    @JSName("model")
    val model_IValueType: IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/indexes relevant section in reference guide}
    */
  @js.native
  class Index protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val attributes: IList[IndexedAttribute] = js.native
    val containerAsEntity: Entity = js.native
    var dataStorageGuid: String = js.native
    @JSName("model")
    var model_Index: IModel = js.native
  }
  
  @js.native
  class IndexedAttribute protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * In version 7.14.0: introduced
      */
    var ascending: Boolean = js.native
    var attribute: Attribute | Null = js.native
    val containerAsIndex: Index = js.native
    @JSName("model")
    var model_IndexedAttribute: IModel = js.native
    var `type`: IndexedAttributeType = js.native
  }
  
  @js.native
  class IndexedAttributeType () extends AbstractEnum
  
  /**
    * In version 7.11.0: introduced
    */
  @js.native
  class IndirectEntityRef protected () extends EntityRef {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val steps: IList[EntityRefStep] = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IIntegerAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class IntegerAttributeType protected () extends IntegerAttributeTypeBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IIntegerAttributeTypeBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  abstract class IntegerAttributeTypeBase protected () extends NumericAttributeTypeBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.ILongAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class LongAttributeType protected () extends IntegerAttributeTypeBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  @js.native
  class MaxLengthRuleInfo protected () extends RuleInfo {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var maxLength: Double = js.native
  }
  
  @js.native
  class MemberAccess protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var accessRights: MemberAccessRights = js.native
    var association: IAssociationBase | Null = js.native
    val associationQualifiedName: String | Null = js.native
    var attribute: IAttribute | Null = js.native
    val attributeQualifiedName: String | Null = js.native
    val containerAsAccessRule: AccessRule = js.native
    @JSName("model")
    var model_MemberAccess: IModel = js.native
  }
  
  @js.native
  class MemberAccessRights () extends AbstractEnum
  
  /**
    * In version 7.11.0: introduced
    */
  @js.native
  abstract class MemberRef protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsAttributeWidget: AttributeWidget = js.native
    val containerAsClientTemplateParameter: ClientTemplateParameter = js.native
    val containerAsDataGridColumn: DataGridColumn = js.native
    val containerAsDocumentTemplatesGridSortItem: GridSortItem = js.native
    val containerAsGridColumn: GridColumn = js.native
    val containerAsListViewSearch: ListViewSearch = js.native
    val containerAsMemberWidget: MemberWidget = js.native
    val containerAsPagesGridSortItem: typings.mendixmodelsdk.distGenPagesMod.pagesNs.GridSortItem = js.native
    val containerAsRangeSearchField: RangeSearchField = js.native
    val containerAsSingleSearchField: SingleSearchField = js.native
    val containerAsSortItem: SortItem = js.native
    val containerAsStaticOrDynamicString: StaticOrDynamicString = js.native
    val containerAsVariableRefExpression: VariableRefExpression = js.native
    val containerAsWidgetValue: WidgetValue = js.native
    var entityRef: IndirectEntityRef | Null = js.native
    @JSName("model")
    var model_MemberRef: IModel = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.INoGeneralization because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined persistable */ @js.native
  class NoGeneralization protected () extends GeneralizationBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsEntity")
    val containerAsEntity_NoGeneralization: Entity = js.native
    var hasChangedBy: Boolean = js.native
    var hasChangedDate: Boolean = js.native
    var hasCreatedDate: Boolean = js.native
    var hasOwner: Boolean = js.native
    var persistable: Boolean = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.INumericAttributeTypeBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  abstract class NumericAttributeTypeBase protected () extends AttributeType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsAttribute")
    val containerAsAttribute_NumericAttributeTypeBase: Attribute = js.native
  }
  
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
  
  @js.native
  class RangeType () extends AbstractEnum
  
  @js.native
  class RegExRuleInfo protected () extends RuleInfo {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var regularExpression: IRegularExpression | Null = js.native
    val regularExpressionQualifiedName: String | Null = js.native
  }
  
  @js.native
  class RequiredRuleInfo protected () extends RuleInfo {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  @js.native
  abstract class RuleInfo protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsValidationRule: ValidationRule = js.native
    @JSName("model")
    var model_RuleInfo: IModel = js.native
  }
  
  /**
    * In version 6.6.0: added public
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IStoredValue because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class StoredValue protected () extends ValueType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsAttribute")
    val containerAsAttribute_StoredValue: Attribute = js.native
    var defaultValue: String = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IStringAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class StringAttributeType protected () extends AttributeType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsAttribute")
    val containerAsAttribute_StringAttributeType: Attribute = js.native
    var length: Double = js.native
  }
  
  @js.native
  class UniqueRuleInfo protected () extends RuleInfo {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/validation-rules relevant section in reference guide}
    */
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
    var attribute: IAttribute = js.native
    val attributeQualifiedName: String = js.native
    val containerAsEntity: Entity = js.native
    var errorMessage: Text = js.native
    @JSName("model")
    var model_ValidationRule: IModel = js.native
    var ruleInfo: RuleInfo = js.native
  }
  
  /**
    * In version 6.6.0: added public
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IValueType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsAttribute */ @js.native
  abstract class ValueType protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsAttribute: Attribute | IAttribute = js.native
    @JSName("model")
    var model_ValueType: IModel = js.native
  }
  
  /* static members */
  @js.native
  object AccessRule extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new AccessRule instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): AccessRule = js.native
    /**
      * Creates and returns a new AccessRule instance in the SDK and on the server.
      * The new AccessRule will be automatically stored in the 'accessRules' property
      * of the parent security.AccessRuleContainerBase element passed as argument.
      */
    def createInAccessRuleContainerBaseUnderAccessRules(container: AccessRuleContainerBase): AccessRule = js.native
    /**
      * Creates and returns a new AccessRule instance in the SDK and on the server.
      * The new AccessRule will be automatically stored in the 'accessRules' property
      * of the parent Entity element passed as argument.
      */
    def createInEntityUnderAccessRules(container: Entity): AccessRule = js.native
  }
  
  /* static members */
  @js.native
  object ActionMoment extends js.Object {
    var After: ActionMoment = js.native
    var Before: ActionMoment = js.native
  }
  
  /* static members */
  @js.native
  object Annotation extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Annotation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Annotation = js.native
    /**
      * Creates and returns a new Annotation instance in the SDK and on the server.
      * The new Annotation will be automatically stored in the 'annotations' property
      * of the parent DomainModel element passed as argument.
      */
    def createIn(container: DomainModel): Annotation = js.native
  }
  
  /* static members */
  @js.native
  object Association extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Association instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Association = js.native
    /**
      * Creates and returns a new Association instance in the SDK and on the server.
      * The new Association will be automatically stored in the 'associations' property
      * of the parent DomainModel element passed as argument.
      */
    def createIn(container: DomainModel): Association = js.native
  }
  
  /* static members */
  @js.native
  object AssociationBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object AssociationDeleteBehavior extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new AssociationDeleteBehavior instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): AssociationDeleteBehavior = js.native
    /**
      * Creates and returns a new AssociationDeleteBehavior instance in the SDK and on the server.
      * The new AssociationDeleteBehavior will be automatically stored in the 'deleteBehavior' property
      * of the parent AssociationBase element passed as argument.
      */
    def createIn(container: AssociationBase): AssociationDeleteBehavior = js.native
  }
  
  /* static members */
  @js.native
  object AssociationOwner extends js.Object {
    var Both: AssociationOwner = js.native
    var Default: AssociationOwner = js.native
  }
  
  /* static members */
  @js.native
  object AssociationRef extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new AssociationRef instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): AssociationRef = js.native
  }
  
  /* static members */
  @js.native
  object AssociationType extends js.Object {
    var Reference: AssociationType = js.native
    var ReferenceSet: AssociationType = js.native
  }
  
  /* static members */
  @js.native
  object Attribute extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Attribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Attribute = js.native
    /**
      * Creates and returns a new Attribute instance in the SDK and on the server.
      * The new Attribute will be automatically stored in the 'attributes' property
      * of the parent Entity element passed as argument.
      */
    def createIn(container: Entity): Attribute = js.native
  }
  
  /* static members */
  @js.native
  object AttributeRef extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent documenttemplates.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInAttributeWidgetUnderAttributeRef(container: AttributeWidget): AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent pages.ClientTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInClientTemplateParameterUnderAttributeRef(container: ClientTemplateParameter): AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent documenttemplates.DataGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInDataGridColumnUnderAttributeRef(container: DataGridColumn): AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent documenttemplates.GridSortItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInDocumentTemplatesGridSortItemUnderAttributeRef(container: GridSortItem): AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent pages.GridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInGridColumnUnderAttributeRef(container: GridColumn): AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'searchRefs' property
      * of the parent pages.ListViewSearch element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInListViewSearchUnderSearchRefs(container: ListViewSearch): AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent pages.MemberWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInMemberWidgetUnderAttributeRef(container: MemberWidget): AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent pages.GridSortItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInPagesGridSortItemUnderAttributeRef(container: typings.mendixmodelsdk.distGenPagesMod.pagesNs.GridSortItem): AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'lowerBoundRef' property
      * of the parent pages.RangeSearchField element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInRangeSearchFieldUnderLowerBoundRef(container: RangeSearchField): AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'upperBoundRef' property
      * of the parent pages.RangeSearchField element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInRangeSearchFieldUnderUpperBoundRef(container: RangeSearchField): AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent pages.SingleSearchField element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInSingleSearchFieldUnderAttributeRef(container: SingleSearchField): AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent microflows.SortItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInSortItemUnderAttributeRef(container: SortItem): AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent pages.StaticOrDynamicString element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInStaticOrDynamicStringUnderAttributeRef(container: StaticOrDynamicString): AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'member' property
      * of the parent expressions.VariableRefExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInVariableRefExpressionUnderMember(container: VariableRefExpression): AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInWidgetValueUnderAttributeRef(container: WidgetValue): AttributeRef = js.native
  }
  
  /* static members */
  @js.native
  object AttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object AutoNumberAttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new AutoNumberAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): AutoNumberAttributeType = js.native
    /**
      * Creates and returns a new AutoNumberAttributeType instance in the SDK and on the server.
      * The new AutoNumberAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: Attribute): AutoNumberAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object BinaryAttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new BinaryAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): BinaryAttributeType = js.native
    /**
      * Creates and returns a new BinaryAttributeType instance in the SDK and on the server.
      * The new BinaryAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: Attribute): BinaryAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object BooleanAttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new BooleanAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): BooleanAttributeType = js.native
    /**
      * Creates and returns a new BooleanAttributeType instance in the SDK and on the server.
      * The new BooleanAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: Attribute): BooleanAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object CalculatedValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new CalculatedValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): CalculatedValue = js.native
    /**
      * Creates and returns a new CalculatedValue instance in the SDK and on the server.
      * The new CalculatedValue will be automatically stored in the 'value' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: Attribute): CalculatedValue = js.native
  }
  
  /* static members */
  @js.native
  object CrossAssociation extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new CrossAssociation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): CrossAssociation = js.native
    /**
      * Creates and returns a new CrossAssociation instance in the SDK and on the server.
      * The new CrossAssociation will be automatically stored in the 'crossAssociations' property
      * of the parent DomainModel element passed as argument.
      */
    def createIn(container: DomainModel): CrossAssociation = js.native
  }
  
  /* static members */
  @js.native
  object CurrencyAttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new CurrencyAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): CurrencyAttributeType = js.native
    /**
      * Creates and returns a new CurrencyAttributeType instance in the SDK and on the server.
      * The new CurrencyAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: Attribute): CurrencyAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object DateTimeAttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DateTimeAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DateTimeAttributeType = js.native
    /**
      * Creates and returns a new DateTimeAttributeType instance in the SDK and on the server.
      * The new DateTimeAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: Attribute): DateTimeAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object DecimalAttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DecimalAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DecimalAttributeType = js.native
    /**
      * Creates and returns a new DecimalAttributeType instance in the SDK and on the server.
      * The new DecimalAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: Attribute): DecimalAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object DecimalAttributeTypeBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object DeletingBehavior extends js.Object {
    var DeleteMeAndReferences: DeletingBehavior = js.native
    var DeleteMeButKeepReferences: DeletingBehavior = js.native
    var DeleteMeIfNoReferences: DeletingBehavior = js.native
  }
  
  /* static members */
  @js.native
  object DirectEntityRef extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DirectEntityRef = js.native
    /**
      * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
      * The new DirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent pages.CreateObjectClientAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInCreateObjectClientActionUnderEntityRef(container: CreateObjectClientAction): DirectEntityRef = js.native
    /**
      * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
      * The new DirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent pages.EntityPathSource element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInEntityPathSourceUnderEntityRef(container: EntityPathSource): DirectEntityRef = js.native
    /**
      * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
      * The new DirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent documenttemplates.EntityWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInEntityWidgetUnderEntityRef(container: EntityWidget): DirectEntityRef = js.native
    /**
      * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
      * The new DirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent pages.NewButton element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 to 7.16.0
      */
    def createInNewButtonUnderEntityRef(container: NewButton): DirectEntityRef = js.native
    /**
      * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
      * The new DirectEntityRef will be automatically stored in the 'constrainedByRefs' property
      * of the parent pages.ReferenceSetSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInReferenceSetSelectorUnderConstrainedByRefs(container: ReferenceSetSelector): DirectEntityRef = js.native
    /**
      * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
      * The new DirectEntityRef will be automatically stored in the 'constrainedByRefs' property
      * of the parent pages.SelectorXPathSource element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInSelectorXPathSourceUnderConstrainedByRefs(container: SelectorXPathSource): DirectEntityRef = js.native
    /**
      * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
      * The new DirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInWidgetValueUnderEntityRef(container: WidgetValue): DirectEntityRef = js.native
  }
  
  /* static members */
  @js.native
  object DomainModel extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new DomainModel unit in the SDK and on the server.
      * Expects one argument, the projects.IModule in which this unit is contained.
      */
    def createIn(container: IModule): DomainModel = js.native
  }
  
  /* static members */
  @js.native
  object Entity extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Entity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Entity = js.native
    /**
      * Creates and returns a new Entity instance in the SDK and on the server.
      * The new Entity will be automatically stored in the 'entities' property
      * of the parent DomainModel element passed as argument.
      */
    def createIn(container: DomainModel): Entity = js.native
  }
  
  /* static members */
  @js.native
  object EntityRef extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object EntityRefStep extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new EntityRefStep instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): EntityRefStep = js.native
    /**
      * Creates and returns a new EntityRefStep instance in the SDK and on the server.
      * The new EntityRefStep will be automatically stored in the 'steps' property
      * of the parent IndirectEntityRef element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createIn(container: IndirectEntityRef): EntityRefStep = js.native
  }
  
  /* static members */
  @js.native
  object EnumerationAttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new EnumerationAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): EnumerationAttributeType = js.native
    /**
      * Creates and returns a new EnumerationAttributeType instance in the SDK and on the server.
      * The new EnumerationAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: Attribute): EnumerationAttributeType = js.native
  }
  
  /* static members */
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
  
  /* static members */
  @js.native
  object EventHandler extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new EventHandler instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): EventHandler = js.native
    /**
      * Creates and returns a new EventHandler instance in the SDK and on the server.
      * The new EventHandler will be automatically stored in the 'eventHandlers' property
      * of the parent Entity element passed as argument.
      */
    def createIn(container: Entity): EventHandler = js.native
  }
  
  /* static members */
  @js.native
  object EventType extends js.Object {
    var Commit: EventType = js.native
    var Create: EventType = js.native
    var Delete: EventType = js.native
    var RollBack: EventType = js.native
  }
  
  /* static members */
  @js.native
  object FloatAttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new FloatAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): FloatAttributeType = js.native
    /**
      * Creates and returns a new FloatAttributeType instance in the SDK and on the server.
      * The new FloatAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: Attribute): FloatAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object FloatAttributeTypeBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object Generalization extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Generalization instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Generalization = js.native
    /**
      * Creates and returns a new Generalization instance in the SDK and on the server.
      * The new Generalization will be automatically stored in the 'generalization' property
      * of the parent Entity element passed as argument.
      */
    def createIn(container: Entity): Generalization = js.native
  }
  
  /* static members */
  @js.native
  object GeneralizationBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object HashedStringAttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new HashedStringAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): HashedStringAttributeType = js.native
    /**
      * Creates and returns a new HashedStringAttributeType instance in the SDK and on the server.
      * The new HashedStringAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: Attribute): HashedStringAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object Index extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Index instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Index = js.native
    /**
      * Creates and returns a new Index instance in the SDK and on the server.
      * The new Index will be automatically stored in the 'indexes' property
      * of the parent Entity element passed as argument.
      */
    def createIn(container: Entity): Index = js.native
  }
  
  /* static members */
  @js.native
  object IndexedAttribute extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new IndexedAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): IndexedAttribute = js.native
    /**
      * Creates and returns a new IndexedAttribute instance in the SDK and on the server.
      * The new IndexedAttribute will be automatically stored in the 'attributes' property
      * of the parent Index element passed as argument.
      */
    def createIn(container: Index): IndexedAttribute = js.native
  }
  
  /* static members */
  @js.native
  object IndexedAttributeType extends js.Object {
    var ChangedDate: IndexedAttributeType = js.native
    var CreatedDate: IndexedAttributeType = js.native
    var Normal: IndexedAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object IndirectEntityRef extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): IndirectEntityRef = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent pages.CreateObjectClientAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInCreateObjectClientActionUnderEntityRef(container: CreateObjectClientAction): IndirectEntityRef = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent pages.EntityPathSource element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInEntityPathSourceUnderEntityRef(container: EntityPathSource): IndirectEntityRef = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent documenttemplates.EntityWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInEntityWidgetUnderEntityRef(container: EntityWidget): IndirectEntityRef = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent MemberRef element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInMemberRefUnderEntityRef(container: MemberRef): IndirectEntityRef = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent pages.NewButton element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 to 7.16.0
      */
    def createInNewButtonUnderEntityRef(container: NewButton): IndirectEntityRef = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * The new IndirectEntityRef will be automatically stored in the 'constrainedByRefs' property
      * of the parent pages.ReferenceSetSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInReferenceSetSelectorUnderConstrainedByRefs(container: ReferenceSetSelector): IndirectEntityRef = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * The new IndirectEntityRef will be automatically stored in the 'constrainedByRefs' property
      * of the parent pages.SelectorXPathSource element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInSelectorXPathSourceUnderConstrainedByRefs(container: SelectorXPathSource): IndirectEntityRef = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInWidgetValueUnderEntityRef(container: WidgetValue): IndirectEntityRef = js.native
  }
  
  /* static members */
  @js.native
  object IntegerAttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new IntegerAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): IntegerAttributeType = js.native
    /**
      * Creates and returns a new IntegerAttributeType instance in the SDK and on the server.
      * The new IntegerAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: Attribute): IntegerAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object IntegerAttributeTypeBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object LongAttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new LongAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): LongAttributeType = js.native
    /**
      * Creates and returns a new LongAttributeType instance in the SDK and on the server.
      * The new LongAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: Attribute): LongAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object MaxLengthRuleInfo extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MaxLengthRuleInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MaxLengthRuleInfo = js.native
    /**
      * Creates and returns a new MaxLengthRuleInfo instance in the SDK and on the server.
      * The new MaxLengthRuleInfo will be automatically stored in the 'ruleInfo' property
      * of the parent ValidationRule element passed as argument.
      */
    def createIn(container: ValidationRule): MaxLengthRuleInfo = js.native
  }
  
  /* static members */
  @js.native
  object MemberAccess extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MemberAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MemberAccess = js.native
    /**
      * Creates and returns a new MemberAccess instance in the SDK and on the server.
      * The new MemberAccess will be automatically stored in the 'memberAccesses' property
      * of the parent AccessRule element passed as argument.
      */
    def createIn(container: AccessRule): MemberAccess = js.native
  }
  
  /* static members */
  @js.native
  object MemberAccessRights extends js.Object {
    var None: MemberAccessRights = js.native
    var ReadOnly: MemberAccessRights = js.native
    var ReadWrite: MemberAccessRights = js.native
  }
  
  /* static members */
  @js.native
  object MemberRef extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object NoGeneralization extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new NoGeneralization instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): NoGeneralization = js.native
    /**
      * Creates and returns a new NoGeneralization instance in the SDK and on the server.
      * The new NoGeneralization will be automatically stored in the 'generalization' property
      * of the parent Entity element passed as argument.
      */
    def createIn(container: Entity): NoGeneralization = js.native
  }
  
  /* static members */
  @js.native
  object NumericAttributeTypeBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
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
  
  /* static members */
  @js.native
  object RangeType extends js.Object {
    var Between: RangeType = js.native
    var GreaterThanOrEqualTo: RangeType = js.native
    var SmallerThanOrEqualTo: RangeType = js.native
  }
  
  /* static members */
  @js.native
  object RegExRuleInfo extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new RegExRuleInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): RegExRuleInfo = js.native
    /**
      * Creates and returns a new RegExRuleInfo instance in the SDK and on the server.
      * The new RegExRuleInfo will be automatically stored in the 'ruleInfo' property
      * of the parent ValidationRule element passed as argument.
      */
    def createIn(container: ValidationRule): RegExRuleInfo = js.native
  }
  
  /* static members */
  @js.native
  object RequiredRuleInfo extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new RequiredRuleInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): RequiredRuleInfo = js.native
    /**
      * Creates and returns a new RequiredRuleInfo instance in the SDK and on the server.
      * The new RequiredRuleInfo will be automatically stored in the 'ruleInfo' property
      * of the parent ValidationRule element passed as argument.
      */
    def createIn(container: ValidationRule): RequiredRuleInfo = js.native
  }
  
  /* static members */
  @js.native
  object RuleInfo extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object StoredValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new StoredValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): StoredValue = js.native
    /**
      * Creates and returns a new StoredValue instance in the SDK and on the server.
      * The new StoredValue will be automatically stored in the 'value' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: Attribute): StoredValue = js.native
  }
  
  /* static members */
  @js.native
  object StringAttributeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new StringAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): StringAttributeType = js.native
    /**
      * Creates and returns a new StringAttributeType instance in the SDK and on the server.
      * The new StringAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: Attribute): StringAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object UniqueRuleInfo extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new UniqueRuleInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): UniqueRuleInfo = js.native
    /**
      * Creates and returns a new UniqueRuleInfo instance in the SDK and on the server.
      * The new UniqueRuleInfo will be automatically stored in the 'ruleInfo' property
      * of the parent ValidationRule element passed as argument.
      */
    def createIn(container: ValidationRule): UniqueRuleInfo = js.native
  }
  
  /* static members */
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
  
  /* static members */
  @js.native
  object ValueType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
}

