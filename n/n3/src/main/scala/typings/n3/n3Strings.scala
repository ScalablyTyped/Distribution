package typings.n3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object n3Strings {
  @js.native
  sealed trait BlankNode extends js.Object
  
  @js.native
  sealed trait DefaultGraph extends js.Object
  
  @js.native
  sealed trait Literal extends js.Object
  
  @js.native
  sealed trait NamedNode extends js.Object
  
  @js.native
  sealed trait Variable extends js.Object
  
  @js.native
  sealed trait _empty extends js.Object
  
  @scala.inline
  def BlankNode: BlankNode = "BlankNode".asInstanceOf[BlankNode]
  @scala.inline
  def DefaultGraph: DefaultGraph = "DefaultGraph".asInstanceOf[DefaultGraph]
  @scala.inline
  def Literal: Literal = "Literal".asInstanceOf[Literal]
  @scala.inline
  def NamedNode: NamedNode = "NamedNode".asInstanceOf[NamedNode]
  @scala.inline
  def Variable: Variable = "Variable".asInstanceOf[Variable]
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
}

