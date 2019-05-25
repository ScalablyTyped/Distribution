package typings
package olLib.sourceRasterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var lib: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var operation: js.UndefOr[Operation] = js.undefined
  var operationType: js.UndefOr[olLib.olLibStrings.pixel | olLib.olLibStrings.image] = js.undefined
  var sources: js.Array[_]
  var threads: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    sources: js.Array[_],
    lib: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    operation: Operation = null,
    operationType: olLib.olLibStrings.pixel | olLib.olLibStrings.image = null,
    threads: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(sources = sources)
    if (lib != null) __obj.updateDynamic("lib")(lib)
    if (operation != null) __obj.updateDynamic("operation")(operation)
    if (operationType != null) __obj.updateDynamic("operationType")(operationType.asInstanceOf[js.Any])
    if (threads != null) __obj.updateDynamic("threads")(threads.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

