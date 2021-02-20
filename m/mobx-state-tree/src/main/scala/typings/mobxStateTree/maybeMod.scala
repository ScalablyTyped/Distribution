package typings.mobxStateTree

import typings.mobxStateTree.typeMod.IAnyType
import typings.mobxStateTree.typeMod.IType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maybeMod {
  
  @JSImport("mobx-state-tree/dist/types/utility-types/maybe", "maybe")
  @js.native
  def maybe[IT /* <: IAnyType */](`type`: IT): IMaybe[IT] = js.native
  
  @JSImport("mobx-state-tree/dist/types/utility-types/maybe", "maybeNull")
  @js.native
  def maybeNull[IT /* <: IAnyType */](`type`: IT): IMaybeNull[IT] = js.native
  
  type IMaybe[IT /* <: IAnyType */] = IMaybeIType[IT, js.UndefOr[scala.Nothing], js.UndefOr[scala.Nothing]]
  
  type IMaybeIType[IT /* <: IAnyType */, C, O] = IType[
    (/* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any) | C, 
    (/* import warning: importer.ImportType#apply Failed type conversion: IT['SnapshotType'] */ js.Any) | O, 
    (/* import warning: importer.ImportType#apply Failed type conversion: IT['TypeWithoutSTN'] */ js.Any) | O
  ]
  
  type IMaybeNull[IT /* <: IAnyType */] = IMaybeIType[IT, js.UndefOr[Null], Null]
}
