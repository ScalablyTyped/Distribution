package typings.monacoDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromLineNumber extends js.Object {
  /**
    * The start of the range (inclusive)
    */
  val fromLineNumber: Double
  /**
    * The end of the range (inclusive)
    */
  val toLineNumber: Double
}

object Anon_FromLineNumber {
  @scala.inline
  def apply(fromLineNumber: Double, toLineNumber: Double): Anon_FromLineNumber = {
    val __obj = js.Dynamic.literal(fromLineNumber = fromLineNumber, toLineNumber = toLineNumber)
  
    __obj.asInstanceOf[Anon_FromLineNumber]
  }
}

