package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObject
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.textsMod.texts.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplate")
@js.native
class ClientTemplate protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsButton: Button = js.native
  
  def containerAsControlBarButton: ControlBarButton = js.native
  
  def containerAsCustomWidget: CustomWidget = js.native
  
  def containerAsDataGrid: DataGrid = js.native
  
  def containerAsDynamicImageViewer: DynamicImageViewer = js.native
  
  def containerAsDynamicText: DynamicText = js.native
  
  def containerAsGroupBox: GroupBox = js.native
  
  def containerAsInputWidget: InputWidget = js.native
  
  def containerAsStaticImageViewer: StaticImageViewer = js.native
  
  def containerAsTabPage: TabPage = js.native
  
  def containerAsWidgetObject: WidgetObject = js.native
  
  def containerAsWidgetValue: WidgetValue = js.native
  
  /**
    * In version 8.3.0: introduced
    */
  def fallback: Text = js.native
  def fallback_=(newValue: Text): Unit = js.native
  
  def parameters: IList[ClientTemplateParameter] = js.native
  
  def template: Text = js.native
  def template_=(newValue: Text): Unit = js.native
}
object ClientTemplate {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplate")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplate.create")
  @js.native
  def create(model: IModel): ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent Button element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplate.createInButtonUnderCaption")
  @js.native
  def createInButtonUnderCaption(container: Button): ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent ControlBarButton element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplate.createInControlBarButtonUnderCaption")
  @js.native
  def createInControlBarButtonUnderCaption(container: ControlBarButton): ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'labelTemplate' property
    * of the parent customwidgets.CustomWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.1.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplate.createInCustomWidgetUnderLabelTemplate")
  @js.native
  def createInCustomWidgetUnderLabelTemplate(container: CustomWidget): ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent DataGrid element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplate.createInDataGridUnderCaption")
  @js.native
  def createInDataGridUnderCaption(container: DataGrid): ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'alternativeText' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplate.createInDynamicImageViewerUnderAlternativeText")
  @js.native
  def createInDynamicImageViewerUnderAlternativeText(container: DynamicImageViewer): ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'content' property
    * of the parent DynamicText element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplate.createInDynamicTextUnderContent")
  @js.native
  def createInDynamicTextUnderContent(container: DynamicText): ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent GroupBox element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplate.createInGroupBoxUnderCaption")
  @js.native
  def createInGroupBoxUnderCaption(container: GroupBox): ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'labelTemplate' property
    * of the parent InputWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplate.createInInputWidgetUnderLabelTemplate")
  @js.native
  def createInInputWidgetUnderLabelTemplate(container: InputWidget): ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'screenReaderLabel' property
    * of the parent InputWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.12.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplate.createInInputWidgetUnderScreenReaderLabel")
  @js.native
  def createInInputWidgetUnderScreenReaderLabel(container: InputWidget): ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'alternativeText' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplate.createInStaticImageViewerUnderAlternativeText")
  @js.native
  def createInStaticImageViewerUnderAlternativeText(container: StaticImageViewer): ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'badge' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplate.createInTabPageUnderBadge")
  @js.native
  def createInTabPageUnderBadge(container: TabPage): ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'labelTemplate' property
    * of the parent customwidgets.WidgetObject element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 8.0.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplate.createInWidgetObjectUnderLabelTemplate")
  @js.native
  def createInWidgetObjectUnderLabelTemplate(container: WidgetObject): ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'textTemplate' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplate.createInWidgetValueUnderTextTemplate")
  @js.native
  def createInWidgetValueUnderTextTemplate(container: WidgetValue): ClientTemplate = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplate.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplate.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
