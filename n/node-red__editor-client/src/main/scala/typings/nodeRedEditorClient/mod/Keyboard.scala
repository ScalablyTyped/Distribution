package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Keyboard extends StObject {
  
  def add(scope: String, key: String, modifiers: js.Object, ondown: String): Unit = js.native
  def add(scope: String, key: String, modifiers: js.Object, ondown: js.Function0[Unit]): Unit = js.native
  
  def formatKey(key: String): String = js.native
  def formatKey(key: String, plain: Boolean): String = js.native
  
  def getShortcut(actionName: String): js.Object = js.native
  
  def init(): Unit = js.native
  
  def remove(key: String): Unit = js.native
  def remove(key: String, modifiers: js.Object): Unit = js.native
  
  def revertToDefault(actionName: String): Unit = js.native
  
  def validateKey(key: String): Boolean = js.native
}
