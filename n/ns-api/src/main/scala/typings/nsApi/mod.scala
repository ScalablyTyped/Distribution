package typings.nsApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(conf: Configuration): typings.nsApi.mod.nsApi = ^.asInstanceOf[js.Dynamic].apply(conf.asInstanceOf[js.Any]).asInstanceOf[typings.nsApi.mod.nsApi]
  
  @JSImport("ns-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Configuration extends StObject {
    
    var password: String
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var username: String
  }
  object Configuration {
    
    inline def apply(password: String, username: String): Configuration = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait nsApi extends StObject {
    
    /** Prijzen - tariffs */
    def prijzen(params: js.Object, callback: js.Function2[/* err */ Any, /* data */ js.Object, Unit]): Unit = js.native
    
    /**
      * Reisadvies - travel advise
      */
    def reisadvies(params: js.Object, callback: js.Function2[/* err */ String, /* data */ js.Object, Unit]): Unit = js.native
    
    def stations(callback: js.Function2[/* err */ String, /* data */ js.Object, Unit]): Unit = js.native
    /**
      * List available stations
      *
      * @param [treeKey] - Group by this key
      */
    def stations(treeKey: String, callback: js.Function2[/* err */ String, /* data */ js.Object, Unit]): Unit = js.native
    
    /** List disruptions */
    def storingen(params: js.Object, callback: js.Function2[/* err */ String, /* data */ js.Object, Unit]): Unit = js.native
    
    /**
      * Vertrektijden - departure times
      *
      * @param station - Station ID
      */
    def vertrektijden(station: String, callback: js.Function2[/* err */ String, /* data */ js.Object, Unit]): Unit = js.native
  }
}
