package typings.nodePolyglot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polyglot extends js.Object {
  
  def clear(): Unit = js.native
  
  def extend(phrases: js.Any): Unit = js.native
  def extend(phrases: js.Any, prefix: String): Unit = js.native
  
  def has(phrase: String): Boolean = js.native
  
  def locale(): String = js.native
  def locale(locale: String): String = js.native
  
  def replace(phrases: js.Any): Unit = js.native
  
  def t(phrase: String): String = js.native
  def t(phrase: String, options: Double): String = js.native
  def t(phrase: String, options: InterpolationOptions): String = js.native
  
  def unset(phrases: js.Any): Unit = js.native
  def unset(phrases: js.Any, prefix: String): Unit = js.native
}
