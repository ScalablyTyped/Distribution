package typings.postgres.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toPascal {
  
  /**
    * Convert a snake_case string to PascalCase.
    * @param str The string from snake_case to convert
    * @returns The new string in PascalCase
    */
  inline def apply(str: String): String = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("postgres", "toPascal")
  @js.native
  val ^ : js.Any = js.native
  
  object column {
    
    @JSImport("postgres", "toPascal.column")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object value {
    
    @JSImport("postgres", "toPascal.value")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(str: Any, column: Column[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(str.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
