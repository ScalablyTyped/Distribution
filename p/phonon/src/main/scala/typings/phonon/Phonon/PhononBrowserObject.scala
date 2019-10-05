package typings.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononBrowserObject extends js.Object {
  var name: String
  var version: String
}

object PhononBrowserObject {
  @scala.inline
  def apply(name: String, version: String): PhononBrowserObject = {
    val __obj = js.Dynamic.literal(name = name, version = version)
  
    __obj.asInstanceOf[PhononBrowserObject]
  }
}

