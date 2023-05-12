package typings.postgres.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Convert snake_case to and from camelCase.
  */
object camel {
  
  object column {
    
    @JSImport("postgres", "camel.column")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def to(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("to")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object value {
    
    @JSImport("postgres", "camel.value")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(str: Any, column: Column[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(str.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
