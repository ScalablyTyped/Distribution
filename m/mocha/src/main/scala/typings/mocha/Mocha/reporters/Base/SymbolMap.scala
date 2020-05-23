package typings.mocha.Mocha.reporters.Base

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default symbol map
  *
  * @see https://mochajs.org/api/module-base#.symbols
  */
trait SymbolMap extends /* key */ StringDictionary[String] {
  var bang: String
  var comma: String
  var dot: String
  var err: String
  var ok: String
}

object SymbolMap {
  @scala.inline
  def apply(
    bang: String,
    comma: String,
    dot: String,
    err: String,
    ok: String,
    StringDictionary: /* name */ StringDictionary[String] = null
  ): SymbolMap = {
    val __obj = js.Dynamic.literal(bang = bang.asInstanceOf[js.Any], comma = comma.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], err = err.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SymbolMap]
  }
}

