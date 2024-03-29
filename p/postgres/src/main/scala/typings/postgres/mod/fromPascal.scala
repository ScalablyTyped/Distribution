package typings.postgres.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromPascal {
  
  /**
    * Convert a PascalCase string to snake_case.
    * @param str The string from snake_case to convert
    * @returns The new string in snake_case
    */
  inline def apply(str: String): String = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("postgres", "fromPascal")
  @js.native
  val ^ : js.Any = js.native
  
  object column {
    
    @JSImport("postgres", "fromPascal.column")
    @js.native
    val ^ : js.Any = js.native
    
    inline def to(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("to")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
