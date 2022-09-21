package typings.photonui.global.photonui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("photonui.MouseManager")
@js.native
open class MouseManager ()
  extends StObject
     with typings.photonui.photonui.MouseManager {
  def this(element: typings.photonui.photonui.Widget) = this()
  def this(element: HTMLElement) = this()
  def this(params: StringDictionary[Any]) = this()
  def this(element: Unit, params: StringDictionary[Any]) = this()
  def this(element: typings.photonui.photonui.Widget, params: StringDictionary[Any]) = this()
  def this(element: HTMLElement, params: StringDictionary[Any]) = this()
  
  /* CompleteClass */
  var action: String = js.native
  
  // readonly
  /* CompleteClass */
  var btnLeft: Boolean = js.native
  
  // readonly
  /* CompleteClass */
  var btnMiddle: Boolean = js.native
  
  // readonly
  /* CompleteClass */
  var btnRight: Boolean = js.native
  
  // readonly
  /* CompleteClass */
  var button: String = js.native
  
  // readonly
  /* CompleteClass */
  var deltaX: Double = js.native
  
  // readonly
  /* CompleteClass */
  var deltaY: Double = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /* CompleteClass */
  var element: HTMLElement = js.native
  
  // readonly
  /* CompleteClass */
  var pageX: Double = js.native
  
  // readonly
  /* CompleteClass */
  var pageY: Double = js.native
  
  /* CompleteClass */
  override def registerCallback(id: String, wEvent: String, callback: js.Function, thisArg: Any): Unit = js.native
  
  /* CompleteClass */
  override def removeCallback(id: String): Unit = js.native
  
  /* CompleteClass */
  var threshold: Double = js.native
  
  // readonly
  /* CompleteClass */
  var x: Double = js.native
  
  // readonly
  /* CompleteClass */
  var y: Double = js.native
}
