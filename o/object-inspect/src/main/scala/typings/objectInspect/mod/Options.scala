package typings.objectInspect.mod

import typings.objectInspect.objectInspectStrings.double
import typings.objectInspect.objectInspectStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inspection options
  */
@js.native
trait Options extends js.Object {
  /**
    * Maximum depth of the inspection. Default: `5`.
    */
  var depth: js.UndefOr[Double] = js.native
  /**
    * Must be "single" or "double", if present.
    */
  var quoteStyle: js.UndefOr[single | double] = js.native
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
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    @scala.inline
    def setQuoteStyle(value: single | double): Self = this.set("quoteStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuoteStyle: Self = this.set("quoteStyle", js.undefined)
  }
  
}

