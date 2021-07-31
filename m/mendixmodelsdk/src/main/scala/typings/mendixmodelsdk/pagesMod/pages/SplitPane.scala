package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.0.0: deleted
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SplitPane")
@js.native
abstract class SplitPane protected () extends Widget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def animatedResize: Boolean = js.native
  def animatedResize_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 7.15.0: deleted
    */
  def firstWidget: Widget | Null = js.native
  def firstWidget_=(newValue: Widget | Null): Unit = js.native
  
  /**
    * In version 7.15.0: introduced
    */
  def firstWidgets: IList[Widget] = js.native
  
  def height: Double = js.native
  def height_=(newValue: Double): Unit = js.native
  
  def position: Double = js.native
  def position_=(newValue: Double): Unit = js.native
  
  /**
    * In version 7.15.0: deleted
    */
  def secondWidget: Widget | Null = js.native
  def secondWidget_=(newValue: Widget | Null): Unit = js.native
  
  /**
    * In version 7.15.0: introduced
    */
  def secondWidgets: IList[Widget] = js.native
}
object SplitPane {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SplitPane")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SplitPane.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SplitPane.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
