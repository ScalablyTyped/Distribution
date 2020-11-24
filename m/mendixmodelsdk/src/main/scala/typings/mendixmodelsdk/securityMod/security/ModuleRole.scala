package typings.mendixmodelsdk.securityMod.security

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.securityMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/module-security relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.securityMod.security.IModuleRole because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsModuleSecurity, name */ @JSImport("mendixmodelsdk/dist/gen/security", "security.ModuleRole")
@js.native
class ModuleRole protected ()
  extends Element[IModel]
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsModuleSecurity: ModuleSecurity = js.native
  @JSName("containerAsModuleSecurity")
  val containerAsModuleSecurity_FModuleRole: IModuleSecurity = js.native
  
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  @JSName("name")
  val name_FModuleRole: String = js.native
  
  @JSName("qualifiedName")
  def qualifiedName_MModuleRole: String | Null = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/security", "security.ModuleRole")
@js.native
object ModuleRole extends js.Object {
  
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
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
