package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libObjectInheritsMod {
  
  inline def apply(
    childConstructor: js.Function1[/* repeated */ Any, Unit],
    parentConstructor: js.Function1[/* repeated */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(childConstructor.asInstanceOf[js.Any], parentConstructor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/object/inherits", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
