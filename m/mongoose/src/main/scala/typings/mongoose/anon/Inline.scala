package typings.mongoose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inline extends js.Object {
  /** the results are returned in an array */
  var `inline`: js.UndefOr[Double] = js.native
  /**
    * {merge: 'collectionName'} add the results to collectionName: if
    * dups exist the new docs overwrite the old
    */
  var merge: js.UndefOr[String] = js.native
  /**
    * {reduce: 'collectionName'} add the results to collectionName: if
    * dups are detected, uses the reducer / finalize functions
    */
  var reduce: js.UndefOr[String] = js.native
  /**
    * {replace: 'collectionName'} add the results to collectionName: the
    * results replace the collection
    */
  var replace: js.UndefOr[String] = js.native
}

object Inline {
  @scala.inline
  def apply(): Inline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inline]
  }
  @scala.inline
  implicit class InlineOps[Self <: Inline] (val x: Self) extends AnyVal {
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
    def setInline(value: Double): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setMerge(value: String): Self = this.set("merge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerge: Self = this.set("merge", js.undefined)
    @scala.inline
    def setReduce(value: String): Self = this.set("reduce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReduce: Self = this.set("reduce", js.undefined)
    @scala.inline
    def setReplace(value: String): Self = this.set("replace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
  }
  
}

