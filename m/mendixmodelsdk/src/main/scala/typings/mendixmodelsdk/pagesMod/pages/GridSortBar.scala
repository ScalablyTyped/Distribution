package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/sort-bar relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/pages", "pages.GridSortBar")
@js.native
open class GridSortBar protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsDropDownSearchField: DropDownSearchField = js.native
  
  def containerAsSelectorDatabaseSource: SelectorDatabaseSource = js.native
  
  def containerAsSelectorXPathSource: SelectorXPathSource = js.native
  
  def containerAsSortableEntityPathSource: SortableEntityPathSource = js.native
  
  def sortItems: IList[GridSortItem] = js.native
}
object GridSortBar {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.GridSortBar")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): GridSortBar = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[GridSortBar]
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent DropDownSearchField element passed as argument.
    */
  /* static member */
  inline def createInDropDownSearchFieldUnderSortBar(container: DropDownSearchField): GridSortBar = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDropDownSearchFieldUnderSortBar")(container.asInstanceOf[js.Any]).asInstanceOf[GridSortBar]
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent SelectorDatabaseSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.2.0 and higher
    */
  /* static member */
  inline def createInSelectorDatabaseSourceUnderSortBar(container: SelectorDatabaseSource): GridSortBar = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSelectorDatabaseSourceUnderSortBar")(container.asInstanceOf[js.Any]).asInstanceOf[GridSortBar]
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent SelectorXPathSource element passed as argument.
    */
  /* static member */
  inline def createInSelectorXPathSourceUnderSortBar(container: SelectorXPathSource): GridSortBar = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSelectorXPathSourceUnderSortBar")(container.asInstanceOf[js.Any]).asInstanceOf[GridSortBar]
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent SortableEntityPathSource element passed as argument.
    */
  /* static member */
  inline def createInSortableEntityPathSourceUnderSortBar(container: SortableEntityPathSource): GridSortBar = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSortableEntityPathSourceUnderSortBar")(container.asInstanceOf[js.Any]).asInstanceOf[GridSortBar]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.GridSortBar.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.GridSortBar.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
