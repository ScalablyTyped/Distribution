package typings.obliterator

import typings.obliterator.typesMod.IntoInterator
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chainMod {
  
  @JSImport("obliterator/chain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](iterables: IntoInterator[T]*): IterableIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(iterables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[IterableIterator[T]]
}
