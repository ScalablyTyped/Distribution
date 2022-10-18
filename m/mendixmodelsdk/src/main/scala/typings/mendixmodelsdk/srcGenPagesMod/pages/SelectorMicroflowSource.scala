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

@JSImport("mendixmodelsdk/src/gen/pages", "pages.SelectorMicroflowSource")
@js.native
open class SelectorMicroflowSource protected () extends SelectorSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def dataSourceMicroflowSettings: MicroflowSettings = js.native
  def dataSourceMicroflowSettings_=(newValue: MicroflowSettings): Unit = js.native
}
object SelectorMicroflowSource {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SelectorMicroflowSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new SelectorMicroflowSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): SelectorMicroflowSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[SelectorMicroflowSource]
  
  /**
    * Creates and returns a new SelectorMicroflowSource instance in the SDK and on the server.
    * The new SelectorMicroflowSource will be automatically stored in the 'selectorSource' property
    * of the parent AssociationWidget element passed as argument.
    */
  /* static member */
  inline def createIn(container: AssociationWidget): SelectorMicroflowSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[SelectorMicroflowSource]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SelectorMicroflowSource.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SelectorMicroflowSource.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
