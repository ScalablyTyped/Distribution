package typings
package mochaLib.MochaNs.reportersNs.BaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default symbol map
  *
  * @see https://mochajs.org/api/module-base#.symbols
  */
trait SymbolMap
  extends /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String] {
  var bang: java.lang.String
  var comma: java.lang.String
  var dot: java.lang.String
  var err: java.lang.String
  var ok: java.lang.String
}

object SymbolMap {
  @scala.inline
  def apply(
    bang: java.lang.String,
    comma: java.lang.String,
    dot: java.lang.String,
    err: java.lang.String,
    ok: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): SymbolMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bang")(bang)
    __obj.updateDynamic("comma")(comma)
    __obj.updateDynamic("dot")(dot)
    __obj.updateDynamic("err")(err)
    __obj.updateDynamic("ok")(ok)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SymbolMap]
  }
}

