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

object PreviousMap {
  @scala.inline
  def apply(
    annotation: java.lang.String,
    consumer: js.Function0[js.Any],
    consumerCache: js.Any,
    decodeInline: js.Function1[js.Any, js.Any],
    file: java.lang.String,
    `inline`: js.Any,
    isMap: js.Function1[js.Any, scala.Boolean],
    loadAnnotation: js.Function1[js.Any, scala.Unit],
    loadMap: js.Function2[js.Any, js.Any, js.Any],
    root: java.lang.String,
    startWith: js.Function2[js.Any, js.Any, scala.Boolean],
    text: java.lang.String,
    withContent: js.Function0[scala.Boolean]
  ): PreviousMap = {
    val __obj = js.Dynamic.literal(annotation = annotation, consumer = consumer, consumerCache = consumerCache, decodeInline = decodeInline, file = file, isMap = isMap, loadAnnotation = loadAnnotation, loadMap = loadMap, root = root, startWith = startWith, text = text, withContent = withContent)
    __obj.updateDynamic("inline")(`inline`)
    __obj.asInstanceOf[PreviousMap]
  }
}

