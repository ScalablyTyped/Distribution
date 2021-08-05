package typings.posterus

import typings.posterus.mod.Future
import typings.std.Error
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fiberMod {
  
  @JSImport("posterus/fiber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fiber(iterator: IterableIterator[js.Any]): Future[js.Any, Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("fiber")(iterator.asInstanceOf[js.Any]).asInstanceOf[Future[js.Any, Error]]
}
