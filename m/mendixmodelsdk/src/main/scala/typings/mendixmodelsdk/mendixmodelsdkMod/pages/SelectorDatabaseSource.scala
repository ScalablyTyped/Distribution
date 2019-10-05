package typings.mendixmodelsdk.mendixmodelsdkMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 6.1.0: introduced
  */
@JSImport("mendixmodelsdk", "pages.SelectorDatabaseSource")
@js.native
class SelectorDatabaseSource protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages.SelectorDatabaseSource {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "pages.SelectorDatabaseSource")
@js.native
object SelectorDatabaseSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new SelectorDatabaseSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenPagesMod.pages.SelectorDatabaseSource = js.native
  /**
    * Creates and returns a new SelectorDatabaseSource instance in the SDK and on the server.
    * The new SelectorDatabaseSource will be automatically stored in the 'selectorSource' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.1.0 and higher
    */
  def createIn(container: typings.mendixmodelsdk.distGenPagesMod.pages.AssociationWidget): typings.mendixmodelsdk.distGenPagesMod.pages.SelectorDatabaseSource = js.native
}

