package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends StObject {
  
  def apply(value: Any): /* asserts value */ Boolean = js.native
  def apply(value: Any, message: String): /* asserts value */ Boolean = js.native
  def apply(value: Any, message: js.Error): /* asserts value */ Boolean = js.native
}
