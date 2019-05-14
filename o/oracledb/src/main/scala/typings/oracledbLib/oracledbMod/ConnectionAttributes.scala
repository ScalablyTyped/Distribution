package typings
package oracledbLib.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides connection credentials and connection-specific configuration properties.
  */
trait ConnectionAttributes extends js.Object {
  /**
    * An alias of connectionString. Only one of the properties should be used.
    * The Oracle database instance to connect to.
    * The string can be an Easy Connect string, or a Net Service Name from atnsnames.ora file, or the name of a local Oracle database instance.
    */
  var connectString: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An alias of connectString. Only one of the properties should be used.
    * The Oracle database instance to connect to.
    * The string can be an Easy Connect string, or a Net Service Name from atnsnames.ora file, or the name of a local Oracle database instance.
    *
    * @since 2.1
    */
  var connectionString: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the name used for Edition-Based Redefinition by this connection.
    * This optional property overrides the oracledb.edition property.
    *
    * @since 2.2
    */
  var edition: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Determines if the standalone connection is created using Oracle Call Interface events mode.
    * This optional property overrides the oracledb.events property.
    *
    * @default false
    * @since 2.2
    */
  var events: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Determines if the connection should be established using External Authentication.
    * This optional property overrides the oracledb.externalAuth property.
    * The user and password properties should not be set when externalAuth is true.
    *
    * @default false
    */
  var externalAuth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Used in conjunction with tag when getting a connection from a connection pool.
    * Indicates that the tag in a connection returned from a connection pool may not match the requested tag.
    *
    * @default false
    * @since 3.1
    */
  var matchAny: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The new password to use for the database user. When using newPassword, the password property should be set to the current password.
    * This allows passwords to be changed at the time of connection, in particular it can be used to connect when the old password has expired.
    *
    * @since 2.2
    */
  var newPassword: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies which previously created pool in the connection pool cache to obtain the connection from. See Pool Alias.
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The password of the database user. A password is also necessary if a proxy user is specified.
    */
  var poolAlias: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The privilege to use when establishing connection to the database.
    * This optional property should be one of the privileged connection constants.
    * Note only non-pooled connections can be privileged.
    *
    * @since 2.1
    */
  var privilege: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of statements to be cached in the statement cache of each connection.
    * This optional property may be used to override the oracledb.stmtCacheSize property.
    */
  var stmtCacheSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Used when getting a connection from a connection pool.
    * Indicates the tag that a connection returned from a connection pool should have.
    * Various heuristics determine the tag that is actually returned.
    *
    * @since 3.1
    */
  var tag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The database user name. Can be a simple user name or a proxy of the form alison[fred].
    */
  var user: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectionAttributes {
  @scala.inline
  def apply(
    connectString: java.lang.String = null,
    connectionString: java.lang.String = null,
    edition: java.lang.String = null,
    events: js.UndefOr[scala.Boolean] = js.undefined,
    externalAuth: js.UndefOr[scala.Boolean] = js.undefined,
    matchAny: js.UndefOr[scala.Boolean] = js.undefined,
    newPassword: java.lang.String = null,
    password: java.lang.String = null,
    poolAlias: java.lang.String = null,
    privilege: scala.Int | scala.Double = null,
    stmtCacheSize: scala.Int | scala.Double = null,
    tag: java.lang.String = null,
    user: java.lang.String = null
  ): ConnectionAttributes = {
    val __obj = js.Dynamic.literal()
    if (connectString != null) __obj.updateDynamic("connectString")(connectString)
    if (connectionString != null) __obj.updateDynamic("connectionString")(connectionString)
    if (edition != null) __obj.updateDynamic("edition")(edition)
    if (!js.isUndefined(events)) __obj.updateDynamic("events")(events)
    if (!js.isUndefined(externalAuth)) __obj.updateDynamic("externalAuth")(externalAuth)
    if (!js.isUndefined(matchAny)) __obj.updateDynamic("matchAny")(matchAny)
    if (newPassword != null) __obj.updateDynamic("newPassword")(newPassword)
    if (password != null) __obj.updateDynamic("password")(password)
    if (poolAlias != null) __obj.updateDynamic("poolAlias")(poolAlias)
    if (privilege != null) __obj.updateDynamic("privilege")(privilege.asInstanceOf[js.Any])
    if (stmtCacheSize != null) __obj.updateDynamic("stmtCacheSize")(stmtCacheSize.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[ConnectionAttributes]
  }
}

