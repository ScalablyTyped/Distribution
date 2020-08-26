package typings.pollyjsPersister.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Persister extends js.Object {
  val options: StringDictionary[js.Any] = js.native
  def persist(): js.Promise[Unit] = js.native
}

object Persister {
  @scala.inline
  def apply(options: StringDictionary[js.Any], persist: () => js.Promise[Unit]): Persister = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist))
    __obj.asInstanceOf[Persister]
  }
  @scala.inline
  implicit class PersisterOps[Self <: Persister] (val x: Self) extends AnyVal {
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
    def setOptions(value: StringDictionary[js.Any]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setPersist(value: () => js.Promise[Unit]): Self = this.set("persist", js.Any.fromFunction0(value))
  }
  
}

