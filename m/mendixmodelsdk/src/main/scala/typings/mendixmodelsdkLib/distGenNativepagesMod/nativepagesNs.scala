package typings
package mendixmodelsdkLib.distGenNativepagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages")
@js.native
object nativepagesNs extends js.Object {
  /**
       * Interfaces and instance classes for types from the Mendix sub meta model `NativePages`.
       */
  /**
       * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
       *
       * In version 7.21.0: introduced
       */
  @js.native
  trait INativeLayout
    extends mendixmodelsdkLib.distGenPagesMod.pagesNs.IFormBase
  
  /**
       * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
       *
       * In version 7.21.0: introduced
       */
  @js.native
  trait INativePage
    extends mendixmodelsdkLib.distGenPagesMod.pagesNs.IFormBase
  
  /**
       * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
       *
       * In version 7.21.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.INativeLayout because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class NativeLayout protected ()
    extends mendixmodelsdkLib.distGenPagesMod.pagesNs.FormBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    /**
             * In version 7.22.0: introduced
             */
    var headerWidget: mendixmodelsdkLib.distGenPagesMod.pagesNs.Widget | scala.Null = js.native
    val widgets: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[mendixmodelsdkLib.distGenPagesMod.pagesNs.Widget] = js.native
  }
  
  /**
       * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
       *
       * In version 7.21.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.INativePage because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class NativePage protected ()
    extends mendixmodelsdkLib.distGenPagesMod.pagesNs.FormBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    /**
             * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
             */
    var layout: INativeLayout = js.native
    val layoutQualifiedName: java.lang.String = js.native
  }
  
  /**
       * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
       *
       * In version 7.21.0: introduced
       */
  @js.native
  object NativeLayout extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNativepagesMod.StructureVersionInfo = js.native
    /**
             * Creates a new NativeLayout unit in the SDK and on the server.
             * Expects one argument, the projects.IFolderBase in which this unit is contained.
             */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativeLayout = js.native
  }
  
  /**
       * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
       *
       * In version 7.21.0: introduced
       */
  @js.native
  object NativePage extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNativepagesMod.StructureVersionInfo = js.native
    /**
             * Creates a new NativePage unit in the SDK and on the server.
             * Expects one argument, the projects.IFolderBase in which this unit is contained.
             */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePage = js.native
  }
  
}

