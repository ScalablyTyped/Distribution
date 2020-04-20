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

trait OtherOS extends AnyOS {
  var os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String
}

object OtherOS {
  @scala.inline
  def apply(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String): OtherOS = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherOS]
  }
}

