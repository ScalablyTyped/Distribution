package typings.mendixmodelsdk.mod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.4.0: introduced
  */
@JSImport("mendixmodelsdk", "pages.PageVariable")
@js.native
class PageVariable protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.pages.PageVariable {
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
@JSImport("mendixmodelsdk", "pages.PageVariable")
@js.native
object PageVariable extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.PageVariable = js.native
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'variable' property
    * of the parent MicroflowParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 and higher
    */
  def createInMicroflowParameterMappingUnderVariable(container: typings.mendixmodelsdk.pagesMod.pages.MicroflowParameterMapping): typings.mendixmodelsdk.pagesMod.pages.PageVariable = js.native
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'variable' property
    * of the parent NanoflowParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 and higher
    */
  def createInNanoflowParameterMappingUnderVariable(container: typings.mendixmodelsdk.pagesMod.pages.NanoflowParameterMapping): typings.mendixmodelsdk.pagesMod.pages.PageVariable = js.native
}

