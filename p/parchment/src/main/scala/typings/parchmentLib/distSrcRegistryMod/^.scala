package typings
package parchmentLib.distSrcRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/registry", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DATA_KEY: parchmentLib.parchmentLibStrings.__blot = js.native
  def create(input: java.lang.String): parchmentLib.distSrcBlotAbstractBlotMod.Blot = js.native
  def create(input: java.lang.String, value: js.Any): parchmentLib.distSrcBlotAbstractBlotMod.Blot = js.native
  def create(input: Scope): parchmentLib.distSrcBlotAbstractBlotMod.Blot = js.native
  def create(input: Scope, value: js.Any): parchmentLib.distSrcBlotAbstractBlotMod.Blot = js.native
  def create(input: stdLib.Node): parchmentLib.distSrcBlotAbstractBlotMod.Blot = js.native
  def create(input: stdLib.Node, value: js.Any): parchmentLib.distSrcBlotAbstractBlotMod.Blot = js.native
  def find(): parchmentLib.distSrcBlotAbstractBlotMod.Blot | scala.Null = js.native
  def find(node: scala.Null, bubble: scala.Boolean): parchmentLib.distSrcBlotAbstractBlotMod.Blot | scala.Null = js.native
  def find(node: stdLib.Node): parchmentLib.distSrcBlotAbstractBlotMod.Blot | scala.Null = js.native
  def find(node: stdLib.Node, bubble: scala.Boolean): parchmentLib.distSrcBlotAbstractBlotMod.Blot | scala.Null = js.native
  def query(query: java.lang.String): parchmentLib.distSrcAttributorAttributorMod.default | BlotConstructor | scala.Null = js.native
  def query(query: java.lang.String, scope: Scope): parchmentLib.distSrcAttributorAttributorMod.default | BlotConstructor | scala.Null = js.native
  def query(query: Scope): parchmentLib.distSrcAttributorAttributorMod.default | BlotConstructor | scala.Null = js.native
  def query(query: Scope, scope: Scope): parchmentLib.distSrcAttributorAttributorMod.default | BlotConstructor | scala.Null = js.native
  def query(query: stdLib.Node): parchmentLib.distSrcAttributorAttributorMod.default | BlotConstructor | scala.Null = js.native
  def query(query: stdLib.Node, scope: Scope): parchmentLib.distSrcAttributorAttributorMod.default | BlotConstructor | scala.Null = js.native
  def register(Definitions: js.Any*): js.Any = js.native
}

