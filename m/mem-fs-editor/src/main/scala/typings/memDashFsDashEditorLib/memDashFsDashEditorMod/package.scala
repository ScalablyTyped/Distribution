package typings
package memDashFsDashEditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object memDashFsDashEditorMod {
  type Callback = js.Function1[/* err */ js.Any, js.Any]
  type Contents = java.lang.String | nodeLib.Buffer
  type ProcessingFunc = js.Function2[/* contents */ nodeLib.Buffer, /* path */ java.lang.String, Contents]
  type ReplacerFunc = js.Function2[/* key */ java.lang.String, /* value */ js.Any, js.Any]
  type Space = java.lang.String | scala.Double
}
