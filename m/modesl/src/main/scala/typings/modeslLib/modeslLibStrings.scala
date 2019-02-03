package typings
package modeslLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object modeslLibStrings {
  @js.native
  sealed trait json extends js.Object
  
  @js.native
  sealed trait plain extends js.Object
  
  @js.native
  sealed trait xml extends js.Object
  
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def plain: plain = "plain".asInstanceOf[plain]
  @scala.inline
  def xml: xml = "xml".asInstanceOf[xml]
}

