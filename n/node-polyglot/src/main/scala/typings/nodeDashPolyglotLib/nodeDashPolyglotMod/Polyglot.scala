package typings
package nodeDashPolyglotLib.nodeDashPolyglotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Polyglot extends js.Object {
  def clear(): scala.Unit = js.native
  def extend(phrases: js.Any): scala.Unit = js.native
  def has(phrase: java.lang.String): scala.Boolean = js.native
  def locale(): java.lang.String = js.native
  def locale(locale: java.lang.String): java.lang.String = js.native
  def replace(phrases: js.Any): scala.Unit = js.native
  def t(phrase: java.lang.String): java.lang.String = js.native
  def t(phrase: java.lang.String, options: InterpolationOptions): java.lang.String = js.native
  def t(phrase: java.lang.String, options: scala.Double): java.lang.String = js.native
}

