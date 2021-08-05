package typings.nodePgMigrate

import org.scalablytyped.runtime.TopLevel
import typings.nodePgMigrate.anon.ZzIGNOREME
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generalTypesMod {
  
  trait CascadeOption extends StObject {
    
    var cascade: js.UndefOr[Boolean] = js.undefined
  }
  object CascadeOption {
    
    inline def apply(): CascadeOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CascadeOption]
    }
    
    extension [Self <: CascadeOption](x: Self) {
      
      inline def setCascade(value: Boolean): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
      
      inline def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
    }
  }
  
  trait DropOptions
    extends StObject
       with IfExistsOption
       with CascadeOption
  object DropOptions {
    
    inline def apply(): DropOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropOptions]
    }
  }
  
  trait IfExistsOption extends StObject {
    
    var ifExists: js.UndefOr[Boolean] = js.undefined
  }
  object IfExistsOption {
    
    inline def apply(): IfExistsOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IfExistsOption]
    }
    
    extension [Self <: IfExistsOption](x: Self) {
      
      inline def setIfExists(value: Boolean): Self = StObject.set(x, "ifExists", value.asInstanceOf[js.Any])
      
      inline def setIfExistsUndefined: Self = StObject.set(x, "ifExists", js.undefined)
    }
  }
  
  trait IfNotExistsOption extends StObject {
    
    var ifNotExists: js.UndefOr[Boolean] = js.undefined
  }
  object IfNotExistsOption {
    
    inline def apply(): IfNotExistsOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IfNotExistsOption]
    }
    
    extension [Self <: IfNotExistsOption](x: Self) {
      
      inline def setIfNotExists(value: Boolean): Self = StObject.set(x, "ifNotExists", value.asInstanceOf[js.Any])
      
      inline def setIfNotExistsUndefined: Self = StObject.set(x, "ifNotExists", js.undefined)
    }
  }
  
  type LiteralUnion[T /* <: String */] = T | (String & ZzIGNOREME)
  
  type Name = String | typings.nodePgMigrate.anon.Name
  
  type Nullable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] | null}
    */ typings.nodePgMigrate.nodePgMigrateStrings.Nullable & TopLevel[T]
  
  /* Inlined node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.PublicPart<node-pg-migrate.node-pg-migrate/dist/operations/PgLiteral.default> */
  trait PgLiteralValue
    extends StObject
       with _Value {
    
    @JSName("constructor")
    var constructor_Original: js.Function1[/* value */ String, js.Any]
    
    var create: js.UndefOr[js.Any] = js.undefined
    
    var literal: /* true */ Boolean
    
    @JSName("toString")
    var toString_Original: js.Function0[String]
    
    var value: String
  }
  object PgLiteralValue {
    
    inline def apply(
      constructor: /* value */ String => js.Any,
      literal: /* true */ Boolean,
      toString_ : () => String,
      value: String
    ): PgLiteralValue = {
      val __obj = js.Dynamic.literal(constructor = js.Any.fromFunction1(constructor), literal = literal.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("toString")(js.Any.fromFunction0(toString_))
      __obj.asInstanceOf[PgLiteralValue]
    }
    
    extension [Self <: PgLiteralValue](x: Self) {
      
      inline def setConstructor(value: /* value */ String => js.Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
      
      inline def setCreate(value: js.Any): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setLiteral(value: /* true */ Boolean): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
      
      inline def setToString_(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type PublicPart[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typings.nodePgMigrate.nodePgMigrateStrings.PublicPart & TopLevel[T]
  
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
