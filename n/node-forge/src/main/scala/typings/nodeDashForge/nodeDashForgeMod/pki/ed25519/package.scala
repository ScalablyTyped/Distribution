package typings.nodeDashForge.nodeDashForgeMod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ed25519 {
  import typings.node.Buffer
  import typings.nodeDashForge.nodeDashForgeMod.util.ByteBuffer
  import typings.std.Uint8Array

  // `string`s will be converted by toNativeBuffer with `encoding: 'binary'`
  type BinaryBuffer = NativeBuffer | ByteBuffer | String
  type Key = NativeBuffer
  type NativeBuffer = Buffer | Uint8Array
}
