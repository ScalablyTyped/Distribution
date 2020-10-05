package typings.mobx.observablearrayMod

import typings.mobx.mobxStrings.splice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IArrayWillSplice[T] extends js.Object {
  var added: js.Array[T] = js.native
  var index: Double = js.native
  var `object`: IObservableArray[T] = js.native
  var removedCount: Double = js.native
  var `type`: splice = js.native
}

object IArrayWillSplice {
  @scala.inline
  def apply[T](
    added: js.Array[T],
    index: Double,
    `object`: IObservableArray[T],
    removedCount: Double,
    `type`: splice
  ): IArrayWillSplice[T] = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removedCount = removedCount.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArrayWillSplice[T]]
  }
  @scala.inline
  implicit class IArrayWillSpliceOps[Self <: IArrayWillSplice[_], T] (val x: Self with IArrayWillSplice[T]) extends AnyVal {
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
    def setAddedVarargs(value: T*): Self = this.set("added", js.Array(value :_*))
    @scala.inline
    def setAdded(value: js.Array[T]): Self = this.set("added", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: IObservableArray[T]): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemovedCount(value: Double): Self = this.set("removedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: splice): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

