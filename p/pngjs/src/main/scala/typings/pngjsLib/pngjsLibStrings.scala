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
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def metadata: metadata = "metadata".asInstanceOf[metadata]
  @scala.inline
  def parsed: parsed = "parsed".asInstanceOf[parsed]
}

