package typings.nodeFibers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fibers", JSImport.Namespace)
  @js.native
  def apply(fn: js.Function): Fiber = js.native
  
  @JSImport("fibers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fibers", "current")
  @js.native
  def current: Fiber = js.native
  @scala.inline
  def current_=(x: Fiber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
  
  @JSImport("fibers", "yield")
  @js.native
  def `yield`(): js.Any = js.native
  @JSImport("fibers", "yield")
  @js.native
  def `yield`(value: js.Any): js.Any = js.native
}
