package typings.mendixmodelsdk.mod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "microflows.ExpressionSplitCondition")
@js.native
class ExpressionSplitCondition protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.microflows.ExpressionSplitCondition {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "microflows.ExpressionSplitCondition")
@js.native
object ExpressionSplitCondition extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ExpressionSplitCondition instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.microflowsMod.microflows.ExpressionSplitCondition = js.native
  /**
    * Creates and returns a new ExpressionSplitCondition instance in the SDK and on the server.
    * The new ExpressionSplitCondition will be automatically stored in the 'splitCondition' property
    * of the parent ExclusiveSplit element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.microflowsMod.microflows.ExclusiveSplit): typings.mendixmodelsdk.microflowsMod.microflows.ExpressionSplitCondition = js.native
}

