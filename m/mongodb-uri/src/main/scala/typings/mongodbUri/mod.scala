package typings.mongodbUri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mongodb-uri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def format(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")().asInstanceOf[String]
  @scala.inline
  def format(uriObject: UriObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(uriObject.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def formatMongoose(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatMongoose")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def formatMongoose(uri: UriObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatMongoose")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def parse(uri: String): UriObject = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(uri.asInstanceOf[js.Any]).asInstanceOf[UriObject]
  
  trait Host extends StObject {
    
    var host: String
    
    var port: js.UndefOr[Double] = js.undefined
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
  
  trait UriObject extends StObject {
    
    var database: js.UndefOr[String] = js.undefined
    
    var hosts: js.Array[Host]
    
    var options: js.UndefOr[js.Any] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var scheme: String
    
    var username: js.UndefOr[String] = js.undefined
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
  
  trait parserOptions extends StObject {
    
    var scheme: String
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
