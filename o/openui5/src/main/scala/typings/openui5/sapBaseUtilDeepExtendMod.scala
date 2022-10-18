package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapBaseUtilDeepExtendMod {
  
  @JSImport("sap/base/util/deepExtend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    /**
    * The object that will receive new properties
    */
  target: js.Object,
    /**
    * One or more objects which get merged into the target object
    */
  source: js.Object*
  ): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(target.asInstanceOf[js.Any]).`++`(source.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Object]
}
