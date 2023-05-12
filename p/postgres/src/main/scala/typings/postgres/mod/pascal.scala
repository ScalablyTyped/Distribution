package typings.postgres.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Convert snake_case to and from PascalCase.
  */
object pascal {
  
  object column {
    
    @JSImport("postgres", "pascal.column")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def to(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("to")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object value {
    
    @JSImport("postgres", "pascal.value")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(str: Any, column: Column[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(str.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
