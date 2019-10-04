package typings.mendixmodelsdk.distGenConstantsMod

import typings.mendixmodelsdk.distGenConstantsMod.constantsNs.Constant
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.DataType
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.Document
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IDocument
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/constants", "constants")
@js.native
object constantsNs extends js.Object {
  /**
    * See: {@link https://docs.mendix.com/refguide7/constants relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenConstantsMod.constantsNs.IConstant because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined  */ @js.native
  class Constant protected () extends Document {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var dataType: String = js.native
    var defaultValue: String = js.native
    /**
      * In version 8.2.0: introduced
      */
    var exposedToClient: Boolean = js.native
    /**
      * In version 7.9.0: introduced
      */
    var `type`: DataType = js.native
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Constants`.
    */
  /**
    * See: {@link https://docs.mendix.com/refguide7/constants relevant section in reference guide}
    */
  @js.native
  trait IConstant extends IDocument
  
  /* static members */
  @js.native
  object Constant extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new Constant unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): Constant = js.native
  }
  
}

