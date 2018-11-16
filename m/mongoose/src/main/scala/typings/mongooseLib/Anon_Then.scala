package typings
package mongooseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Then extends js.Object {
  var `catch`: (js.Function0[stdLib.Promise[mongooseLib.mongooseMod.Connection | _]]) | (js.Function1[
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | stdLib.PromiseLike[_]], 
    stdLib.Promise[mongooseLib.mongooseMod.Connection | _]
  ])
  var `then`: js.Function0[stdLib.Promise[_]] | (js.Function1[
    /* onfulfilled */ js.Function1[/* value */ mongooseLib.mongooseMod.Connection, _ | stdLib.PromiseLike[_]], 
    stdLib.Promise[_]
  ]) | (js.Function2[
    /* onfulfilled */ js.Function1[/* value */ mongooseLib.mongooseMod.Connection, _ | stdLib.PromiseLike[_]], 
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | stdLib.PromiseLike[_]], 
    stdLib.Promise[_]
  ]) | (js.Function2[
    /* onfulfilled */ js.UndefOr[scala.Nothing], 
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | stdLib.PromiseLike[_]], 
    stdLib.Promise[_]
  ]) | (js.Function2[
    /* onfulfilled */ scala.Null, 
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | stdLib.PromiseLike[_]], 
    stdLib.Promise[_]
  ])
}

