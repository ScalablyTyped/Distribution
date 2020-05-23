package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/issue-collection/
trait IssueCollection extends js.Object {
  var name: String
  def append(uri: String, issues: js.Array[Issue]): Unit
  def clear(): Unit
  def dispose(): Unit
  def get(uri: String): Unit
  def has(uri: String): Unit
  def remove(uri: String): Unit
  def set(uri: String, issues: js.Array[Issue]): Unit
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
}

