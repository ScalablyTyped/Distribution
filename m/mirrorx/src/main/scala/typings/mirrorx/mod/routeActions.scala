package typings.mirrorx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait routeActions extends StObject {
  
  def go(n: Double): RouterAction = js.native
  
  def goBack(): RouterAction = js.native
  
  def goForward(): RouterAction = js.native
  
  def push(location: js.Any): RouterAction = js.native
  def push(location: js.Any, state: js.Any): RouterAction = js.native
  
  def replace(location: js.Any): RouterAction = js.native
  def replace(location: js.Any, state: js.Any): RouterAction = js.native
}
