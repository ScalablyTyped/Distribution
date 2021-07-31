package typings.mongodbMemoryServerCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecateMod {
  
  @JSImport("mongodb-memory-server-core/lib/util/deprecate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deprecate(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deprecate")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
