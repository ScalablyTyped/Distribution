package typings.mendixmodelsdk.srcGenAllModelClassesMod.pages

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

@JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.DropDownButtonItem")
@js.native
open class DropDownButtonItem protected ()
  extends typings.mendixmodelsdk.srcGenPagesMod.pages.DropDownButtonItem {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object DropDownButtonItem {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.DropDownButtonItem")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DropDownButtonItem instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenPagesMod.pages.DropDownButtonItem = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.DropDownButtonItem]
  
  /**
    * Creates and returns a new DropDownButtonItem instance in the SDK and on the server.
    * The new DropDownButtonItem will be automatically stored in the 'items' property
    * of the parent DropDownButton element passed as argument.
    */
  /* static member */
  inline def createIn(container: typings.mendixmodelsdk.srcGenPagesMod.pages.DropDownButton): typings.mendixmodelsdk.srcGenPagesMod.pages.DropDownButtonItem = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.DropDownButtonItem]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.DropDownButtonItem.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.DropDownButtonItem.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
