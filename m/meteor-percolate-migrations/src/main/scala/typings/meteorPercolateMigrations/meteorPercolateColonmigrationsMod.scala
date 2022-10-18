package typings.meteorPercolateMigrations

import typings.meteorPercolateMigrations.meteorPercolateMigrationsStrings.debug
import typings.meteorPercolateMigrations.meteorPercolateMigrationsStrings.error
import typings.meteorPercolateMigrations.meteorPercolateMigrationsStrings.info
import typings.meteorPercolateMigrations.meteorPercolateMigrationsStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meteorPercolateColonmigrationsMod {
  
  @JSImport("meteor/percolate:migrations", "Migrations")
  @js.native
  val Migrations: MigrationsPublicApi = js.native
  
  trait Config extends StObject {
    
    var collectionName: js.UndefOr[String] = js.undefined
    
    var log: js.UndefOr[Boolean] = js.undefined
    
    var logIfLatest: js.UndefOr[Boolean] = js.undefined
    
    var logger: js.UndefOr[(js.Function1[/* options */ LoggerOptions, Unit]) | Null] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setCollectionName(value: String): Self = StObject.set(x, "collectionName", value.asInstanceOf[js.Any])
      
      inline def setCollectionNameUndefined: Self = StObject.set(x, "collectionName", js.undefined)
      
      inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogIfLatest(value: Boolean): Self = StObject.set(x, "logIfLatest", value.asInstanceOf[js.Any])
      
      inline def setLogIfLatestUndefined: Self = StObject.set(x, "logIfLatest", js.undefined)
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setLogger(value: /* options */ LoggerOptions => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
      
      inline def setLoggerNull: Self = StObject.set(x, "logger", null)
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
  
  trait LoggerOptions extends StObject {
    
    var level: info | warn | error | debug
    
    var message: String
    
    var tag: typings.meteorPercolateMigrations.meteorPercolateMigrationsStrings.Migrations
  }
  object LoggerOptions {
    
    inline def apply(level: info | warn | error | debug, message: String): LoggerOptions = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tag = "Migrations")
      __obj.asInstanceOf[LoggerOptions]
    }
    
    extension [Self <: LoggerOptions](x: Self) {
      
      inline def setLevel(value: info | warn | error | debug): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTag(value: typings.meteorPercolateMigrations.meteorPercolateMigrationsStrings.Migrations): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait MigrationSpec extends StObject {
    
    var down: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    def up(): Unit
    
    var version: Double
  }
  object MigrationSpec {
    
    inline def apply(up: () => Unit, version: Double): MigrationSpec = {
      val __obj = js.Dynamic.literal(up = js.Any.fromFunction0(up), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[MigrationSpec]
    }
    
    extension [Self <: MigrationSpec](x: Self) {
      
      inline def setDown(value: () => Unit): Self = StObject.set(x, "down", js.Any.fromFunction0(value))
      
      inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setUp(value: () => Unit): Self = StObject.set(x, "up", js.Any.fromFunction0(value))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MigrationsPublicApi extends StObject {
    
    def add(spec: MigrationSpec): Unit = js.native
    
    def config(c: Config): Unit = js.native
    
    def getVersion(): Double = js.native
    
    def migrateTo(version: String): Unit = js.native
    def migrateTo(version: Double): Unit = js.native
    
    def start(): Unit = js.native
    
    def unlock(): Unit = js.native
  }
}
