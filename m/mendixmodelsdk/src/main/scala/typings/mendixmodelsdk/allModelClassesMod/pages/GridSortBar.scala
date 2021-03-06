package typings.mendixmodelsdk.allModelClassesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/sort-bar relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSortBar")
@js.native
class GridSortBar protected ()
  extends typings.mendixmodelsdk.pagesMod.pages.GridSortBar {
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
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSortBar")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSortBar.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.GridSortBar = js.native
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent DropDownSearchField element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSortBar.createInDropDownSearchFieldUnderSortBar")
  @js.native
  def createInDropDownSearchFieldUnderSortBar(container: typings.mendixmodelsdk.pagesMod.pages.DropDownSearchField): typings.mendixmodelsdk.pagesMod.pages.GridSortBar = js.native
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent SelectorDatabaseSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.2.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSortBar.createInSelectorDatabaseSourceUnderSortBar")
  @js.native
  def createInSelectorDatabaseSourceUnderSortBar(container: typings.mendixmodelsdk.pagesMod.pages.SelectorDatabaseSource): typings.mendixmodelsdk.pagesMod.pages.GridSortBar = js.native
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent SelectorXPathSource element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSortBar.createInSelectorXPathSourceUnderSortBar")
  @js.native
  def createInSelectorXPathSourceUnderSortBar(container: typings.mendixmodelsdk.pagesMod.pages.SelectorXPathSource): typings.mendixmodelsdk.pagesMod.pages.GridSortBar = js.native
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent SortableEntityPathSource element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSortBar.createInSortableEntityPathSourceUnderSortBar")
  @js.native
  def createInSortableEntityPathSourceUnderSortBar(container: typings.mendixmodelsdk.pagesMod.pages.SortableEntityPathSource): typings.mendixmodelsdk.pagesMod.pages.GridSortBar = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSortBar.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSortBar.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
