package typings.popmotion.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncApi extends js.Object {
  var cancelSync: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in popmotion.popmotion/framesync/lib/types.StepId ]: (process : popmotion.popmotion/framesync/lib/types.Process): void}
    */ typings.popmotion.popmotionStrings.SyncApi with TopLevel[js.Any]
  var steps: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in popmotion.popmotion/framesync/lib/types.StepId ]: popmotion.popmotion/framesync/lib/types.Step}
    */ typings.popmotion.popmotionStrings.SyncApi with TopLevel[js.Any]
  var sync: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in popmotion.popmotion/framesync/lib/types.StepId ]: (process : popmotion.popmotion/framesync/lib/types.Process, keepAlive? : boolean, immediate? : boolean): popmotion.popmotion/framesync/lib/types.Process}
    */ typings.popmotion.popmotionStrings.SyncApi with TopLevel[js.Any]
}

object SyncApi {
  @scala.inline
  def apply(
    cancelSync: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in popmotion.popmotion/framesync/lib/types.StepId ]: (process : popmotion.popmotion/framesync/lib/types.Process): void}
    */ typings.popmotion.popmotionStrings.SyncApi with TopLevel[js.Any],
    steps: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in popmotion.popmotion/framesync/lib/types.StepId ]: popmotion.popmotion/framesync/lib/types.Step}
    */ typings.popmotion.popmotionStrings.SyncApi with TopLevel[js.Any],
    sync: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in popmotion.popmotion/framesync/lib/types.StepId ]: (process : popmotion.popmotion/framesync/lib/types.Process, keepAlive? : boolean, immediate? : boolean): popmotion.popmotion/framesync/lib/types.Process}
    */ typings.popmotion.popmotionStrings.SyncApi with TopLevel[js.Any]
  ): SyncApi = {
    val __obj = js.Dynamic.literal(cancelSync = cancelSync.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncApi]
  }
}

