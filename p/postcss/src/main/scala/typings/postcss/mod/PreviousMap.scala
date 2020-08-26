package typings.postcss.mod

import typings.sourceMap.mod.RawSourceMap
import typings.sourceMap.mod.SourceMapConsumer
import typings.sourceMap.mod.SourceMapGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postcss", "PreviousMap")
@js.native
class PreviousMap protected () extends js.Object {
  def this(css: js.Any, opts: js.Any) = this()
  var annotation: String = js.native
  var consumerCache: js.Any = js.native
  var file: String = js.native
  var `inline`: js.Any = js.native
  var root: String = js.native
  var text: String = js.native
  def consumer(): SourceMapConsumer = js.native
  def decodeInline(text: String): String = js.native
  def getAnnotationURL(sourceMapString: String): String = js.native
  def isMap(map: js.Any): Boolean = js.native
  def loadAnnotation(css: String): Unit = js.native
  def loadMap(file: js.Any, prev: String): String = js.native
  def loadMap(file: js.Any, prev: js.Function): String = js.native
  def loadMap(file: js.Any, prev: RawSourceMap): String = js.native
  def loadMap(file: js.Any, prev: SourceMapConsumer): String = js.native
  def loadMap(file: js.Any, prev: SourceMapGenerator): String = js.native
  def startWith(string: String, start: String): Boolean = js.native
  def withContent(): Boolean = js.native
}

