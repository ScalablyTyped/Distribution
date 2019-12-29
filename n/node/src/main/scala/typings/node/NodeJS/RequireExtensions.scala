package typings.node.NodeJS

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequireExtensions
  extends /* ext */ StringDictionary[js.Function2[/* m */ Module, /* filename */ String, _]] {
  @JSName(".js")
  def Dotjs(m: Module, filename: String): js.Any
  @JSName(".json")
  def Dotjson(m: Module, filename: String): js.Any
  @JSName(".node")
  def Dotnode(m: Module, filename: String): js.Any
}

object RequireExtensions {
  @scala.inline
  def apply(
    Dotjs: (Module, String) => js.Any,
    Dotjson: (Module, String) => js.Any,
    Dotnode: (Module, String) => js.Any,
    StringDictionary: /* ext */ StringDictionary[js.Function2[/* m */ Module, /* filename */ String, _]] = null
  ): RequireExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".js")(js.Any.fromFunction2(Dotjs))
    __obj.updateDynamic(".json")(js.Any.fromFunction2(Dotjson))
    __obj.updateDynamic(".node")(js.Any.fromFunction2(Dotnode))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RequireExtensions]
  }
}

