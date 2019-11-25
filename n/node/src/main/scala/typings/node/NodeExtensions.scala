package typings.node

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeExtensions
  extends /* ext */ StringDictionary[js.Function2[/* m */ NodeModule, /* filename */ java.lang.String, _]] {
  def `.js`(m: NodeModule, filename: java.lang.String): js.Any
  def `.json`(m: NodeModule, filename: java.lang.String): js.Any
  def `.node`(m: NodeModule, filename: java.lang.String): js.Any
}

object NodeExtensions {
  @scala.inline
  def apply(
    `.js`: (NodeModule, java.lang.String) => js.Any,
    `.json`: (NodeModule, java.lang.String) => js.Any,
    `.node`: (NodeModule, java.lang.String) => js.Any,
    StringDictionary: /* ext */ StringDictionary[js.Function2[/* m */ NodeModule, /* filename */ java.lang.String, _]] = null
  ): NodeExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".js")(js.Any.fromFunction2(`.js`))
    __obj.updateDynamic(".json")(js.Any.fromFunction2(`.json`))
    __obj.updateDynamic(".node")(js.Any.fromFunction2(`.node`))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[NodeExtensions]
  }
}

