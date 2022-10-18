package typings.mendixmodelsdk.mod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
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
  * See: {@link https://docs.mendix.com/refguide/sort-bar relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "pages.GridSortBar")
@js.native
open class GridSortBar protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.pages.GridSortBar {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object GridSortBar {
  
  @JSImport("mendixmodelsdk", "pages.GridSortBar")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenPagesMod.pages.GridSortBar = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.GridSortBar]
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent DropDownSearchField element passed as argument.
    */
  /* static member */
  inline def createInDropDownSearchFieldUnderSortBar(container: typings.mendixmodelsdk.srcGenPagesMod.pages.DropDownSearchField): typings.mendixmodelsdk.srcGenPagesMod.pages.GridSortBar = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDropDownSearchFieldUnderSortBar")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.GridSortBar]
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent SelectorDatabaseSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.2.0 and higher
    */
  /* static member */
  inline def createInSelectorDatabaseSourceUnderSortBar(container: typings.mendixmodelsdk.srcGenPagesMod.pages.SelectorDatabaseSource): typings.mendixmodelsdk.srcGenPagesMod.pages.GridSortBar = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSelectorDatabaseSourceUnderSortBar")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.GridSortBar]
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent SelectorXPathSource element passed as argument.
    */
  /* static member */
  inline def createInSelectorXPathSourceUnderSortBar(container: typings.mendixmodelsdk.srcGenPagesMod.pages.SelectorXPathSource): typings.mendixmodelsdk.srcGenPagesMod.pages.GridSortBar = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSelectorXPathSourceUnderSortBar")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.GridSortBar]
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent SortableEntityPathSource element passed as argument.
    */
  /* static member */
  inline def createInSortableEntityPathSourceUnderSortBar(container: typings.mendixmodelsdk.srcGenPagesMod.pages.SortableEntityPathSource): typings.mendixmodelsdk.srcGenPagesMod.pages.GridSortBar = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSortableEntityPathSourceUnderSortBar")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.GridSortBar]
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.GridSortBar.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.GridSortBar.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
