package typings.pgEscape

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(fmt: String, args: Any*): String = ^.asInstanceOf[js.Dynamic].apply(scala.List(fmt.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  @JSImport("pg-escape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dollarQuotedString(`val`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dollarQuotedString")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ident(`val`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ident")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def literal(`val`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def string(`val`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
}
