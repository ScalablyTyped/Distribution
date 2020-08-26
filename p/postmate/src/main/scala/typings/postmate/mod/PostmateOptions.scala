package typings.postmate.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options passed to the Postmate constructor
  */
@js.native
trait PostmateOptions extends js.Object {
  /**
    * An Array to add classes to the iFrame. Useful for styling
    */
  var classListArray: js.UndefOr[js.Array[String]] = js.native
  /**
    * An element to append the iFrame to. Default: document.body
    */
  var container: js.UndefOr[HTMLElement | Null] = js.native
  /**
    * An object literal to represent the default values of the child's model
    */
  var model: js.UndefOr[js.Any] = js.native
  /**
    * A name which is used for the name attribute of the created iFrame
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A URL to load in the iFrame. The origin of this URL will also be used for securing message transport
    */
  var url: String = js.native
}

object PostmateOptions {
  @scala.inline
  def apply(url: String): PostmateOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostmateOptions]
  }
  @scala.inline
  implicit class PostmateOptionsOps[Self <: PostmateOptions] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassListArrayVarargs(value: String*): Self = this.set("classListArray", js.Array(value :_*))
    @scala.inline
    def setClassListArray(value: js.Array[String]): Self = this.set("classListArray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassListArray: Self = this.set("classListArray", js.undefined)
    @scala.inline
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

