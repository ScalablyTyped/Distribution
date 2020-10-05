package typings.node.anon

import typings.node.dnsMod.RecordWithTtl
import typings.node.dnsMod.ResolveOptions
import typings.node.dnsMod.ResolveWithTtlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallHostnameOptions extends js.Object {
  def apply(hostname: String): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
  def apply(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
}

