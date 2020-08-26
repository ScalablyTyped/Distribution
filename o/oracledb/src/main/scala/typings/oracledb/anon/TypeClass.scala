package typings.oracledb.anon

import typings.oracledb.mod.DBObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeClass[T] extends js.Object {
  /** One of the DB_TYPE constants. */
  var `type`: Double = js.native
  /** Set if the value of type is a DBObject. */
  var typeClass: js.UndefOr[DBObjectClass[T]] = js.native
  /** Type, such as 'VARCHAR2' or 'NUMBER'. */
  var typeName: String = js.native
}

object TypeClass {
  @scala.inline
  def apply[T](`type`: Double, typeName: String): TypeClass[T] = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeClass[T]]
  }
  @scala.inline
  implicit class TypeClassOps[Self <: TypeClass[_], T] (val x: Self with TypeClass[T]) extends AnyVal {
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
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeName(value: String): Self = this.set("typeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeClass(value: DBObjectClass[T]): Self = this.set("typeClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeClass: Self = this.set("typeClass", js.undefined)
  }
  
}

