package typings.mobxStateTree.anon

import typings.mobxStateTree.referenceMod.IReferenceType
import typings.mobxStateTree.referenceMod.ReferenceOptions
import typings.mobxStateTree.typeMod.IAnyComplexType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallSubTypeOptions extends js.Object {
  
  def apply[IT /* <: IAnyComplexType */](subType: IT): IReferenceType[IT] = js.native
  def apply[IT /* <: IAnyComplexType */](subType: IT, options: ReferenceOptions[IT]): IReferenceType[IT] = js.native
}
