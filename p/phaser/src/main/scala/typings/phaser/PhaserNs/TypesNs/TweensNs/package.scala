package typings.phaser.PhaserNs.TypesNs

import typings.phaser.PhaserNs.TweensNs.Timeline
import typings.phaser.PhaserNs.TweensNs.Tween
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TweensNs {
  type GetEndCallback = js.Function3[/* target */ js.Any, /* key */ String, /* value */ Double, Unit]
  type GetStartCallback = js.Function3[/* target */ js.Any, /* key */ String, /* value */ Double, Unit]
  type TimelineOnCompleteCallback = js.Function2[/* timeline */ Timeline, /* repeated */ js.Any, Unit]
  type TimelineOnLoopCallback = js.Function2[/* timeline */ Timeline, /* repeated */ js.Any, Unit]
  type TimelineOnStartCallback = js.Function2[/* timeline */ Timeline, /* repeated */ js.Any, Unit]
  type TimelineOnUpdateCallback = js.Function2[/* timeline */ Timeline, /* repeated */ js.Any, Unit]
  type TimelineOnYoyoCallback = js.Function2[/* timeline */ Timeline, /* repeated */ js.Any, Unit]
  type TweenOnCompleteCallback = js.Function3[/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any, Unit]
  type TweenOnLoopCallback = js.Function3[/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any, Unit]
  type TweenOnRepeatCallback = js.Function3[/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any, Unit]
  type TweenOnStartCallback = js.Function3[/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any, Unit]
  type TweenOnUpdateCallback = js.Function3[/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any, Unit]
  type TweenOnYoyoCallback = js.Function3[/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any, Unit]
}
