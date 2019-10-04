package typings.pgDashPromise.pgDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// helpers.Column class;
// API: http://vitaly-t.github.io/pg-promise/helpers.Column.html
@JSImport("pg-promise", "Column")
@js.native
class Column protected () extends _QueryColumns {
  def this(col: String) = this()
  def this(col: IColumnConfig) = this()
  val cast: String = js.native
  val castText: String = js.native
  val cnd: Boolean = js.native
  val `def`: js.Any = js.native
  val escapedName: String = js.native
  val mod: FormattingFilter = js.native
  // these are all read-only:
  val name: String = js.native
  val prop: String = js.native
  def init(value: js.Any): js.Any = js.native
  def skip(name: String): Boolean = js.native
  def toString(level: Double): String = js.native
}

