package typings
package nodemailerLib.libDkimMod.DKIMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SingleKeyOptions extends OptionalOptions {
  /** is the domain name to use in the signature */
  var domainName: java.lang.String
  /** is the DKIM key selector */
  var keySelector: java.lang.String
  /** is the private key for the selector in PEM format */
  var privateKey: java.lang.String | nodemailerLib.Anon_Key
}

