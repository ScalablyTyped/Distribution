package typings.atNodelibFsDotStat

import typings.atNodelibFsDotStat.outAdaptersFsMod.FileSystemAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fs extends js.Object {
  var fs: FileSystemAdapter
}

object Anon_Fs {
  @scala.inline
  def apply(fs: FileSystemAdapter): Anon_Fs = {
    val __obj = js.Dynamic.literal(fs = fs)
  
    __obj.asInstanceOf[Anon_Fs]
  }
}

