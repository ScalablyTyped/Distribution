package typings.mendixmodelsdk.unitsMod

import typings.mendixmodelsdk.elementsMod.IAbstractElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.unitsMod.IAbstractUnit because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined delete */ @js.native
trait IModelUnit extends IAbstractElement {
  @JSName("container")
  val container_IModelUnit: IStructuralUnit = js.native
  /**
    * Deletes the unit from the model
    */
  def delete(): Unit = js.native
}

