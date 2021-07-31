package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsMod {
  
  @JSImport("ol/functions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def FALSE(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("FALSE")().asInstanceOf[Boolean]
  
  @scala.inline
  def TRUE(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TRUE")().asInstanceOf[Boolean]
  
  @scala.inline
  def VOID(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("VOID")().asInstanceOf[Unit]
  
  @scala.inline
  def memoizeOne[ReturnType](fn: js.Function1[/* p0 */ js.Any, ReturnType]): js.Function1[/* p0 */ js.Any, ReturnType] = ^.asInstanceOf[js.Dynamic].applyDynamic("memoizeOne")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* p0 */ js.Any, ReturnType]]
}
