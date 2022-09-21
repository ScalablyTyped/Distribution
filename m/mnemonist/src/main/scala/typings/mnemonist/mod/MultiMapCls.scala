package typings.mnemonist.mod

import typings.std.Set
import typings.std.SetConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("mnemonist", "MultiMap")
@js.native
open class MultiMapCls[K, V] protected ()
  extends StObject
     with typings.mnemonist.multiMapMod.MultiMap[K, V, Set[V]] {
  def this(container: SetConstructor) = this()
}
