package typings.n3

import typings.n3.mod.BaseFormat
import typings.n3.mod.MimeType
import typings.n3.mod.Star
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object n3Strings {
  
  @js.native
  sealed trait `-star`
    extends StObject
       with Star
  inline def `-star`: `-star` = "-star".asInstanceOf[`-star`]
  
  @js.native
  sealed trait Asterisk
    extends StObject
       with Star
  inline def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  
  @js.native
  sealed trait BlankNode extends StObject
  inline def BlankNode: BlankNode = "BlankNode".asInstanceOf[BlankNode]
  
  @js.native
  sealed trait DefaultGraph extends StObject
  inline def DefaultGraph: DefaultGraph = "DefaultGraph".asInstanceOf[DefaultGraph]
  
  @js.native
  sealed trait Literal extends StObject
  inline def Literal: Literal = "Literal".asInstanceOf[Literal]
  
  @js.native
  sealed trait `N-Quads`
    extends StObject
       with BaseFormat
  inline def `N-Quads`: `N-Quads` = "N-Quads".asInstanceOf[`N-Quads`]
  
  @js.native
  sealed trait `N-Triples`
    extends StObject
       with BaseFormat
  inline def `N-Triples`: `N-Triples` = "N-Triples".asInstanceOf[`N-Triples`]
  
  @js.native
  sealed trait N3
    extends StObject
       with BaseFormat
  inline def N3: N3 = "N3".asInstanceOf[N3]
  
  @js.native
  sealed trait NamedNode extends StObject
  inline def NamedNode: NamedNode = "NamedNode".asInstanceOf[NamedNode]
  
  @js.native
  sealed trait Notation3
    extends StObject
       with BaseFormat
  inline def Notation3: Notation3 = "Notation3".asInstanceOf[Notation3]
  
  @js.native
  sealed trait Quad extends StObject
  inline def Quad: Quad = "Quad".asInstanceOf[Quad]
  
  @js.native
  sealed trait TriG
    extends StObject
       with BaseFormat
  inline def TriG: TriG = "TriG".asInstanceOf[TriG]
  
  @js.native
  sealed trait Turtle
    extends StObject
       with BaseFormat
  inline def Turtle: Turtle = "Turtle".asInstanceOf[Turtle]
  
  @js.native
  sealed trait Variable extends StObject
  inline def Variable: Variable = "Variable".asInstanceOf[Variable]
  
  @js.native
  sealed trait _empty extends StObject
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait application
    extends StObject
       with MimeType
  inline def application: application = "application".asInstanceOf[application]
  
  @js.native
  sealed trait example
    extends StObject
       with MimeType
  inline def example: example = "example".asInstanceOf[example]
  
  @js.native
  sealed trait message
    extends StObject
       with MimeType
  inline def message: message = "message".asInstanceOf[message]
  
  @js.native
  sealed trait multipart
    extends StObject
       with MimeType
  inline def multipart: multipart = "multipart".asInstanceOf[multipart]
  
  @js.native
  sealed trait star
    extends StObject
       with Star
  inline def star: star = "star".asInstanceOf[star]
  
  @js.native
  sealed trait text
    extends StObject
       with MimeType
  inline def text: text = "text".asInstanceOf[text]
}
