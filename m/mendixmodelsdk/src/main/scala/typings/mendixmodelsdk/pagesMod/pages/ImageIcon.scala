package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.imagesMod.images.IImage
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.menusMod.menus.MenuItem
import typings.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ImageIcon")
@js.native
class ImageIcon protected () extends Icon {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def image: IImage = js.native
  
  def imageQualifiedName: String = js.native
  
  def image_=(newValue: IImage): Unit = js.native
}
object ImageIcon {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ImageIcon")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ImageIcon instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): ImageIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ImageIcon]
  
  /**
    * Creates and returns a new ImageIcon instance in the SDK and on the server.
    * The new ImageIcon will be automatically stored in the 'icon' property
    * of the parent nativepages.BottomBarItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @scala.inline
  def createInBottomBarItemUnderIcon(container: BottomBarItem): ImageIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBottomBarItemUnderIcon")(container.asInstanceOf[js.Any]).asInstanceOf[ImageIcon]
  
  /**
    * Creates and returns a new ImageIcon instance in the SDK and on the server.
    * The new ImageIcon will be automatically stored in the 'icon' property
    * of the parent Button element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInButtonUnderIcon(container: Button): ImageIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("createInButtonUnderIcon")(container.asInstanceOf[js.Any]).asInstanceOf[ImageIcon]
  
  /**
    * Creates and returns a new ImageIcon instance in the SDK and on the server.
    * The new ImageIcon will be automatically stored in the 'icon' property
    * of the parent ControlBarButton element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInControlBarButtonUnderIcon(container: ControlBarButton): ImageIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("createInControlBarButtonUnderIcon")(container.asInstanceOf[js.Any]).asInstanceOf[ImageIcon]
  
  /**
    * Creates and returns a new ImageIcon instance in the SDK and on the server.
    * The new ImageIcon will be automatically stored in the 'icon' property
    * of the parent menus.MenuItem element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInMenuItemUnderIcon(container: MenuItem): ImageIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMenuItemUnderIcon")(container.asInstanceOf[js.Any]).asInstanceOf[ImageIcon]
  
  /**
    * Creates and returns a new ImageIcon instance in the SDK and on the server.
    * The new ImageIcon will be automatically stored in the 'icon' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @scala.inline
  def createInWidgetValueUnderIcon(container: WidgetValue): ImageIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderIcon")(container.asInstanceOf[js.Any]).asInstanceOf[ImageIcon]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ImageIcon.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ImageIcon.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
