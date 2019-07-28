package typings.memDashFsDashEditor

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object memDashFsDashEditorMod {
  type Callback = js.Function1[/* err */ js.Any, js.Any]
  type Contents = String | Buffer
  type ProcessingFunc = js.Function2[/* contents */ Buffer, /* path */ String, Contents]
  type ReplacerFunc = js.Function2[/* key */ String, /* value */ js.Any, js.Any]
  type Space = String | Double
}
