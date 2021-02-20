package typings.mongodbUri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mongodb-uri", "MongodbUriParser")
  @js.native
  class MongodbUriParser () extends StObject {
    def this(options: parserOptions) = this()
    
    /**
      * Takes a URI object and returns a URI string of the form:
      *
      *   mongodb://[username[:password]@]host1[:port1][,host2[:port2],...[,hostN[:portN]]][/[database]][?options]
      *
      */
    def format(): String = js.native
    def format(uriObject: UriObject): String = js.native
    
    def formatMongoose(uri: String): String = js.native
    /**
      * Takes either a URI object or string and returns a Mongoose connection string. Specifically, instead of listing all
      * hosts and ports in a single URI, a Mongoose connection string contains a list of URIs each with a single host and
      * port pair.
      *
      * Useful in environments where a MongoDB URI environment variable is provided, but needs to be programmatically
      * transformed into a string digestible by mongoose.connect()--for example, when deploying to a PaaS like Heroku
      * using a MongoDB add-on like MongoLab.
      *
      */
    def formatMongoose(uri: UriObject): String = js.native
    
    /**
      * Takes a URI of the form:
      *
      *   mongodb://[username[:password]@]host1[:port1][,host2[:port2],...[,hostN[:portN]]][/[database]][?options]
      *
      * scheme and hosts will always be present. Other fields will only be present in the result if they were
      * present in the input.
      */
    def parse(uri: String): UriObject = js.native
  }
  
  @JSImport("mongodb-uri", "format")
  @js.native
  def format(): String = js.native
  @JSImport("mongodb-uri", "format")
  @js.native
  def format(uriObject: UriObject): String = js.native
  
  @JSImport("mongodb-uri", "formatMongoose")
  @js.native
  def formatMongoose(uri: String): String = js.native
  @JSImport("mongodb-uri", "formatMongoose")
  @js.native
  def formatMongoose(uri: UriObject): String = js.native
  
  @JSImport("mongodb-uri", "parse")
  @js.native
  def parse(uri: String): UriObject = js.native
  
  @js.native
  trait Host extends StObject {
    
    var host: String = js.native
    
    var port: js.UndefOr[Double] = js.native
  }
  object Host {
    
    @scala.inline
    def apply(host: String): Host = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  @js.native
  trait UriObject extends StObject {
    
    var database: js.UndefOr[String] = js.native
    
    var hosts: js.Array[Host] = js.native
    
    var options: js.UndefOr[js.Any] = js.native
    
    var password: js.UndefOr[String] = js.native
    
    var scheme: String = js.native
    
    var username: js.UndefOr[String] = js.native
  }
  object UriObject {
    
    @scala.inline
    def apply(hosts: js.Array[Host], scheme: String): UriObject = {
      val __obj = js.Dynamic.literal(hosts = hosts.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[UriObject]
    }
    
    @scala.inline
    implicit class UriObjectMutableBuilder[Self <: UriObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      @scala.inline
      def setHosts(value: js.Array[Host]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostsVarargs(value: Host*): Self = StObject.set(x, "hosts", js.Array(value :_*))
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  @js.native
  trait parserOptions extends StObject {
    
    var scheme: String = js.native
  }
  object parserOptions {
    
    @scala.inline
    def apply(scheme: String): parserOptions = {
      val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[parserOptions]
    }
    
    @scala.inline
    implicit class parserOptionsMutableBuilder[Self <: parserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    }
  }
}
