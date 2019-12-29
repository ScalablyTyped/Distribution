package typings.mendixmodelsdk.mendixmodelsdkMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "pages.SelectorXPathSource")
@js.native
class SelectorXPathSource protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages.SelectorXPathSource {
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
@JSImport("mendixmodelsdk", "pages.SelectorXPathSource")
@js.native
object SelectorXPathSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new SelectorXPathSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenPagesMod.pages.SelectorXPathSource = js.native
  /**
    * Creates and returns a new SelectorXPathSource instance in the SDK and on the server.
    * The new SelectorXPathSource will be automatically stored in the 'selectorSource' property
    * of the parent AssociationWidget element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenPagesMod.pages.AssociationWidget): typings.mendixmodelsdk.distGenPagesMod.pages.SelectorXPathSource = js.native
}

