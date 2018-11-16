package typings
package pngjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object pngjsLibStrings {
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait metadata extends js.Object
  
  @js.native
  sealed trait parsed extends js.Object
  
  def error: error = "error".asInstanceOf[error]
  def metadata: metadata = "metadata".asInstanceOf[metadata]
  def parsed: parsed = "parsed".asInstanceOf[parsed]
}

