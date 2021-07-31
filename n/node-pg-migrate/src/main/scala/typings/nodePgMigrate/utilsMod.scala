package typings.nodePgMigrate

import org.scalablytyped.runtime.StringDictionary
import typings.nodePgMigrate.anon.PublicPartPgLiteral
import typings.nodePgMigrate.distTypesMod.Literal
import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.distTypesMod.RunnerOption
import typings.nodePgMigrate.functionsTypesMod.FunctionParam
import typings.nodePgMigrate.functionsTypesMod.FunctionParamType
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.generalTypesMod.Type
import typings.nodePgMigrate.generalTypesMod.Value
import typings.nodePgMigrate.mod.PgLiteral
import typings.nodePgMigrate.tablesTypesMod.ColumnDefinition
import typings.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("node-pg-migrate/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node-pg-migrate/dist/utils", "StringIdGenerator")
  @js.native
  class StringIdGenerator () extends StObject {
    def this(chars: String) = this()
    
    val chars: js.Any = js.native
    
    var ids: js.Any = js.native
    
    var increment: js.Any = js.native
    
    def next(): String = js.native
  }
  
  @scala.inline
  def applyType(`type`: Type): ColumnDefinition & FunctionParamType = ^.asInstanceOf[js.Dynamic].applyDynamic("applyType")(`type`.asInstanceOf[js.Any]).asInstanceOf[ColumnDefinition & FunctionParamType]
  @scala.inline
  def applyType(`type`: Type, extendingTypeShorthands: ColumnDefinitions): ColumnDefinition & FunctionParamType = (^.asInstanceOf[js.Dynamic].applyDynamic("applyType")(`type`.asInstanceOf[js.Any], extendingTypeShorthands.asInstanceOf[js.Any])).asInstanceOf[ColumnDefinition & FunctionParamType]
  
  @scala.inline
  def applyTypeAdapters(`type`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("applyTypeAdapters")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def createSchemalize(shouldDecamelize: Boolean, shouldQuote: Boolean): js.Function1[/* v */ Name, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSchemalize")(shouldDecamelize.asInstanceOf[js.Any], shouldQuote.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Name, String]]
  
  @scala.inline
  def createTransformer(literal: Literal): js.Function2[
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
  
  @scala.inline
  def escapeValue(`val`: Value): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  
  @scala.inline
  def formatLines(lines: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatLines")(lines.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def formatLines(lines: js.Array[String], replace: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatLines")(lines.asInstanceOf[js.Any], replace.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatLines(lines: js.Array[String], replace: String, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatLines")(lines.asInstanceOf[js.Any], replace.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatLines(lines: js.Array[String], replace: Unit, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatLines")(lines.asInstanceOf[js.Any], replace.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatParams(params: js.Array[FunctionParam], mOptions: MigrationOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatParams")(params.asInstanceOf[js.Any], mOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatParams(params: Unit, mOptions: MigrationOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatParams")(params.asInstanceOf[js.Any], mOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getMigrationTableSchema(options: RunnerOption): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMigrationTableSchema")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getSchemas(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchemas")().asInstanceOf[js.Array[String]]
  @scala.inline
  def getSchemas(schema: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchemas")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def getSchemas(schema: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchemas")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def makeComment(`object`: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeComment")(`object`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def makeComment(`object`: String, name: String, text: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeComment")(`object`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[String]
}
