package typings.mdastUtilFromMarkdown.mod

import typings.mdast.mod.Root
import typings.micromark.sharedTypesMod.Buffer
import typings.micromark.sharedTypesMod.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mdast-util-from-markdown", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(value: String): Root = js.native
  def apply(value: String, encoding: js.UndefOr[scala.Nothing], options: Options): Root = js.native
  def apply(value: String, encoding: BufferEncoding): Root = js.native
  def apply(value: String, encoding: BufferEncoding, options: Options): Root = js.native
  def apply(value: String, options: Options): Root = js.native
  def apply(value: Buffer): Root = js.native
  def apply(value: Buffer, encoding: js.UndefOr[scala.Nothing], options: Options): Root = js.native
  def apply(value: Buffer, encoding: BufferEncoding): Root = js.native
  def apply(value: Buffer, encoding: BufferEncoding, options: Options): Root = js.native
  def apply(value: Buffer, options: Options): Root = js.native
}
