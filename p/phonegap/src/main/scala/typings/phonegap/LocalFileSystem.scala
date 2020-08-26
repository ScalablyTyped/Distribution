package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
interface LocalFileSystem {
  requestFileSystem: Function;
  resolveLocalFileSystemURI: Function;
}*/
@js.native
trait LocalFileSystem extends js.Object {
  var PERSISTENT: Double = js.native
  var TEMPORARY: Double = js.native
}

object LocalFileSystem {
  @scala.inline
  def apply(PERSISTENT: Double, TEMPORARY: Double): LocalFileSystem = {
    val __obj = js.Dynamic.literal(PERSISTENT = PERSISTENT.asInstanceOf[js.Any], TEMPORARY = TEMPORARY.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalFileSystem]
  }
  @scala.inline
  implicit class LocalFileSystemOps[Self <: LocalFileSystem] (val x: Self) extends AnyVal {
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
    def setPERSISTENT(value: Double): Self = this.set("PERSISTENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setTEMPORARY(value: Double): Self = this.set("TEMPORARY", value.asInstanceOf[js.Any])
  }
  
}

