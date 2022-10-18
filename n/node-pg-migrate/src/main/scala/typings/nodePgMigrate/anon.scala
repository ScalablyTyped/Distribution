package typings.nodePgMigrate

import org.scalablytyped.runtime.StringDictionary
import typings.nodePgMigrate.distMigrationMod.CreateOptions
import typings.nodePgMigrate.distMigrationMod.FilenameFormat
import typings.nodePgMigrate.distOperationsGeneralTypesMod.DropOptions
import typings.nodePgMigrate.distOperationsTablesTypesMod.LikeOptions
import typings.nodePgMigrate.distOperationsTriggersTypesMod.CreateTriggerFn
import typings.nodePgMigrate.distOperationsTriggersTypesMod.TriggerOptions
import typings.nodePgMigrate.nodePgMigrateStrings.js_
import typings.nodePgMigrate.nodePgMigrateStrings.sql
import typings.nodePgMigrate.nodePgMigrateStrings.ts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined node-pg-migrate.node-pg-migrate/dist/migration.CreateOptionsDefault & {  filenameFormat :node-pg-migrate.node-pg-migrate/dist/migration.FilenameFormat | undefined} */
  trait CreateOptionsDefaultfilen
    extends StObject
       with CreateOptions {
    
    var filenameFormat: js.UndefOr[FilenameFormat] = js.undefined
    
    var ignorePattern: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[js_ | ts | sql] = js.undefined
  }
  object CreateOptionsDefaultfilen {
    
    inline def apply(): CreateOptionsDefaultfilen = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateOptionsDefaultfilen]
    }
    
    extension [Self <: CreateOptionsDefaultfilen](x: Self) {
      
      inline def setFilenameFormat(value: FilenameFormat): Self = StObject.set(x, "filenameFormat", value.asInstanceOf[js.Any])
      
      inline def setFilenameFormatUndefined: Self = StObject.set(x, "filenameFormat", js.undefined)
      
      inline def setIgnorePattern(value: String): Self = StObject.set(x, "ignorePattern", value.asInstanceOf[js.Any])
      
      inline def setIgnorePatternUndefined: Self = StObject.set(x, "ignorePattern", js.undefined)
      
      inline def setLanguage(value: js_ | ts | sql): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    }
  }
  
  /* Inlined node-pg-migrate.node-pg-migrate/dist/migration.CreateOptionsTemplate & {  filenameFormat :node-pg-migrate.node-pg-migrate/dist/migration.FilenameFormat | undefined} */
  trait CreateOptionsTemplatefile
    extends StObject
       with CreateOptions {
    
    var filenameFormat: js.UndefOr[FilenameFormat] = js.undefined
    
    var templateFileName: String
  }
  object CreateOptionsTemplatefile {
    
    inline def apply(templateFileName: String): CreateOptionsTemplatefile = {
      val __obj = js.Dynamic.literal(templateFileName = templateFileName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateOptionsTemplatefile]
    }
    
    extension [Self <: CreateOptionsTemplatefile](x: Self) {
      
      inline def setFilenameFormat(value: FilenameFormat): Self = StObject.set(x, "filenameFormat", value.asInstanceOf[js.Any])
      
      inline def setFilenameFormatUndefined: Self = StObject.set(x, "filenameFormat", js.undefined)
      
      inline def setTemplateFileName(value: String): Self = StObject.set(x, "templateFileName", value.asInstanceOf[js.Any])
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
    
    var table: typings.nodePgMigrate.distOperationsGeneralTypesMod.Name
  }
  object Options {
    
    inline def apply(table: typings.nodePgMigrate.distOperationsGeneralTypesMod.Name): Options = {
      val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOptions(value: LikeOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setTable(value: typings.nodePgMigrate.distOperationsGeneralTypesMod.Name): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.PublicPart<node-pg-migrate.node-pg-migrate.PgLiteral> */
  trait PublicPartPgLiteral extends StObject {
    
    @JSName("constructor")
    var constructor_Original: js.Function1[/* value */ String, Any]
    
    var create: js.UndefOr[Any] = js.undefined
    
    var literal: /* true */ Boolean
    
    @JSName("toString")
    var toString_Original: js.Function0[String]
    
    var value: String
  }
  object PublicPartPgLiteral {
    
    inline def apply(
      constructor: /* value */ String => Any,
      literal: /* true */ Boolean,
      toString_ : () => String,
      value: String
    ): PublicPartPgLiteral = {
      val __obj = js.Dynamic.literal(constructor = js.Any.fromFunction1(constructor), literal = literal.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("toString")(js.Any.fromFunction0(toString_))
      __obj.asInstanceOf[PublicPartPgLiteral]
    }
    
    extension [Self <: PublicPartPgLiteral](x: Self) {
      
      inline def setConstructor(value: /* value */ String => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
      
      inline def setCreate(value: Any): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
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
        value: (/* tableName */ typings.nodePgMigrate.distOperationsGeneralTypesMod.Name, /* triggerName */ String, /* triggerOptions */ TriggerOptions & DropOptions) => String | js.Array[String]
      ): Self = StObject.set(x, "reverse", js.Any.fromFunction3(value))
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
  
  /* Inlined {[name: string] : node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Type} & node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.DropOptions */
  trait namestringTypeDropOptions
    extends StObject
       with /* name */ StringDictionary[typings.nodePgMigrate.distOperationsGeneralTypesMod.Type] {
    
    var cascade: js.UndefOr[Boolean] = js.undefined
    
    var ifExists: js.UndefOr[Boolean] = js.undefined
  }
  object namestringTypeDropOptions {
    
    inline def apply(): namestringTypeDropOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[namestringTypeDropOptions]
    }
    
    extension [Self <: namestringTypeDropOptions](x: Self) {
      
      inline def setCascade(value: Boolean): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
      
      inline def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
      
      inline def setIfExists(value: Boolean): Self = StObject.set(x, "ifExists", value.asInstanceOf[js.Any])
      
      inline def setIfExistsUndefined: Self = StObject.set(x, "ifExists", js.undefined)
    }
  }
}
