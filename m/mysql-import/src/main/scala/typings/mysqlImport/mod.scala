package typings.mysqlImport

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mysql-import", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def config(settings: Settings): Importer = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(settings.asInstanceOf[js.Any]).asInstanceOf[Importer]
  
  trait Importer extends StObject {
    
    /**
      * Import an .sql file to the database.
      */
    def `import`(filename: String): js.Promise[Unit]
  }
  object Importer {
    
    inline def apply(`import`: String => js.Promise[Unit]): Importer = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
      __obj.asInstanceOf[Importer]
    }
    
    extension [Self <: Importer](x: Self) {
      
      inline def setImport(value: String => js.Promise[Unit]): Self = StObject.set(x, "import", js.Any.fromFunction1(value))
    }
  }
  
  trait Settings extends StObject {
    
    /**
      * The database to connect to.
      */
    var database: String
    
    /**
      * The MySQL host to connect to.
      */
    var host: String
    
    /**
      * Function to handle errors. The function will receive the Error. If not provided the error will be thrown.
      */
    var onerror: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
    
    /**
      * The password for the user.
      */
    var password: String
    
    /**
      * The MySQL port to connect to.
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * The MySQL user to connect with.
      */
    var user: String
  }
  object Settings {
    
    inline def apply(database: String, host: String, password: String, user: String): Settings = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setOnerror(value: /* error */ Any => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
      
      inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
