package typings.photonui.photonui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontSelect
  extends StObject
     with Select {
  
  def addFont(fontName: String): Unit = js.native
  
  var fonts: js.Array[String] = js.native
}
