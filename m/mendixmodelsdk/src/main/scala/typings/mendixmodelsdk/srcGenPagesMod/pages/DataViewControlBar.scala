package typings.mendixmodelsdk.srcGenPagesMod.pages

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
  * See: {@link https://docs.mendix.com/refguide6/data-view-control-bar relevant section in reference guide}
  *
  * In version 6.7.0: deleted
  */
@JSImport("mendixmodelsdk/src/gen/pages", "pages.DataViewControlBar")
@js.native
open class DataViewControlBar protected () extends ControlBar {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def closeButton: ControlBarItem | Null = js.native
  def closeButton_=(newValue: ControlBarItem | Null): Unit = js.native
}
object DataViewControlBar {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.DataViewControlBar")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DataViewControlBar instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): DataViewControlBar = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[DataViewControlBar]
  
  /**
    * Creates and returns a new DataViewControlBar instance in the SDK and on the server.
    * The new DataViewControlBar will be automatically stored in the 'controlBar' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.6.0
    */
  /* static member */
  inline def createIn(container: DataView): DataViewControlBar = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[DataViewControlBar]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.DataViewControlBar.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.DataViewControlBar.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
