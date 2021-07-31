package typings.parse.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Analytics {
  
  @JSImport("parse", "Analytics")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def track(name: String, dimensions: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(name.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
}
