package typings.mendixmodelsdk.allModelClassesMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object images {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "images.Image")
  @js.native
  class Image protected ()
    extends typings.mendixmodelsdk.imagesMod.images.Image {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Image {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "images.Image")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new Image instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.imagesMod.images.Image = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.imagesMod.images.Image]
    
    /**
      * Creates and returns a new Image instance in the SDK and on the server.
      * The new Image will be automatically stored in the 'images' property
      * of the parent ImageCollection element passed as argument.
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.imagesMod.images.ImageCollection): typings.mendixmodelsdk.imagesMod.images.Image = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.imagesMod.images.Image]
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "images.Image.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "images.Image.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.imagesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.imagesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/images relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "images.ImageCollection")
  @js.native
  class ImageCollection protected ()
    extends typings.mendixmodelsdk.imagesMod.images.ImageCollection {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object ImageCollection {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "images.ImageCollection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ImageCollection unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @scala.inline
    def createIn(container: IFolderBase): typings.mendixmodelsdk.imagesMod.images.ImageCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.imagesMod.images.ImageCollection]
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "images.ImageCollection.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "images.ImageCollection.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.imagesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.imagesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
