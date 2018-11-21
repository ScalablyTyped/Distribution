package typings
package parseLib.ParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped Object */ @JSGlobal("Parse.Config")
@js.native
class Config () extends js.Object {
  def escape(attr: java.lang.String): js.Any = js.native
  def get(attr: java.lang.String): js.Any = js.native
}

/* RemoveDifficultInheritance: 
- Dropped Object */ @JSGlobal("Parse.Config")
@js.native
object Config extends js.Object {
  def current(): parseLib.ParseNs.Config = js.native
  def get(): stdLib.Promise[parseLib.ParseNs.Config] = js.native
  def get(options: parseLib.ParseNs.SuccessFailureOptions): stdLib.Promise[parseLib.ParseNs.Config] = js.native
}

