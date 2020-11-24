package typings.mendixmodelsdk.projectsMod.projects

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.projectsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/projects", "projects.OneTimeConversionMarker")
@js.native
class OneTimeConversionMarker protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsProjectConversion: ProjectConversion = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/projects", "projects.OneTimeConversionMarker")
@js.native
object OneTimeConversionMarker extends js.Object {
  
  /**
    * Creates and returns a new OneTimeConversionMarker instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): OneTimeConversionMarker = js.native
  
  /**
    * Creates and returns a new OneTimeConversionMarker instance in the SDK and on the server.
    * The new OneTimeConversionMarker will be automatically stored in the 'markers' property
    * of the parent ProjectConversion element passed as argument.
    */
  def createIn(container: ProjectConversion): OneTimeConversionMarker = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
