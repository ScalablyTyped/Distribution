package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/issue-collection/
@js.native
trait IssueCollection extends js.Object {
  var name: String = js.native
  def append(uri: String, issues: js.Array[Issue]): Unit = js.native
  def clear(): Unit = js.native
  def dispose(): Unit = js.native
  def get(uri: String): Unit = js.native
  def has(uri: String): Unit = js.native
  def remove(uri: String): Unit = js.native
  def set(uri: String, issues: js.Array[Issue]): Unit = js.native
}

object IssueCollection {
  @scala.inline
  def apply(
    append: (String, js.Array[Issue]) => Unit,
    clear: () => Unit,
    dispose: () => Unit,
    get: String => Unit,
    has: String => Unit,
    name: String,
    remove: String => Unit,
    set: (String, js.Array[Issue]) => Unit
  ): IssueCollection = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append), clear = js.Any.fromFunction0(clear), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), name = name.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[IssueCollection]
  }
  @scala.inline
  implicit class IssueCollectionOps[Self <: IssueCollection] (val x: Self) extends AnyVal {
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
    def setAppend(value: (String, js.Array[Issue]) => Unit): Self = this.set("append", js.Any.fromFunction2(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setGet(value: String => Unit): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setHas(value: String => Unit): Self = this.set("has", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: String => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (String, js.Array[Issue]) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
  
}

