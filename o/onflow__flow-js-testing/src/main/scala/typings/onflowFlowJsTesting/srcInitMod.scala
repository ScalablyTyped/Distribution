package typings.onflowFlowJsTesting

import typings.onflowFlowJsTesting.anon.Pkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcInitMod {
  
  @JSImport("@onflow/flow-js-testing/src/init", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(bastPath: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(bastPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def init(bastPath: String, options: Pkey): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(bastPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
}
