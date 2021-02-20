package typings.mobxStateTree

import typings.mobxStateTree.typeMod.ISimpleType
import typings.mobxStateTree.typeMod.IType
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primitivesMod {
  
  @JSImport("mobx-state-tree/dist/types/primitives", "DatePrimitive")
  @js.native
  val DatePrimitive: IType[Double | Date, Double, Date] = js.native
  
  @JSImport("mobx-state-tree/dist/types/primitives", "boolean")
  @js.native
  val boolean: ISimpleType[Boolean] = js.native
  
  @JSImport("mobx-state-tree/dist/types/primitives", "integer")
  @js.native
  val integer: ISimpleType[Double] = js.native
  
  @JSImport("mobx-state-tree/dist/types/primitives", "isPrimitiveType")
  @js.native
  def isPrimitiveType(
    `type`: IType[
      Boolean | Date | Double | String, 
      Boolean | Double | String, 
      Boolean | Date | Double | String
    ]
  ): /* is mobx-state-tree.mobx-state-tree/dist/core/type/type.IType<string, string, string> */ Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/types/primitives", "nullType")
  @js.native
  val nullType: ISimpleType[Null] = js.native
  
  @JSImport("mobx-state-tree/dist/types/primitives", "number")
  @js.native
  val number: ISimpleType[Double] = js.native
  
  @JSImport("mobx-state-tree/dist/types/primitives", "string")
  @js.native
  val string: ISimpleType[String] = js.native
  
  @JSImport("mobx-state-tree/dist/types/primitives", "undefinedType")
  @js.native
  val undefinedType: ISimpleType[js.UndefOr[scala.Nothing]] = js.native
}
