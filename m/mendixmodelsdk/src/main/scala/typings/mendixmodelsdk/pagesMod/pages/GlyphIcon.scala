package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.menusMod.menus.MenuItem
import typings.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.GlyphIcon")
@js.native
class GlyphIcon protected () extends Icon {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def code: Double = js.native
  def code_=(newValue: Double): Unit = js.native
}
object GlyphIcon {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.GlyphIcon")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new GlyphIcon instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.GlyphIcon.create")
  @js.native
  def create(model: IModel): GlyphIcon = js.native
  
  /**
    * Creates and returns a new GlyphIcon instance in the SDK and on the server.
    * The new GlyphIcon will be automatically stored in the 'icon' property
    * of the parent nativepages.BottomBarItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.GlyphIcon.createInBottomBarItemUnderIcon")
  @js.native
  def createInBottomBarItemUnderIcon(container: BottomBarItem): GlyphIcon = js.native
  
  /**
    * Creates and returns a new GlyphIcon instance in the SDK and on the server.
    * The new GlyphIcon will be automatically stored in the 'icon' property
    * of the parent Button element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.GlyphIcon.createInButtonUnderIcon")
  @js.native
  def createInButtonUnderIcon(container: Button): GlyphIcon = js.native
  
  /**
    * Creates and returns a new GlyphIcon instance in the SDK and on the server.
    * The new GlyphIcon will be automatically stored in the 'icon' property
    * of the parent ControlBarButton element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.GlyphIcon.createInControlBarButtonUnderIcon")
  @js.native
  def createInControlBarButtonUnderIcon(container: ControlBarButton): GlyphIcon = js.native
  
  /**
    * Creates and returns a new GlyphIcon instance in the SDK and on the server.
    * The new GlyphIcon will be automatically stored in the 'icon' property
    * of the parent menus.MenuItem element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.GlyphIcon.createInMenuItemUnderIcon")
  @js.native
  def createInMenuItemUnderIcon(container: MenuItem): GlyphIcon = js.native
  
  /**
    * Creates and returns a new GlyphIcon instance in the SDK and on the server.
    * The new GlyphIcon will be automatically stored in the 'icon' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.GlyphIcon.createInWidgetValueUnderIcon")
  @js.native
  def createInWidgetValueUnderIcon(container: WidgetValue): GlyphIcon = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.GlyphIcon.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.GlyphIcon.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
