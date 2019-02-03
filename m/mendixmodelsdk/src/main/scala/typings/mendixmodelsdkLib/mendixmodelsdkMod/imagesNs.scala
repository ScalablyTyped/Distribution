package typings
package mendixmodelsdkLib.mendixmodelsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "images")
@js.native
object imagesNs extends js.Object {
  @js.native
  class Image protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.imagesNs.Image {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/images relevant section in reference guide}
    */
  @js.native
  class ImageCollection protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.imagesNs.ImageCollection {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
  }
  
  /* static members */
  @js.native
  object Image extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenImagesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Image instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenImagesMod.imagesNs.Image = js.native
    /**
      * Creates and returns a new Image instance in the SDK and on the server.
      * The new Image will be automatically stored in the 'images' property
      * of the parent ImageCollection element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenImagesMod.imagesNs.ImageCollection): mendixmodelsdkLib.distGenImagesMod.imagesNs.Image = js.native
  }
  
  /* static members */
  @js.native
  object ImageCollection extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenImagesMod.StructureVersionInfo = js.native
    /**
      * Creates a new ImageCollection unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenImagesMod.imagesNs.ImageCollection = js.native
  }
  
}

