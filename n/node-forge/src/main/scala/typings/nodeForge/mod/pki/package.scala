package typings.nodeForge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pki {
  type PEM = java.lang.String
  type PrivateKey = typings.nodeForge.mod.pki.rsa.PrivateKey | typings.nodeForge.mod.pki.ed25519.Key
  type PublicKey = typings.nodeForge.mod.pki.rsa.PublicKey | typings.nodeForge.mod.pki.ed25519.Key
  type oids = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type setRsaPublicKey = js.Function2[
    /* n */ typings.nodeForge.mod.jsbn.BigInteger, 
    /* e */ typings.nodeForge.mod.jsbn.BigInteger, 
    typings.nodeForge.mod.pki.rsa.PublicKey
  ]
}
