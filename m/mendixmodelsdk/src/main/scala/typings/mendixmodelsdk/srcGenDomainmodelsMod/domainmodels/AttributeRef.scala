package typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.AttributeWidget
import typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DataGridColumn
import typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.GridSortItem
import typings.mendixmodelsdk.srcGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.SortItem
import typings.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplateParameter
import typings.mendixmodelsdk.srcGenPagesMod.pages.GridColumn
import typings.mendixmodelsdk.srcGenPagesMod.pages.ListViewSearch
import typings.mendixmodelsdk.srcGenPagesMod.pages.MemberWidget
import typings.mendixmodelsdk.srcGenPagesMod.pages.RangeSearchField
import typings.mendixmodelsdk.srcGenPagesMod.pages.SingleSearchField
import typings.mendixmodelsdk.srcGenPagesMod.pages.StaticOrDynamicString
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.6.0: added public
  * In version 7.11.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IMemberRef because Already inherited
- typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IAttributeRef because var conflicts: entityRef, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.AttributeRef")
@js.native
open class AttributeRef protected () extends MemberRef {
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
  
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.AttributeRef")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent documenttemplates.AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInAttributeWidgetUnderAttributeRef(container: AttributeWidget): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.ClientTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInClientTemplateParameterUnderAttributeRef(container: ClientTemplateParameter): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInClientTemplateParameterUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent documenttemplates.DataGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInDataGridColumnUnderAttributeRef(container: DataGridColumn): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataGridColumnUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent documenttemplates.GridSortItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInDocumentTemplatesGridSortItemUnderAttributeRef(container: GridSortItem): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplatesGridSortItemUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.GridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInGridColumnUnderAttributeRef(container: GridColumn): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridColumnUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'searchRefs' property
    * of the parent pages.ListViewSearch element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInListViewSearchUnderSearchRefs(container: ListViewSearch): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewSearchUnderSearchRefs")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.MemberWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInMemberWidgetUnderAttributeRef(container: MemberWidget): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMemberWidgetUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.GridSortItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInPagesGridSortItemUnderAttributeRef(container: typings.mendixmodelsdk.srcGenPagesMod.pages.GridSortItem): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPagesGridSortItemUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'lowerBoundRef' property
    * of the parent pages.RangeSearchField element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInRangeSearchFieldUnderLowerBoundRef(container: RangeSearchField): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRangeSearchFieldUnderLowerBoundRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'upperBoundRef' property
    * of the parent pages.RangeSearchField element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInRangeSearchFieldUnderUpperBoundRef(container: RangeSearchField): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRangeSearchFieldUnderUpperBoundRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.SingleSearchField element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInSingleSearchFieldUnderAttributeRef(container: SingleSearchField): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSingleSearchFieldUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent microflows.SortItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInSortItemUnderAttributeRef(container: SortItem): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSortItemUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.StaticOrDynamicString element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInStaticOrDynamicStringUnderAttributeRef(container: StaticOrDynamicString): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInStaticOrDynamicStringUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'member' property
    * of the parent expressions.VariableRefExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 to 9.7.0
    */
  /* static member */
  inline def createInVariableRefExpressionUnderMember(container: VariableRefExpression): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVariableRefExpressionUnderMember")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInWidgetValueUnderAttributeRef(container: WidgetValue): AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeRef]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.AttributeRef.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.AttributeRef.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
