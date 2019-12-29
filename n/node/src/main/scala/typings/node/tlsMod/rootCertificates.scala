package typings.node.tlsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An immutable array of strings representing the root certificates (in PEM
  * format) used for verifying peer certificates. This is the default value
  * of the ca option to tls.createSecureContext().
  */
@JSImport("tls", "rootCertificates")
@js.native
object rootCertificates
  extends TopLevel[js.Array[String]]

