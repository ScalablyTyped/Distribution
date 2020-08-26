package typings.mendixmodelsdk.unitsMod

import typings.mendixmodelsdk.elementsMod.IAbstractElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.unitsMod.IAbstractUnit because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined isLoadable, isReadOnly, delete */ @js.native
trait IModelUnit extends IAbstractElement {
  @JSName("container")
  val container_IModelUnit: IStructuralUnit = js.native
  /**
    * Whether this unit and all of its children (recursively) can be loaded.
    */
  val isLoadable: Boolean = js.native
  /**
    * Whether this unit and all of its children (recursively) are editable.
    */
  val isReadOnly: Boolean = js.native
  /**
    * Deletes the unit from the model
    */
  def delete(): Unit = js.native
}

