package typings.opentypeJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.opentypeJs.anon.LowMemory
import typings.opentypeJs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def load(url: String): js.Promise[Font] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Font]]
inline def load(url: String, callback: js.Function2[/* error */ Any, /* font */ js.UndefOr[Font], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def loadSync(url: String): Font = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(url.asInstanceOf[js.Any]).asInstanceOf[Font]
inline def loadSync(url: String, opt: LowMemory): Font = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(url.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Font]

inline def parse(buffer: Any): Font = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(buffer.asInstanceOf[js.Any]).asInstanceOf[Font]

type Contour = js.Array[Point]

type KerningPairs = StringDictionary[Double]

type LocalizedName = StringDictionary[String]

type Substitution = js.Function1[/* font */ Font, Any]
