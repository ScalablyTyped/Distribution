package typings.postmate.postmateMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options passed to the Postmate constructor
  */
trait PostmateOptions extends js.Object {
  /**
    * An Array to add classes to the iFrame. Useful for styling
    */
  var classListArray: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An element to append the iFrame to. Default: document.body
    */
  var container: js.UndefOr[HTMLElement | Null] = js.undefined
  /**
    * An object literal to represent the default values of the child's model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /**
    * A URL to load in the iFrame. The origin of this URL will also be used for securing message transport
    */
  var url: String
}

object PostmateOptions {
  @scala.inline
  def apply(
    url: String,
    classListArray: js.Array[String] = null,
    container: HTMLElement = null,
    model: js.Any = null
  ): PostmateOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (classListArray != null) __obj.updateDynamic("classListArray")(classListArray.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostmateOptions]
  }
}

