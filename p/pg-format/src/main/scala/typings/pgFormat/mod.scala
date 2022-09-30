package typings.pgFormat

import typings.pgFormat.anon.Pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(fmt: String, args: Any*): String = ^.asInstanceOf[js.Dynamic].apply(scala.List(fmt.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  @JSImport("pg-format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def config(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")().asInstanceOf[Unit]
  inline def config(config: Pattern): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def ident(`val`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ident")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def ident(`val`: js.Array[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ident")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def ident(`val`: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ident")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def ident(`val`: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ident")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def ident(`val`: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ident")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def literal(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")().asInstanceOf[String]
  inline def literal(`val`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def literal(`val`: js.Array[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def literal(`val`: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def literal(`val`: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def literal(`val`: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def literal(`val`: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def string(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("string")().asInstanceOf[String]
  inline def string(`val`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def string(`val`: js.Array[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def string(`val`: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def string(`val`: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def string(`val`: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def string(`val`: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def withArray(fmt: String, array: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withArray")(fmt.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[String]
}
