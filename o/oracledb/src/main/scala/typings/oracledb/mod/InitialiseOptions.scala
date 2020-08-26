package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitialiseOptions extends js.Object {
  /**
    * This specifies the directory in which the Optional Oracle Net Configuration and Optional Oracle Client Configuration files reside. It is equivalent to setting the Oracle environment variable TNS_ADMIN to this value. Any value in that environment variable prior to the call to oracledb.initOracleClient() is ignored. If this attribute is not set, Oracle’s default configuration file search heuristics are used.
    */
  var configDir: js.UndefOr[String] = js.native
  /**
    * This specifies the driver name value shown in database views, such as V$SESSION_CONNECT_INFO. It can be used by applications to identify themselves for tracing and monitoring purposes. The convention is to separate the product name from the product version by a colon and single space characters. If this attribute is not specified, the value “node-oracledb : version” is used.
    * 
    * @see https://oracle.github.io/node-oracledb/doc/api.html#otherinit
    */
  var driverName: js.UndefOr[String] = js.native
  /**
    * This specifies the URL that is included in the node-oracledb exception message if the Oracle Client libraries cannot be loaded. This allows applications that use node-oracledb to refer users to application-specific installation instructions. If this attribute is not specified, then the node-oracledb installation instructions URL is used. 
    * 
    * @see https://oracle.github.io/node-oracledb/doc/api.html#otherinit
    */
  var errorUrl: js.UndefOr[String] = js.native
  /**
    * This specifies the directory containing the Oracle Client libraries. If libDir is not specified, the default library search mechanism is used. If your client libraries are in a full Oracle Client or Oracle Database installation, such as Oracle Database “XE” Express Edition, then you must have previously set environment variables like ORACLE_HOME before calling initOracleClient().
    * 
    * @see https://oracle.github.io/node-oracledb/doc/api.html#oracleclientloading
    */
  var libDir: js.UndefOr[String] = js.native
}

object InitialiseOptions {
  @scala.inline
  def apply(): InitialiseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialiseOptions]
  }
  @scala.inline
  implicit class InitialiseOptionsOps[Self <: InitialiseOptions] (val x: Self) extends AnyVal {
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
    def setConfigDir(value: String): Self = this.set("configDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigDir: Self = this.set("configDir", js.undefined)
    @scala.inline
    def setDriverName(value: String): Self = this.set("driverName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriverName: Self = this.set("driverName", js.undefined)
    @scala.inline
    def setErrorUrl(value: String): Self = this.set("errorUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorUrl: Self = this.set("errorUrl", js.undefined)
    @scala.inline
    def setLibDir(value: String): Self = this.set("libDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLibDir: Self = this.set("libDir", js.undefined)
  }
  
}

