package typings.mobx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distApiTojsMod {
  
  @JSImport("mobx/dist/api/tojs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toJS[T](source: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(source.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def toJS[T](source: T, options: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
}
