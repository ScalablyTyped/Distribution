package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SortItemList")
@js.native
class SortItemList protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsDatabaseRetrieveSource: DatabaseRetrieveSource = js.native
  
  def containerAsSort: Sort = js.native
  
  def items: IList[SortItem] = js.native
}
object SortItemList {
  
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SortItemList")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new SortItemList instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): SortItemList = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[SortItemList]
  
  /**
    * Creates and returns a new SortItemList instance in the SDK and on the server.
    * The new SortItemList will be automatically stored in the 'sortItemList' property
    * of the parent DatabaseRetrieveSource element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInDatabaseRetrieveSourceUnderSortItemList(container: DatabaseRetrieveSource): SortItemList = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDatabaseRetrieveSourceUnderSortItemList")(container.asInstanceOf[js.Any]).asInstanceOf[SortItemList]
  
  /**
    * Creates and returns a new SortItemList instance in the SDK and on the server.
    * The new SortItemList will be automatically stored in the 'sortItemList' property
    * of the parent Sort element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInSortUnderSortItemList(container: Sort): SortItemList = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSortUnderSortItemList")(container.asInstanceOf[js.Any]).asInstanceOf[SortItemList]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SortItemList.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SortItemList.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
