package typings.mobxStateTree.anon

import typings.mobxStateTree.maybeMod.IMaybe
import typings.mobxStateTree.referenceMod.IReferenceType
import typings.mobxStateTree.referenceMod.ReferenceOptionsGetSet
import typings.mobxStateTree.typeMod.IAnyComplexType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn0 extends js.Object {
  
  def apply[IT /* <: IAnyComplexType */](subType: IT): IMaybe[IReferenceType[IT]] = js.native
  def apply[IT /* <: IAnyComplexType */](subType: IT, options: (ReferenceOptionsGetSet[IT] | js.Object) with AcceptsUndefined): IMaybe[IReferenceType[IT]] = js.native
}
