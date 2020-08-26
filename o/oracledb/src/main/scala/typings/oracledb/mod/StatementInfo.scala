package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of connection.getStatementInfo().
  */
@js.native
trait StatementInfo[T] extends js.Object {
  /** Array of strings corresponding to the unique names of the bind variables used in the SQL statement. */
  var bindNames: js.UndefOr[js.Array[String]] = js.native
  /** Extended metadata properties. */
  var metaData: js.UndefOr[js.Array[Metadata[T]]] = js.native
  /** One of the SQL Statement Type Constants. */
  var statementType: js.UndefOr[Double] = js.native
}

object StatementInfo {
  @scala.inline
  def apply[T](): StatementInfo[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatementInfo[T]]
  }
  @scala.inline
  implicit class StatementInfoOps[Self <: StatementInfo[_], T] (val x: Self with StatementInfo[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBindNamesVarargs(value: String*): Self = this.set("bindNames", js.Array(value :_*))
    @scala.inline
    def setBindNames(value: js.Array[String]): Self = this.set("bindNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindNames: Self = this.set("bindNames", js.undefined)
    @scala.inline
    def setMetaDataVarargs(value: Metadata[T]*): Self = this.set("metaData", js.Array(value :_*))
    @scala.inline
    def setMetaData(value: js.Array[Metadata[T]]): Self = this.set("metaData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetaData: Self = this.set("metaData", js.undefined)
    @scala.inline
    def setStatementType(value: Double): Self = this.set("statementType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatementType: Self = this.set("statementType", js.undefined)
  }
  
}

