package typings.nodePgMigrate

import org.scalablytyped.runtime.StringDictionary
import typings.nodePgMigrate.anon.PublicPartPgLiteral
import typings.nodePgMigrate.distOperationsFunctionsTypesMod.FunctionParam
import typings.nodePgMigrate.distOperationsFunctionsTypesMod.FunctionParamType
import typings.nodePgMigrate.distOperationsGeneralTypesMod.Name
import typings.nodePgMigrate.distOperationsGeneralTypesMod.Type
import typings.nodePgMigrate.distOperationsGeneralTypesMod.Value
import typings.nodePgMigrate.distOperationsTablesTypesMod.ColumnDefinition
import typings.nodePgMigrate.distOperationsTablesTypesMod.ColumnDefinitions
import typings.nodePgMigrate.distTypesMod.Literal
import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.distTypesMod.RunnerOption
import typings.nodePgMigrate.mod.PgLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("node-pg-migrate/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node-pg-migrate/dist/utils", "StringIdGenerator")
  @js.native
  open class StringIdGenerator () extends StObject {
    def this(chars: String) = this()
    
    /* private */ val chars: Any = js.native
    
    /* private */ var ids: Any = js.native
    
    /* private */ var increment: Any = js.native
    
    def next(): String = js.native
  }
  
  inline def applyType(`type`: Type): ColumnDefinition & FunctionParamType = ^.asInstanceOf[js.Dynamic].applyDynamic("applyType")(`type`.asInstanceOf[js.Any]).asInstanceOf[ColumnDefinition & FunctionParamType]
  inline def applyType(`type`: Type, extendingTypeShorthands: ColumnDefinitions): ColumnDefinition & FunctionParamType = (^.asInstanceOf[js.Dynamic].applyDynamic("applyType")(`type`.asInstanceOf[js.Any], extendingTypeShorthands.asInstanceOf[js.Any])).asInstanceOf[ColumnDefinition & FunctionParamType]
  
  inline def applyTypeAdapters(`type`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("applyTypeAdapters")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def createSchemalize(shouldDecamelize: Boolean, shouldQuote: Boolean): js.Function1[/* v */ Name, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSchemalize")(shouldDecamelize.asInstanceOf[js.Any], shouldQuote.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Name, String]]
  
  inline def createTransformer(literal: Literal): js.Function2[
    /* s */ String, 
    /* d */ js.UndefOr[
      StringDictionary[
        String | Double | Boolean | PgLiteral | PublicPartPgLiteral | js.Array[Value] | typings.nodePgMigrate.anon.Name | Null
      ]
    ], 
    String
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")(literal.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* s */ String, 
    /* d */ js.UndefOr[
      StringDictionary[
        String | Double | Boolean | PgLiteral | PublicPartPgLiteral | js.Array[Value] | typings.nodePgMigrate.anon.Name | Null
      ]
    ], 
    String
  ]]
  
  inline def escapeValue(`val`: Value): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  
  inline def formatLines(lines: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatLines")(lines.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatLines(lines: js.Array[String], replace: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatLines")(lines.asInstanceOf[js.Any], replace.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatLines(lines: js.Array[String], replace: String, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatLines")(lines.asInstanceOf[js.Any], replace.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatLines(lines: js.Array[String], replace: Unit, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatLines")(lines.asInstanceOf[js.Any], replace.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatParams(params: js.Array[FunctionParam], mOptions: MigrationOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatParams")(params.asInstanceOf[js.Any], mOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getMigrationTableSchema(options: RunnerOption): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMigrationTableSchema")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getSchemas(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchemas")().asInstanceOf[js.Array[String]]
  inline def getSchemas(schema: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchemas")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def getSchemas(schema: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchemas")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def intersection[T](list1: js.Array[T], list2: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(list1.asInstanceOf[js.Any], list2.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def makeComment(`object`: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeComment")(`object`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def makeComment(`object`: String, name: String, text: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeComment")(`object`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[String]
}
