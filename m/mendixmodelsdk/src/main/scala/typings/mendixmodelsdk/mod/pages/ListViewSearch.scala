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

@JSImport("mendixmodelsdk", "pages.ListViewSearch")
@js.native
open class ListViewSearch protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.pages.ListViewSearch {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ListViewSearch {
  
  @JSImport("mendixmodelsdk", "pages.ListViewSearch")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ListViewSearch instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenPagesMod.pages.ListViewSearch = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.ListViewSearch]
  
  /**
    * Creates and returns a new ListViewSearch instance in the SDK and on the server.
    * The new ListViewSearch will be automatically stored in the 'search' property
    * of the parent ListViewDatabaseSource element passed as argument.
    */
  /* static member */
  inline def createInListViewDatabaseSourceUnderSearch(container: typings.mendixmodelsdk.srcGenPagesMod.pages.ListViewDatabaseSource): typings.mendixmodelsdk.srcGenPagesMod.pages.ListViewSearch = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewDatabaseSourceUnderSearch")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.ListViewSearch]
  
  /**
    * Creates and returns a new ListViewSearch instance in the SDK and on the server.
    * The new ListViewSearch will be automatically stored in the 'search' property
    * of the parent ListViewXPathSource element passed as argument.
    */
  /* static member */
  inline def createInListViewXPathSourceUnderSearch(container: typings.mendixmodelsdk.srcGenPagesMod.pages.ListViewXPathSource): typings.mendixmodelsdk.srcGenPagesMod.pages.ListViewSearch = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewXPathSourceUnderSearch")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.ListViewSearch]
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ListViewSearch.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ListViewSearch.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
