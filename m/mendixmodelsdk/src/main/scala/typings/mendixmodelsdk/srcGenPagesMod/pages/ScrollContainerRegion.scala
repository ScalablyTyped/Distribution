package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.ScrollContainerRegion")
@js.native
open class ScrollContainerRegion protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 8.0.0: introduced
    */
  def appearance: Appearance = js.native
  def appearance_=(newValue: Appearance): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def `class`: String = js.native
  def class_=(newValue: String): Unit = js.native
  
  def containerAsScrollContainer: ScrollContainer = js.native
  
  def size: Double = js.native
  
  def sizeMode: SizeMode = js.native
  def sizeMode_=(newValue: SizeMode): Unit = js.native
  
  def size_=(newValue: Double): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def style: String = js.native
  def style_=(newValue: String): Unit = js.native
  
  /**
    * In version 6.10.0: introduced
    */
  def toggleMode: ToggleMode = js.native
  def toggleMode_=(newValue: ToggleMode): Unit = js.native
  
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
object ScrollContainerRegion {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ScrollContainerRegion")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): ScrollContainerRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ScrollContainerRegion]
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'bottom' property
    * of the parent ScrollContainer element passed as argument.
    */
  /* static member */
  inline def createInScrollContainerUnderBottom(container: ScrollContainer): ScrollContainerRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerUnderBottom")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainerRegion]
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'center' property
    * of the parent ScrollContainer element passed as argument.
    */
  /* static member */
  inline def createInScrollContainerUnderCenter(container: ScrollContainer): ScrollContainerRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerUnderCenter")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainerRegion]
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'left' property
    * of the parent ScrollContainer element passed as argument.
    */
  /* static member */
  inline def createInScrollContainerUnderLeft(container: ScrollContainer): ScrollContainerRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerUnderLeft")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainerRegion]
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'right' property
    * of the parent ScrollContainer element passed as argument.
    */
  /* static member */
  inline def createInScrollContainerUnderRight(container: ScrollContainer): ScrollContainerRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerUnderRight")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainerRegion]
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'top' property
    * of the parent ScrollContainer element passed as argument.
    */
  /* static member */
  inline def createInScrollContainerUnderTop(container: ScrollContainer): ScrollContainerRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerUnderTop")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainerRegion]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ScrollContainerRegion.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ScrollContainerRegion.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
