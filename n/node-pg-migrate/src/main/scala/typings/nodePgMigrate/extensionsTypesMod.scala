package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.IfNotExistsOption
import typings.nodePgMigrate.generalTypesMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extensionsTypesMod {
  
  @js.native
  trait CreateExtension extends CreateExtensionFn {
    
    def reverse(`extension`: js.Array[StringExtension]): String | js.Array[String] = js.native
    def reverse(`extension`: js.Array[StringExtension], options: CreateExtensionOptions & DropOptions): String | js.Array[String] = js.native
    def reverse(`extension`: StringExtension): String | js.Array[String] = js.native
    def reverse(`extension`: StringExtension, options: CreateExtensionOptions & DropOptions): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: CreateExtensionFn = js.native
  }
  
  type CreateExtensionFn = js.Function2[
    /* extension */ StringExtension | js.Array[StringExtension], 
    /* options */ js.UndefOr[CreateExtensionOptions & DropOptions], 
    String | js.Array[String]
  ]
  
  trait CreateExtensionOptions
    extends StObject
       with IfNotExistsOption {
    
    var schema: js.UndefOr[String] = js.undefined
  }
  object CreateExtensionOptions {
    
    inline def apply(): CreateExtensionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateExtensionOptions]
    }
    
    extension [Self <: CreateExtensionOptions](x: Self) {
      
      inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
  
  type DropExtension = js.Function2[
    /* extension */ StringExtension | js.Array[StringExtension], 
    /* dropOptions */ js.UndefOr[DropOptions], 
    String | js.Array[String]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodePgMigrate.nodePgMigrateStrings.adminpack
    - typings.nodePgMigrate.nodePgMigrateStrings.amcheck
    - typings.nodePgMigrate.nodePgMigrateStrings.auth_delay
    - typings.nodePgMigrate.nodePgMigrateStrings.auto_explain
    - typings.nodePgMigrate.nodePgMigrateStrings.bloom
    - typings.nodePgMigrate.nodePgMigrateStrings.btree_gin
    - typings.nodePgMigrate.nodePgMigrateStrings.btree_gist
    - typings.nodePgMigrate.nodePgMigrateStrings.citext
    - typings.nodePgMigrate.nodePgMigrateStrings.cube
    - typings.nodePgMigrate.nodePgMigrateStrings.dblink
    - typings.nodePgMigrate.nodePgMigrateStrings.dict_int
    - typings.nodePgMigrate.nodePgMigrateStrings.dict_xsyn
    - typings.nodePgMigrate.nodePgMigrateStrings.earthdistance
    - typings.nodePgMigrate.nodePgMigrateStrings.file_fdw
    - typings.nodePgMigrate.nodePgMigrateStrings.fuzzystrmatch
    - typings.nodePgMigrate.nodePgMigrateStrings.hstore
    - typings.nodePgMigrate.nodePgMigrateStrings.intagg
    - typings.nodePgMigrate.nodePgMigrateStrings.intarray
    - typings.nodePgMigrate.nodePgMigrateStrings.isn
    - typings.nodePgMigrate.nodePgMigrateStrings.lo
    - typings.nodePgMigrate.nodePgMigrateStrings.ltree
    - typings.nodePgMigrate.nodePgMigrateStrings.pageinspect
    - typings.nodePgMigrate.nodePgMigrateStrings.passwordcheck
    - typings.nodePgMigrate.nodePgMigrateStrings.pg_buffercache
    - typings.nodePgMigrate.nodePgMigrateStrings.pgcrypto
    - typings.nodePgMigrate.nodePgMigrateStrings.pg_freespacemap
    - typings.nodePgMigrate.nodePgMigrateStrings.pg_prewarm
    - typings.nodePgMigrate.nodePgMigrateStrings.pgrowlocks
    - typings.nodePgMigrate.nodePgMigrateStrings.pg_stat_statements
    - typings.nodePgMigrate.nodePgMigrateStrings.pgstattuple
    - typings.nodePgMigrate.nodePgMigrateStrings.pg_trgm
    - typings.nodePgMigrate.nodePgMigrateStrings.pg_visibility
    - typings.nodePgMigrate.nodePgMigrateStrings.postgres_fdw
    - typings.nodePgMigrate.nodePgMigrateStrings.seg
    - typings.nodePgMigrate.nodePgMigrateStrings.sepgsql
    - typings.nodePgMigrate.nodePgMigrateStrings.spi
    - typings.nodePgMigrate.nodePgMigrateStrings.sslinfo
    - typings.nodePgMigrate.nodePgMigrateStrings.tablefunc
    - typings.nodePgMigrate.nodePgMigrateStrings.tcn
    - typings.nodePgMigrate.nodePgMigrateStrings.test_decoding
    - typings.nodePgMigrate.nodePgMigrateStrings.tsm_system_rows
    - typings.nodePgMigrate.nodePgMigrateStrings.tsm_system_time
    - typings.nodePgMigrate.nodePgMigrateStrings.unaccent
    - typings.nodePgMigrate.nodePgMigrateStrings.`uuid-ossp`
    - typings.nodePgMigrate.nodePgMigrateStrings.xml2
  */
  trait Extension extends StObject
  object Extension {
    
    inline def adminpack: typings.nodePgMigrate.nodePgMigrateStrings.adminpack = "adminpack".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.adminpack]
    
    inline def amcheck: typings.nodePgMigrate.nodePgMigrateStrings.amcheck = "amcheck".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.amcheck]
    
    inline def auth_delay: typings.nodePgMigrate.nodePgMigrateStrings.auth_delay = "auth_delay".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.auth_delay]
    
    inline def auto_explain: typings.nodePgMigrate.nodePgMigrateStrings.auto_explain = "auto_explain".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.auto_explain]
    
    inline def bloom: typings.nodePgMigrate.nodePgMigrateStrings.bloom = "bloom".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.bloom]
    
    inline def btree_gin: typings.nodePgMigrate.nodePgMigrateStrings.btree_gin = "btree_gin".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.btree_gin]
    
    inline def btree_gist: typings.nodePgMigrate.nodePgMigrateStrings.btree_gist = "btree_gist".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.btree_gist]
    
    inline def citext: typings.nodePgMigrate.nodePgMigrateStrings.citext = "citext".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.citext]
    
    inline def cube: typings.nodePgMigrate.nodePgMigrateStrings.cube = "cube".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.cube]
    
    inline def dblink: typings.nodePgMigrate.nodePgMigrateStrings.dblink = "dblink".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.dblink]
    
    inline def dict_int: typings.nodePgMigrate.nodePgMigrateStrings.dict_int = "dict_int".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.dict_int]
    
    inline def dict_xsyn: typings.nodePgMigrate.nodePgMigrateStrings.dict_xsyn = "dict_xsyn".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.dict_xsyn]
    
    inline def earthdistance: typings.nodePgMigrate.nodePgMigrateStrings.earthdistance = "earthdistance".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.earthdistance]
    
    inline def file_fdw: typings.nodePgMigrate.nodePgMigrateStrings.file_fdw = "file_fdw".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.file_fdw]
    
    inline def fuzzystrmatch: typings.nodePgMigrate.nodePgMigrateStrings.fuzzystrmatch = "fuzzystrmatch".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.fuzzystrmatch]
    
    inline def hstore: typings.nodePgMigrate.nodePgMigrateStrings.hstore = "hstore".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.hstore]
    
    inline def intagg: typings.nodePgMigrate.nodePgMigrateStrings.intagg = "intagg".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.intagg]
    
    inline def intarray: typings.nodePgMigrate.nodePgMigrateStrings.intarray = "intarray".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.intarray]
    
    inline def isn: typings.nodePgMigrate.nodePgMigrateStrings.isn = "isn".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.isn]
    
    inline def lo: typings.nodePgMigrate.nodePgMigrateStrings.lo = "lo".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.lo]
    
    inline def ltree: typings.nodePgMigrate.nodePgMigrateStrings.ltree = "ltree".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.ltree]
    
    inline def pageinspect: typings.nodePgMigrate.nodePgMigrateStrings.pageinspect = "pageinspect".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.pageinspect]
    
    inline def passwordcheck: typings.nodePgMigrate.nodePgMigrateStrings.passwordcheck = "passwordcheck".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.passwordcheck]
    
    inline def pg_buffercache: typings.nodePgMigrate.nodePgMigrateStrings.pg_buffercache = "pg_buffercache".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.pg_buffercache]
    
    inline def pg_freespacemap: typings.nodePgMigrate.nodePgMigrateStrings.pg_freespacemap = "pg_freespacemap".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.pg_freespacemap]
    
    inline def pg_prewarm: typings.nodePgMigrate.nodePgMigrateStrings.pg_prewarm = "pg_prewarm".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.pg_prewarm]
    
    inline def pg_stat_statements: typings.nodePgMigrate.nodePgMigrateStrings.pg_stat_statements = "pg_stat_statements".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.pg_stat_statements]
    
    inline def pg_trgm: typings.nodePgMigrate.nodePgMigrateStrings.pg_trgm = "pg_trgm".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.pg_trgm]
    
    inline def pg_visibility: typings.nodePgMigrate.nodePgMigrateStrings.pg_visibility = "pg_visibility".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.pg_visibility]
    
    inline def pgcrypto: typings.nodePgMigrate.nodePgMigrateStrings.pgcrypto = "pgcrypto".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.pgcrypto]
    
    inline def pgrowlocks: typings.nodePgMigrate.nodePgMigrateStrings.pgrowlocks = "pgrowlocks".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.pgrowlocks]
    
    inline def pgstattuple: typings.nodePgMigrate.nodePgMigrateStrings.pgstattuple = "pgstattuple".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.pgstattuple]
    
    inline def postgres_fdw: typings.nodePgMigrate.nodePgMigrateStrings.postgres_fdw = "postgres_fdw".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.postgres_fdw]
    
    inline def seg: typings.nodePgMigrate.nodePgMigrateStrings.seg = "seg".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.seg]
    
    inline def sepgsql: typings.nodePgMigrate.nodePgMigrateStrings.sepgsql = "sepgsql".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.sepgsql]
    
    inline def spi: typings.nodePgMigrate.nodePgMigrateStrings.spi = "spi".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.spi]
    
    inline def sslinfo: typings.nodePgMigrate.nodePgMigrateStrings.sslinfo = "sslinfo".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.sslinfo]
    
    inline def tablefunc: typings.nodePgMigrate.nodePgMigrateStrings.tablefunc = "tablefunc".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.tablefunc]
    
    inline def tcn: typings.nodePgMigrate.nodePgMigrateStrings.tcn = "tcn".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.tcn]
    
    inline def test_decoding: typings.nodePgMigrate.nodePgMigrateStrings.test_decoding = "test_decoding".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.test_decoding]
    
    inline def tsm_system_rows: typings.nodePgMigrate.nodePgMigrateStrings.tsm_system_rows = "tsm_system_rows".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.tsm_system_rows]
    
    inline def tsm_system_time: typings.nodePgMigrate.nodePgMigrateStrings.tsm_system_time = "tsm_system_time".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.tsm_system_time]
    
    inline def unaccent: typings.nodePgMigrate.nodePgMigrateStrings.unaccent = "unaccent".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.unaccent]
    
    inline def `uuid-ossp`: typings.nodePgMigrate.nodePgMigrateStrings.`uuid-ossp` = "uuid-ossp".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.`uuid-ossp`]
    
    inline def xml2: typings.nodePgMigrate.nodePgMigrateStrings.xml2 = "xml2".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.xml2]
  }
  
  type StringExtension = LiteralUnion[Extension]
}
