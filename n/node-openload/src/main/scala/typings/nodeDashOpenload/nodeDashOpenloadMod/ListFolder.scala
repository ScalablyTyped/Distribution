package typings.nodeDashOpenload.nodeDashOpenloadMod

import typings.nodeDashOpenload.Anon_ContenttypeCstatus
import typings.nodeDashOpenload.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFolder extends js.Object {
  var files: js.Array[Anon_ContenttypeCstatus]
  var folders: js.Array[Anon_Id]
}

object ListFolder {
  @scala.inline
  def apply(files: js.Array[Anon_ContenttypeCstatus], folders: js.Array[Anon_Id]): ListFolder = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], folders = folders.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListFolder]
  }
}

