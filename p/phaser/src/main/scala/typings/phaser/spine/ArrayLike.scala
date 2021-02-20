package typings.phaser.spine

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayLike[T] extends /* n */ NumberDictionary[T] {
  
  var length: Double = js.native
}
object ArrayLike {
  
  @scala.inline
  def apply[T](length: Double): ArrayLike[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayLike[T]]
  }
  
  @scala.inline
  implicit class ArrayLikeMutableBuilder[Self <: ArrayLike[_], T] (val x: Self with ArrayLike[T]) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
