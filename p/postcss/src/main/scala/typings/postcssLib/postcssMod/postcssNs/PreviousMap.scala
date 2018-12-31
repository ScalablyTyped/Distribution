package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviousMap extends js.Object {
  var annotation: java.lang.String
  var consumerCache: js.Any
  var file: java.lang.String
  var `inline`: js.Any
  var root: java.lang.String
  var text: java.lang.String
  def consumer(): js.Any
  def decodeInline(text: js.Any): js.Any
  def isMap(map: js.Any): scala.Boolean
  def loadAnnotation(css: js.Any): scala.Unit
  def loadMap(file: js.Any, prev: js.Any): js.Any
  def startWith(string: js.Any, start: js.Any): scala.Boolean
  def withContent(): scala.Boolean
}

