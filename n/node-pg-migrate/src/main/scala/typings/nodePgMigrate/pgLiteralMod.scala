package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod._Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pgLiteralMod {
  
  @JSImport("node-pg-migrate/dist/operations/PgLiteral", JSImport.Default)
  @js.native
  class default protected ()
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
    
    @scala.inline
    def create(str: String): PgLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(str.asInstanceOf[js.Any]).asInstanceOf[PgLiteral]
  }
  
  trait PgLiteral extends StObject {
    
    val literal: /* true */ Boolean
    
    val value: String
  }
  object PgLiteral {
    
    @scala.inline
    def apply(literal: /* true */ Boolean, value: String): PgLiteral = {
      val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PgLiteral]
    }
    
    @scala.inline
    implicit class PgLiteralMutableBuilder[Self <: PgLiteral] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLiteral(value: /* true */ Boolean): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
