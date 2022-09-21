package typings.photonui.global.photonui

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("photonui.Base")
@js.native
open class Base ()
  extends StObject
     with typings.photonui.photonui.Base {
  def this(params: StringDictionary[Any]) = this()
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /* CompleteClass */
  override def registerCallback(id: String, wEvent: String, callback: js.Function, thisArg: Any): Unit = js.native
  
  /* CompleteClass */
  override def removeCallback(id: String): Unit = js.native
}
