package typings.next

import typings.next.anon.Lossy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `distCompiled@edgeRuntimePrimitivesStructuredCloneMod` {
  
  @JSImport("next/dist/compiled/@edge-runtime/primitives/structured-clone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def structuredClone[T](any: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("structuredClone")(any.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def structuredClone[T](any: T, options: Lossy): T = (^.asInstanceOf[js.Dynamic].applyDynamic("structuredClone")(any.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
}
