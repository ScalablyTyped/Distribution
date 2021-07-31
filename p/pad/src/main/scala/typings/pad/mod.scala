package typings.pad

import typings.pad.anon.Char
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Left pad */
  // tslint:disable-next-line unified-signatures
  @scala.inline
  def apply(length: Double, text: String): String = (^.asInstanceOf[js.Dynamic].apply(length.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(length: Double, text: String, char: String): String = (^.asInstanceOf[js.Dynamic].apply(length.asInstanceOf[js.Any], text.asInstanceOf[js.Any], char.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(length: Double, text: String, options: Char): String = (^.asInstanceOf[js.Dynamic].apply(length.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  /** Right pad */
  // tslint:disable-next-line unified-signatures
  @scala.inline
  def apply(text: String, length: Double): String = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(text: String, length: Double, char: String): String = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], length.asInstanceOf[js.Any], char.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(text: String, length: Double, options: Char): String = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("pad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
