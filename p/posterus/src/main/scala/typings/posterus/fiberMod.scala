package typings.posterus

import typings.posterus.mod.Future
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fiberMod {
  
  @JSImport("posterus/fiber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fiber(iterator: IterableIterator[Any]): Future[Any, js.Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("fiber")(iterator.asInstanceOf[js.Any]).asInstanceOf[Future[Any, js.Error]]
}
