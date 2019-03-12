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
    consumer: () => js.Any,
    consumerCache: js.Any,
    decodeInline: js.Any => js.Any,
    file: java.lang.String,
    `inline`: js.Any,
    isMap: js.Any => scala.Boolean,
    loadAnnotation: js.Any => scala.Unit,
    loadMap: (js.Any, js.Any) => js.Any,
    root: java.lang.String,
    startWith: (js.Any, js.Any) => scala.Boolean,
    text: java.lang.String,
    withContent: () => scala.Boolean
  ): PreviousMap = {
    val __obj = js.Dynamic.literal(annotation = annotation, consumer = js.Any.fromFunction0(consumer), consumerCache = consumerCache, decodeInline = js.Any.fromFunction1(decodeInline), file = file, isMap = js.Any.fromFunction1(isMap), loadAnnotation = js.Any.fromFunction1(loadAnnotation), loadMap = js.Any.fromFunction2(loadMap), root = root, startWith = js.Any.fromFunction2(startWith), text = text, withContent = js.Any.fromFunction0(withContent))
    __obj.updateDynamic("inline")(`inline`)
    __obj.asInstanceOf[PreviousMap]
  }
}

