package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.4.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/pages", "pages.PageVariable")
@js.native
open class PageVariable protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsAssociationWidget: AssociationWidget = js.native
  
  def containerAsAttributeWidget: AttributeWidget = js.native
  
  def containerAsClientTemplateParameter: ClientTemplateParameter = js.native
  
  def containerAsConditionalSettings: ConditionalSettings = js.native
  
  def containerAsMicroflowParameterMapping: MicroflowParameterMapping = js.native
  
  def containerAsNanoflowParameterMapping: NanoflowParameterMapping = js.native
  
  def containerAsPageParameterMapping: PageParameterMapping = js.native
  
  def containerAsSnippetParameterMapping: SnippetParameterMapping = js.native
  
  def containerAsWidgetValue: WidgetValue = js.native
  
  /**
    * In version 9.5.0: introduced
    */
  def pageParameter: PageParameter | Null = js.native
  
  def pageParameterLocalName: String | Null = js.native
  
  def pageParameter_=(newValue: PageParameter | Null): Unit = js.native
  
  /**
    * In version 9.21.0: introduced
    */
  def snippetParameter: SnippetParameter | Null = js.native
  
  def snippetParameterLocalName: String | Null = js.native
  
  def snippetParameter_=(newValue: SnippetParameter | Null): Unit = js.native
  
  def useAllPages: Boolean = js.native
  def useAllPages_=(newValue: Boolean): Unit = js.native
  
  def widget: Widget | Null = js.native
  
  def widgetLocalName: String | Null = js.native
  
  def widget_=(newValue: Widget | Null): Unit = js.native
}
object PageVariable {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageVariable")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'sourceVariable' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.24.0 and higher
    */
  /* static member */
  inline def createInAssociationWidgetUnderSourceVariable(container: AssociationWidget): PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAssociationWidgetUnderSourceVariable")(container.asInstanceOf[js.Any]).asInstanceOf[PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'sourceVariable' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.8.0 and higher
    */
  /* static member */
  inline def createInAttributeWidgetUnderSourceVariable(container: AttributeWidget): PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderSourceVariable")(container.asInstanceOf[js.Any]).asInstanceOf[PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'sourceVariable' property
    * of the parent ClientTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.24.0 and higher
    */
  /* static member */
  inline def createInClientTemplateParameterUnderSourceVariable(container: ClientTemplateParameter): PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInClientTemplateParameterUnderSourceVariable")(container.asInstanceOf[js.Any]).asInstanceOf[PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'sourceVariable' property
    * of the parent ConditionalSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.24.0 and higher
    */
  /* static member */
  inline def createInConditionalSettingsUnderSourceVariable(container: ConditionalSettings): PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConditionalSettingsUnderSourceVariable")(container.asInstanceOf[js.Any]).asInstanceOf[PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'variable' property
    * of the parent MicroflowParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 and higher
    */
  /* static member */
  inline def createInMicroflowParameterMappingUnderVariable(container: MicroflowParameterMapping): PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterMappingUnderVariable")(container.asInstanceOf[js.Any]).asInstanceOf[PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'variable' property
    * of the parent NanoflowParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 and higher
    */
  /* static member */
  inline def createInNanoflowParameterMappingUnderVariable(container: NanoflowParameterMapping): PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNanoflowParameterMappingUnderVariable")(container.asInstanceOf[js.Any]).asInstanceOf[PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'variable' property
    * of the parent PageParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.7.0 and higher
    */
  /* static member */
  inline def createInPageParameterMappingUnderVariable(container: PageParameterMapping): PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageParameterMappingUnderVariable")(container.asInstanceOf[js.Any]).asInstanceOf[PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'variable' property
    * of the parent SnippetParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.21.0 and higher
    */
  /* static member */
  inline def createInSnippetParameterMappingUnderVariable(container: SnippetParameterMapping): PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetParameterMappingUnderVariable")(container.asInstanceOf[js.Any]).asInstanceOf[PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'sourceVariable' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.8.0 and higher
    */
  /* static member */
  inline def createInWidgetValueUnderSourceVariable(container: WidgetValue): PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderSourceVariable")(container.asInstanceOf[js.Any]).asInstanceOf[PageVariable]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageVariable.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageVariable.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
