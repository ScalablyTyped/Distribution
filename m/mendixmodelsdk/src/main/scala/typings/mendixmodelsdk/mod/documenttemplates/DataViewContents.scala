package typings.mendixmodelsdk.mod.documenttemplates

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "documenttemplates.DataViewContents")
@js.native
class DataViewContents protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.documenttemplates.DataViewContents {
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
@JSImport("mendixmodelsdk", "documenttemplates.DataViewContents")
@js.native
object DataViewContents extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataViewContents instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataViewContents = js.native
  /**
    * Creates and returns a new DataViewContents instance in the SDK and on the server.
    * The new DataViewContents will be automatically stored in the 'contents' property
    * of the parent DataView element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataView): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataViewContents = js.native
}

