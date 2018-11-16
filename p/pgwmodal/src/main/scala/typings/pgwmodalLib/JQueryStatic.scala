package typings
package pgwmodalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("pgwModal")
  var pgwModal_Original: PgwModalMethod = js.native
  def pgwModal(action: java.lang.String): js.Any = js.native
  def pgwModal(option: PgwModalOption): scala.Boolean = js.native
  @JSName("pgwModal")
  def pgwModal_close(action: pgwmodalLib.pgwmodalLibStrings.close): scala.Boolean = js.native
  @JSName("pgwModal")
  def pgwModal_getData(action: pgwmodalLib.pgwmodalLibStrings.getData): js.Any = js.native
  @JSName("pgwModal")
  def pgwModal_isOpen(action: pgwmodalLib.pgwmodalLibStrings.isOpen): scala.Boolean = js.native
  @JSName("pgwModal")
  def pgwModal_reposition(action: pgwmodalLib.pgwmodalLibStrings.reposition): scala.Boolean = js.native
}

