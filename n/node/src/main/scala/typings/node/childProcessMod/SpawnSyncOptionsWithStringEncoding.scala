package typings.node.childProcessMod

import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpawnSyncOptionsWithStringEncoding extends SpawnSyncOptions {
  @JSName("encoding")
  var encoding_SpawnSyncOptionsWithStringEncoding: BufferEncoding = js.native
}

object SpawnSyncOptionsWithStringEncoding {
  @scala.inline
  def apply(encoding: BufferEncoding): SpawnSyncOptionsWithStringEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpawnSyncOptionsWithStringEncoding]
  }
  @scala.inline
  implicit class SpawnSyncOptionsWithStringEncodingOps[Self <: SpawnSyncOptionsWithStringEncoding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = this.set("encoding", value.asInstanceOf[js.Any])
  }
  
}

