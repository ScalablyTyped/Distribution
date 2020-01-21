package typings.node.dnsMod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("dns", "lookup")
@js.native
object lookup extends js.Object {
  def apply(
    hostname: String,
    callback: js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    family: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    options: LookupAllOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[LookupAddress], Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    options: LookupOneOptions,
    callback: js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    options: LookupOptions,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* address */ String | js.Array[LookupAddress], 
      /* family */ Double, 
      Unit
    ]
  ): Unit = js.native
  @JSName("__promisify__")
  def promisify(hostname: String): js.Promise[LookupAddress] = js.native
  @JSName("__promisify__")
  def promisify(hostname: String, options: Double): js.Promise[LookupAddress] = js.native
  @JSName("__promisify__")
  def promisify(hostname: String, options: LookupAllOptions): js.Promise[js.Array[LookupAddress]] = js.native
  @JSName("__promisify__")
  def promisify(hostname: String, options: LookupOneOptions): js.Promise[LookupAddress] = js.native
  @JSName("__promisify__")
  def promisify(hostname: String, options: LookupOptions): js.Promise[LookupAddress | js.Array[LookupAddress]] = js.native
}

