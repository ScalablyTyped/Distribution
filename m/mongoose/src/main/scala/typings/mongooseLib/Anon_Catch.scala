package typings
package mongooseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Catch extends js.Object {
  var `catch`: (js.Function0[js.Promise[mongooseLib.mongooseMod.Connection | _]]) | (js.Function1[
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | js.Thenable[_]], 
    js.Promise[mongooseLib.mongooseMod.Connection | _]
  ])
  var `then`: js.Function0[js.Promise[_]] | (js.Function1[
    /* onfulfilled */ js.Function1[/* value */ mongooseLib.mongooseMod.Connection, _ | js.Thenable[_]], 
    js.Promise[_]
  ]) | (js.Function2[
    /* onfulfilled */ js.Function1[/* value */ mongooseLib.mongooseMod.Connection, _ | js.Thenable[_]], 
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | js.Thenable[_]], 
    js.Promise[_]
  ]) | (js.Function2[
    /* onfulfilled */ js.UndefOr[scala.Nothing], 
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | js.Thenable[_]], 
    js.Promise[_]
  ]) | (js.Function2[
    /* onfulfilled */ scala.Null, 
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | js.Thenable[_]], 
    js.Promise[_]
  ])
}

object Anon_Catch {
  @scala.inline
  def apply(
    `catch`: (js.Function0[js.Promise[mongooseLib.mongooseMod.Connection | _]]) | (js.Function1[
      /* onrejected */ js.Function1[/* reason */ js.Any, _ | js.Thenable[_]], 
      js.Promise[mongooseLib.mongooseMod.Connection | _]
    ]),
    `then`: js.Function0[js.Promise[_]] | (js.Function1[
      /* onfulfilled */ js.Function1[/* value */ mongooseLib.mongooseMod.Connection, _ | js.Thenable[_]], 
      js.Promise[_]
    ]) | (js.Function2[
      /* onfulfilled */ js.Function1[/* value */ mongooseLib.mongooseMod.Connection, _ | js.Thenable[_]], 
      /* onrejected */ js.Function1[/* reason */ js.Any, _ | js.Thenable[_]], 
      js.Promise[_]
    ]) | (js.Function2[
      /* onfulfilled */ js.UndefOr[scala.Nothing], 
      /* onrejected */ js.Function1[/* reason */ js.Any, _ | js.Thenable[_]], 
      js.Promise[_]
    ]) | (js.Function2[
      /* onfulfilled */ scala.Null, 
      /* onrejected */ js.Function1[/* reason */ js.Any, _ | js.Thenable[_]], 
      js.Promise[_]
    ])
  ): Anon_Catch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Catch]
  }
}

