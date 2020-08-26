package typings.mongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentToObjectOptions extends js.Object {
  /** depopulate any populated paths, replacing them with their original refs (defaults to false) */
  var depopulate: js.UndefOr[Boolean] = js.native
  /** whether to convert Maps to POJOs. (defaults to false) */
  var flattenMaps: js.UndefOr[Boolean] = js.native
  /** apply all getters (path and virtual getters) */
  var getters: js.UndefOr[Boolean] = js.native
  /** remove empty objects (defaults to true) */
  var minimize: js.UndefOr[Boolean] = js.native
  /**
    * A transform function to apply to the resulting document before returning
    * @param doc The mongoose document which is being converted
    * @param ret The plain object representation which has been converted
    * @param options The options in use (either schema options or the options passed inline)
    */
  var transform: js.UndefOr[js.Function3[/* doc */ js.Any, /* ret */ js.Any, /* options */ js.Any, _]] = js.native
  /** whether to include the version key (defaults to true) */
  var versionKey: js.UndefOr[Boolean] = js.native
  /** apply virtual getters (can override getters option) */
  var virtuals: js.UndefOr[Boolean] = js.native
}

object DocumentToObjectOptions {
  @scala.inline
  def apply(): DocumentToObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentToObjectOptions]
  }
  @scala.inline
  implicit class DocumentToObjectOptionsOps[Self <: DocumentToObjectOptions] (val x: Self) extends AnyVal {
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
    def setDepopulate(value: Boolean): Self = this.set("depopulate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepopulate: Self = this.set("depopulate", js.undefined)
    @scala.inline
    def setFlattenMaps(value: Boolean): Self = this.set("flattenMaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlattenMaps: Self = this.set("flattenMaps", js.undefined)
    @scala.inline
    def setGetters(value: Boolean): Self = this.set("getters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetters: Self = this.set("getters", js.undefined)
    @scala.inline
    def setMinimize(value: Boolean): Self = this.set("minimize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimize: Self = this.set("minimize", js.undefined)
    @scala.inline
    def setTransform(value: (/* doc */ js.Any, /* ret */ js.Any, /* options */ js.Any) => _): Self = this.set("transform", js.Any.fromFunction3(value))
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setVersionKey(value: Boolean): Self = this.set("versionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionKey: Self = this.set("versionKey", js.undefined)
    @scala.inline
    def setVirtuals(value: Boolean): Self = this.set("virtuals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtuals: Self = this.set("virtuals", js.undefined)
  }
  
}

