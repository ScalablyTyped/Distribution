package typings.preloadjs.global.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.ProgressEvent")
@js.native
open class ProgressEvent protected ()
  extends StObject
     with typings.preloadjs.createjs.ProgressEvent {
  def this(loaded: Double) = this()
  def this(loaded: Double, total: Double) = this()
  
  // properties
  /* CompleteClass */
  var loaded: Double = js.native
  
  /* CompleteClass */
  var progress: Double = js.native
  
  /* CompleteClass */
  var total: Double = js.native
}
