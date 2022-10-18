package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.0.0: deleted
  */
/* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/pages", "pages.SplitPane")
@js.native
open class SplitPane protected () extends Widget {
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
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SplitPane")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SplitPane.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SplitPane.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
