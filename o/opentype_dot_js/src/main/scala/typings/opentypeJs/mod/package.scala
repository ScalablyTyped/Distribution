package typings.opentypeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def load(url: java.lang.String): js.Promise[typings.opentypeJs.mod.Font] = typings.opentypeJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.opentypeJs.mod.Font]]
inline def load(
  url: java.lang.String,
  callback: js.Function2[/* error */ js.Any, /* font */ js.UndefOr[typings.opentypeJs.mod.Font], scala.Unit]
): scala.Unit = (typings.opentypeJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def loadSync(url: java.lang.String): typings.opentypeJs.mod.Font = typings.opentypeJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(url.asInstanceOf[js.Any]).asInstanceOf[typings.opentypeJs.mod.Font]
inline def loadSync(url: java.lang.String, opt: typings.opentypeJs.anon.LowMemory): typings.opentypeJs.mod.Font = (typings.opentypeJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(url.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[typings.opentypeJs.mod.Font]

inline def parse(buffer: js.Any): typings.opentypeJs.mod.Font = typings.opentypeJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.opentypeJs.mod.Font]

type Contour = js.Array[typings.opentypeJs.mod.Point]

type KerningPairs = org.scalablytyped.runtime.StringDictionary[scala.Double]

type LocalizedName = org.scalablytyped.runtime.StringDictionary[java.lang.String]

type Substitution = js.Function1[/* font */ typings.opentypeJs.mod.Font, js.Any]
