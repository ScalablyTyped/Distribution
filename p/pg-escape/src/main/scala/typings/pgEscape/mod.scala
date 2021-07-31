package typings.pgEscape

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(fmt: String, args: js.Any*): String = (^.asInstanceOf[js.Dynamic].apply(fmt.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("pg-escape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def dollarQuotedString(`val`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dollarQuotedString")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def ident(`val`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ident")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def literal(`val`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def string(`val`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
}
