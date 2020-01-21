package typings.mendixmodelsdk.structuresMod

import typings.mendixmodelsdk.elementsMod.IAbstractElement
import typings.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/structures", "aliases")
@js.native
object aliases extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.mendixmodelsdk.unitsMod.StructuralUnit
    - typings.mendixmodelsdk.elementsMod.AbstractElement
  */
  trait Container extends js.Object
  
  type IContainer = IStructuralUnit | IAbstractElement
}

