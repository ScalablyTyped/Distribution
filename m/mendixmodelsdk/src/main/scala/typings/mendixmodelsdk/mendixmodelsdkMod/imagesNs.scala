package typings.mendixmodelsdk.mendixmodelsdkMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "images")
@js.native
object imagesNs extends js.Object {
  @js.native
  class Image protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.imagesNs.Image {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/images relevant section in reference guide}
    */
  @js.native
  class ImageCollection protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.imagesNs.ImageCollection {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /* static members */
  @js.native
  object Image extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenImagesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Image instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenImagesMod.imagesNs.Image = js.native
    /**
      * Creates and returns a new Image instance in the SDK and on the server.
      * The new Image will be automatically stored in the 'images' property
      * of the parent ImageCollection element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenImagesMod.imagesNs.ImageCollection): typings.mendixmodelsdk.distGenImagesMod.imagesNs.Image = js.native
  }
  
  /* static members */
  @js.native
  object ImageCollection extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenImagesMod.StructureVersionInfo = js.native
    /**
      * Creates a new ImageCollection unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenImagesMod.imagesNs.ImageCollection = js.native
  }
  
}

