package typings.obliterator

import typings.obliterator.typesMod.IntoInterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object includesMod {
  
  @JSImport("obliterator/includes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](target: IntoInterator[T], value: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
