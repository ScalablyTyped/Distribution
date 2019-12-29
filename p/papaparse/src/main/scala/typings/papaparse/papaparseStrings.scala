package typings.papaparse

import typings.papaparse.papaparseMod._GuessableDelimiters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object papaparseStrings {
  @js.native
  sealed trait Charactertabulation extends _GuessableDelimiters
  
  @js.native
  sealed trait Comma extends _GuessableDelimiters
  
  @js.native
  sealed trait Informationseparatorone extends js.Object
  
  @js.native
  sealed trait Informationseparatortwo extends js.Object
  
  @js.native
  sealed trait Semicolon extends _GuessableDelimiters
  
  @js.native
  sealed trait Verticalline extends _GuessableDelimiters
  
  @js.native
  sealed trait greedy extends js.Object
  
  @scala.inline
  def Charactertabulation: Charactertabulation = "\t".asInstanceOf[Charactertabulation]
  @scala.inline
  def Comma: Comma = ",".asInstanceOf[Comma]
  @scala.inline
  def Informationseparatorone: Informationseparatorone = "\u001F".asInstanceOf[Informationseparatorone]
  @scala.inline
  def Informationseparatortwo: Informationseparatortwo = "\u001E".asInstanceOf[Informationseparatortwo]
  @scala.inline
  def Semicolon: Semicolon = ";".asInstanceOf[Semicolon]
  @scala.inline
  def Verticalline: Verticalline = "|".asInstanceOf[Verticalline]
  @scala.inline
  def greedy: greedy = "greedy".asInstanceOf[greedy]
}

