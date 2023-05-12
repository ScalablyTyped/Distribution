package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObject
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenTextsMod.texts.Text
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.ClientTemplate")
@js.native
open class ClientTemplate protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsAccessibilitySettings: AccessibilitySettings = js.native
  
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
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ClientTemplate")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'screenReaderDescription' property
    * of the parent AccessibilitySettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.22.0 and higher
    */
  /* static member */
  inline def createInAccessibilitySettingsUnderScreenReaderDescription(container: AccessibilitySettings): ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAccessibilitySettingsUnderScreenReaderDescription")(container.asInstanceOf[js.Any]).asInstanceOf[ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'screenReaderTitle' property
    * of the parent AccessibilitySettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.22.0 and higher
    */
  /* static member */
  inline def createInAccessibilitySettingsUnderScreenReaderTitle(container: AccessibilitySettings): ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAccessibilitySettingsUnderScreenReaderTitle")(container.asInstanceOf[js.Any]).asInstanceOf[ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent Button element passed as argument.
    */
  /* static member */
  inline def createInButtonUnderCaption(container: Button): ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInButtonUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent ControlBarButton element passed as argument.
    */
  /* static member */
  inline def createInControlBarButtonUnderCaption(container: ControlBarButton): ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInControlBarButtonUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'labelTemplate' property
    * of the parent customwidgets.CustomWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.1.0 and higher
    */
  /* static member */
  inline def createInCustomWidgetUnderLabelTemplate(container: CustomWidget): ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomWidgetUnderLabelTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent DataGrid element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInDataGridUnderCaption(container: DataGrid): ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataGridUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'alternativeText' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  /* static member */
  inline def createInDynamicImageViewerUnderAlternativeText(container: DynamicImageViewer): ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDynamicImageViewerUnderAlternativeText")(container.asInstanceOf[js.Any]).asInstanceOf[ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'content' property
    * of the parent DynamicText element passed as argument.
    */
  /* static member */
  inline def createInDynamicTextUnderContent(container: DynamicText): ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDynamicTextUnderContent")(container.asInstanceOf[js.Any]).asInstanceOf[ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent GroupBox element passed as argument.
    */
  /* static member */
  inline def createInGroupBoxUnderCaption(container: GroupBox): ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'labelTemplate' property
    * of the parent InputWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  /* static member */
  inline def createInInputWidgetUnderLabelTemplate(container: InputWidget): ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInInputWidgetUnderLabelTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'screenReaderLabel' property
    * of the parent InputWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.12.0 and higher
    */
  /* static member */
  inline def createInInputWidgetUnderScreenReaderLabel(container: InputWidget): ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInInputWidgetUnderScreenReaderLabel")(container.asInstanceOf[js.Any]).asInstanceOf[ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'alternativeText' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  /* static member */
  inline def createInStaticImageViewerUnderAlternativeText(container: StaticImageViewer): ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInStaticImageViewerUnderAlternativeText")(container.asInstanceOf[js.Any]).asInstanceOf[ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'badge' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  inline def createInTabPageUnderBadge(container: TabPage): ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderBadge")(container.asInstanceOf[js.Any]).asInstanceOf[ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'labelTemplate' property
    * of the parent customwidgets.WidgetObject element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 8.0.0
    */
  /* static member */
  inline def createInWidgetObjectUnderLabelTemplate(container: WidgetObject): ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetObjectUnderLabelTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'textTemplate' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 and higher
    */
  /* static member */
  inline def createInWidgetValueUnderTextTemplate(container: WidgetValue): ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderTextTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[ClientTemplate]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ClientTemplate.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ClientTemplate.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
