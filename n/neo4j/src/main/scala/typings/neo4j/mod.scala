package typings.neo4j

import typings.request.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("neo4j", "GraphDatabase")
  @js.native
  open class GraphDatabase protected () extends StObject {
    /**
      * Constructor.
      * @constructor
      * @param {GraphDatabaseOptions} options Connection options.
      */
    def this(options: GraphDatabaseOptions) = this()
    /**
      * Constructor.
      * @constructor
      * @param {string} url A URL connection.
      */
    def this(url: String) = this()
    
    /**
      * Agent.
      * @type {any}
      */
    var agent: Any = js.native
    
    /**
      * Credentials.
      * @type {Authentication}
      */
    var auth: Authentication = js.native
    
    /**
      * Makes multiple queries, across multiple network requests, all within a single transaction.
      * @return {Transaction} The transaction.
      */
    def beginTransaction(): Transaction = js.native
    
    /**
      * Changes password.
      * @param {ChangePasswordOptions}   options     Options.
      * @param {DoneCallback}            callback    A callback.
      */
    def changePassword(options: ChangePasswordOptions, callback: DoneCallback): Unit = js.native
    
    /**
      * Checks if the password must be changed.
      * @param {Function} callback A callback.
      */
    def checkPasswordChangeNeeded(callback: js.Function2[/* error */ Any, /* changed */ Boolean, Unit]): Unit = js.native
    
    /**
      * Creates a constraint.
      * @param {ConstraintOptions}   options   Options.
      * @param {ResultCallback}      callback  A callback.
      */
    def createConstraint(options: ConstraintOptions, callback: ResultCallback): Unit = js.native
    
    /**
      * Makes simple, parametrized Cypher queries.
      * @param {CypherOptions}   options     Options.
      * @param {ResultCallback}  callback    A callback.
      */
    def cypher(options: CypherOptions, callback: ResultCallback): Request = js.native
    
    /**
      * Drops a constraint.
      * @param {ConstraintOptions}   options   Options.
      * @param {DoneCallback}        callback  A callback.
      */
    def dropConstraint(options: ConstraintOptions, callback: DoneCallback): Unit = js.native
    
    /**
      * Drop an index.
      * @param {IndexOptions}    options   Options.
      * @param {DoneCallback}    callback  A callback.
      */
    def dropIndex(options: IndexOptions, callback: DoneCallback): Unit = js.native
    
    /**
      * Gets constraints.
      * @param {ConstraintOptions}   options     Options or callback.
      * @param {ResultCallback}      callback    A callback.
      */
    def getConstraints(options: ConstraintOptions): Unit = js.native
    def getConstraints(options: ConstraintOptions, callback: ResultCallback): Unit = js.native
    
    /**
      * Gets indexes.
      * @param {ResultCallback} callback A callback.
      */
    def getIndexes(): Unit = js.native
    def getIndexes(callback: ResultCallback): Unit = js.native
    /**
      * Gets indexes.
      * @param {IndexOptions}    options     Options.
      * @param {ResultCallback}  callback    A callback.
      */
    def getIndexes(options: IndexOptions, callback: ResultCallback): Unit = js.native
    
    /**
      * Get labels.
      * @param {ResultCallback} callback A callback.
      */
    def getLabels(callback: ResultCallback): Unit = js.native
    
    /**
      * Gets property keys.
      * @param {ResultCallback} callback A callback.
      */
    def getPropertyKeys(callback: ResultCallback): Unit = js.native
    
    /**
      * Gets relationship types.
      * @param {ResultCallback} callback A callback.
      */
    def getRelationshipTypes(callback: ResultCallback): Unit = js.native
    
    /**
      * Determines if a constraint exists.
      * @param {ConstraintOptions}   options   Options.
      * @param {Function}            callback  A callback.
      */
    def hasConstraint(options: ConstraintOptions, callback: js.Function2[/* error */ Any, /* exists */ Boolean, Unit]): Unit = js.native
    
    /**
      * Determines if an index exists.
      * @param {IndexOptions}    options   Options.
      * @param {Function}        callback  A callback.
      */
    def hasIndex(options: IndexOptions, callback: js.Function2[/* error */ Any, /* exists */ Boolean, Unit]): Unit = js.native
    
    /**
      * Makes arbitrary HTTP request to the REST API.
      * @param {HttpOptions}     options     Options.
      * @param {ResultCallback}  callback    A callback.
      * @return {Request} The HTTP request.
      */
    def http(options: HttpOptions, callback: ResultCallback): Request = js.native
    
    /**
      * Proxy.
      * @type {any}
      */
    var proxy: Any = js.native
    
    /**
      * URL connection.
      * @type {string}
      */
    var url: String = js.native
  }
  
  trait Authentication extends StObject {
    
    var password: String
    
    var username: String
  }
  object Authentication {
    
    inline def apply(password: String, username: String): Authentication = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Authentication]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Authentication] (val x: Self) extends AnyVal {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChangePasswordOptions extends StObject {
    
    var password: String
  }
  object ChangePasswordOptions {
    
    inline def apply(password: String): ChangePasswordOptions = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangePasswordOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangePasswordOptions] (val x: Self) extends AnyVal {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConstraintOptions extends StObject {
    
    var label: js.UndefOr[Any] = js.undefined
    
    var property: js.UndefOr[Any] = js.undefined
  }
  object ConstraintOptions {
    
    inline def apply(): ConstraintOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstraintOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstraintOptions] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setProperty(value: Any): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    }
  }
  
  trait CypherOptions extends StObject {
    
    var commit: js.UndefOr[js.Object] = js.undefined
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var lean: js.UndefOr[js.Object] = js.undefined
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var query: js.UndefOr[js.Object] = js.undefined
  }
  object CypherOptions {
    
    inline def apply(): CypherOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CypherOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CypherOptions] (val x: Self) extends AnyVal {
      
      inline def setCommit(value: js.Object): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      inline def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setLean(value: js.Object): Self = StObject.set(x, "lean", value.asInstanceOf[js.Any])
      
      inline def setLeanUndefined: Self = StObject.set(x, "lean", js.undefined)
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  type DoneCallback = js.Function1[/* error */ Any, Unit]
  
  trait GraphDatabaseOptions extends StObject {
    
    /**
      * HTTP agent.
      * @type {any}
      */
    var agent: js.UndefOr[Any] = js.undefined
    
    /**
      * Authentication information.
      * @type {string|Authentication}
      */
    var auth: String | Authentication
    
    /**
      * HTTP headers.
      * @type {Object}
      */
    var headers: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Proxy address.
      * @type {string}
      */
    var proxy: js.UndefOr[String] = js.undefined
    
    /**
      * URL connection.
      * @type {string}
      */
    var url: String
  }
  object GraphDatabaseOptions {
    
    inline def apply(auth: String | Authentication, url: String): GraphDatabaseOptions = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphDatabaseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GraphDatabaseOptions] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: Any): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAuth(value: String | Authentication): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait HttpOptions extends StObject {
    
    var body: Any
    
    var method: String
    
    var path: String
    
    var raw: Any
  }
  object HttpOptions {
    
    inline def apply(body: Any, method: String, path: String, raw: Any): HttpOptions = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpOptions] (val x: Self) extends AnyVal {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: Any): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  trait IndexOptions extends StObject {
    
    var label: js.UndefOr[Any] = js.undefined
    
    var property: js.UndefOr[Any] = js.undefined
  }
  object IndexOptions {
    
    inline def apply(): IndexOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndexOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IndexOptions] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setProperty(value: Any): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    }
  }
  
  type ResultCallback = js.Function2[/* error */ Any, /* result */ Any, Unit]
  
  trait Transaction extends StObject {
    
    def commit(callback: DoneCallback): Unit
    
    def cypher(options: CypherOptions, callback: ResultCallback): Request
    
    var expiresAt: js.Date
    
    var expiresIn: js.Date | Double
    
    def renew(callback: DoneCallback): Unit
    
    def rollback(callback: DoneCallback): Unit
    
    var state: String
  }
  object Transaction {
    
    inline def apply(
      commit: DoneCallback => Unit,
      cypher: (CypherOptions, ResultCallback) => Request,
      expiresAt: js.Date,
      expiresIn: js.Date | Double,
      renew: DoneCallback => Unit,
      rollback: DoneCallback => Unit,
      state: String
    ): Transaction = {
      val __obj = js.Dynamic.literal(commit = js.Any.fromFunction1(commit), cypher = js.Any.fromFunction2(cypher), expiresAt = expiresAt.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], renew = js.Any.fromFunction1(renew), rollback = js.Any.fromFunction1(rollback), state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transaction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Transaction] (val x: Self) extends AnyVal {
      
      inline def setCommit(value: DoneCallback => Unit): Self = StObject.set(x, "commit", js.Any.fromFunction1(value))
      
      inline def setCypher(value: (CypherOptions, ResultCallback) => Request): Self = StObject.set(x, "cypher", js.Any.fromFunction2(value))
      
      inline def setExpiresAt(value: js.Date): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
      
      inline def setExpiresIn(value: js.Date | Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setRenew(value: DoneCallback => Unit): Self = StObject.set(x, "renew", js.Any.fromFunction1(value))
      
      inline def setRollback(value: DoneCallback => Unit): Self = StObject.set(x, "rollback", js.Any.fromFunction1(value))
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
