package typings.mendixmodelsdk.securityMod.security

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.securityMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/module-role relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.securityMod.security.IModuleRole because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsModuleSecurity, name */ @JSImport("mendixmodelsdk/dist/gen/security", "security.ModuleRole")
@js.native
class ModuleRole protected ()
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
  @JSName("containerAsModuleSecurity")
  val containerAsModuleSecurity_FModuleRole: IModuleSecurity = js.native
  @JSName("model")
  var model_FModuleRole: IModel = js.native
  @JSName("name")
  val name_FModuleRole: String = js.native
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  def containerAsModuleSecurity: ModuleSecurity = js.native
  def description: String = js.native
  def description(newValue: String): js.Any = js.native
  def name: String = js.native
  def name(newValue: String): js.Any = js.native
  @JSName("qualifiedName")
  def qualifiedName_MModuleRole: String | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/security", "security.ModuleRole")
@js.native
object ModuleRole extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ModuleRole instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ModuleRole = js.native
  /**
    * Creates and returns a new ModuleRole instance in the SDK and on the server.
    * The new ModuleRole will be automatically stored in the 'moduleRoles' property
    * of the parent ModuleSecurity element passed as argument.
    */
  def createIn(container: ModuleSecurity): ModuleRole = js.native
}

