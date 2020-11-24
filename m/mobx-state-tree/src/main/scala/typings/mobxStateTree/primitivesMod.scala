package typings.mobxStateTree

import typings.mobxStateTree.typeMod.ISimpleType
import typings.mobxStateTree.typeMod.IType
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/types/primitives", JSImport.Namespace)
@js.native
object primitivesMod extends js.Object {
  
  val DatePrimitive: IType[Double | Date, Double, Date] = js.native
  
  val boolean: ISimpleType[Boolean] = js.native
  
  val integer: ISimpleType[Double] = js.native
  
  def isPrimitiveType(
    `type`: IType[
      Boolean | Date | Double | String, 
      Boolean | Double | String, 
      Boolean | Date | Double | String
    ]
  ): /* is mobx-state-tree.mobx-state-tree/dist/core/type/type.IType<string, string, string> */ Boolean = js.native
  
  val nullType: ISimpleType[Null] = js.native
  
  val number: ISimpleType[Double] = js.native
  
  val string: ISimpleType[String] = js.native
  
  val undefinedType: ISimpleType[js.UndefOr[scala.Nothing]] = js.native
}
