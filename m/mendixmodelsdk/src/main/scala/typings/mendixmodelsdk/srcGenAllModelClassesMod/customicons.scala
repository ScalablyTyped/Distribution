package typings.mendixmodelsdk.srcGenAllModelClassesMod

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customicons {
  
  /**
    * In version 9.20.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customicons.CustomIcon")
  @js.native
  open class CustomIcon protected ()
    extends typings.mendixmodelsdk.srcGenCustomiconsMod.customicons.CustomIcon {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object CustomIcon {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customicons.CustomIcon")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CustomIcon instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenCustomiconsMod.customicons.CustomIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomiconsMod.customicons.CustomIcon]
    
    /**
      * Creates and returns a new CustomIcon instance in the SDK and on the server.
      * The new CustomIcon will be automatically stored in the 'icons' property
      * of the parent CustomIconCollection element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.20.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenCustomiconsMod.customicons.CustomIconCollection): typings.mendixmodelsdk.srcGenCustomiconsMod.customicons.CustomIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomiconsMod.customicons.CustomIcon]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customicons.CustomIcon.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customicons.CustomIcon.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenCustomiconsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenCustomiconsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/customicons relevant section in reference guide}
    *
    * In version 9.20.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customicons.CustomIconCollection")
  @js.native
  open class CustomIconCollection protected ()
    extends typings.mendixmodelsdk.srcGenCustomiconsMod.customicons.CustomIconCollection {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object CustomIconCollection {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customicons.CustomIconCollection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new CustomIconCollection unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenCustomiconsMod.customicons.CustomIconCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomiconsMod.customicons.CustomIconCollection]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customicons.CustomIconCollection.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customicons.CustomIconCollection.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenCustomiconsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenCustomiconsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
