package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.projectsMod.projects.Document
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.2.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.domainmodelsMod.domainmodels.IRemoteEntitySourceDocument because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined icon */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RemoteEntitySourceDocument")
@js.native
abstract class RemoteEntitySourceDocument protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  /**
    * In version 8.11.0: added public
    * In version 8.10.0: introduced
    */
  @JSName("icon")
  val icon_FRemoteEntitySourceDocument: String | Null = js.native
  @JSName("model")
  var model_FRemoteEntitySourceDocument: IModel = js.native
  /**
    * In version 8.10.0: introduced
    */
  def catalogUrl: String = js.native
  def catalogUrl_=(newValue: String): Unit = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MRemoteEntitySourceDocument: FolderBase = js.native
  /**
    * In version 8.10.0: introduced
    */
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  /**
    * In version 8.11.0: added public
    * In version 8.10.0: introduced
    */
  def icon: String | Null = js.native
  def icon_=(newValue: String | Null): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RemoteEntitySourceDocument")
@js.native
object RemoteEntitySourceDocument extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

