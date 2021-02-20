package typings.mendixmodelsdk.allModelClassesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObject
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate")
@js.native
class ClientTemplate protected ()
  extends typings.mendixmodelsdk.pagesMod.pages.ClientTemplate {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ClientTemplate {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent Button element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInButtonUnderCaption")
  @js.native
  def createInButtonUnderCaption(container: typings.mendixmodelsdk.pagesMod.pages.Button): typings.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent ControlBarButton element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInControlBarButtonUnderCaption")
  @js.native
  def createInControlBarButtonUnderCaption(container: typings.mendixmodelsdk.pagesMod.pages.ControlBarButton): typings.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'labelTemplate' property
    * of the parent customwidgets.CustomWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.1.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInCustomWidgetUnderLabelTemplate")
  @js.native
  def createInCustomWidgetUnderLabelTemplate(container: CustomWidget): typings.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent DataGrid element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInDataGridUnderCaption")
  @js.native
  def createInDataGridUnderCaption(container: typings.mendixmodelsdk.pagesMod.pages.DataGrid): typings.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'alternativeText' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInDynamicImageViewerUnderAlternativeText")
  @js.native
  def createInDynamicImageViewerUnderAlternativeText(container: typings.mendixmodelsdk.pagesMod.pages.DynamicImageViewer): typings.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'content' property
    * of the parent DynamicText element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInDynamicTextUnderContent")
  @js.native
  def createInDynamicTextUnderContent(container: typings.mendixmodelsdk.pagesMod.pages.DynamicText): typings.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent GroupBox element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInGroupBoxUnderCaption")
  @js.native
  def createInGroupBoxUnderCaption(container: typings.mendixmodelsdk.pagesMod.pages.GroupBox): typings.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'labelTemplate' property
    * of the parent InputWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInInputWidgetUnderLabelTemplate")
  @js.native
  def createInInputWidgetUnderLabelTemplate(container: typings.mendixmodelsdk.pagesMod.pages.InputWidget): typings.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'screenReaderLabel' property
    * of the parent InputWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.12.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInInputWidgetUnderScreenReaderLabel")
  @js.native
  def createInInputWidgetUnderScreenReaderLabel(container: typings.mendixmodelsdk.pagesMod.pages.InputWidget): typings.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'alternativeText' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInStaticImageViewerUnderAlternativeText")
  @js.native
  def createInStaticImageViewerUnderAlternativeText(container: typings.mendixmodelsdk.pagesMod.pages.StaticImageViewer): typings.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'badge' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInTabPageUnderBadge")
  @js.native
  def createInTabPageUnderBadge(container: typings.mendixmodelsdk.pagesMod.pages.TabPage): typings.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'labelTemplate' property
    * of the parent customwidgets.WidgetObject element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 8.0.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInWidgetObjectUnderLabelTemplate")
  @js.native
  def createInWidgetObjectUnderLabelTemplate(container: WidgetObject): typings.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'textTemplate' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInWidgetValueUnderTextTemplate")
  @js.native
  def createInWidgetValueUnderTextTemplate(container: WidgetValue): typings.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
