package typings.parseConflictJson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parse-conflict-json", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Parse a JSON string that has git merge conflicts, resolving if possible.
    * If the JSON is valid, it just does JSON.parse as normal.
    * If either side of the conflict is invalid JSON, then an error is thrown for that.
    */
  def apply(text: String): js.Any = js.native
  def apply(text: String, reviver: js.UndefOr[scala.Nothing], prefer: Prefer): js.Any = js.native
  def apply(
    text: String,
    reviver: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _]
  ): js.Any = js.native
  def apply(
    text: String,
    reviver: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _],
    prefer: Prefer
  ): js.Any = js.native
}
