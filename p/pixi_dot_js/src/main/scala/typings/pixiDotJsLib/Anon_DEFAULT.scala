package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DEFAULT extends js.Object {
  var DEFAULT: scala.Double
  var DYNAMIC: scala.Double
  var STATIC: scala.Double
}

trait Anon_Default extends js.Object {
  var default: java.lang.String
  var pointer: java.lang.String
}

object Anon_DEFAULT {
  @scala.inline
  def apply(DEFAULT: scala.Double, DYNAMIC: scala.Double, STATIC: scala.Double): Anon_DEFAULT = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT, DYNAMIC = DYNAMIC, STATIC = STATIC)
  
    __obj.asInstanceOf[Anon_DEFAULT]
  }
}

object Anon_Default {
  @scala.inline
  def apply(default: java.lang.String, pointer: java.lang.String): Anon_Default = {
    val __obj = js.Dynamic.literal(default = default, pointer = pointer)
  
    __obj.asInstanceOf[Anon_Default]
  }
}

