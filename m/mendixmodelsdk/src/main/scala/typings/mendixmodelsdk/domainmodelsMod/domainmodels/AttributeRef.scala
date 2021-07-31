package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.AttributeWidget
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.GridSortItem
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.expressionsMod.expressions.VariableRefExpression
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.SortItem
import typings.mendixmodelsdk.pagesMod.pages.ClientTemplateParameter
import typings.mendixmodelsdk.pagesMod.pages.GridColumn
import typings.mendixmodelsdk.pagesMod.pages.ListViewSearch
import typings.mendixmodelsdk.pagesMod.pages.MemberWidget
import typings.mendixmodelsdk.pagesMod.pages.RangeSearchField
import typings.mendixmodelsdk.pagesMod.pages.SingleSearchField
import typings.mendixmodelsdk.pagesMod.pages.StaticOrDynamicString
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.11.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AttributeRef")
@js.native
class AttributeRef protected () extends MemberRef {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def attribute: IAttribute = js.native
  
  def attributeQualifiedName: String = js.native
  
  def attribute_=(newValue: IAttribute): Unit = js.native
}
object AttributeRef {
  
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AttributeRef")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent documenttemplates.AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @scala.inline
  def createInAttributeWidgetUnderAttributeRef(container: AttributeWidget): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.ClientTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @scala.inline
  def createInClientTemplateParameterUnderAttributeRef(container: ClientTemplateParameter): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInClientTemplateParameterUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent documenttemplates.DataGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @scala.inline
  def createInDataGridColumnUnderAttributeRef(container: DataGridColumn): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataGridColumnUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent documenttemplates.GridSortItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @scala.inline
  def createInDocumentTemplatesGridSortItemUnderAttributeRef(container: GridSortItem): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplatesGridSortItemUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.GridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @scala.inline
  def createInGridColumnUnderAttributeRef(container: GridColumn): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridColumnUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'searchRefs' property
    * of the parent pages.ListViewSearch element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @scala.inline
  def createInListViewSearchUnderSearchRefs(container: ListViewSearch): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewSearchUnderSearchRefs")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.MemberWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @scala.inline
  def createInMemberWidgetUnderAttributeRef(container: MemberWidget): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMemberWidgetUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.GridSortItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @scala.inline
  def createInPagesGridSortItemUnderAttributeRef(container: typings.mendixmodelsdk.pagesMod.pages.GridSortItem): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPagesGridSortItemUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'lowerBoundRef' property
    * of the parent pages.RangeSearchField element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @scala.inline
  def createInRangeSearchFieldUnderLowerBoundRef(container: RangeSearchField): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRangeSearchFieldUnderLowerBoundRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'upperBoundRef' property
    * of the parent pages.RangeSearchField element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @scala.inline
  def createInRangeSearchFieldUnderUpperBoundRef(container: RangeSearchField): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRangeSearchFieldUnderUpperBoundRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.SingleSearchField element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @scala.inline
  def createInSingleSearchFieldUnderAttributeRef(container: SingleSearchField): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSingleSearchFieldUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent microflows.SortItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @scala.inline
  def createInSortItemUnderAttributeRef(container: SortItem): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSortItemUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.StaticOrDynamicString element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @scala.inline
  def createInStaticOrDynamicStringUnderAttributeRef(container: StaticOrDynamicString): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInStaticOrDynamicStringUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'member' property
    * of the parent expressions.VariableRefExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @scala.inline
  def createInVariableRefExpressionUnderMember(container: VariableRefExpression): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVariableRefExpressionUnderMember")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @scala.inline
  def createInWidgetValueUnderAttributeRef(container: WidgetValue): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AttributeRef.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AttributeRef.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
