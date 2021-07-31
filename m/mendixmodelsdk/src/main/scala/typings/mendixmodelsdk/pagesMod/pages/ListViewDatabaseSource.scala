package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ListViewDatabaseSource")
@js.native
class ListViewDatabaseSource protected () extends DatabaseSourceBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def search: ListViewSearch = js.native
  def search_=(newValue: ListViewSearch): Unit = js.native
}
object ListViewDatabaseSource {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ListViewDatabaseSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ListViewDatabaseSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): ListViewDatabaseSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ListViewDatabaseSource]
  
  /**
    * Creates and returns a new ListViewDatabaseSource instance in the SDK and on the server.
    * The new ListViewDatabaseSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.2.0
    */
  /* static member */
  @scala.inline
  def createIn(container: EntityWidget): ListViewDatabaseSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ListViewDatabaseSource]
  
  /**
    * Creates and returns a new ListViewDatabaseSource instance in the SDK and on the server.
    * The new ListViewDatabaseSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInEntityWidgetUnderDataSource(container: EntityWidget): ListViewDatabaseSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityWidgetUnderDataSource")(container.asInstanceOf[js.Any]).asInstanceOf[ListViewDatabaseSource]
  
  /**
    * Creates and returns a new ListViewDatabaseSource instance in the SDK and on the server.
    * The new ListViewDatabaseSource will be automatically stored in the 'dataSource' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  /* static member */
  @scala.inline
  def createInWidgetValueUnderDataSource(container: WidgetValue): ListViewDatabaseSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderDataSource")(container.asInstanceOf[js.Any]).asInstanceOf[ListViewDatabaseSource]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ListViewDatabaseSource.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ListViewDatabaseSource.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
