package typings.pouchdbLiveFind.PouchDB

import typings.pouchdbLiveFind.PouchDB.LiveFind.LiveFeed
import typings.pouchdbLiveFind.PouchDB.LiveFind.RequestDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database[Content /* <: js.Object */] extends js.Object {
  def liveFind(requestDef: RequestDef[Content]): LiveFeed[Content] = js.native
}

object Database {
  @scala.inline
  def apply[/* <: js.Object */ Content](liveFind: RequestDef[Content] => LiveFeed[Content]): Database[Content] = {
    val __obj = js.Dynamic.literal(liveFind = js.Any.fromFunction1(liveFind))
    __obj.asInstanceOf[Database[Content]]
  }
  @scala.inline
  implicit class DatabaseOps[Self <: Database[_], /* <: js.Object */ Content] (val x: Self with Database[Content]) extends AnyVal {
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
    def setLiveFind(value: RequestDef[Content] => LiveFeed[Content]): Self = this.set("liveFind", js.Any.fromFunction1(value))
  }
  
}

