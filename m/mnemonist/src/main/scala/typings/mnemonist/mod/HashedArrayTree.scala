package typings.mnemonist.mod

import typings.mnemonist.hashedArrayTreeMod.HashedArrayTreeOptions
import typings.mnemonist.hashedArrayTreeMod.default
import typings.mnemonist.typesMod.IArrayLikeConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "HashedArrayTree")
@js.native
open class HashedArrayTree[T] protected () extends default[T] {
  // Constructor
  def this(ArrayClass: IArrayLikeConstructor, capacity: Double) = this()
  def this(ArrayClass: IArrayLikeConstructor, options: HashedArrayTreeOptions) = this()
}
