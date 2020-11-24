package typings.oracledb.mod

import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides connection credentials and connection-specific configuration properties.
  */
@js.native
trait ConnectionAttributes extends js.Object {
  
  /**
    * An alias of connectionString. Only one of the properties should be used.
    * The Oracle database instance to connect to.
    * The string can be an Easy Connect string, or a Net Service Name from atnsnames.ora file, or the name of a local Oracle database instance.
    */
  var connectString: js.UndefOr[String] = js.native
  
  /**
    * An alias of connectString. Only one of the properties should be used.
    * The Oracle database instance to connect to.
    * The string can be an Easy Connect string, or a Net Service Name from atnsnames.ora file, or the name of a local Oracle database instance.
    *
    * @since 2.1
    */
  var connectionString: js.UndefOr[String] = js.native
  
  /**
    * Sets the name used for Edition-Based Redefinition by this connection.
    * This optional property overrides the oracledb.edition property.
    *
    * @since 2.2
    */
  var edition: js.UndefOr[String] = js.native
  
  /**
    * Determines if the standalone connection is created using Oracle Call Interface events mode.
    * This optional property overrides the oracledb.events property.
    *
    * @default false
    * @since 2.2
    */
  var events: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines if the connection should be established using External Authentication.
    * This optional property overrides the oracledb.externalAuth property.
    * The user and password properties should not be set when externalAuth is true.
    *
    * @default false
    */
  var externalAuth: js.UndefOr[Boolean] = js.native
  
  /**
    * Used in conjunction with tag when getting a connection from a connection pool.
    * Indicates that the tag in a connection returned from a connection pool may not match the requested tag.
    *
    * @default false
    * @since 3.1
    */
  var matchAny: js.UndefOr[Boolean] = js.native
  
  /**
    * The new password to use for the database user. When using newPassword, the password property should be set to the current password.
    * This allows passwords to be changed at the time of connection, in particular it can be used to connect when the old password has expired.
    *
    * @since 2.2
    */
  var newPassword: js.UndefOr[String] = js.native
  
  /**
    * Specifies which previously created pool in the connection pool cache to obtain the connection from. See Pool Alias.
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * The password of the database user. A password is also necessary if a proxy user is specified.
    */
  var poolAlias: js.UndefOr[String] = js.native
  
  /**
    * The privilege to use when establishing connection to the database.
    * This optional property should be one of the privileged connection constants.
    * Note only non-pooled connections can be privileged.
    *
    * @since 2.1
    */
  var privilege: js.UndefOr[Double] = js.native
  
  /**
    * Allows a connection to be established directly to a database shard.
    * 
    * @see https://oracle.github.io/node-oracledb/doc/api.html#sharding
    * @since 4.1
    */
  var shardingKey: js.UndefOr[js.Array[String | Double | Date | Buffer]] = js.native
  
  /**
    * The number of statements to be cached in the statement cache of each connection.
    * This optional property may be used to override the oracledb.stmtCacheSize property.
    */
  var stmtCacheSize: js.UndefOr[Double] = js.native
  
  /**
    * Allows a connection to be established directly to a database shard.
    * 
    * @see https://oracle.github.io/node-oracledb/doc/api.html#sharding
    * @since 4.1
    */
  var superShardingKey: js.UndefOr[js.Array[String | Double | Date | Buffer]] = js.native
  
  /**
    * Used when getting a connection from a connection pool.
    * Indicates the tag that a connection returned from a connection pool should have.
    * Various heuristics determine the tag that is actually returned.
    *
    * @since 3.1
    */
  var tag: js.UndefOr[String] = js.native
  
  /**
    * The database user name. Can be a simple user name or a proxy of the form alison[fred].
    */
  var user: js.UndefOr[String] = js.native
}
object ConnectionAttributes {
  
  @scala.inline
  def apply(): ConnectionAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionAttributes]
  }
  
  @scala.inline
  implicit class ConnectionAttributesOps[Self <: ConnectionAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnectString(value: String): Self = this.set("connectString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectString: Self = this.set("connectString", js.undefined)
    
    @scala.inline
    def setConnectionString(value: String): Self = this.set("connectionString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionString: Self = this.set("connectionString", js.undefined)
    
    @scala.inline
    def setEdition(value: String): Self = this.set("edition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdition: Self = this.set("edition", js.undefined)
    
    @scala.inline
    def setEvents(value: Boolean): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setExternalAuth(value: Boolean): Self = this.set("externalAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalAuth: Self = this.set("externalAuth", js.undefined)
    
    @scala.inline
    def setMatchAny(value: Boolean): Self = this.set("matchAny", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchAny: Self = this.set("matchAny", js.undefined)
    
    @scala.inline
    def setNewPassword(value: String): Self = this.set("newPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewPassword: Self = this.set("newPassword", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPoolAlias(value: String): Self = this.set("poolAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoolAlias: Self = this.set("poolAlias", js.undefined)
    
    @scala.inline
    def setPrivilege(value: Double): Self = this.set("privilege", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivilege: Self = this.set("privilege", js.undefined)
    
    @scala.inline
    def setShardingKeyVarargs(value: (String | Double | Date | Buffer)*): Self = this.set("shardingKey", js.Array(value :_*))
    
    @scala.inline
    def setShardingKey(value: js.Array[String | Double | Date | Buffer]): Self = this.set("shardingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShardingKey: Self = this.set("shardingKey", js.undefined)
    
    @scala.inline
    def setStmtCacheSize(value: Double): Self = this.set("stmtCacheSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStmtCacheSize: Self = this.set("stmtCacheSize", js.undefined)
    
    @scala.inline
    def setSuperShardingKeyVarargs(value: (String | Double | Date | Buffer)*): Self = this.set("superShardingKey", js.Array(value :_*))
    
    @scala.inline
    def setSuperShardingKey(value: js.Array[String | Double | Date | Buffer]): Self = this.set("superShardingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuperShardingKey: Self = this.set("superShardingKey", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
