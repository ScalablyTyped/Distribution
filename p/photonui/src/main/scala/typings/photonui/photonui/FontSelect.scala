package typings.photonui.photonui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontSelect extends Select {
  
  def addFont(fontName: String): Unit = js.native
  
  var fonts: js.Array[String] = js.native
}
