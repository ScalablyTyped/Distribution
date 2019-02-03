package typings
package mendixmodelsdkLib.distGenConstantsMod

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
  - mendixmodelsdkLib.distGenConstantsMod.constantsNs.IConstant because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class Constant protected ()
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.Document {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var dataType: java.lang.String = js.native
    var defaultValue: java.lang.String = js.native
    /**
      * In version 7.9.0: introduced
      */
    var `type`: mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DataType = js.native
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Constants`.
    */
  /**
    * See: {@link https://docs.mendix.com/refguide7/constants relevant section in reference guide}
    */
  @js.native
  trait IConstant
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.IDocument
  
  /* static members */
  @js.native
  object Constant extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenConstantsMod.StructureVersionInfo = js.native
    /**
      * Creates a new Constant unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant = js.native
  }
  
}

