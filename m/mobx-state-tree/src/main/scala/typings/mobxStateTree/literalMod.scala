package typings.mobxStateTree

import typings.mobxStateTree.typeMod.ISimpleType
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/types/utility-types/literal", JSImport.Namespace)
@js.native
object literalMod extends js.Object {
  
  def isLiteralType[IT /* <: ISimpleType[_] */](`type`: IT): /* is IT */ Boolean = js.native
  
  def literal(value: js.UndefOr[scala.Nothing]): ISimpleType[js.UndefOr[scala.Nothing]] = js.native
  def literal(value: String): ISimpleType[String] = js.native
  def literal(value: Boolean): ISimpleType[Boolean] = js.native
  def literal(value: Double): ISimpleType[Double] = js.native
  def literal(value: Null): ISimpleType[Null] = js.native
  def literal(value: Date): ISimpleType[Date] = js.native
}
