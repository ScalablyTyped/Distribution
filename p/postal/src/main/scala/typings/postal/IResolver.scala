package typings.postal

import typings.postal.anon.Binding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResolver extends StObject {
  
  def compare(binding: String, topic: String, headerOptions: js.Object): Boolean = js.native
  
  def purge(): Unit = js.native
  def purge(options: Binding): Unit = js.native
  
  def reset(): Unit = js.native
}
