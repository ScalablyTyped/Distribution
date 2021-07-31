package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends StObject {
  
  def data(content: js.Array[js.Object]): Unit = js.native
  def data(content: js.Array[js.Object], selectFirst: Boolean): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getSelected(): js.Object = js.native
  
  def select(item: js.Object): Unit = js.native
}
