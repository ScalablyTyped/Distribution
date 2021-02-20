package typings.pad

import typings.pad.anon.Char
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Left pad */
  // tslint:disable-next-line unified-signatures
  @JSImport("pad", JSImport.Namespace)
  @js.native
  def apply(length: Double, text: String): String = js.native
  @JSImport("pad", JSImport.Namespace)
  @js.native
  def apply(length: Double, text: String, char: String): String = js.native
  @JSImport("pad", JSImport.Namespace)
  @js.native
  def apply(length: Double, text: String, options: Char): String = js.native
  /** Right pad */
  // tslint:disable-next-line unified-signatures
  @JSImport("pad", JSImport.Namespace)
  @js.native
  def apply(text: String, length: Double): String = js.native
  @JSImport("pad", JSImport.Namespace)
  @js.native
  def apply(text: String, length: Double, char: String): String = js.native
  @JSImport("pad", JSImport.Namespace)
  @js.native
  def apply(text: String, length: Double, options: Char): String = js.native
}
