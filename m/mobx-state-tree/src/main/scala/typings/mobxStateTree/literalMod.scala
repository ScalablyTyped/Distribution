package typings.mobxStateTree

import typings.mobxStateTree.typeMod.ISimpleType
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object literalMod {
  
  @JSImport("mobx-state-tree/dist/types/utility-types/literal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isLiteralType[IT /* <: ISimpleType[js.Any] */](`type`: IT): /* is IT */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLiteralType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is IT */ Boolean]
  
  @scala.inline
  def literal(value: String): ISimpleType[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[ISimpleType[String]]
  @scala.inline
  def literal(value: Boolean): ISimpleType[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[ISimpleType[Boolean]]
  @scala.inline
  def literal(value: Double): ISimpleType[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[ISimpleType[Double]]
  @scala.inline
  def literal(value: Null): ISimpleType[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[ISimpleType[Null]]
  @scala.inline
  def literal(value: Unit): ISimpleType[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[ISimpleType[Unit]]
  @scala.inline
  def literal(value: Date): ISimpleType[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[ISimpleType[Date]]
}
