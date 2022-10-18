package typings.nodePgMigrate

import typings.nodePgMigrate.distOperationsGeneralTypesMod._Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsPgLiteralMod {
  
  @JSImport("node-pg-migrate/dist/operations/PgLiteral", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with PgLiteral
       with _Value {
    def this(value: String) = this()
    
    /* CompleteClass */
    override val literal: /* true */ Boolean = js.native
    
    /* CompleteClass */
    override val value: String = js.native
  }
  /* static members */
  object default {
    
    @JSImport("node-pg-migrate/dist/operations/PgLiteral", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(str: String): PgLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(str.asInstanceOf[js.Any]).asInstanceOf[PgLiteral]
  }
  
  trait PgLiteral extends StObject {
    
    val literal: /* true */ Boolean
    
    val value: String
  }
  object PgLiteral {
    
    inline def apply(literal: /* true */ Boolean, value: String): PgLiteral = {
      val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PgLiteral]
    }
    
    extension [Self <: PgLiteral](x: Self) {
      
      inline def setLiteral(value: /* true */ Boolean): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
