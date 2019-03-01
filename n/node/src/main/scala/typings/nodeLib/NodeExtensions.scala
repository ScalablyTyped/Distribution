package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeExtensions
  extends /* ext */ org.scalablytyped.runtime.StringDictionary[js.Function2[/* m */ NodeModule, /* filename */ java.lang.String, _]] {
  def `.js`(m: NodeModule, filename: java.lang.String): js.Any
  def `.json`(m: NodeModule, filename: java.lang.String): js.Any
  def `.node`(m: NodeModule, filename: java.lang.String): js.Any
}

object NodeExtensions {
  @scala.inline
  def apply(
    `.js`: js.Function2[NodeModule, java.lang.String, js.Any],
    `.json`: js.Function2[NodeModule, java.lang.String, js.Any],
    `.node`: js.Function2[NodeModule, java.lang.String, js.Any],
    StringDictionary: /* ext */ org.scalablytyped.runtime.StringDictionary[js.Function2[/* m */ NodeModule, /* filename */ java.lang.String, _]] = null
  ): NodeExtensions = {
    val __obj = js.Dynamic.literal(`.js` = `.js`, `.json` = `.json`, `.node` = `.node`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[NodeExtensions]
  }
}

