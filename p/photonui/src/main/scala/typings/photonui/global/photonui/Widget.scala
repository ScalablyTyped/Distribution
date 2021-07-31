package typings.photonui.global.photonui

import org.scalablytyped.runtime.StringDictionary
import typings.photonui.anon.X
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("photonui.Widget")
@js.native
class Widget ()
  extends StObject
     with typings.photonui.photonui.Widget {
  
  /* CompleteClass */
  var absolutePosition: X = js.native
  
  /* CompleteClass */
  override def addClass(className: String): Unit = js.native
  
  // readonly
  /* CompleteClass */
  var contextMenu: typings.photonui.photonui.PopupWindow = js.native
  
  /* CompleteClass */
  var contextMenuName: String = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /* CompleteClass */
  override def hide(): Unit = js.native
  
  /* CompleteClass */
  var html: HTMLElement = js.native
  
  // readonly
  /* CompleteClass */
  var layoutOptions: StringDictionary[js.Any] = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  // readonly
  /* CompleteClass */
  var offsetHeight: Double = js.native
  
  /* CompleteClass */
  var offsetWidth: Double = js.native
  
  // readonly
  /* CompleteClass */
  var parent: typings.photonui.photonui.Widget = js.native
  
  /* CompleteClass */
  var parentName: String = js.native
  
  /* CompleteClass */
  override def registerCallback(id: String, wEvent: String, callback: js.Function, thisArg: js.Any): Unit = js.native
  
  /* CompleteClass */
  override def removeCallback(id: String): Unit = js.native
  
  /* CompleteClass */
  override def removeClass(className: String): Unit = js.native
  
  /* CompleteClass */
  override def show(): Unit = js.native
  
  /* CompleteClass */
  var tooltip: String = js.native
  
  /* CompleteClass */
  override def unparent(): Unit = js.native
  
  /* CompleteClass */
  var visible: Boolean = js.native
}
object Widget {
  
  @JSGlobal("photonui.Widget")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def domInsert(widget: typings.photonui.photonui.Widget): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("domInsert")(widget.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def domInsert(widget: typings.photonui.photonui.Widget, element: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("domInsert")(widget.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def domInsert(widget: typings.photonui.photonui.Widget, element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("domInsert")(widget.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def getWidget(name: String): typings.photonui.photonui.Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("getWidget")(name.asInstanceOf[js.Any]).asInstanceOf[typings.photonui.photonui.Widget]
}
