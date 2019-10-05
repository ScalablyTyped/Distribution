package typings.musicmetadata.MM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoOf extends js.Object {
  var no: Double
  var of: Double
}

object NoOf {
  @scala.inline
  def apply(no: Double, of: Double): NoOf = {
    val __obj = js.Dynamic.literal(no = no, of = of)
  
    __obj.asInstanceOf[NoOf]
  }
}

