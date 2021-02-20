package typings.mobxStateTree

import typings.mobxStateTree.typeMod.ISimpleType
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object literalMod {
  
  @JSImport("mobx-state-tree/dist/types/utility-types/literal", "isLiteralType")
  @js.native
  def isLiteralType[IT /* <: ISimpleType[_] */](`type`: IT): /* is IT */ Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/types/utility-types/literal", "literal")
  @js.native
  def literal(value: js.UndefOr[scala.Nothing]): ISimpleType[js.UndefOr[scala.Nothing]] = js.native
  @JSImport("mobx-state-tree/dist/types/utility-types/literal", "literal")
  @js.native
  def literal(value: String): ISimpleType[String] = js.native
  @JSImport("mobx-state-tree/dist/types/utility-types/literal", "literal")
  @js.native
  def literal(value: Boolean): ISimpleType[Boolean] = js.native
  @JSImport("mobx-state-tree/dist/types/utility-types/literal", "literal")
  @js.native
  def literal(value: Double): ISimpleType[Double] = js.native
  @JSImport("mobx-state-tree/dist/types/utility-types/literal", "literal")
  @js.native
  def literal(value: Null): ISimpleType[Null] = js.native
  @JSImport("mobx-state-tree/dist/types/utility-types/literal", "literal")
  @js.native
  def literal(value: Date): ISimpleType[Date] = js.native
}
