package typings.mendixmodelsdk.unitsMod

import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.structuresMod.Structure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.unitsMod.IAbstractUnit because var conflicts: container, id, isLoaded, model, structureTypeName, unit. Inlined isLoadable, isReadOnly */ @JSImport("mendixmodelsdk/dist/sdk/internal/units", "AbstractUnit")
@js.native
abstract class AbstractUnit[TModel /* <: IAbstractModel */] protected () extends Structure[TModel, StructuralUnit[IAbstractModel]] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IStructuralUnit
  ) = this()
  
  def deepCopyInto(newParent: IStructuralUnit): AbstractUnit[IAbstractModel] = js.native
  
  def isLoadable: Boolean = js.native
  /**
    * Whether this unit and all of its children (recursively) can be loaded.
    */
  @JSName("isLoadable")
  val isLoadable_FAbstractUnit: Boolean = js.native
  
  /**
    * Checks whether all attributes are available at this instant;
    * if false, a load is required to access these properties.
    */
  @JSName("isLoaded")
  def isLoaded_MAbstractUnit: Boolean = js.native
  
  def isReadOnly: Boolean = js.native
  /**
    * Whether this unit and all of its children (recursively) are editable.
    */
  @JSName("isReadOnly")
  val isReadOnly_FAbstractUnit: Boolean = js.native
}
