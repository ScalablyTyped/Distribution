package typings.mendixmodelsdk.mod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.menusMod.menus.MenuItem
import typings.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "pages.GlyphIcon")
@js.native
class GlyphIcon protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.pages.GlyphIcon {
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
@JSImport("mendixmodelsdk", "pages.GlyphIcon")
@js.native
object GlyphIcon extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new GlyphIcon instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.GlyphIcon = js.native
  /**
    * Creates and returns a new GlyphIcon instance in the SDK and on the server.
    * The new GlyphIcon will be automatically stored in the 'icon' property
    * of the parent nativepages.BottomBarItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInBottomBarItemUnderIcon(container: BottomBarItem): typings.mendixmodelsdk.pagesMod.pages.GlyphIcon = js.native
  /**
    * Creates and returns a new GlyphIcon instance in the SDK and on the server.
    * The new GlyphIcon will be automatically stored in the 'icon' property
    * of the parent Button element passed as argument.
    */
  def createInButtonUnderIcon(container: typings.mendixmodelsdk.pagesMod.pages.Button): typings.mendixmodelsdk.pagesMod.pages.GlyphIcon = js.native
  /**
    * Creates and returns a new GlyphIcon instance in the SDK and on the server.
    * The new GlyphIcon will be automatically stored in the 'icon' property
    * of the parent ControlBarButton element passed as argument.
    */
  def createInControlBarButtonUnderIcon(container: typings.mendixmodelsdk.pagesMod.pages.ControlBarButton): typings.mendixmodelsdk.pagesMod.pages.GlyphIcon = js.native
  /**
    * Creates and returns a new GlyphIcon instance in the SDK and on the server.
    * The new GlyphIcon will be automatically stored in the 'icon' property
    * of the parent menus.MenuItem element passed as argument.
    */
  def createInMenuItemUnderIcon(container: MenuItem): typings.mendixmodelsdk.pagesMod.pages.GlyphIcon = js.native
  /**
    * Creates and returns a new GlyphIcon instance in the SDK and on the server.
    * The new GlyphIcon will be automatically stored in the 'icon' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWidgetValueUnderIcon(container: WidgetValue): typings.mendixmodelsdk.pagesMod.pages.GlyphIcon = js.native
}

