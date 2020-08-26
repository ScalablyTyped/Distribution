package typings.mozillaReadability.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Minimum number of characters in the extracted textContent in order to
    * consider the article correctly identified. If the threshold is not met then
    * the extraction process will automatically run again with different flags.
    *
    * See implementation details at https://github.com/mozilla/readability/blob/52ab9b5c8916c306a47b2119270dcdabebf9d203/Readability.js#L1208
    *
    * Changed from wordThreshold in https://github.com/mozilla/readability/commit/3ff9a166fb27928f222c4c0722e730eda412658a
    */
  var charThreshold: js.UndefOr[Double] = js.native
  /**
    * parse() removes the class="" attribute from every element in the given
    * subtree, except those that match CLASSES_TO_PRESERVE and
    * the classesToPreserve array from the options object.
    */
  var classesToPreserve: js.UndefOr[js.Array[String]] = js.native
  /**
    * Control whether log messages are sent to the console
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * By default Readability will strip all classes from the HTML elements in the
    * processed article. By setting this to `true` the classes will be retained.
    *
    * This is a blanket alternative to `classesToPreserve`.
    *
    * Added in https://github.com/mozilla/readability/commit/2982216913af2c66b0690e88606b03116553ad92
    */
  var keepClasses: js.UndefOr[Boolean] = js.native
  /**
    * Set a maximum size on the documents that will be processed. This size is
    * checked before any parsing operations occur. If the number of elements in
    * the document exceeds this threshold then an Error will be thrown.
    *
    * See implementation details at https://github.com/mozilla/readability/blob/52ab9b5c8916c306a47b2119270dcdabebf9d203/Readability.js#L2019
    */
  var maxElemsToParse: js.UndefOr[Double] = js.native
  var nbTopCandidates: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setCharThreshold(value: Double): Self = this.set("charThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharThreshold: Self = this.set("charThreshold", js.undefined)
    @scala.inline
    def setClassesToPreserveVarargs(value: String*): Self = this.set("classesToPreserve", js.Array(value :_*))
    @scala.inline
    def setClassesToPreserve(value: js.Array[String]): Self = this.set("classesToPreserve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassesToPreserve: Self = this.set("classesToPreserve", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setKeepClasses(value: Boolean): Self = this.set("keepClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepClasses: Self = this.set("keepClasses", js.undefined)
    @scala.inline
    def setMaxElemsToParse(value: Double): Self = this.set("maxElemsToParse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxElemsToParse: Self = this.set("maxElemsToParse", js.undefined)
    @scala.inline
    def setNbTopCandidates(value: Double): Self = this.set("nbTopCandidates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNbTopCandidates: Self = this.set("nbTopCandidates", js.undefined)
  }
  
}

