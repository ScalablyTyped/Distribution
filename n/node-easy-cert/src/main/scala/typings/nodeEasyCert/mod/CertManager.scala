package typings.nodeEasyCert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertManager extends js.Object {
  /**
    * Clear all certificates in Root directory.
    *
    * @param callback Optional callback called when all certificates are cleared.
    */
  def clearCerts(): Unit = js.native
  def clearCerts(callback: js.Function0[_]): Unit = js.native
  /**
    * Generates a new Root CA certificate.
    *
    * @param config Configuration for the new Root CA.
    * @param callback Callback called when certificate is ready with key and cert paths.
    */
  def generateRootCA(config: GenerateConfig): Unit = js.native
  def generateRootCA(config: GenerateConfig, callback: GenerateCallback): Unit = js.native
  /**
    * Get or create a new Certificate for given hostname.
    *
    * @param hostname Hostname for the new certificate.
    * @param callback Callback called with key and cert content.
    */
  def getCertificate(hostname: String): Unit = js.native
  def getCertificate(hostname: String, callback: GetCertificateCallback): Unit = js.native
  /**
    * Get the Root CA file path.
    * If the Root CA file does not exist, returns `""`;
    */
  def getRootCAFilePath(): String = js.native
  /**
    * Get the Root directory path.
    * Root directory is the path where certificates are stored.
    */
  def getRootDirPath(): String = js.native
  /** Get whether Root CA certificate is trusted on this OS. */
  def ifRootCATrusted(): Boolean = js.native
  /** Get whether Root CA file exists. */
  def isRootCAFileExists(): Boolean = js.native
}

