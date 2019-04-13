package typings
package postcssLib.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postcss", "PreviousMap")
@js.native
class PreviousMap protected () extends js.Object {
  def this(css: js.Any, opts: js.Any) = this()
  var annotation: java.lang.String = js.native
  var consumerCache: js.Any = js.native
  var file: java.lang.String = js.native
  var `inline`: js.Any = js.native
  var root: java.lang.String = js.native
  var text: java.lang.String = js.native
  def consumer(): sourceDashMapLib.sourceDashMapMod.SourceMapConsumer = js.native
  def decodeInline(text: java.lang.String): java.lang.String = js.native
  def isMap(map: js.Any): scala.Boolean = js.native
  def loadAnnotation(css: java.lang.String): scala.Unit = js.native
  def loadMap(file: js.Any, prev: java.lang.String): java.lang.String = js.native
  def loadMap(file: js.Any, prev: js.Function): java.lang.String = js.native
  def loadMap(file: js.Any, prev: sourceDashMapLib.sourceDashMapMod.RawSourceMap): java.lang.String = js.native
  def loadMap(file: js.Any, prev: sourceDashMapLib.sourceDashMapMod.SourceMapConsumer): java.lang.String = js.native
  def loadMap(file: js.Any, prev: sourceDashMapLib.sourceDashMapMod.SourceMapGenerator): java.lang.String = js.native
  def startWith(string: java.lang.String, start: java.lang.String): scala.Boolean = js.native
  def withContent(): scala.Boolean = js.native
}

