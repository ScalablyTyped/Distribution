package typings.mendixmodelsdk.allModelClassesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ConditionalVisibilitySettings")
@js.native
class ConditionalVisibilitySettings protected ()
  extends typings.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ConditionalVisibilitySettings {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ConditionalVisibilitySettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ConditionalVisibilitySettings.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent ConditionallyVisibleWidget element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ConditionalVisibilitySettings.createInConditionallyVisibleWidgetUnderConditionalVisibilitySettings")
  @js.native
  def createInConditionallyVisibleWidgetUnderConditionalVisibilitySettings(container: typings.mendixmodelsdk.pagesMod.pages.ConditionallyVisibleWidget): typings.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent ControlBarButton element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ConditionalVisibilitySettings.createInControlBarButtonUnderConditionalVisibilitySettings")
  @js.native
  def createInControlBarButtonUnderConditionalVisibilitySettings(container: typings.mendixmodelsdk.pagesMod.pages.ControlBarButton): typings.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent customwidgets.CustomWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.1.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ConditionalVisibilitySettings.createInCustomWidgetUnderConditionalVisibilitySettings")
  @js.native
  def createInCustomWidgetUnderConditionalVisibilitySettings(container: CustomWidget): typings.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent LayoutGridRow element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ConditionalVisibilitySettings.createInLayoutGridRowUnderConditionalVisibilitySettings")
  @js.native
  def createInLayoutGridRowUnderConditionalVisibilitySettings(container: typings.mendixmodelsdk.pagesMod.pages.LayoutGridRow): typings.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent NavigationListItem element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ConditionalVisibilitySettings.createInNavigationListItemUnderConditionalVisibilitySettings")
  @js.native
  def createInNavigationListItemUnderConditionalVisibilitySettings(container: typings.mendixmodelsdk.pagesMod.pages.NavigationListItem): typings.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent TabPage element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ConditionalVisibilitySettings.createInTabPageUnderConditionalVisibilitySettings")
  @js.native
  def createInTabPageUnderConditionalVisibilitySettings(container: typings.mendixmodelsdk.pagesMod.pages.TabPage): typings.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent TableRow element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ConditionalVisibilitySettings.createInTableRowUnderConditionalVisibilitySettings")
  @js.native
  def createInTableRowUnderConditionalVisibilitySettings(container: typings.mendixmodelsdk.pagesMod.pages.TableRow): typings.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ConditionalVisibilitySettings.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ConditionalVisibilitySettings.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
