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
    hostname: java.lang.String,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* address */ java.lang.String, 
      /* family */ Double, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    hostname: java.lang.String,
    family: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* address */ java.lang.String, 
      /* family */ Double, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    hostname: java.lang.String,
    options: LookupAllOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[LookupAddress], Unit]
  ): Unit = js.native
  def apply(
    hostname: java.lang.String,
    options: LookupOneOptions,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* address */ java.lang.String, 
      /* family */ Double, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    hostname: java.lang.String,
    options: LookupOptions,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* address */ java.lang.String | js.Array[LookupAddress], 
      /* family */ Double, 
      Unit
    ]
  ): Unit = js.native
  def __promisify__(hostname: java.lang.String): js.Promise[LookupAddress] = js.native
  def __promisify__(hostname: java.lang.String, options: Double): js.Promise[LookupAddress] = js.native
  def __promisify__(hostname: java.lang.String, options: LookupAllOptions): js.Promise[js.Array[LookupAddress]] = js.native
  def __promisify__(hostname: java.lang.String, options: LookupOneOptions): js.Promise[LookupAddress] = js.native
  def __promisify__(hostname: java.lang.String, options: LookupOptions): js.Promise[LookupAddress | js.Array[LookupAddress]] = js.native
}

