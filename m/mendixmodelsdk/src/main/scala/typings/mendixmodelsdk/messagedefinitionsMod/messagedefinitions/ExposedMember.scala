package typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.mappingsMod.mappings.Element
import typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedMember")
@js.native
abstract class ExposedMember protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FExposedMember: IModel = js.native
  /**
    * In version 7.15.0: introduced
    */
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
  /**
    * In version 7.15.0: introduced
    */
  def example: String = js.native
  def example_=(newValue: String): Unit = js.native
  def originalName: String = js.native
  def originalName_=(newValue: String): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedMember")
@js.native
object ExposedMember extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

