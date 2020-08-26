package typings.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeErrorOptions extends js.Object {
  /**
    * An index inside a node's string that should be highlighted as source
    * of error.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Plugin name that created this error. PostCSS will set it automatically.
    */
  var plugin: js.UndefOr[String] = js.native
  /**
    * A word inside a node's string, that should be highlighted as source
    * of error.
    */
  var word: js.UndefOr[String] = js.native
}

object NodeErrorOptions {
  @scala.inline
  def apply(): NodeErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeErrorOptions]
  }
  @scala.inline
  implicit class NodeErrorOptionsOps[Self <: NodeErrorOptions] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setPlugin(value: String): Self = this.set("plugin", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugin: Self = this.set("plugin", js.undefined)
    @scala.inline
    def setWord(value: String): Self = this.set("word", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWord: Self = this.set("word", js.undefined)
  }
  
}

