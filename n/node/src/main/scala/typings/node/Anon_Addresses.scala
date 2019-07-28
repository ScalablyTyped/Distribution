package typings.node

import typings.node.NodeJSNs.ErrnoException
import typings.node.dnsMod.RecordWithTtl
import typings.node.dnsMod.ResolveOptions
import typings.node.dnsMod.ResolveWithTtlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Addresses extends js.Object {
  def apply(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  def apply(
    hostname: java.lang.String,
    options: ResolveOptions,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ js.Array[RecordWithTtl | java.lang.String], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    hostname: java.lang.String,
    options: ResolveWithTtlOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[RecordWithTtl], Unit]
  ): Unit = js.native
  def __promisify__(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def __promisify__(hostname: java.lang.String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | java.lang.String]] = js.native
  def __promisify__(hostname: java.lang.String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
}

