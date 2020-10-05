package typings.node.anon

import typings.node.perfHooksMod.EntryType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Buffered extends js.Object {
  var buffered: js.UndefOr[Boolean] = js.native
  var entryTypes: js.Array[EntryType] = js.native
}

object Buffered {
  @scala.inline
  def apply(entryTypes: js.Array[EntryType]): Buffered = {
    val __obj = js.Dynamic.literal(entryTypes = entryTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffered]
  }
  @scala.inline
  implicit class BufferedOps[Self <: Buffered] (val x: Self) extends AnyVal {
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
    def setEntryTypesVarargs(value: EntryType*): Self = this.set("entryTypes", js.Array(value :_*))
    @scala.inline
    def setEntryTypes(value: js.Array[EntryType]): Self = this.set("entryTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuffered(value: Boolean): Self = this.set("buffered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuffered: Self = this.set("buffered", js.undefined)
  }
  
}

