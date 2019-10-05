package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodels

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.AttributeWidget
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DataGridColumn
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.GridSortItem
import typings.mendixmodelsdk.distGenExpressionsMod.expressions.VariableRefExpression
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.SortItem
import typings.mendixmodelsdk.distGenPagesMod.pages.ClientTemplateParameter
import typings.mendixmodelsdk.distGenPagesMod.pages.GridColumn
import typings.mendixmodelsdk.distGenPagesMod.pages.ListViewSearch
import typings.mendixmodelsdk.distGenPagesMod.pages.MemberWidget
import typings.mendixmodelsdk.distGenPagesMod.pages.RangeSearchField
import typings.mendixmodelsdk.distGenPagesMod.pages.SingleSearchField
import typings.mendixmodelsdk.distGenPagesMod.pages.StaticOrDynamicString
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.11.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.AttributeRef")
@js.native
class AttributeRef protected ()
  extends typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.AttributeRef")
@js.native
object AttributeRef extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent documenttemplates.AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInAttributeWidgetUnderAttributeRef(container: AttributeWidget): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.ClientTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInClientTemplateParameterUnderAttributeRef(container: ClientTemplateParameter): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent documenttemplates.DataGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInDataGridColumnUnderAttributeRef(container: DataGridColumn): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent documenttemplates.GridSortItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInDocumentTemplatesGridSortItemUnderAttributeRef(container: GridSortItem): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.GridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInGridColumnUnderAttributeRef(container: GridColumn): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'searchRefs' property
    * of the parent pages.ListViewSearch element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInListViewSearchUnderSearchRefs(container: ListViewSearch): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.MemberWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInMemberWidgetUnderAttributeRef(container: MemberWidget): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.GridSortItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInPagesGridSortItemUnderAttributeRef(container: typings.mendixmodelsdk.distGenPagesMod.pages.GridSortItem): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'lowerBoundRef' property
    * of the parent pages.RangeSearchField element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInRangeSearchFieldUnderLowerBoundRef(container: RangeSearchField): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'upperBoundRef' property
    * of the parent pages.RangeSearchField element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInRangeSearchFieldUnderUpperBoundRef(container: RangeSearchField): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.SingleSearchField element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInSingleSearchFieldUnderAttributeRef(container: SingleSearchField): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent microflows.SortItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInSortItemUnderAttributeRef(container: SortItem): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.StaticOrDynamicString element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInStaticOrDynamicStringUnderAttributeRef(container: StaticOrDynamicString): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'member' property
    * of the parent expressions.VariableRefExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInVariableRefExpressionUnderMember(container: VariableRefExpression): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInWidgetValueUnderAttributeRef(container: WidgetValue): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
}

