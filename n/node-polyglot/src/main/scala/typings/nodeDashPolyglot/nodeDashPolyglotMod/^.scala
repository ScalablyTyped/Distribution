package typings.nodeDashPolyglot.nodeDashPolyglotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-polyglot", JSImport.Namespace)
@js.native
class ^ () extends Polyglot {
  def this(options: PolyglotOptions) = this()
}

@JSImport("node-polyglot", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def transformPhrase(phrase: String): String = js.native
  def transformPhrase(phrase: String, options: Double): String = js.native
  def transformPhrase(phrase: String, options: Double, locale: String): String = js.native
  def transformPhrase(phrase: String, options: InterpolationOptions): String = js.native
  def transformPhrase(phrase: String, options: InterpolationOptions, locale: String): String = js.native
}

