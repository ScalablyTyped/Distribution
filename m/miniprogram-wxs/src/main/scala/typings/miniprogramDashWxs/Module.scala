package typings.miniprogramDashWxs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Module extends js.Object {
  /**
    * 导出内容
    */
  var exports: js.Any
}

object Module {
  @scala.inline
  def apply(exports: js.Any): Module = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Module]
  }
}

/**
  * 模块
  */
@JSGlobal("module")
@js.native
object module extends TopLevel[Module]

