package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationDirection
import typings.nodePgMigrate.extensionsTypesMod.Extension
import typings.nodePgMigrate.tablesTypesMod.Action
import typings.nodePgMigrate.tablesTypesMod.Like
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nodePgMigrateStrings {
  @js.native
  sealed trait AFTER extends js.Object
  
  @js.native
  sealed trait ALL extends Like
  
  @js.native
  sealed trait ALWAYS extends js.Object
  
  @js.native
  sealed trait BEFORE extends js.Object
  
  @js.native
  sealed trait `BY DEFAULT` extends js.Object
  
  @js.native
  sealed trait CASCADE extends Action
  
  @js.native
  sealed trait CASCADED extends js.Object
  
  @js.native
  sealed trait COMMENTS extends Like
  
  @js.native
  sealed trait CONSTRAINTS extends Like
  
  @js.native
  sealed trait DEFAULTS extends Like
  
  @js.native
  sealed trait DELETE extends js.Object
  
  @js.native
  sealed trait DISABLE extends js.Object
  
  @js.native
  sealed trait ENABLE extends js.Object
  
  @js.native
  sealed trait FORCE extends js.Object
  
  @js.native
  sealed trait FULL extends js.Object
  
  @js.native
  sealed trait IDENTITY extends Like
  
  @js.native
  sealed trait IMMUTABLE extends js.Object
  
  @js.native
  sealed trait IN extends js.Object
  
  @js.native
  sealed trait INDEXES extends Like
  
  @js.native
  sealed trait INOUT extends js.Object
  
  @js.native
  sealed trait INSERT extends js.Object
  
  @js.native
  sealed trait `INSTEAD OF` extends js.Object
  
  @js.native
  sealed trait LOCAL extends js.Object
  
  @js.native
  sealed trait `NO ACTION` extends Action
  
  @js.native
  sealed trait `NO FORCE` extends js.Object
  
  @js.native
  sealed trait OUT extends js.Object
  
  @js.native
  sealed trait RESTRICT extends Action
  
  @js.native
  sealed trait RESTRICTED extends js.Object
  
  @js.native
  sealed trait ROW extends js.Object
  
  @js.native
  sealed trait SAFE extends js.Object
  
  @js.native
  sealed trait SELECT extends js.Object
  
  @js.native
  sealed trait `SET DEFAULT` extends Action
  
  @js.native
  sealed trait `SET NULL` extends Action
  
  @js.native
  sealed trait SIMPLE extends js.Object
  
  @js.native
  sealed trait STABLE extends js.Object
  
  @js.native
  sealed trait STATEMENT extends js.Object
  
  @js.native
  sealed trait STATISTICS extends Like
  
  @js.native
  sealed trait STORAGE extends Like
  
  @js.native
  sealed trait UNSAFE extends js.Object
  
  @js.native
  sealed trait UPDATE extends js.Object
  
  @js.native
  sealed trait VARIADIC extends js.Object
  
  @js.native
  sealed trait VOLATILE extends js.Object
  
  @js.native
  sealed trait adminpack extends Extension
  
  @js.native
  sealed trait amcheck extends Extension
  
  @js.native
  sealed trait auth_delay extends Extension
  
  @js.native
  sealed trait auto_explain extends Extension
  
  @js.native
  sealed trait bloom extends Extension
  
  @js.native
  sealed trait btree extends js.Object
  
  @js.native
  sealed trait btree_gin extends Extension
  
  @js.native
  sealed trait btree_gist extends Extension
  
  @js.native
  sealed trait citext extends Extension
  
  @js.native
  sealed trait cube extends Extension
  
  @js.native
  sealed trait dblink extends Extension
  
  @js.native
  sealed trait dict_int extends Extension
  
  @js.native
  sealed trait dict_xsyn extends Extension
  
  @js.native
  sealed trait down extends MigrationDirection
  
  @js.native
  sealed trait earthdistance extends Extension
  
  @js.native
  sealed trait file_fdw extends Extension
  
  @js.native
  sealed trait function extends js.Object
  
  @js.native
  sealed trait fuzzystrmatch extends Extension
  
  @js.native
  sealed trait gin extends js.Object
  
  @js.native
  sealed trait gist extends js.Object
  
  @js.native
  sealed trait hash extends js.Object
  
  @js.native
  sealed trait hstore extends Extension
  
  @js.native
  sealed trait intagg extends Extension
  
  @js.native
  sealed trait intarray extends Extension
  
  @js.native
  sealed trait isn extends Extension
  
  @js.native
  sealed trait js_ extends js.Object
  
  @js.native
  sealed trait lo extends Extension
  
  @js.native
  sealed trait ltree extends Extension
  
  @js.native
  sealed trait operator extends js.Object
  
  @js.native
  sealed trait pageinspect extends Extension
  
  @js.native
  sealed trait passwordcheck extends Extension
  
  @js.native
  sealed trait pg_buffercache extends Extension
  
  @js.native
  sealed trait pg_freespacemap extends Extension
  
  @js.native
  sealed trait pg_prewarm extends Extension
  
  @js.native
  sealed trait pg_stat_statements extends Extension
  
  @js.native
  sealed trait pg_trgm extends Extension
  
  @js.native
  sealed trait pg_visibility extends Extension
  
  @js.native
  sealed trait pgcrypto extends Extension
  
  @js.native
  sealed trait pgrowlocks extends Extension
  
  @js.native
  sealed trait pgstattuple extends Extension
  
  @js.native
  sealed trait postgres_fdw extends Extension
  
  @js.native
  sealed trait seg extends Extension
  
  @js.native
  sealed trait sepgsql extends Extension
  
  @js.native
  sealed trait spgist extends js.Object
  
  @js.native
  sealed trait spi extends Extension
  
  @js.native
  sealed trait sql extends js.Object
  
  @js.native
  sealed trait sslinfo extends Extension
  
  @js.native
  sealed trait tablefunc extends Extension
  
  @js.native
  sealed trait tcn extends Extension
  
  @js.native
  sealed trait test_decoding extends Extension
  
  @js.native
  sealed trait ts extends js.Object
  
  @js.native
  sealed trait tsm_system_rows extends Extension
  
  @js.native
  sealed trait tsm_system_time extends Extension
  
  @js.native
  sealed trait unaccent extends Extension
  
  @js.native
  sealed trait up extends MigrationDirection
  
  @js.native
  sealed trait `uuid-ossp` extends Extension
  
  @js.native
  sealed trait xml2 extends Extension
  
  @scala.inline
  def AFTER: AFTER = "AFTER".asInstanceOf[AFTER]
  @scala.inline
  def ALL: ALL = "ALL".asInstanceOf[ALL]
  @scala.inline
  def ALWAYS: ALWAYS = "ALWAYS".asInstanceOf[ALWAYS]
  @scala.inline
  def BEFORE: BEFORE = "BEFORE".asInstanceOf[BEFORE]
  @scala.inline
  def `BY DEFAULT`: `BY DEFAULT` = "BY DEFAULT".asInstanceOf[`BY DEFAULT`]
  @scala.inline
  def CASCADE: CASCADE = "CASCADE".asInstanceOf[CASCADE]
  @scala.inline
  def CASCADED: CASCADED = "CASCADED".asInstanceOf[CASCADED]
  @scala.inline
  def COMMENTS: COMMENTS = "COMMENTS".asInstanceOf[COMMENTS]
  @scala.inline
  def CONSTRAINTS: CONSTRAINTS = "CONSTRAINTS".asInstanceOf[CONSTRAINTS]
  @scala.inline
  def DEFAULTS: DEFAULTS = "DEFAULTS".asInstanceOf[DEFAULTS]
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def DISABLE: DISABLE = "DISABLE".asInstanceOf[DISABLE]
  @scala.inline
  def ENABLE: ENABLE = "ENABLE".asInstanceOf[ENABLE]
  @scala.inline
  def FORCE: FORCE = "FORCE".asInstanceOf[FORCE]
  @scala.inline
  def FULL: FULL = "FULL".asInstanceOf[FULL]
  @scala.inline
  def IDENTITY: IDENTITY = "IDENTITY".asInstanceOf[IDENTITY]
  @scala.inline
  def IMMUTABLE: IMMUTABLE = "IMMUTABLE".asInstanceOf[IMMUTABLE]
  @scala.inline
  def IN: IN = "IN".asInstanceOf[IN]
  @scala.inline
  def INDEXES: INDEXES = "INDEXES".asInstanceOf[INDEXES]
  @scala.inline
  def INOUT: INOUT = "INOUT".asInstanceOf[INOUT]
  @scala.inline
  def INSERT: INSERT = "INSERT".asInstanceOf[INSERT]
  @scala.inline
  def `INSTEAD OF`: `INSTEAD OF` = "INSTEAD OF".asInstanceOf[`INSTEAD OF`]
  @scala.inline
  def LOCAL: LOCAL = "LOCAL".asInstanceOf[LOCAL]
  @scala.inline
  def `NO ACTION`: `NO ACTION` = "NO ACTION".asInstanceOf[`NO ACTION`]
  @scala.inline
  def `NO FORCE`: `NO FORCE` = "NO FORCE".asInstanceOf[`NO FORCE`]
  @scala.inline
  def OUT: OUT = "OUT".asInstanceOf[OUT]
  @scala.inline
  def RESTRICT: RESTRICT = "RESTRICT".asInstanceOf[RESTRICT]
  @scala.inline
  def RESTRICTED: RESTRICTED = "RESTRICTED".asInstanceOf[RESTRICTED]
  @scala.inline
  def ROW: ROW = "ROW".asInstanceOf[ROW]
  @scala.inline
  def SAFE: SAFE = "SAFE".asInstanceOf[SAFE]
  @scala.inline
  def SELECT: SELECT = "SELECT".asInstanceOf[SELECT]
  @scala.inline
  def `SET DEFAULT`: `SET DEFAULT` = "SET DEFAULT".asInstanceOf[`SET DEFAULT`]
  @scala.inline
  def `SET NULL`: `SET NULL` = "SET NULL".asInstanceOf[`SET NULL`]
  @scala.inline
  def SIMPLE: SIMPLE = "SIMPLE".asInstanceOf[SIMPLE]
  @scala.inline
  def STABLE: STABLE = "STABLE".asInstanceOf[STABLE]
  @scala.inline
  def STATEMENT: STATEMENT = "STATEMENT".asInstanceOf[STATEMENT]
  @scala.inline
  def STATISTICS: STATISTICS = "STATISTICS".asInstanceOf[STATISTICS]
  @scala.inline
  def STORAGE: STORAGE = "STORAGE".asInstanceOf[STORAGE]
  @scala.inline
  def UNSAFE: UNSAFE = "UNSAFE".asInstanceOf[UNSAFE]
  @scala.inline
  def UPDATE: UPDATE = "UPDATE".asInstanceOf[UPDATE]
  @scala.inline
  def VARIADIC: VARIADIC = "VARIADIC".asInstanceOf[VARIADIC]
  @scala.inline
  def VOLATILE: VOLATILE = "VOLATILE".asInstanceOf[VOLATILE]
  @scala.inline
  def adminpack: adminpack = "adminpack".asInstanceOf[adminpack]
  @scala.inline
  def amcheck: amcheck = "amcheck".asInstanceOf[amcheck]
  @scala.inline
  def auth_delay: auth_delay = "auth_delay".asInstanceOf[auth_delay]
  @scala.inline
  def auto_explain: auto_explain = "auto_explain".asInstanceOf[auto_explain]
  @scala.inline
  def bloom: bloom = "bloom".asInstanceOf[bloom]
  @scala.inline
  def btree: btree = "btree".asInstanceOf[btree]
  @scala.inline
  def btree_gin: btree_gin = "btree_gin".asInstanceOf[btree_gin]
  @scala.inline
  def btree_gist: btree_gist = "btree_gist".asInstanceOf[btree_gist]
  @scala.inline
  def citext: citext = "citext".asInstanceOf[citext]
  @scala.inline
  def cube: cube = "cube".asInstanceOf[cube]
  @scala.inline
  def dblink: dblink = "dblink".asInstanceOf[dblink]
  @scala.inline
  def dict_int: dict_int = "dict_int".asInstanceOf[dict_int]
  @scala.inline
  def dict_xsyn: dict_xsyn = "dict_xsyn".asInstanceOf[dict_xsyn]
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  @scala.inline
  def earthdistance: earthdistance = "earthdistance".asInstanceOf[earthdistance]
  @scala.inline
  def file_fdw: file_fdw = "file_fdw".asInstanceOf[file_fdw]
  @scala.inline
  def function: function = "function".asInstanceOf[function]
  @scala.inline
  def fuzzystrmatch: fuzzystrmatch = "fuzzystrmatch".asInstanceOf[fuzzystrmatch]
  @scala.inline
  def gin: gin = "gin".asInstanceOf[gin]
  @scala.inline
  def gist: gist = "gist".asInstanceOf[gist]
  @scala.inline
  def hash: hash = "hash".asInstanceOf[hash]
  @scala.inline
  def hstore: hstore = "hstore".asInstanceOf[hstore]
  @scala.inline
  def intagg: intagg = "intagg".asInstanceOf[intagg]
  @scala.inline
  def intarray: intarray = "intarray".asInstanceOf[intarray]
  @scala.inline
  def isn: isn = "isn".asInstanceOf[isn]
  @scala.inline
  def js_ : js_ = "js".asInstanceOf[js_]
  @scala.inline
  def lo: lo = "lo".asInstanceOf[lo]
  @scala.inline
  def ltree: ltree = "ltree".asInstanceOf[ltree]
  @scala.inline
  def operator: operator = "operator".asInstanceOf[operator]
  @scala.inline
  def pageinspect: pageinspect = "pageinspect".asInstanceOf[pageinspect]
  @scala.inline
  def passwordcheck: passwordcheck = "passwordcheck".asInstanceOf[passwordcheck]
  @scala.inline
  def pg_buffercache: pg_buffercache = "pg_buffercache".asInstanceOf[pg_buffercache]
  @scala.inline
  def pg_freespacemap: pg_freespacemap = "pg_freespacemap".asInstanceOf[pg_freespacemap]
  @scala.inline
  def pg_prewarm: pg_prewarm = "pg_prewarm".asInstanceOf[pg_prewarm]
  @scala.inline
  def pg_stat_statements: pg_stat_statements = "pg_stat_statements".asInstanceOf[pg_stat_statements]
  @scala.inline
  def pg_trgm: pg_trgm = "pg_trgm".asInstanceOf[pg_trgm]
  @scala.inline
  def pg_visibility: pg_visibility = "pg_visibility".asInstanceOf[pg_visibility]
  @scala.inline
  def pgcrypto: pgcrypto = "pgcrypto".asInstanceOf[pgcrypto]
  @scala.inline
  def pgrowlocks: pgrowlocks = "pgrowlocks".asInstanceOf[pgrowlocks]
  @scala.inline
  def pgstattuple: pgstattuple = "pgstattuple".asInstanceOf[pgstattuple]
  @scala.inline
  def postgres_fdw: postgres_fdw = "postgres_fdw".asInstanceOf[postgres_fdw]
  @scala.inline
  def seg: seg = "seg".asInstanceOf[seg]
  @scala.inline
  def sepgsql: sepgsql = "sepgsql".asInstanceOf[sepgsql]
  @scala.inline
  def spgist: spgist = "spgist".asInstanceOf[spgist]
  @scala.inline
  def spi: spi = "spi".asInstanceOf[spi]
  @scala.inline
  def sql: sql = "sql".asInstanceOf[sql]
  @scala.inline
  def sslinfo: sslinfo = "sslinfo".asInstanceOf[sslinfo]
  @scala.inline
  def tablefunc: tablefunc = "tablefunc".asInstanceOf[tablefunc]
  @scala.inline
  def tcn: tcn = "tcn".asInstanceOf[tcn]
  @scala.inline
  def test_decoding: test_decoding = "test_decoding".asInstanceOf[test_decoding]
  @scala.inline
  def ts: ts = "ts".asInstanceOf[ts]
  @scala.inline
  def tsm_system_rows: tsm_system_rows = "tsm_system_rows".asInstanceOf[tsm_system_rows]
  @scala.inline
  def tsm_system_time: tsm_system_time = "tsm_system_time".asInstanceOf[tsm_system_time]
  @scala.inline
  def unaccent: unaccent = "unaccent".asInstanceOf[unaccent]
  @scala.inline
  def up: up = "up".asInstanceOf[up]
  @scala.inline
  def `uuid-ossp`: `uuid-ossp` = "uuid-ossp".asInstanceOf[`uuid-ossp`]
  @scala.inline
  def xml2: xml2 = "xml2".asInstanceOf[xml2]
}

