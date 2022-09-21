package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RejectablePromise2[T, E]
  extends StObject
     with IPromise2[T, E] {
  
  def pending(): Boolean = js.native
  
  def reject(): Unit = js.native
  def reject(reason: E): Unit = js.native
  
  def rejected(): Boolean = js.native
  
  def resolved(): Boolean = js.native
}
