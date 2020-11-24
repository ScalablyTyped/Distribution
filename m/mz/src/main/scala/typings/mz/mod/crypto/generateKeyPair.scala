package typings.mz.mod.crypto

import typings.mz.mzStrings.der
import typings.mz.mzStrings.dsa
import typings.mz.mzStrings.ec
import typings.mz.mzStrings.ed25519
import typings.mz.mzStrings.ed448
import typings.mz.mzStrings.pem
import typings.mz.mzStrings.rsa
import typings.mz.mzStrings.x25519
import typings.mz.mzStrings.x448
import typings.node.Buffer
import typings.node.cryptoMod.DSAKeyPairKeyObjectOptions
import typings.node.cryptoMod.DSAKeyPairOptions
import typings.node.cryptoMod.ECKeyPairKeyObjectOptions
import typings.node.cryptoMod.ECKeyPairOptions
import typings.node.cryptoMod.ED25519KeyPairKeyObjectOptions
import typings.node.cryptoMod.ED25519KeyPairOptions
import typings.node.cryptoMod.ED448KeyPairKeyObjectOptions
import typings.node.cryptoMod.ED448KeyPairOptions
import typings.node.cryptoMod.RSAKeyPairKeyObjectOptions
import typings.node.cryptoMod.RSAKeyPairOptions
import typings.node.cryptoMod.X25519KeyPairKeyObjectOptions
import typings.node.cryptoMod.X25519KeyPairOptions
import typings.node.cryptoMod.X448KeyPairKeyObjectOptions
import typings.node.cryptoMod.X448KeyPairOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz", "crypto.generateKeyPair")
@js.native
object generateKeyPair extends js.Object {
  
  def apply(
    `type`: dsa,
    options: DSAKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ Error | Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: dsa,
    options: DSAKeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: ec,
    options: ECKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ Error | Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: ec,
    options: ECKeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: ed25519,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ Error | Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: ed25519,
    options: ED25519KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ Error | Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: ed25519,
    options: ED25519KeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: ed448,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ Error | Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: ed448,
    options: ED448KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ Error | Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: ed448,
    options: ED448KeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: rsa,
    options: RSAKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ Error | Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: rsa,
    options: RSAKeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: x25519,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ Error | Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: x25519,
    options: X25519KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ Error | Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: x25519,
    options: X25519KeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: x448,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ Error | Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: x448,
    options: X448KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ Error | Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: x448,
    options: X448KeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
}
