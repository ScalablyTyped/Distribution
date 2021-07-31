package typings.pbkdf2

import typings.node.Buffer
import typings.std.DataView
import typings.std.Error
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pbkdf2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def pbkdf2(
    password: String,
    salt: String,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: String,
    salt: String,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: String,
    salt: Buffer,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: String,
    salt: Buffer,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: String,
    salt: TypedArray,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: String,
    salt: TypedArray,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: String,
    salt: DataView,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: String,
    salt: DataView,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: Buffer,
    salt: String,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: Buffer,
    salt: String,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: Buffer,
    salt: Buffer,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: Buffer,
    salt: Buffer,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: Buffer,
    salt: TypedArray,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: Buffer,
    salt: TypedArray,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: Buffer,
    salt: DataView,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: Buffer,
    salt: DataView,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: TypedArray,
    salt: String,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: TypedArray,
    salt: String,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: TypedArray,
    salt: Buffer,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: TypedArray,
    salt: Buffer,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: TypedArray,
    salt: TypedArray,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: TypedArray,
    salt: TypedArray,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: TypedArray,
    salt: DataView,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: TypedArray,
    salt: DataView,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: DataView,
    salt: String,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: DataView,
    salt: String,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: DataView,
    salt: Buffer,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: DataView,
    salt: Buffer,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: DataView,
    salt: TypedArray,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: DataView,
    salt: TypedArray,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: DataView,
    salt: DataView,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: DataView,
    salt: DataView,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def pbkdf2Sync(password: String, salt: String, iterations: Double, keylen: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: String, salt: String, iterations: Double, keylen: Double, digest: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: String, salt: Buffer, iterations: Double, keylen: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: String, salt: Buffer, iterations: Double, keylen: Double, digest: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: String, salt: TypedArray, iterations: Double, keylen: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: String, salt: TypedArray, iterations: Double, keylen: Double, digest: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: String, salt: DataView, iterations: Double, keylen: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: String, salt: DataView, iterations: Double, keylen: Double, digest: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: Buffer, salt: String, iterations: Double, keylen: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: Buffer, salt: String, iterations: Double, keylen: Double, digest: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: Buffer, salt: Buffer, iterations: Double, keylen: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: Buffer, salt: Buffer, iterations: Double, keylen: Double, digest: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: Buffer, salt: TypedArray, iterations: Double, keylen: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: Buffer, salt: TypedArray, iterations: Double, keylen: Double, digest: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: Buffer, salt: DataView, iterations: Double, keylen: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: Buffer, salt: DataView, iterations: Double, keylen: Double, digest: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: TypedArray, salt: String, iterations: Double, keylen: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: TypedArray, salt: String, iterations: Double, keylen: Double, digest: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: TypedArray, salt: Buffer, iterations: Double, keylen: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: TypedArray, salt: Buffer, iterations: Double, keylen: Double, digest: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: TypedArray, salt: TypedArray, iterations: Double, keylen: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: TypedArray, salt: TypedArray, iterations: Double, keylen: Double, digest: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: TypedArray, salt: DataView, iterations: Double, keylen: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: TypedArray, salt: DataView, iterations: Double, keylen: Double, digest: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: DataView, salt: String, iterations: Double, keylen: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: DataView, salt: String, iterations: Double, keylen: Double, digest: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: DataView, salt: Buffer, iterations: Double, keylen: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: DataView, salt: Buffer, iterations: Double, keylen: Double, digest: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: DataView, salt: TypedArray, iterations: Double, keylen: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: DataView, salt: TypedArray, iterations: Double, keylen: Double, digest: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: DataView, salt: DataView, iterations: Double, keylen: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pbkdf2Sync(password: DataView, salt: DataView, iterations: Double, keylen: Double, digest: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  // No need to export this
  type TypedArray = Int8Array | Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array
}
