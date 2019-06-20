package typings
package phaserLib.PhaserNs.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TweensNs {
  type GetEndCallback = js.Function3[/* target */ js.Any, /* key */ java.lang.String, /* value */ scala.Double, scala.Unit]
  type GetStartCallback = js.Function3[/* target */ js.Any, /* key */ java.lang.String, /* value */ scala.Double, scala.Unit]
  type TimelineOnCompleteCallback = js.Function2[
    /* timeline */ phaserLib.PhaserNs.TweensNs.Timeline, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type TimelineOnLoopCallback = js.Function2[
    /* timeline */ phaserLib.PhaserNs.TweensNs.Timeline, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type TimelineOnStartCallback = js.Function2[
    /* timeline */ phaserLib.PhaserNs.TweensNs.Timeline, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type TimelineOnUpdateCallback = js.Function2[
    /* timeline */ phaserLib.PhaserNs.TweensNs.Timeline, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type TimelineOnYoyoCallback = js.Function2[
    /* timeline */ phaserLib.PhaserNs.TweensNs.Timeline, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type TweenOnCompleteCallback = js.Function3[
    /* tween */ phaserLib.PhaserNs.TweensNs.Tween, 
    /* targets */ js.Array[js.Any], 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type TweenOnLoopCallback = js.Function3[
    /* tween */ phaserLib.PhaserNs.TweensNs.Tween, 
    /* targets */ js.Array[js.Any], 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type TweenOnRepeatCallback = js.Function3[
    /* tween */ phaserLib.PhaserNs.TweensNs.Tween, 
    /* target */ js.Any, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type TweenOnStartCallback = js.Function3[
    /* tween */ phaserLib.PhaserNs.TweensNs.Tween, 
    /* targets */ js.Array[js.Any], 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type TweenOnUpdateCallback = js.Function3[
    /* tween */ phaserLib.PhaserNs.TweensNs.Tween, 
    /* target */ js.Any, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type TweenOnYoyoCallback = js.Function3[
    /* tween */ phaserLib.PhaserNs.TweensNs.Tween, 
    /* target */ js.Any, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
}
