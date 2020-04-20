package typings.pgProtocol.messagesMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.pgProtocol.messagesMod.NoticeOrError because var conflicts: message. Inlined severity, code, detail, hint, position, internalPosition, internalQuery, where, schema, table, column, dataType, constraint, file, line, routine */ @JSImport("pg-protocol/dist/messages", "DatabaseError")
@js.native
class DatabaseError protected () extends Error {
  def this(message: String, length: Double, name: MessageName) = this()
  var code: js.UndefOr[String] = js.native
  var column: js.UndefOr[String] = js.native
  var constraint: js.UndefOr[String] = js.native
  var dataType: js.UndefOr[String] = js.native
  var detail: js.UndefOr[String] = js.native
  var file: js.UndefOr[String] = js.native
  var hint: js.UndefOr[String] = js.native
  var internalPosition: js.UndefOr[String] = js.native
  var internalQuery: js.UndefOr[String] = js.native
  val length: Double = js.native
  var line: js.UndefOr[String] = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  @JSName("name")
  val name_DatabaseError: MessageName = js.native
  var position: js.UndefOr[String] = js.native
  var routine: js.UndefOr[String] = js.native
  var schema: js.UndefOr[String] = js.native
  var severity: js.UndefOr[String] = js.native
  var table: js.UndefOr[String] = js.native
  var where: js.UndefOr[String] = js.native
}

