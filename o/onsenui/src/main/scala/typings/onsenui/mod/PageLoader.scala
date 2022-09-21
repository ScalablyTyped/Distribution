package typings.onsenui.mod

import typings.onsenui.anon.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description PageLoader class constructor
  */
@JSImport("onsenui", "PageLoader")
@js.native
open class PageLoader protected () extends StObject {
  def this(args: Any*) = this()
  
  var internalLoader: js.Function = js.native
  
  def load(options: Page, done: js.Function): Unit = js.native
}
