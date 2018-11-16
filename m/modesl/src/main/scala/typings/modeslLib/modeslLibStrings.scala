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
  
  def json: json = "json".asInstanceOf[json]
  def plain: plain = "plain".asInstanceOf[plain]
  def xml: xml = "xml".asInstanceOf[xml]
}

