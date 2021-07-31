package typings.preloadjs.global.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.ErrorEvent")
@js.native
class ErrorEvent ()
  extends StObject
     with typings.preloadjs.createjs.ErrorEvent {
  def this(title: String) = this()
  def this(title: String, message: String) = this()
  def this(title: Unit, message: String) = this()
  def this(title: String, message: String, data: js.Object) = this()
  def this(title: String, message: Unit, data: js.Object) = this()
  def this(title: Unit, message: String, data: js.Object) = this()
  def this(title: Unit, message: Unit, data: js.Object) = this()
  
  // properties
  /* CompleteClass */
  var data: js.Object = js.native
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var title: String = js.native
}
