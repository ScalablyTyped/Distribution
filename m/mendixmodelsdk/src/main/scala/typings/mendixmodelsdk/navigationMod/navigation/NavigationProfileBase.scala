package typings.mendixmodelsdk.navigationMod.navigation

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.navigationMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.navigationMod.navigation.INavigationProfileBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsNavigationDocument, name */ @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NavigationProfileBase")
@js.native
abstract class NavigationProfileBase protected ()
  extends Element
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("containerAsNavigationDocument")
  val containerAsNavigationDocument_FNavigationProfileBase: INavigationDocument = js.native
  @JSName("model")
  var model_FNavigationProfileBase: IModel = js.native
  /**
    * In version 7.2.0: introduced
    */
  @JSName("name")
  val name_FNavigationProfileBase: String = js.native
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  def containerAsNavigationDocument: NavigationDocument = js.native
  /**
    * In version 7.2.0: introduced
    */
  def name: String = js.native
  def name(newValue: String): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.22.0: introduced
    */
  def offlineEntityConfigs: IList[OfflineEntityConfig] | Null = js.native
  @JSName("qualifiedName")
  def qualifiedName_MNavigationProfileBase: String | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NavigationProfileBase")
@js.native
object NavigationProfileBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

