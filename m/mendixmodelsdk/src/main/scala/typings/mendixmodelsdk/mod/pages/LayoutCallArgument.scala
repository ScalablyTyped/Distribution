package typings.mendixmodelsdk.mod.pages

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

@JSImport("mendixmodelsdk", "pages.LayoutCallArgument")
@js.native
class LayoutCallArgument protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.pages.LayoutCallArgument {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object LayoutCallArgument {
  
  @JSImport("mendixmodelsdk", "pages.LayoutCallArgument")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new LayoutCallArgument instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LayoutCallArgument.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.LayoutCallArgument = js.native
  
  /**
    * Creates and returns a new LayoutCallArgument instance in the SDK and on the server.
    * The new LayoutCallArgument will be automatically stored in the 'arguments' property
    * of the parent LayoutCall element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LayoutCallArgument.createIn")
  @js.native
  def createIn(container: typings.mendixmodelsdk.pagesMod.pages.LayoutCall): typings.mendixmodelsdk.pagesMod.pages.LayoutCallArgument = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LayoutCallArgument.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LayoutCallArgument.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
