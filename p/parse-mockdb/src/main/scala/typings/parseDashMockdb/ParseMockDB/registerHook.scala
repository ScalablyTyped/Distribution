package typings.parseDashMockdb.ParseMockDB

import typings.parse.parseMod._Global_.Parse.Cloud.BeforeSaveRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ParseMockDB.registerHook")
@js.native
object registerHook extends js.Object {
  def apply(
    className: String,
    hookType: HookType,
    hookFn: js.Function1[
      /* request */ BeforeSaveRequest, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Parse.IPromise<any> */ _
    ]
  ): Unit = js.native
}

