package typings.phin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object phinStrings {
  @js.native
  sealed trait json extends js.Object
  
  @js.native
  sealed trait none extends js.Object
  
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
}

