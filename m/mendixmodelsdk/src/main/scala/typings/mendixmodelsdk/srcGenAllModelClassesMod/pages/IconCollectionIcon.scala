package typings.mendixmodelsdk.srcGenAllModelClassesMod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.srcGenMenusMod.menus.MenuItem
import typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.BottomBarItem
import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.20.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.IconCollectionIcon")
@js.native
open class IconCollectionIcon protected ()
  extends typings.mendixmodelsdk.srcGenPagesMod.pages.IconCollectionIcon {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object IconCollectionIcon {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.IconCollectionIcon")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new IconCollectionIcon instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenPagesMod.pages.IconCollectionIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.IconCollectionIcon]
  
  /**
    * Creates and returns a new IconCollectionIcon instance in the SDK and on the server.
    * The new IconCollectionIcon will be automatically stored in the 'icon' property
    * of the parent nativepages.BottomBarItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.20.0 and higher
    */
  /* static member */
  inline def createInBottomBarItemUnderIcon(container: BottomBarItem): typings.mendixmodelsdk.srcGenPagesMod.pages.IconCollectionIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBottomBarItemUnderIcon")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.IconCollectionIcon]
  
  /**
    * Creates and returns a new IconCollectionIcon instance in the SDK and on the server.
    * The new IconCollectionIcon will be automatically stored in the 'icon' property
    * of the parent Button element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.20.0 and higher
    */
  /* static member */
  inline def createInButtonUnderIcon(container: typings.mendixmodelsdk.srcGenPagesMod.pages.Button): typings.mendixmodelsdk.srcGenPagesMod.pages.IconCollectionIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("createInButtonUnderIcon")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.IconCollectionIcon]
  
  /**
    * Creates and returns a new IconCollectionIcon instance in the SDK and on the server.
    * The new IconCollectionIcon will be automatically stored in the 'icon' property
    * of the parent ControlBarButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.20.0 and higher
    */
  /* static member */
  inline def createInControlBarButtonUnderIcon(container: typings.mendixmodelsdk.srcGenPagesMod.pages.ControlBarButton): typings.mendixmodelsdk.srcGenPagesMod.pages.IconCollectionIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("createInControlBarButtonUnderIcon")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.IconCollectionIcon]
  
  /**
    * Creates and returns a new IconCollectionIcon instance in the SDK and on the server.
    * The new IconCollectionIcon will be automatically stored in the 'icon' property
    * of the parent menus.MenuItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.20.0 and higher
    */
  /* static member */
  inline def createInMenuItemUnderIcon(container: MenuItem): typings.mendixmodelsdk.srcGenPagesMod.pages.IconCollectionIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMenuItemUnderIcon")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.IconCollectionIcon]
  
  /**
    * Creates and returns a new IconCollectionIcon instance in the SDK and on the server.
    * The new IconCollectionIcon will be automatically stored in the 'icon' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.20.0 and higher
    */
  /* static member */
  inline def createInWidgetValueUnderIcon(container: WidgetValue): typings.mendixmodelsdk.srcGenPagesMod.pages.IconCollectionIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderIcon")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.IconCollectionIcon]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.IconCollectionIcon.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.IconCollectionIcon.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
