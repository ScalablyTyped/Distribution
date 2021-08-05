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

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutCallArgument")
@js.native
class LayoutCallArgument protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsLayoutCall: LayoutCall = js.native
  
  /**
    * In version 6.8.0: introduced
    */
  def parameter: ILayoutParameter = js.native
  
  /**
    * In version 6.8.0: deleted
    */
  def parameterName: String = js.native
  def parameterName_=(newValue: String): Unit = js.native
  
  def parameterQualifiedName: String = js.native
  
  def parameter_=(newValue: ILayoutParameter): Unit = js.native
  
  /**
    * In version 7.15.0: deleted
    */
  def widget: Widget | Null = js.native
  def widget_=(newValue: Widget | Null): Unit = js.native
  
  /**
    * In version 7.15.0: introduced
    */
  def widgets: IList[Widget] = js.native
}
object LayoutCallArgument {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutCallArgument")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new LayoutCallArgument instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): LayoutCallArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[LayoutCallArgument]
  
  /**
    * Creates and returns a new LayoutCallArgument instance in the SDK and on the server.
    * The new LayoutCallArgument will be automatically stored in the 'arguments' property
    * of the parent LayoutCall element passed as argument.
    */
  /* static member */
  inline def createIn(container: LayoutCall): LayoutCallArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[LayoutCallArgument]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutCallArgument.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutCallArgument.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
