package typings
package nunjucksLib.nunjucksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Extension extends js.Object {
  var tags: js.Array[java.lang.String]
  // Parser API is undocumented it is suggested to check the source: https://github.com/mozilla/nunjucks/blob/master/src/parser.js
  def parse(parser: js.Any, nodes: js.Any, lexer: js.Any): js.Any
}

