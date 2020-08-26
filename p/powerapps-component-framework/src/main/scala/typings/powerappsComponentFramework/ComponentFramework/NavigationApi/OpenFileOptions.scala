package typings.powerappsComponentFramework.ComponentFramework.NavigationApi

import typings.powerappsComponentFramework.ComponentFramework.NavigationApi.Types.OpenFileMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for open file options.
  */
@js.native
trait OpenFileOptions extends js.Object {
  /**
    * Specify whether to open or save the file
    * Values:
    *   1 - open
    *   2 - save
    */
  var openMode: OpenFileMode = js.native
}

object OpenFileOptions {
  @scala.inline
  def apply(openMode: OpenFileMode): OpenFileOptions = {
    val __obj = js.Dynamic.literal(openMode = openMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenFileOptions]
  }
  @scala.inline
  implicit class OpenFileOptionsOps[Self <: OpenFileOptions] (val x: Self) extends AnyVal {
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
    def setOpenMode(value: OpenFileMode): Self = this.set("openMode", value.asInstanceOf[js.Any])
  }
  
}

