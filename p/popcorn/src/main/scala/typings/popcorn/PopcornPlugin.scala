package typings.popcorn

import typings.std.TrackEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopcornPlugin extends js.Object {
  var _setup: js.UndefOr[js.Function1[/* track */ js.UndefOr[TrackEvent], js.Any]] = js.native
  var _teardown: js.UndefOr[js.Function1[/* track */ js.UndefOr[TrackEvent], js.Any]] = js.native
  var _update: js.UndefOr[js.Function1[/* track */ js.UndefOr[TrackEvent], js.Any]] = js.native
  var end: js.UndefOr[js.Function2[/* event */ js.Any, /* track */ js.UndefOr[TrackEvent], js.Any]] = js.native
  var frame: js.UndefOr[js.Function2[/* event */ js.Any, /* track */ js.UndefOr[TrackEvent], js.Any]] = js.native
  var manifest: js.UndefOr[PopcornManifest] = js.native
  var start: js.UndefOr[js.Function2[/* event */ js.Any, /* track */ js.UndefOr[TrackEvent], js.Any]] = js.native
  @JSName("toString")
  var toString_FPopcornPlugin: js.UndefOr[js.Function0[String]] = js.native
  def apply(options: js.Any): js.Any = js.native
}

