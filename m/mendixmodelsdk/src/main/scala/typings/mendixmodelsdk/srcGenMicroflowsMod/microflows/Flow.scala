package typings.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typings.mendixmodelsdk.srcCommonMod.common.ISize
import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.Flow")
@js.native
open class Flow protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsMicroflowBase: MicroflowBase = js.native
  
  def destination: MicroflowObject = js.native
  
  def destinationBezierVector: ISize = js.native
  def destinationBezierVector_=(newValue: ISize): Unit = js.native
  
  def destinationConnectionIndex: Double = js.native
  def destinationConnectionIndex_=(newValue: Double): Unit = js.native
  
  def destination_=(newValue: MicroflowObject): Unit = js.native
  
  def origin: MicroflowObject = js.native
  
  def originBezierVector: ISize = js.native
  def originBezierVector_=(newValue: ISize): Unit = js.native
  
  def originConnectionIndex: Double = js.native
  def originConnectionIndex_=(newValue: Double): Unit = js.native
  
  def origin_=(newValue: MicroflowObject): Unit = js.native
}
object Flow {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.Flow")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.Flow.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.Flow.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
