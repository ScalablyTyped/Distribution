package typings.nodePgMigrate

import typings.nodePgMigrate.functionsTypesMod.FunctionOptions
import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.Value
import typings.nodePgMigrate.tablesTypesMod.LikeOptions
import typings.nodePgMigrate.triggersTypesMod.CreateTriggerFn
import typings.nodePgMigrate.triggersTypesMod.TriggerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FilenameFormat extends StObject {
    
    var filenameFormat: js.UndefOr[typings.nodePgMigrate.migrationMod.FilenameFormat] = js.undefined
  }
  object FilenameFormat {
    
    inline def apply(): FilenameFormat = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilenameFormat]
    }
    
    extension [Self <: FilenameFormat](x: Self) {
      
      inline def setFilenameFormat(value: typings.nodePgMigrate.migrationMod.FilenameFormat): Self = StObject.set(x, "filenameFormat", value.asInstanceOf[js.Any])
      
      inline def setFilenameFormatUndefined: Self = StObject.set(x, "filenameFormat", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var schema: js.UndefOr[String] = js.undefined
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var options: js.UndefOr[LikeOptions] = js.undefined
    
    var table: typings.nodePgMigrate.generalTypesMod.Name
  }
  object Options {
    
    inline def apply(table: typings.nodePgMigrate.generalTypesMod.Name): Options = {
      val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOptions(value: LikeOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setTable(value: typings.nodePgMigrate.generalTypesMod.Name): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.PublicPart<node-pg-migrate.node-pg-migrate.PgLiteral> */
  trait PublicPartPgLiteral extends StObject {
    
    @JSName("constructor")
    var constructor_Original: js.Function1[/* value */ String, js.Any]
    
    var create: js.UndefOr[js.Any] = js.undefined
    
    var literal: /* true */ Boolean
    
    @JSName("toString")
    var toString_Original: js.Function0[String]
    
    var value: String
  }
  object PublicPartPgLiteral {
    
    inline def apply(
      constructor: /* value */ String => js.Any,
      literal: /* true */ Boolean,
      toString_ : () => String,
      value: String
    ): PublicPartPgLiteral = {
      val __obj = js.Dynamic.literal(constructor = js.Any.fromFunction1(constructor), literal = literal.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("toString")(js.Any.fromFunction0(toString_))
      __obj.asInstanceOf[PublicPartPgLiteral]
    }
    
    extension [Self <: PublicPartPgLiteral](x: Self) {
      
      inline def setConstructor(value: /* value */ String => js.Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
      
      inline def setCreate(value: js.Any): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setLiteral(value: /* true */ Boolean): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
      
      inline def setToString_(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Reverse extends StObject {
    
    var reverse: CreateTriggerFn
  }
  object Reverse {
    
    inline def apply(reverse: CreateTriggerFn): Reverse = {
      val __obj = js.Dynamic.literal(reverse = reverse.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reverse]
    }
    
    extension [Self <: Reverse](x: Self) {
      
      inline def setReverse(value: CreateTriggerFn): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseFunction3(
        value: (/* tableName */ typings.nodePgMigrate.generalTypesMod.Name, /* triggerName */ String, /* triggerOptions */ TriggerOptions & DropOptions) => String | js.Array[String]
      ): Self = StObject.set(x, "reverse", js.Any.fromFunction3(value))
      
      inline def setReverseFunction4(
        value: (/* tableName */ typings.nodePgMigrate.generalTypesMod.Name, /* triggerName */ String, /* triggerOptions */ TriggerOptions & FunctionOptions & DropOptions, /* definition */ Value) => String | js.Array[String]
      ): Self = StObject.set(x, "reverse", js.Any.fromFunction4(value))
    }
  }
  
  trait Type extends StObject {
    
    var `type`: String
  }
  object Type {
    
    inline def apply(`type`: String): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ZzIGNOREME extends StObject {
    
    var zz_IGNORE_ME: js.UndefOr[scala.Nothing] = js.undefined
  }
}
