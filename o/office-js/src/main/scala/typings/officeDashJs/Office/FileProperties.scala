package typings.officeDashJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileProperties extends js.Object {
  /**
    * File's URL
    */
  var url: String
}

object FileProperties {
  @scala.inline
  def apply(url: String): FileProperties = {
    val __obj = js.Dynamic.literal(url = url)
  
    __obj.asInstanceOf[FileProperties]
  }
}

