package typings.pgFormat

import typings.pgFormat.anon.Pattern
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pg-format", JSImport.Namespace)
  @js.native
  def apply(fmt: String, args: js.Any*): String = js.native
  
  @JSImport("pg-format", "config")
  @js.native
  def config(): Unit = js.native
  @JSImport("pg-format", "config")
  @js.native
  def config(config: Pattern): Unit = js.native
  
  @JSImport("pg-format", "ident")
  @js.native
  def ident(`val`: String): String = js.native
  @JSImport("pg-format", "ident")
  @js.native
  def ident(`val`: js.Array[_]): String = js.native
  @JSImport("pg-format", "ident")
  @js.native
  def ident(`val`: Boolean): String = js.native
  @JSImport("pg-format", "ident")
  @js.native
  def ident(`val`: Double): String = js.native
  @JSImport("pg-format", "ident")
  @js.native
  def ident(`val`: Date): String = js.native
  
  @JSImport("pg-format", "literal")
  @js.native
  def literal(): String = js.native
  @JSImport("pg-format", "literal")
  @js.native
  def literal(`val`: String): String = js.native
  @JSImport("pg-format", "literal")
  @js.native
  def literal(`val`: js.Array[_]): String = js.native
  @JSImport("pg-format", "literal")
  @js.native
  def literal(`val`: js.Object): String = js.native
  @JSImport("pg-format", "literal")
  @js.native
  def literal(`val`: Boolean): String = js.native
  @JSImport("pg-format", "literal")
  @js.native
  def literal(`val`: Double): String = js.native
  @JSImport("pg-format", "literal")
  @js.native
  def literal(`val`: Date): String = js.native
  
  @JSImport("pg-format", "string")
  @js.native
  def string(): String = js.native
  @JSImport("pg-format", "string")
  @js.native
  def string(`val`: String): String = js.native
  @JSImport("pg-format", "string")
  @js.native
  def string(`val`: js.Array[_]): String = js.native
  @JSImport("pg-format", "string")
  @js.native
  def string(`val`: js.Object): String = js.native
  @JSImport("pg-format", "string")
  @js.native
  def string(`val`: Boolean): String = js.native
  @JSImport("pg-format", "string")
  @js.native
  def string(`val`: Double): String = js.native
  @JSImport("pg-format", "string")
  @js.native
  def string(`val`: Date): String = js.native
  
  @JSImport("pg-format", "withArray")
  @js.native
  def withArray(fmt: String, array: js.Array[_]): String = js.native
}
