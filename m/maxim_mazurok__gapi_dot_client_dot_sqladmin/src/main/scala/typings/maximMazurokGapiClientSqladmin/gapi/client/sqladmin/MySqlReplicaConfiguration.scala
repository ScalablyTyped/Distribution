package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MySqlReplicaConfiguration extends js.Object {
  
  /** PEM representation of the trusted CA's x509 certificate. */
  var caCertificate: js.UndefOr[String] = js.native
  
  /** PEM representation of the replica's x509 certificate. */
  var clientCertificate: js.UndefOr[String] = js.native
  
  /** PEM representation of the replica's private key. The corresponsing public key is encoded in the client's certificate. */
  var clientKey: js.UndefOr[String] = js.native
  
  /** Seconds to wait between connect retries. MySQL's default is 60 seconds. */
  var connectRetryInterval: js.UndefOr[Double] = js.native
  
  /**
    * Path to a SQL dump file in Google Cloud Storage from which the replica instance is to be created. The URI is in the form gs://bucketName/fileName. Compressed gzip files (.gz) are
    * also supported. Dumps have the binlog co-ordinates from which replication begins. This can be accomplished by setting --master-data to 1 when using mysqldump.
    */
  var dumpFilePath: js.UndefOr[String] = js.native
  
  /** This is always *sql#mysqlReplicaConfiguration*. */
  var kind: js.UndefOr[String] = js.native
  
  /** Interval in milliseconds between replication heartbeats. */
  var masterHeartbeatPeriod: js.UndefOr[String] = js.native
  
  /** The password for the replication connection. */
  var password: js.UndefOr[String] = js.native
  
  /** A list of permissible ciphers to use for SSL encryption. */
  var sslCipher: js.UndefOr[String] = js.native
  
  /** The username for the replication connection. */
  var username: js.UndefOr[String] = js.native
  
  /** Whether or not to check the primary instance's Common Name value in the certificate that it sends during the SSL handshake. */
  var verifyServerCertificate: js.UndefOr[Boolean] = js.native
}
object MySqlReplicaConfiguration {
  
  @scala.inline
  def apply(): MySqlReplicaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MySqlReplicaConfiguration]
  }
  
  @scala.inline
  implicit class MySqlReplicaConfigurationOps[Self <: MySqlReplicaConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCaCertificate(value: String): Self = this.set("caCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaCertificate: Self = this.set("caCertificate", js.undefined)
    
    @scala.inline
    def setClientCertificate(value: String): Self = this.set("clientCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCertificate: Self = this.set("clientCertificate", js.undefined)
    
    @scala.inline
    def setClientKey(value: String): Self = this.set("clientKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientKey: Self = this.set("clientKey", js.undefined)
    
    @scala.inline
    def setConnectRetryInterval(value: Double): Self = this.set("connectRetryInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectRetryInterval: Self = this.set("connectRetryInterval", js.undefined)
    
    @scala.inline
    def setDumpFilePath(value: String): Self = this.set("dumpFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDumpFilePath: Self = this.set("dumpFilePath", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMasterHeartbeatPeriod(value: String): Self = this.set("masterHeartbeatPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterHeartbeatPeriod: Self = this.set("masterHeartbeatPeriod", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setSslCipher(value: String): Self = this.set("sslCipher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslCipher: Self = this.set("sslCipher", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    
    @scala.inline
    def setVerifyServerCertificate(value: Boolean): Self = this.set("verifyServerCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerifyServerCertificate: Self = this.set("verifyServerCertificate", js.undefined)
  }
}
