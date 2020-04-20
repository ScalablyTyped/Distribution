package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.commonMod.common.ISize
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Flow")
@js.native
abstract class Flow protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FFlow: IModel = js.native
  def containerAsMicroflowBase: MicroflowBase = js.native
  def destination: MicroflowObject = js.native
  def destination(newValue: MicroflowObject): js.Any = js.native
  def destinationBezierVector: ISize = js.native
  def destinationBezierVector(newValue: ISize): js.Any = js.native
  def destinationConnectionIndex: Double = js.native
  def destinationConnectionIndex(newValue: Double): js.Any = js.native
  def origin: MicroflowObject = js.native
  def origin(newValue: MicroflowObject): js.Any = js.native
  def originBezierVector: ISize = js.native
  def originBezierVector(newValue: ISize): js.Any = js.native
  def originConnectionIndex: Double = js.native
  def originConnectionIndex(newValue: Double): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Flow")
@js.native
object Flow extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

