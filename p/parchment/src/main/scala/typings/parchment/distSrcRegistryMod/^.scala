package typings.parchment.distSrcRegistryMod

import typings.parchment.distSrcAttributorAttributorMod.default
import typings.parchment.distSrcBlotAbstractBlotMod.Blot
import typings.parchment.parchmentStrings.__blot
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/registry", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DATA_KEY: __blot = js.native
  def create(input: String): Blot = js.native
  def create(input: String, value: js.Any): Blot = js.native
  def create(input: Scope): Blot = js.native
  def create(input: Scope, value: js.Any): Blot = js.native
  def create(input: Node): Blot = js.native
  def create(input: Node, value: js.Any): Blot = js.native
  def find(): Blot | Null = js.native
  def find(node: Null, bubble: Boolean): Blot | Null = js.native
  def find(node: Node): Blot | Null = js.native
  def find(node: Node, bubble: Boolean): Blot | Null = js.native
  def query(query: String): default | BlotConstructor | Null = js.native
  def query(query: String, scope: Scope): default | BlotConstructor | Null = js.native
  def query(query: Scope): default | BlotConstructor | Null = js.native
  def query(query: Scope, scope: Scope): default | BlotConstructor | Null = js.native
  def query(query: Node): default | BlotConstructor | Null = js.native
  def query(query: Node, scope: Scope): default | BlotConstructor | Null = js.native
  def register(Definitions: js.Any*): js.Any = js.native
}

