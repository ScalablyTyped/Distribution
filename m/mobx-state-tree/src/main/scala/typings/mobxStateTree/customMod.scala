package typings.mobxStateTree

import typings.mobxStateTree.typeMod.IType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/types/utility-types/custom", JSImport.Namespace)
@js.native
object customMod extends js.Object {
  
  def custom[S, T](options: CustomTypeOptions[S, T]): IType[S | T, S, T] = js.native
  
  @js.native
  trait CustomTypeOptions[S, T] extends js.Object {
    
    /** given a serialized value and environment, how to turn it into the target type */
    def fromSnapshot(snapshot: S): T = js.native
    def fromSnapshot(snapshot: S, env: js.Any): T = js.native
    
    /** a non empty string is assumed to be a validation error */
    def getValidationMessage(snapshot: S): String = js.native
    
    /** if true, this is a converted value, if false, it's a snapshot */
    def isTargetType(value: S | T): Boolean = js.native
    
    /** Friendly name */
    var name: String = js.native
    
    /** return the serialization of the current value */
    def toSnapshot(value: T): S = js.native
  }
}
