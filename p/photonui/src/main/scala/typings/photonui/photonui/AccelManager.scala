package typings.photonui.photonui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccelManager extends Base {
  
  def addAccel(id: String, keys: String, callback: js.Function): Unit = js.native
  def addAccel(id: String, keys: String, callback: js.Function, safe: Boolean): Unit = js.native
  
  def removeAccel(id: String): Unit = js.native
}
