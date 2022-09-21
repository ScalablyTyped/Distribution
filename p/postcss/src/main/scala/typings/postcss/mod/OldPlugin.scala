package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OldPlugin[T] extends Transformer {
  
  def apply(): Transformer = js.native
  def apply(opts: T): Transformer = js.native
  
  var postcss: Transformer = js.native
}
