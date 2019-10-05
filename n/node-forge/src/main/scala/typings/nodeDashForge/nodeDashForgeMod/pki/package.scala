package typings.nodeDashForge.nodeDashForgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pki {
  import org.scalablytyped.runtime.StringDictionary
  import typings.nodeDashForge.nodeDashForgeMod.jsbn.BigInteger
  import typings.nodeDashForge.nodeDashForgeMod.pki.ed25519.Key

  type PEM = String
  type PrivateKey = typings.nodeDashForge.nodeDashForgeMod.pki.rsa.PrivateKey | Key
  type PublicKey = typings.nodeDashForge.nodeDashForgeMod.pki.rsa.PublicKey | Key
  type oids = StringDictionary[String]
  type setRsaPublicKey = js.Function2[
    /* n */ BigInteger, 
    /* e */ BigInteger, 
    typings.nodeDashForge.nodeDashForgeMod.pki.rsa.PublicKey
  ]
}
