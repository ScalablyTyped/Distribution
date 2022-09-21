package typings.photonui.photonui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// -----------------------------------
@js.native
trait Select
  extends StObject
     with Widget {
  
  // string (maybe)
  def addChild(widget: Widget): Unit = js.native
  def addChild(widget: Widget, layoutOptions: Any): Unit = js.native
  
  var children: js.Array[Widget] = js.native
  
  var childrenNames: js.Array[String] = js.native
  
  var iconVisible: Boolean = js.native
  
  var placeholder: String = js.native
  
  var popupHeight: Double = js.native
  
  var popupMaxHeight: Double = js.native
  
  var popupMaxWidth: Double = js.native
  
  var popupMinHeight: Double = js.native
  
  var popupMinWidth: Double = js.native
  
  // readonly
  var popupOffsetHeight: Double = js.native
  
  var popupOffsetWidth: Double = js.native
  
  // readonly
  var popupPadding: Double = js.native
  
  var popupWidth: Double = js.native
  
  var value: Any = js.native
}
