package typings.mongodbMemoryServerCore.getosMod

import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.aix
import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.android
import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.cygwin
import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.darwin
import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.freebsd
import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.openbsd
import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.sunos
import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.win32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OtherOS extends AnyOS {
  var os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String = js.native
}

object OtherOS {
  @scala.inline
  def apply(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String): OtherOS = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherOS]
  }
  @scala.inline
  implicit class OtherOSOps[Self <: OtherOS] (val x: Self) extends AnyVal {
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
    def setOs(value: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String): Self = this.set("os", value.asInstanceOf[js.Any])
  }
  
}

