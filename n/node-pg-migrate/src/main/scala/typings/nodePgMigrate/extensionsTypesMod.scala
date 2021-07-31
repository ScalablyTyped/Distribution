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
    
    @scala.inline
    def apply(): CreateExtensionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateExtensionOptions]
    }
    
    @scala.inline
    implicit class CreateExtensionOptionsMutableBuilder[Self <: CreateExtensionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
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
    
    @scala.inline
    def adminpack: typings.nodePgMigrate.nodePgMigrateStrings.adminpack = "adminpack".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.adminpack]
    
    @scala.inline
    def amcheck: typings.nodePgMigrate.nodePgMigrateStrings.amcheck = "amcheck".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.amcheck]
    
    @scala.inline
    def auth_delay: typings.nodePgMigrate.nodePgMigrateStrings.auth_delay = "auth_delay".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.auth_delay]
    
    @scala.inline
    def auto_explain: typings.nodePgMigrate.nodePgMigrateStrings.auto_explain = "auto_explain".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.auto_explain]
    
    @scala.inline
    def bloom: typings.nodePgMigrate.nodePgMigrateStrings.bloom = "bloom".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.bloom]
    
    @scala.inline
    def btree_gin: typings.nodePgMigrate.nodePgMigrateStrings.btree_gin = "btree_gin".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.btree_gin]
    
    @scala.inline
    def btree_gist: typings.nodePgMigrate.nodePgMigrateStrings.btree_gist = "btree_gist".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.btree_gist]
    
    @scala.inline
    def citext: typings.nodePgMigrate.nodePgMigrateStrings.citext = "citext".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.citext]
    
    @scala.inline
    def cube: typings.nodePgMigrate.nodePgMigrateStrings.cube = "cube".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.cube]
    
    @scala.inline
    def dblink: typings.nodePgMigrate.nodePgMigrateStrings.dblink = "dblink".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.dblink]
    
    @scala.inline
    def dict_int: typings.nodePgMigrate.nodePgMigrateStrings.dict_int = "dict_int".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.dict_int]
    
    @scala.inline
    def dict_xsyn: typings.nodePgMigrate.nodePgMigrateStrings.dict_xsyn = "dict_xsyn".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.dict_xsyn]
    
    @scala.inline
    def earthdistance: typings.nodePgMigrate.nodePgMigrateStrings.earthdistance = "earthdistance".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.earthdistance]
    
    @scala.inline
    def file_fdw: typings.nodePgMigrate.nodePgMigrateStrings.file_fdw = "file_fdw".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.file_fdw]
    
    @scala.inline
    def fuzzystrmatch: typings.nodePgMigrate.nodePgMigrateStrings.fuzzystrmatch = "fuzzystrmatch".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.fuzzystrmatch]
    
    @scala.inline
    def hstore: typings.nodePgMigrate.nodePgMigrateStrings.hstore = "hstore".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.hstore]
    
    @scala.inline
    def intagg: typings.nodePgMigrate.nodePgMigrateStrings.intagg = "intagg".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.intagg]
    
    @scala.inline
    def intarray: typings.nodePgMigrate.nodePgMigrateStrings.intarray = "intarray".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.intarray]
    
    @scala.inline
    def isn: typings.nodePgMigrate.nodePgMigrateStrings.isn = "isn".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.isn]
    
    @scala.inline
    def lo: typings.nodePgMigrate.nodePgMigrateStrings.lo = "lo".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.lo]
    
    @scala.inline
    def ltree: typings.nodePgMigrate.nodePgMigrateStrings.ltree = "ltree".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.ltree]
    
    @scala.inline
    def pageinspect: typings.nodePgMigrate.nodePgMigrateStrings.pageinspect = "pageinspect".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.pageinspect]
    
    @scala.inline
    def passwordcheck: typings.nodePgMigrate.nodePgMigrateStrings.passwordcheck = "passwordcheck".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.passwordcheck]
    
    @scala.inline
    def pg_buffercache: typings.nodePgMigrate.nodePgMigrateStrings.pg_buffercache = "pg_buffercache".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.pg_buffercache]
    
    @scala.inline
    def pg_freespacemap: typings.nodePgMigrate.nodePgMigrateStrings.pg_freespacemap = "pg_freespacemap".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.pg_freespacemap]
    
    @scala.inline
    def pg_prewarm: typings.nodePgMigrate.nodePgMigrateStrings.pg_prewarm = "pg_prewarm".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.pg_prewarm]
    
    @scala.inline
    def pg_stat_statements: typings.nodePgMigrate.nodePgMigrateStrings.pg_stat_statements = "pg_stat_statements".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.pg_stat_statements]
    
    @scala.inline
    def pg_trgm: typings.nodePgMigrate.nodePgMigrateStrings.pg_trgm = "pg_trgm".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.pg_trgm]
    
    @scala.inline
    def pg_visibility: typings.nodePgMigrate.nodePgMigrateStrings.pg_visibility = "pg_visibility".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.pg_visibility]
    
    @scala.inline
    def pgcrypto: typings.nodePgMigrate.nodePgMigrateStrings.pgcrypto = "pgcrypto".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.pgcrypto]
    
    @scala.inline
    def pgrowlocks: typings.nodePgMigrate.nodePgMigrateStrings.pgrowlocks = "pgrowlocks".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.pgrowlocks]
    
    @scala.inline
    def pgstattuple: typings.nodePgMigrate.nodePgMigrateStrings.pgstattuple = "pgstattuple".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.pgstattuple]
    
    @scala.inline
    def postgres_fdw: typings.nodePgMigrate.nodePgMigrateStrings.postgres_fdw = "postgres_fdw".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.postgres_fdw]
    
    @scala.inline
    def seg: typings.nodePgMigrate.nodePgMigrateStrings.seg = "seg".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.seg]
    
    @scala.inline
    def sepgsql: typings.nodePgMigrate.nodePgMigrateStrings.sepgsql = "sepgsql".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.sepgsql]
    
    @scala.inline
    def spi: typings.nodePgMigrate.nodePgMigrateStrings.spi = "spi".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.spi]
    
    @scala.inline
    def sslinfo: typings.nodePgMigrate.nodePgMigrateStrings.sslinfo = "sslinfo".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.sslinfo]
    
    @scala.inline
    def tablefunc: typings.nodePgMigrate.nodePgMigrateStrings.tablefunc = "tablefunc".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.tablefunc]
    
    @scala.inline
    def tcn: typings.nodePgMigrate.nodePgMigrateStrings.tcn = "tcn".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.tcn]
    
    @scala.inline
    def test_decoding: typings.nodePgMigrate.nodePgMigrateStrings.test_decoding = "test_decoding".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.test_decoding]
    
    @scala.inline
    def tsm_system_rows: typings.nodePgMigrate.nodePgMigrateStrings.tsm_system_rows = "tsm_system_rows".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.tsm_system_rows]
    
    @scala.inline
    def tsm_system_time: typings.nodePgMigrate.nodePgMigrateStrings.tsm_system_time = "tsm_system_time".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.tsm_system_time]
    
    @scala.inline
    def unaccent: typings.nodePgMigrate.nodePgMigrateStrings.unaccent = "unaccent".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.unaccent]
    
    @scala.inline
    def `uuid-ossp`: typings.nodePgMigrate.nodePgMigrateStrings.`uuid-ossp` = "uuid-ossp".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.`uuid-ossp`]
    
    @scala.inline
    def xml2: typings.nodePgMigrate.nodePgMigrateStrings.xml2 = "xml2".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.xml2]
  }
  
  type StringExtension = LiteralUnion[Extension]
}
