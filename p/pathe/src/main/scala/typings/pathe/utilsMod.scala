package typings.pathe

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object utilsMod {
  
  @JSImport("pathe/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filename(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("filename")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeAliases(_aliases: Record[String, String]): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAliases")(_aliases.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  
  inline def resolveAlias(path: String, aliases: Record[String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAlias")(path.asInstanceOf[js.Any], aliases.asInstanceOf[js.Any])).asInstanceOf[String]
}
