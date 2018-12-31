package typings
package nunjucksLib.nunjucksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nunjucks", "Loader")
@js.native
class Loader () extends js.Object {
  def emit(name: java.lang.String, args: js.Any*): scala.Unit = js.native
  def extend(toExtend: ILoader): ILoader = js.native
  def isRelative(filename: java.lang.String): scala.Boolean = js.native
  def on(name: java.lang.String, func: js.Function1[/* repeated */ js.Any, _]): scala.Unit = js.native
  def resolve(from: java.lang.String, to: java.lang.String): java.lang.String = js.native
}

