package typings.memDashFsDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object memDashFsDashEditorMod {
  import typings.node.Buffer

  type Callback = js.Function1[/* err */ js.Any, js.Any]
  type Contents = String | Buffer
  type ProcessingFunc = js.Function2[/* contents */ Buffer, /* path */ String, Contents]
  type ReplacerFunc = js.Function2[/* key */ String, /* value */ js.Any, js.Any]
  type Space = String | Double
}
