package typings.oracledb.mod

import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides connection credentials and connection-specific configuration properties.
  */
trait ConnectionAttributes extends StObject {
  
  /**
    * An alias of connectionString. Only one of the properties should be used.
    * The Oracle database instance to connect to.
    * The string can be an Easy Connect string, or a Net Service Name from atnsnames.ora file, or the name of a local Oracle database instance.
    */
  var connectString: js.UndefOr[String] = js.undefined
  
  /**
    * An alias of connectString. Only one of the properties should be used.
    * The Oracle database instance to connect to.
    * The string can be an Easy Connect string, or a Net Service Name from atnsnames.ora file, or the name of a local Oracle database instance.
    *
    * @since 2.1
    */
  var connectionString: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the name used for Edition-Based Redefinition by this connection.
    * This optional property overrides the oracledb.edition property.
    *
    * @since 2.2
    */
  var edition: js.UndefOr[String] = js.undefined
  
  /**
    * Determines if the standalone connection is created using Oracle Call Interface events mode.
    * This optional property overrides the oracledb.events property.
    *
    * @default false
    * @since 2.2
    */
  var events: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines if the connection should be established using External Authentication.
    * This optional property overrides the oracledb.externalAuth property.
    * The user and password properties should not be set when externalAuth is true.
    *
    * @default false
    */
  var externalAuth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Used in conjunction with tag when getting a connection from a connection pool.
    * Indicates that the tag in a connection returned from a connection pool may not match the requested tag.
    *
    * @default false
    * @since 3.1
    */
  var matchAny: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The new password to use for the database user. When using newPassword, the password property should be set to the current password.
    * This allows passwords to be changed at the time of connection, in particular it can be used to connect when the old password has expired.
    *
    * @since 2.2
    */
  var newPassword: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies which previously created pool in the connection pool cache to obtain the connection from. See Pool Alias.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * The password of the database user. A password is also necessary if a proxy user is specified.
    */
  var poolAlias: js.UndefOr[String] = js.undefined
  
  /**
    * The privilege to use when establishing connection to the database.
    * This optional property should be one of the privileged connection constants.
    * Note only non-pooled connections can be privileged.
    *
    * @since 2.1
    */
  var privilege: js.UndefOr[Double] = js.undefined
  
  /**
    * Allows a connection to be established directly to a database shard.
    * 
    * @see https://oracle.github.io/node-oracledb/doc/api.html#sharding
    * @since 4.1
    */
  var shardingKey: js.UndefOr[js.Array[String | Double | Date | Buffer]] = js.undefined
  
  /**
    * The number of statements to be cached in the statement cache of each connection.
    * This optional property may be used to override the oracledb.stmtCacheSize property.
    */
  var stmtCacheSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Allows a connection to be established directly to a database shard.
    * 
    * @see https://oracle.github.io/node-oracledb/doc/api.html#sharding
    * @since 4.1
    */
  var superShardingKey: js.UndefOr[js.Array[String | Double | Date | Buffer]] = js.undefined
  
  /**
    * Used when getting a connection from a connection pool.
    * Indicates the tag that a connection returned from a connection pool should have.
    * Various heuristics determine the tag that is actually returned.
    *
    * @since 3.1
    */
  var tag: js.UndefOr[String] = js.undefined
  
  /**
    * The database user name. Can be a simple user name or a proxy of the form alison[fred].
    */
  var user: js.UndefOr[String] = js.undefined
}
object ConnectionAttributes {
  
  inline def apply(): ConnectionAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionAttributes]
  }
  
  extension [Self <: ConnectionAttributes](x: Self) {
    
    inline def setConnectString(value: String): Self = StObject.set(x, "connectString", value.asInstanceOf[js.Any])
    
    inline def setConnectStringUndefined: Self = StObject.set(x, "connectString", js.undefined)
    
    inline def setConnectionString(value: String): Self = StObject.set(x, "connectionString", value.asInstanceOf[js.Any])
    
    inline def setConnectionStringUndefined: Self = StObject.set(x, "connectionString", js.undefined)
    
    inline def setEdition(value: String): Self = StObject.set(x, "edition", value.asInstanceOf[js.Any])
    
    inline def setEditionUndefined: Self = StObject.set(x, "edition", js.undefined)
    
    inline def setEvents(value: Boolean): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setExternalAuth(value: Boolean): Self = StObject.set(x, "externalAuth", value.asInstanceOf[js.Any])
    
    inline def setExternalAuthUndefined: Self = StObject.set(x, "externalAuth", js.undefined)
    
    inline def setMatchAny(value: Boolean): Self = StObject.set(x, "matchAny", value.asInstanceOf[js.Any])
    
    inline def setMatchAnyUndefined: Self = StObject.set(x, "matchAny", js.undefined)
    
    inline def setNewPassword(value: String): Self = StObject.set(x, "newPassword", value.asInstanceOf[js.Any])
    
    inline def setNewPasswordUndefined: Self = StObject.set(x, "newPassword", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPoolAlias(value: String): Self = StObject.set(x, "poolAlias", value.asInstanceOf[js.Any])
    
    inline def setPoolAliasUndefined: Self = StObject.set(x, "poolAlias", js.undefined)
    
    inline def setPrivilege(value: Double): Self = StObject.set(x, "privilege", value.asInstanceOf[js.Any])
    
    inline def setPrivilegeUndefined: Self = StObject.set(x, "privilege", js.undefined)
    
    inline def setShardingKey(value: js.Array[String | Double | Date | Buffer]): Self = StObject.set(x, "shardingKey", value.asInstanceOf[js.Any])
    
    inline def setShardingKeyUndefined: Self = StObject.set(x, "shardingKey", js.undefined)
    
    inline def setShardingKeyVarargs(value: (String | Double | Date | Buffer)*): Self = StObject.set(x, "shardingKey", js.Array(value :_*))
    
    inline def setStmtCacheSize(value: Double): Self = StObject.set(x, "stmtCacheSize", value.asInstanceOf[js.Any])
    
    inline def setStmtCacheSizeUndefined: Self = StObject.set(x, "stmtCacheSize", js.undefined)
    
    inline def setSuperShardingKey(value: js.Array[String | Double | Date | Buffer]): Self = StObject.set(x, "superShardingKey", value.asInstanceOf[js.Any])
    
    inline def setSuperShardingKeyUndefined: Self = StObject.set(x, "superShardingKey", js.undefined)
    
    inline def setSuperShardingKeyVarargs(value: (String | Double | Date | Buffer)*): Self = StObject.set(x, "superShardingKey", js.Array(value :_*))
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
