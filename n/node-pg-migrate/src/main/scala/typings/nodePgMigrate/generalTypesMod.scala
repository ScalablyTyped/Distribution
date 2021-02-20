package typings.nodePgMigrate

import org.scalablytyped.runtime.TopLevel
import typings.nodePgMigrate.anon.ZzIGNOREME
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generalTypesMod {
  
  @js.native
  trait CascadeOption extends StObject {
    
    var cascade: js.UndefOr[Boolean] = js.native
  }
  object CascadeOption {
    
    @scala.inline
    def apply(): CascadeOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CascadeOption]
    }
    
    @scala.inline
    implicit class CascadeOptionMutableBuilder[Self <: CascadeOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCascade(value: Boolean): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
    }
  }
  
  type DropOptions = IfExistsOption with CascadeOption
  
  @js.native
  trait IfExistsOption extends StObject {
    
    var ifExists: js.UndefOr[Boolean] = js.native
  }
  object IfExistsOption {
    
    @scala.inline
    def apply(): IfExistsOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IfExistsOption]
    }
    
    @scala.inline
    implicit class IfExistsOptionMutableBuilder[Self <: IfExistsOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIfExists(value: Boolean): Self = StObject.set(x, "ifExists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfExistsUndefined: Self = StObject.set(x, "ifExists", js.undefined)
    }
  }
  
  @js.native
  trait IfNotExistsOption extends StObject {
    
    var ifNotExists: js.UndefOr[Boolean] = js.native
  }
  object IfNotExistsOption {
    
    @scala.inline
    def apply(): IfNotExistsOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IfNotExistsOption]
    }
    
    @scala.inline
    implicit class IfNotExistsOptionMutableBuilder[Self <: IfNotExistsOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIfNotExists(value: Boolean): Self = StObject.set(x, "ifNotExists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfNotExistsUndefined: Self = StObject.set(x, "ifNotExists", js.undefined)
    }
  }
  
  type LiteralUnion[T /* <: String */] = T | (String with ZzIGNOREME)
  
  type Name = String | typings.nodePgMigrate.anon.Name
  
  type Nullable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] | null}
    */ typings.nodePgMigrate.nodePgMigrateStrings.Nullable with TopLevel[T]
  
  /* Inlined node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.PublicPart<node-pg-migrate.node-pg-migrate/dist/operations/PgLiteral.default> */
  @js.native
  trait PgLiteralValue extends _Value {
    
    @JSName("constructor")
    var constructor_Original: js.Function1[/* value */ String, js.Any] = js.native
    
    var create: js.UndefOr[js.Any] = js.native
    
    var literal: /* true */ Boolean = js.native
    
    @JSName("toString")
    var toString_Original: js.Function0[String] = js.native
    
    var value: String = js.native
  }
  
  type PublicPart[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typings.nodePgMigrate.nodePgMigrateStrings.PublicPart with TopLevel[T]
  
  type Type = String | typings.nodePgMigrate.anon.Type
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - scala.Boolean
    - java.lang.String
    - scala.Double
    - typings.nodePgMigrate.pgLiteralMod.default
    - typings.nodePgMigrate.generalTypesMod.PgLiteralValue
    - js.Array[
  / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value * / js.Object]
  */
  type Value = _Value | (js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value */ js.Object
  ]) | Null | Boolean | String | Double
  
  trait _Value extends StObject
}
